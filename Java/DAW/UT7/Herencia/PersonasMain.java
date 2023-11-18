import UD7.*;



import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonasMain {
    static ArrayList<Personas> myPeople = new ArrayList<>();
    static Scanner keyb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Vamos a realizar una lista de Alumnos y Profesores");
        addIntoList();
        System.out.println("\n--------------------");
        printTeachers();
        System.out.println("\n--------------------");
        printStudents();
    }

    private static void addIntoList() {
        boolean repeat = true;
        int select = 0;

        do{
            select = numberControl("¿Deseas introducir un Alumno (Pulsa 1), un Profesor (Pulsa 2) o deseas terminar (Pulsa 0)?: ", "Debes introducir un número para escoger la selección.");
            if (select < 0 || select > 2) {
                System.out.println("Debes introducir una de las opciones disponibles.");
            } else {
                if (select == 1) {
                    addPerson("alumno");
                } else if (select == 2){
                    addPerson("profesor");
                } else {
                    repeat = false;
                }
            }
        } while(repeat);
    }

    private static void addPerson(String personType) {
        String nombre = "";
        String DNI = "";
        String fechaNacimiento = "";

        nombre = addNombre(nombre, personType);
        DNI = addDNI(DNI, personType);
        fechaNacimiento = addFechaNacimiento (fechaNacimiento, personType);

        if (personType.equals("alumno")){
            myPeople.add(new Alumnos(nombre, DNI, fechaNacimiento));
            addAlumInfo((Alumnos) myPeople.get(myPeople.size()-1));
        } else {
            myPeople.add(new Profesores(nombre, DNI, fechaNacimiento));
            addTeacherInfo((Profesores) myPeople.get(myPeople.size()-1));
        }
    }

    private static String addNombre (String nombre, String personType) {
        do {
            System.out.print("Introduce el nombre del " + personType + " (con las iniciales mayúsculas): ");
            nombre = keyb.nextLine().trim();
            if (!nombre.matches("([A-ZÑ][a-zñ]+)(\\s[A-ZÑ][a-zñ]+)*")) {
                System.out.println("Debes introducir el nombre cona ls iniciales mayúsculas y separados por un solo espacio.");
                nombre = "repeat";
            }
        } while (nombre.equals("repeat"));
        return nombre;
   }

    private static String addDNI(String dni, String personType) {
        do {
            System.out.print("Introduce el DNI del " + personType + ": ");
            dni = keyb.nextLine().toUpperCase().trim();
            if (!dni.matches("\\d{8}[A-Z]")) {
                System.out.println("Debes introducir el DNI correctamente (12345678A).");
                dni = "repeat";
            }
        } while (dni.equals("repeat"));
        return dni;
    }

    private static String addFechaNacimiento(String fechaNacimiento, String personType) {
        Pattern date = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher dateMatch;
        do {
            System.out.print("Introduce el la Fecha de Nacimiento del " + personType + " (Formato dd/mm/aaaa): ");
            fechaNacimiento = keyb.nextLine().toUpperCase().trim();
            dateMatch = date.matcher(fechaNacimiento);
            //TODO Todo el if
            if (!dateMatch.matches() || !isCorrectDate(Integer.parseInt(dateMatch.group(1)), Integer.parseInt(dateMatch.group(2)), Integer.parseInt(dateMatch.group(3)))) {
                System.out.println("Debes introducir una fecha correcta y en el Formato dd/mm/aaaa: ");
                fechaNacimiento = "repeat";
            }
        } while (fechaNacimiento.equals("repeat"));

        return fechaNacimiento;
    }

    private static boolean isCorrectDate(int dias, int meses, int anios) {
        if(dias<=0 || meses<=0 || meses>12 || anios<=0) {
            return false;
        }

        switch (meses) {
            case 4:
            case 6:
            case 9:
            case 11:
                if(dias>30) {
                    return false;
                }
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dias>31) {
                    return false;
                }
                break;

            case 2:
                if((isBisiesto(anios) && dias>29) ||(!isBisiesto(anios) && dias>28)) {
                    return false;
                }
        }
        return true;
    }

    private static boolean isBisiesto(int anios) {
        if((anios%4==0 && anios%100!=0) || (anios%400==0 && anios%100==0)) {
            return true;
        } else {
            return false;
        }
    }

    private static void addTeacherInfo(Profesores profesor) {
        profesor.setNRP(addNRP());       //NRP como un número de 6 dígitos
        profesor.setEspecialidad(addEspecialidad());
        profesor.setCentroDestino(addCentroDestino());
    }

    private static int addNRP() {
        int NRP = 0;
        do {
            NRP = numberControl("Introduce el NRP del Profesor: ", "Debes introducir el NRP como un número entero.");
            if (NRP<100000 || NRP>999999) {
                System.out.println("Debes introducir un NRP de seis dígitos.");
                NRP=-1;
            }
        } while (NRP == -1);
        return NRP;
    }

    private static int addEspecialidad() {
        int especialidad = 0;
        do {
            especialidad = numberControl("Introduce el código de Especialidad del Profesor: ", "Debes introducir la Especialidad como un número entero.");
            if (especialidad<100 || especialidad>999) {
                System.out.println("Debes introducir un código de tres dígitos.");
                especialidad=-1;
            }
        } while (especialidad == -1);
        return especialidad;
    }

    private static String addCentroDestino() {
        String centro = "";
        System.out.print("Introduce el nombre del Centro de destino: ");
        centro = keyb.nextLine();
        return centro;
    }

    private static void addAlumInfo(Alumnos alumno) {
        alumno.setCial(addCIAL());
        alumno.setCiclo(addCiclo());
    }

    private static String addCIAL() {
        String cial = "";
        do {
            System.out.print("Introduce el CIAL del alumno: ");
            cial = keyb.nextLine().toUpperCase();
            if (cial.length() != 10) {
                System.out.println("El CIAL debe introducise como un código alfanumérico de 10 caracteres.");
                cial = "repeat";
            }
        } while (cial.equals("repeat"));
        return cial;
    }

    private static String addCiclo() {
        String ciclo = "";
        System.out.print("Introduce el nombre del Ciclo que cursa el alumno: ");
        ciclo = keyb.nextLine();
        return ciclo;
    }

    private static int numberControl(String message, String errorMessage) {
        int select = 0;
        do {
            System.out.print(message);
            try {
                select = keyb.nextInt();
                keyb.nextLine();
            } catch (InputMismatchException e) {
                keyb.nextLine();
                System.out.println(errorMessage);

                select = -1;
            }
        } while (select == -1);
        return select;
    }

    public static void printTeachers() {
        System.out.println("Los Profesores introducidos son:");
        for (Personas person: myPeople) {
            if (person instanceof Profesores) {
                System.out.println("--> Nombre: " + person.getNombre() + ", DNI: " + person.getDNI() + ", Edad: "
                        + person.getEdad() + ", NRP: " + ((Profesores) person).getNRP() + ", Especialidad: " +
                        ((Profesores) person).getEspecialidad() + ", Centro de Destino: "
                        + ((Profesores) person).getCentroDestino() + ".");
            }
        }
    }

    public static void printStudents() {
        System.out.println("Los Alumnos introducidos son:");
        for (Personas person: myPeople) {
            if (person instanceof Alumnos) {
                System.out.println("--> Nombre: " + person.getNombre() + ", DNI: " + person.getDNI() + ", Edad: "
                        + person.getEdad() + ", CIAL: " + ((Alumnos) person).getCial() + ", Ciclo cursado: " +
                        ((Alumnos) person).getCiclo() + ".");
            }
        }
    }
}


package personasmain;
import personasmain.UD7.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Cristo Rubén Pérez Suárez
 * Clase principal del programa
 */
public class PersonasMain {
    static ArrayList<Personas> myPeople = new ArrayList<>();
    static Scanner keyb = new Scanner(System.in);

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Vamos a realizar una lista de Alumnos y Profesores");
        addIntoList();
        System.out.println("\n--------------------");
        printTeachers();
        System.out.println("\n--------------------");
        printStudents();
    }

    //Menu que segun la opcion realizaá una accion u otra
    private static void addIntoList() {
        boolean repeat = true;
        int select = 0;

        do{
            select = numberControl("Deseas introducir un Alumno (Pulsa 1), un Profesor (Pulsa 2) o deseas terminar (Pulsa 0)?: ", "Debes introducir un numero para escoger la seleccion.");
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

    //Llamamos a los constructores para añadir las personas
    private static void addPerson(String personType) {
        String nombre = addNombre(personType);
        String DNI = addDNI(personType);
        String fechaNacimiento = addFechaNacimiento (personType);
        //--------------------------------------CAMBIOS AQUI-------------------------------------------\\
        if (personType.equals("alumno")){
            //Realizamos cambios apra llamar al procedimiento que 
            //indica si es becario o no
            selectAlumnType(nombre, DNI, fechaNacimiento);
        } else if (personType.equals("profesor")){
            selectTeacherType(nombre, DNI, fechaNacimiento);
        }
    }
    
    //Procedimiento que usamos para indicar si el alumno es becario o no.
    private static void selectAlumnType(String nombre, String DNI, String fechaNacimiento){
        String selectAlumno = "";
        do {
            //Pedimos que nos confirme si es o no un Becario
            System.out.print("El alumno que vas a introducir es un Becario/a? \"Si\" o \"No\": ");
            selectAlumno = keyb.nextLine().toUpperCase().trim();
            if (!selectAlumno.matches("SI|NO")) {
                System.out.println("Debes introducir \"Si\" o \"No\".");
                selectAlumno = "repeat";
            } else {
                if (selectAlumno.equals("SI")){
                    //Añadimos a personas un nuevo becario
                    myPeople.add(new Becarios(nombre, DNI, fechaNacimiento, addCIAL(),addCiclo()));
                } else {
                    myPeople.add(new Alumnos(nombre, DNI, fechaNacimiento));
                    addAlumInfo((Alumnos) myPeople.get(myPeople.size()-1));
                }
            }
        } while (selectAlumno.equals("repeat"));
    }
    
    //Pedimos que nos indique si el profesor es o no Tutor
    private static void selectTeacherType(String nombre, String DNI, String fechaNacimiento){
        String selectTutor = "";
        do {
            System.out.print("El profesor que vas a introducir es un Tutor/a? \"Si\" o \"No\": ");
            selectTutor = keyb.nextLine().toUpperCase().trim();
            if (!selectTutor.matches("SI|NO")) {
                System.out.println("Debes introducir \"Si\" o \"No\".");
                selectTutor = "repeat";
            } else {
                if (selectTutor.equals("SI")){
                    myPeople.add(new Tutores(nombre, DNI, fechaNacimiento));
                    addGrupo((Tutores) myPeople.get(myPeople.size()-1));
                } else {
                    myPeople.add(new Profesores(nombre, DNI, fechaNacimiento));
                }
                addTeacherInfo((Profesores) myPeople.get(myPeople.size()-1));
            }
        } while (selectTutor.equals("repeat"));
    }

    //Añadimos el nombre de la persona
    private static String addNombre(String personType) {
        String nombre = "";
        do {
            System.out.print("Introduce el nombre del " + personType + " (con las iniciales may�sculas): ");
            nombre = keyb.nextLine().trim();
            //Llamamos para comprobar el nombre
            
        } while (compNombre(nombre) == false);
        return nombre;
   }
    
    /**
     * Comprobacion del Nombre
     * @param nombre variable que almacena el nombre de la persona que se introduzca al programa
     * @return devolvemos verdadero o falso según sea un nombre correcto o no
     */
    public static boolean compNombre(String nombre){
       if (!nombre.matches("([A-Z�][a-z�]+)(\\s[A-Z�][a-z�]+)*")) {
                System.out.println("Debes introducir el nombre cona ls iniciales may�sculas y separados por un solo espacio.");
                return false;
        }
        return true;
    }

    //Añadimos el DNI de las personas y llamamos al metodo que lo comprueba
    private static String addDNI(String personType) {
        String dni = "";
        do {
            System.out.print("Introduce el DNI del " + personType + ": ");
            dni = keyb.nextLine().toUpperCase().trim();
            //Comprobamos el DNI introducido 
        } while (compDNI(dni) == false);
        return dni;
    }
    
    /**
     * Comprobacion del DNI
     * @param dni variables que almacena el numero indentificativo de cada persona
     * @return devolvemos el verdadero si el DNI es valido o falso si no lo es
     */
    public static boolean compDNI(String dni){
            if (!dni.matches("\\d{8}[A-Z]")) {
                System.out.println("Debes introducir el DNI correctamente (12345678A).");
                return false;
            }        
        return true;
    }

    //Añadimos y comprobamos que la fecha tenga la estructura pedida
    private static String addFechaNacimiento(String personType) {
        String fechaNacimiento = "";
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

    /**
     *  Comprobamos que la fecha introducida sea correcta
     * @param dias Variable que almacena los dias del año
     * @param meses Variable que almacna los meses del año
     * @param anios Variable que almacena el año
     * @return devolvemos un booleano si es verdadero es porque la fecha es valida si no lo fuera devoleria false
     */
    public static boolean isCorrectDate(int dias, int meses, int anios) {
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

    /**
     *  Comprobar si el año es bisiesto
     * @param anios variable que almacena los años para comprobar si son bisiestos
     * @return devolvemos un booleano si es verdadero el año es bisiesto
     */
    public static boolean isBisiesto(int anios) {
        return ((anios % 4 == 0 && anios % 100 != 0) || (anios % 400 == 0 && anios % 100 == 0));
    }

    //Añadimos el grupo del tutor
    private static void addGrupo(Tutores tutores){
        System.out.print("¿Cual es el grupo de tutora del Profesor? (Ejemplo 1 DAM): ");
        tutores.setGrupo(keyb.nextLine());
    }

    //Añadimos toda la informacion al profesor mediante sus setter
    private static void addTeacherInfo(Profesores profesor) {
        profesor.setIdef(addNRP());      
        profesor.setEspecialidad(addEspecialidad());
        profesor.setCentroDestino(addCentroDestino());
        profesor.setSalario(addSueldo());
    }

    //Añadimos y llamamos al metodo que comprueba el NRP
    private static String addNRP() {
        int NRP = 0;
        do {
            NRP = numberControl("Introduce el NRP del Profesor: ", "Debes introducir el NRP como un n�mero entero.");
            //Comprobamos que el NRP sea correcto
        } while (compNRP(NRP) == false);
        return Integer.toString(NRP);
        //Para poder usar sin problemas la interface Acceso se ha modificado NRP para que sea String
    }
    
    /**
     * Comprobamos que el NRP sea de 6 digitos
     * @param NRP Variable que almacena el nuemero NRP del profesor
     * @return devuelve true si el NRP es valido y false si no lo fuera
     */
    public static boolean compNRP(int NRP){
            if (NRP<100000 || NRP>999999) {
                System.out.println("Debes introducir un NRP de seis digitos.");
                NRP=-1;
                return false;
            }
        return true;
    }

    //Añadimos la especialidad del profesor
    private static int addEspecialidad() {
        int especialidad = 0;
        do {
            especialidad = numberControl("Introduce el codigo de Especialidad del Profesor: ", "Debes introducir la Especialidad como un n�mero entero.");
            //Comprobamos la especialidad            
        } while (compEspecialidad(especialidad)==false);
        return especialidad;
    }
    
    /**
     * Comprobamos que la especialidad sea de 3 digitos
     * @param especialidad Variable que contiene el codigo de la especialidad
     * @return devuelve true si la especialidad es correcta y false si es incorrecta
     */
    public static boolean compEspecialidad(int especialidad){
            if (especialidad<100 || especialidad>999) {
                System.out.println("Debes introducir un codigo de tres digitos.");
                return false;
            }        
        return true;
    }

    //Añadir el centro de destino del profesor
    private static String addCentroDestino() {
        String centro = "";
        System.out.print("Introduce el nombre del Centro de destino: ");
        centro = keyb.nextLine();
        return centro;
    }

    //Pedimos el sueldo y llamamos para comprobarlo antes de ser introducido
    private static double addSueldo(){
        double sueldo = 0;
        do {
            try{
                System.out.print("Introduce el salario base que cobra el Profesor (Si es tutor se le aplicar� el complemento): ");
                sueldo = keyb.nextDouble();
                keyb.nextLine();
            } catch (InputMismatchException e) {
                sueldo = -1;
                keyb.nextLine();
                System.out.println("Debes introducir un numero con o sin decimales.");
            }
            //Comprobamos el sueldo
        } while (compSueldo(sueldo)==false);
        return sueldo;
    }
    
    /**
     *  Comprobacion para el sueldo
     * @param sueldo Variable que contiene el sueldo a comprobar
     * @return devolvemos true si el sueldo es de minimo 1000.0
     */
    public static boolean compSueldo(double sueldo){
                if (sueldo < 1000) {
                    System.out.println("El salario minimo aplicable es de 1000.0 euros.");
                    return false;
                }        
        return true;
    }

    //Mandamos los datos al alumnos
    private static void addAlumInfo(Alumnos alumno) {
        alumno.setIdef(addCIAL());
        alumno.setCiclo(addCiclo());
    }

    //Añadimos el Cial del alumno
    private static String addCIAL() {
        String cial = "";
        do {
            System.out.print("Introduce el CIAL del alumno: ");
            cial = keyb.nextLine().toUpperCase();
            //Comprobamos el Cial    
        } while (compCial(cial)==false);
        return cial;
    }
    
    /**
     *  Comprobbacion del Cial del alumno
     * @param cial Variable que contiene el Cial que vamos a comprobar
     * @return si el cial es valido devolvemos true si no lo es false
     */
    public static boolean compCial(String cial){
            if (cial.length() != 10) {
                System.out.println("El CIAL debe introducise como un codigo alfanumerico de 10 caracteres.");
                return false;
            }        
        return true;
    }

    //Añadimos el ciclo del alumno
    private static String addCiclo() {
        String ciclo = "";
        System.out.print("Introduce el nombre del Ciclo que cursa el alumno: ");
        ciclo = keyb.nextLine();
        return ciclo;
    }

    //Metodo de control
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

    //Metodo que nos lista a los profesores en pantalla
    private static void printTeachers() {
        System.out.println("Los Profesores introducidos son:");
        for (Personas person: myPeople) {
            if (person instanceof Profesores) {
                System.out.print("--> Nombre: " + person.getNombre() + ", DNI: " + person.getDNI() + ", Edad: "
                        + person.getEdad() + ", NRP: " + person.getIdef() + ", Especialidad: "
                        + ((Profesores) person).getEspecialidad() + ", Centro de Destino: "
                        + ((Profesores) person).getCentroDestino() + ", Salario con complementos aplicados: "
                        + ((Profesores) person).getSueldo() + " euros.");
                if (person instanceof Tutores) {
                    System.out.println(" Este Profesor/a es Tutor/a de " + ((Tutores) person).getGrupo() + ".");
                } else {
                    System.out.print("\n");
                }
            }
        }
    }

    //Metodo que muestra los datos de los estudiantes
    private static void printStudents() {
        System.out.println("Los Alumnos introducidos son:");
        for (Personas person: myPeople) {
            if (person instanceof Alumnos) {
                System.out.println("--> Nombre: " + person.getNombre() + ", DNI: " + person.getDNI() + ", Edad: "
                        + person.getEdad() + ", CIAL: " + person.getIdef() + ", Ciclo cursado: " +
                        ((Alumnos) person).getCiclo() + " ");
            
                //Añadimos para mostrar los datos que pertenecen al Becario como es su sueldo
                if (person instanceof Becarios) {
                    System.out.println("    > Este alumno es Becario y su sueldo es de: "+((Becarios) person).getSueldo() +".");
            }  else {
                    System.out.print("\n");
                }
            }
        }
    }

}


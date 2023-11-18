package UD7;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Personas implements Acceso {
    protected String nombre;
    protected String DNI;
    private LocalDate fechaNacimiento;
    //Campo calculado edad "getEdad"

    public Personas(String nombre, String DNI, String fechaNacimiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        setFechaNacimiento(fechaNacimiento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        DateTimeFormatter DateForm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, DateForm);
    }

    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
       
    }
}

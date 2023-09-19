package UD7;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Personas {
    protected String nombre;
    protected String DNI;
    private LocalDate fechaNacimiento;
    protected int edad;

    public Personas(String nombre, String DNI, String fechaNacimiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.setFechaNacimiento(fechaNacimiento);
        this.setEdad();
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
        LocalDate fn = LocalDate.parse(fechaNacimiento, DateForm);

        this.fechaNacimiento = fn;
    }

    public int getEdad() {
        return edad;
    }

    private void setEdad() {
        this.edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
}

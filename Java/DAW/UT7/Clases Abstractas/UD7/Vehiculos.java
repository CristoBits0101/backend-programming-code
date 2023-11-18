package UD7;

public abstract class Vehiculos {
    private String matricula;
    private String chasis;
    private String marca;
    private String DNIPropietario;
    private int yearMatriculacion; //Para no extender en exceso el ejercicio se ha optado por usar solo el año

    //Tanto para esta clase como para el resto se han creado los constructores requeridos pero solo he utilizado el
    //Constructor vacio de cada clase para optimizar el programa
    public Vehiculos() {
    }

    public Vehiculos(String matricula, String chasis, String marca, String DNIPropietario, int yearMatriculacion) {
        this.matricula = matricula;
        this.chasis = chasis;
        this.marca = marca;
        this.DNIPropietario = DNIPropietario;
        this.yearMatriculacion = yearMatriculacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDNIPropietario() {
        return DNIPropietario;
    }

    public void setDNIPropietario(String DNIPropietario) {
        this.DNIPropietario = DNIPropietario;
    }

    public int getYearMatriculacion() {
        return yearMatriculacion;
    }

    public void setYearMatriculacion(int yearMatriculacion) {
        this.yearMatriculacion = yearMatriculacion;
    }

    public abstract String getITV();
}

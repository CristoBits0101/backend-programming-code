package Paradigms.POO.Object.Correlations.Automotive.Assistant;

public class Motor {

    private String marca;
    private int cilindrada;
    private int potencia;

    public Motor()
    {

    }

    public Motor(String marca, int cilindrada, int potencia) {
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void arrancar() {
        System.out.println("El motor ha arrancado");
    }
}


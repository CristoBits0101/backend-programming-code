package advanced.patterns.creational.singleton.beans;

public class Singleton {

    private static Singleton singleton;
    public int contador = 0;

    // El constructor privado impide instanciar objetos de la clase.
    private Singleton() {
    }

    /**
     * La función permite instanciar accediendo al constructor privado.
     * La primera vez te devuelve el atributo con la nueva instancia.
     * La segunda vez te devuelve el atributo con la vieja instancia.
     */
    public static Singleton getInstance() {
        return (singleton == null) ? (singleton = new Singleton()) : singleton;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}
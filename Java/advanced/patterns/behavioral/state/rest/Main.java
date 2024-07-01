package advanced.patterns.behavioral.state.rest;

import advanced.patterns.behavioral.state.beans.Telefono;

public class Main {
    public static void main(String[] args) {
        // 
        Telefono telefono1 = new Telefono();
        Telefono telefono2 = new Telefono();

        // 
        System.out.println(telefono1.estado.desbloquear());
        System.out.println(telefono1.estado.hacerFoto());

        // 
        System.out.println(telefono2.estado.desbloquear());
        System.out.println(telefono2.estado.abrirCamara());
    }
}

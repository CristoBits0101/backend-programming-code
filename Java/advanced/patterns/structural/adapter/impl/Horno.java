package advanced.patterns.structural.adapter.impl;

import advanced.patterns.structural.adapter.service.EnchufableService;

public class Horno implements EnchufableService {

    boolean encendido = false;

    @Override
    public void enciende() {
        System.out.println("Horno enciende");
    }

    @Override
    public void apaga() {
        System.out.println("Horno apaga");
    }

    @Override
    public boolean encendido() {
        return this.encendido;
    }

}

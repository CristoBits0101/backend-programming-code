package advanced.patterns.structural.adapter.rest;

import advanced.patterns.structural.adapter.impl.Horno;
import advanced.patterns.structural.adapter.impl.Lampara;
import advanced.patterns.structural.adapter.impl.PowerAdapter;
import advanced.patterns.structural.adapter.services.EnchufableService;

public class Main {

    public static void main(String[] args) {

        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        PowerAdapter adapter = new PowerAdapter();

        enciende(horno);
        enciende(lampara);
        enciende(adapter);

    }

    public static void enciende(EnchufableService enchufableService) {
        enchufableService.enciende();
    }

    public static void apaga(EnchufableService enchufableService) {
        enchufableService.apaga();
    }

    public static boolean encendido(EnchufableService enchufableService) {
        return enchufableService.encendido();
    }

}

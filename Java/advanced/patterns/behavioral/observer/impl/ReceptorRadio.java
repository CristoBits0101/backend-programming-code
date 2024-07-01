package advanced.patterns.behavioral.observer.impl;

import advanced.patterns.behavioral.observer.service.Receptor;

public class ReceptorRadio implements Receptor {
    @Override
    public void recibe() {
        System.out.println("Señal recibida en la radio.");
    }
}

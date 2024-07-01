package advanced.patterns.behavioral.observer.impl;

import java.util.ArrayList;

import advanced.patterns.behavioral.observer.service.Receptor;

public class Emisor {
    private ArrayList<Receptor> receptor = new ArrayList<Receptor>();

    public void addReceptor(Receptor receptor) {
        this.receptor.add(receptor);
    }

    public void emite() {
        for (Receptor receptor : this.receptor) {
            receptor.recibe();
        }
    }
}

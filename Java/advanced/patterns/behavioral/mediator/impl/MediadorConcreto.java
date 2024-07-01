package advanced.patterns.behavioral.mediator.impl;

import java.util.ArrayList;

import advanced.patterns.behavioral.mediator.service.Colega;
import advanced.patterns.behavioral.mediator.service.Mediator;

public class MediadorConcreto extends Mediator {
    ArrayList<Colega> colegas = new ArrayList<>();

    @Override
    public void registra(Colega colega) {
        if (!colegas.contains(colega)) {
            colegas.add(colega);
            colega.setMediator(this);
        }
    }

    @Override
    public void reenvia(Colega colega) {
        for (Colega actual : colegas) {
            if (!actual.equals(colega)) {
                actual.recibe();
            }
        }
    }

}

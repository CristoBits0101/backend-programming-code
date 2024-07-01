package advanced.patterns.behavioral.mediator.impl;

import advanced.patterns.behavioral.mediator.service.Colega;

public class ColegaConcreto2 extends Colega {

    @Override
    public void recibe() {
        System.out.println("2 -> He recibido un mensaje del mediador.");
    }

    @Override
    public void envia() {
        System.out.println("Soy el colega 2 y envio un mensaje al mediador.");
        mediator.reenvia(this);
    }
}

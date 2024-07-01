package advanced.patterns.behavioral.mediator.service;

abstract public class Colega {
    public Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void recibe();

    public abstract void envia();
}

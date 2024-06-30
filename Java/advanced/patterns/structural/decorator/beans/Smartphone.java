package advanced.patterns.structural.decorator.beans;

import advanced.patterns.structural.decorator.impl.PhoneDecorator;
import advanced.patterns.structural.decorator.service.PhoneService;

public class Smartphone extends PhoneDecorator {

    public Smartphone(PhoneService phoneService) {
        super(phoneService);
    }

    @Override
    public void create() {
        super.create();
        System.out.println("Soy un teléfono smartphone.");
    }

}

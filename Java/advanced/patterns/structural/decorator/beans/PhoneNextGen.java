package advanced.patterns.structural.decorator.beans;

import advanced.patterns.structural.decorator.impl.PhoneDecorator;
import advanced.patterns.structural.decorator.services.PhoneService;

public class PhoneNextGen extends PhoneDecorator {

    public PhoneNextGen(PhoneService phoneService) {
        super(phoneService);
    }

    @Override
    public void create() {
        super.create();
        System.out.println("Soy un teléfono NextGen.");
    }

}

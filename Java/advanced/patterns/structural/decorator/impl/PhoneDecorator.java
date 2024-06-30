package advanced.patterns.structural.decorator.impl;

import advanced.patterns.structural.decorator.services.PhoneService;

public class PhoneDecorator implements PhoneService {

    private PhoneService phoneService;

    // Esta es la implemetación del patrón Decorator.
    public PhoneDecorator(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @Override
    public void create() {
        this.phoneService.create();
    }

}

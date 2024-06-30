package advanced.patterns.structural.decorator.impl;

import advanced.patterns.structural.decorator.services.PhoneService;

public class PhoneImpl implements PhoneService {

    @Override
    public void create() {
        System.out.println("Soy un teléfono básico.");
        haveGSM8901();
        haveSMS8901();
    }

    private void haveGSM8901() {
        System.out.println("Tengo un GSM 8901.");
    }

    private void haveSMS8901() {
        System.out.println("Tengo un SMS 8901.");
    }

}

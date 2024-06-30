package advanced.patterns.structural.decorator;

public class PhoneImpl implements PhoneService {

    @Override
    public void create() {
        System.out.println("Soy un teléfono básico.");
    }

    private void haveGSM8901() {
        System.out.println("Tengo un GSM 8901.");
    }

    private void haveSMS8901() {
        System.out.println("Tengo un SMS 8901.");
    }

}

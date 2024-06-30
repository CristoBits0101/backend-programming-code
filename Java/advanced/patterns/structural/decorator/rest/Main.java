package advanced.patterns.structural.decorator.rest;

import advanced.patterns.structural.decorator.impl.PhoneImpl;

public class Main {
    public static void main(String[] args) {
        PhoneImpl phone = new PhoneImpl();
        phone.create();
    }
}

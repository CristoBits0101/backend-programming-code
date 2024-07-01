package advanced.patterns.behavioral.observer.rest;

import advanced.patterns.behavioral.observer.impl.Emisor;
import advanced.patterns.behavioral.observer.impl.ReceptorRadio;
import advanced.patterns.behavioral.observer.impl.ReceptorTV;

public class Main {
    public static void main(String[] args) {
        // 
        Emisor emisor = new Emisor();

        // 
        ReceptorTV tv = new ReceptorTV();
        ReceptorRadio radio = new ReceptorRadio();

        // 
        emisor.addReceptor(tv);
        emisor.addReceptor(radio);

        // 
        emisor.emite();
    }
}

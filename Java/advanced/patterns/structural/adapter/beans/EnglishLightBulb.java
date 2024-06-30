package advanced.patterns.structural.adapter.beans;

public class EnglishLightBulb {

    private boolean powereOn = false;
    private int voltage = 0;

    public void turnOn(int voltage) {
        this.powereOn = true;
        this.voltage = voltage;
        System.out.println("Turning on");
    }

    public void turnOff() {
        this.powereOn = false;
        this.voltage = voltage;
        System.out.println("Turning off");
    }

    public boolean isPoweredOn() {
        return this.powereOn;
    }

}

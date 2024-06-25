package basic.poo.object.correlations.automotive.parent;

import Paradigms.POO.Object.Correlations.Automotive.Assistant.Motor;

public class Vehicle
{
    private Motor motor;

    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void arrancar() {
        motor.arrancar();
    }
}

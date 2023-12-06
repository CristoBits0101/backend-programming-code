package Paradigms.POO.Object.Correlations.Automotive.Parent;

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

package basic.poo.object.correlations;

import Paradigms.POO.Object.Correlations.Automotive.Assistant.Motor;
import Paradigms.POO.Object.Correlations.Automotive.Parent.Vehicle;

public class Correlation
{
    public static void main(String[] args)
    {
        // We create a motor
        Motor volkswagen = new Motor("Volkswagen", 2000, 320);

        // We pass the motor to the vehicle object
        Vehicle citroen  = new Vehicle(volkswagen);

        // We print the motor
        System.out.println(citroen.getMotor());
    }
}

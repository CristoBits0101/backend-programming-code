package basic.poo.object.instantiate;

import Paradigms.POO.Object.Instantiate.Class.Empty;
import Paradigms.POO.Object.Instantiate.Class.Parameters;

public class Main
{
    public static void main(String[] args)
    {
        // Instantiate class with empty constructor
        Empty empty = new Empty();

        // Instantiate class with constructor with parameters
        Parameters parameters = new Parameters("Cristo", 18);
    }
}

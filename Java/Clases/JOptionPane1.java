import javax.swing.JOptionPane;

public class JOptionPane1 {

    public static void main (String [] args) {

        int edad = Integer.parseInt (JOptionPane.showInputDialog ("Introduzca la edad:"));
        JOptionPane.showMessageDialog (null, "Muchas gracias. Has escrito "+edad);
        
    }
}

import javax.swing.JOptionPane;

public class JOptionPane2 {

    public static void main (String [] args) {

        int elec =  JOptionPane.showConfirmDialog (null,"¿Estás seguro de que quieres salir?");
        JOptionPane.showMessageDialog (null, "Tu elección ha sido "+elec);
        
    }
}

import javax.swing.*;

public class ClaseGUI {

    public static void main (String [] args) {
    
        JFrame frame = new JFrame ("Ventanita");
        frame.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel ("Hola mundo DAW");
        frame.getContentPane ().add(label);
        frame.pack ();
        frame.setLocationRelativeTo (null);
        frame.setBounds (200, 100, 500, 200);
        frame.setResizable (false);
        frame.setVisible(true);

    }

}

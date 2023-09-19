import javax.swing.*;
import java.awt.*;

public class Motif {
    public static void main(String[]args){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch(Exception e){
            System.out.println(e);
        }
        JLabel etiqueta = new JLabel("Una Etiqueta cualquiera: ");
        JTextField campo = new JTextField("Escribe aquí...",15);        
        JCheckBox chequeo = new JCheckBox("Elegido", true);
        String arreglo[] = {null, "Opciones","Opciones"};
        JComboBox combo = new JComboBox(arreglo);
        JButton aceptar = new JButton("Aceptar");
        JButton cancelar = new JButton("Cancelar");
       
        JFrame marco = new JFrame("Look and Feel - Motif");
        marco.setSize(350,170);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        marco.setLayout(new GridLayout(3,1));
        marco.add(etiqueta);marco.add(campo);
        marco.add(chequeo);marco.add(combo);
        marco.add(aceptar);marco.add(cancelar);
    }
}

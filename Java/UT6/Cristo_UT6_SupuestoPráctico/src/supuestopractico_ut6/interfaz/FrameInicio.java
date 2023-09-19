/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supuestopractico_ut6.interfaz;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import supuestopractico_ut6.SupuestoPractico_UT6;
import supuestopractico_ut6.files_controller.BinWriter;
import supuestopractico_ut6.files_controller.logWriter;
/**
 *
 * @author Cristo Pérez Suárez
 */
public class FrameInicio extends javax.swing.JFrame {
    
    /**
     * Creates new form FrameInicio
     */
    public FrameInicio() {
        initComponents();
        img_jframe();
        //Ponemos el titulo a la ventana para que aparezca en la cabecera
        this.setTitle("BBVA del pueblo");
        //La ventana simepre aparecerá en el centro
        this.setLocationRelativeTo(null);
       
        //Al cerra la ventana llamamos al Binwriter para escribir los datos del objeto cliente
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
               //Pasamos un mensaje al metodo que escribe en el log
                logWriter.writingInFile("Programa finalizado -> "+SupuestoPractico_UT6.obtFecha());
               //Llamamos a escrituaBinario para proceder a meter los datos dentro del fichero
                BinWriter.escrituraBinario();     
                System.exit(0);
            }
        });        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Crear_butt = new javax.swing.JButton();
        Operar_but = new javax.swing.JButton();
        Listar_but = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(252, 254, 255));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Crear_butt.setBackground(new java.awt.Color(20, 84, 156));
        Crear_butt.setForeground(new java.awt.Color(255, 255, 255));
        Crear_butt.setText("Crear Usuario");
        Crear_butt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Crear_butt.setBorderPainted(false);
        Crear_butt.setFocusPainted(false);
        Crear_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_buttActionPerformed(evt);
            }
        });

        Operar_but.setBackground(new java.awt.Color(20, 84, 156));
        Operar_but.setForeground(new java.awt.Color(255, 255, 255));
        Operar_but.setText("Operar Cuenta");
        Operar_but.setAlignmentY(1.0F);
        Operar_but.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Operar_but.setBorderPainted(false);
        Operar_but.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Operar_but.setFocusPainted(false);
        Operar_but.setMaximumSize(new java.awt.Dimension(85, 22));
        Operar_but.setMinimumSize(new java.awt.Dimension(85, 22));
        Operar_but.setPreferredSize(new java.awt.Dimension(85, 22));
        Operar_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Operar_butActionPerformed(evt);
            }
        });

        Listar_but.setBackground(new java.awt.Color(20, 84, 156));
        Listar_but.setForeground(new java.awt.Color(255, 255, 255));
        Listar_but.setText("Listar Usuarios");
        Listar_but.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Listar_but.setBorderPainted(false);
        Listar_but.setFocusPainted(false);
        Listar_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Listar_butActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("<html><body>Con el servicio Cambio de Banco<br>haremos las gestiones por ti</body></html>");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(18, 18, 18));
        jLabel4.setText("<html><body>Una forma gratuita de traer tus ingresos y tus recibos, o toda tu <br> cuenta de otro banco, sin papeleos, sin tener que ir a una oficina <br> y sin hablar con el otro banco.</body></html>");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("<html><body><a href=\"https://www.bbva.es/personas.html\">Ir a la Web</a></body></html>");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(298, 298, 298))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Listar_but, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Operar_but, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Crear_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(339, 339, 339))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(298, 298, 298))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Crear_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Operar_but, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(Listar_but, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(138, 138, 138))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//GEN-FIRST:event_Crear_butActionPerformed
 
//GEN-LAST:event_Crear_butActionPerformed
    //Metodo que contiene la accion del boton Operar_but
    private void Operar_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Operar_butActionPerformed
            //Creamos un objeto de la ventana a la que queremos acceder y lo llamamos o
            FrameOperacion o = new FrameOperacion();
            //La hacemos visible
            o.setVisible (true);
            //Dejamos de ver la ventana en la que estamos
            this.setVisible(false);
    }//GEN-LAST:event_Operar_butActionPerformed
    
    //Metodo que contiene la accion del boton Listar_but
    private void Listar_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Listar_butActionPerformed
            //Creamos un objeto de la ventana a la que queremos acceder y lo llamamos l
            FrameListado l = new FrameListado();
            //La hacemos visible
            l.setVisible (true);
            //Dejamos de ver la ventana en la que estamos
            this.setVisible(false);               
    }//GEN-LAST:event_Listar_butActionPerformed
      
    //Metodo que contiene la accion del boton Crear_butt
    private void Crear_buttActionPerformed(java.awt.event.ActionEvent evt) {
            //Creamos un objeto de la ventana a la que queremos acceder y lo llamamos c
            FrameCrear c = new FrameCrear();
            //La hacemos visible
            c.setVisible (true);
            //Dejamos de ver la ventana en la que estamos
            this.setVisible(false);          
      }
   
    //Icono de la ventana
    private void img_jframe(){
        ImageIcon imgIcon = new ImageIcon("..\\supuestoPractico_UT6\\src\\supuestopractico_ut6\\interfaz\\img/bbva_icon.png");
        this.setIconImage(imgIcon.getImage());      
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crear_butt;
    private javax.swing.JButton Listar_but;
    private javax.swing.JButton Operar_but;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

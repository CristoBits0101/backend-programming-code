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
import supuestopractico_ut6.cliente.*;
import supuestopractico_ut6.files_controller.*;
/**
 *
 * @author Cristo Pérez Suárez
 */

public class FrameCrear extends javax.swing.JFrame {
    /**
     * Creates new form FrameCrear
     */
    
    public FrameCrear() {
        initComponents();
        img_jframe();
        //Ponemos el titulo a la ventana para que aparezca en la cabecera
        this.setTitle("BBVA del pueblo");
        //La ventana siempre aparecerá en el centro
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
    
    //Icono de la ventana
    private void img_jframe(){
        ImageIcon imgIcon = new ImageIcon("..\\supuestoPractico_UT6\\src\\supuestopractico_ut6\\interfaz\\img/bbva_icon.png");
        this.setIconImage(imgIcon.getImage());      
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField_dni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_cuenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_apellidos = new javax.swing.JTextField();
        jTextField_nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_saldo = new javax.swing.JTextField();
        button_crearUsr = new javax.swing.JButton();
        button_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 68, 129));
        jLabel3.setText("<html><body>Hazte cliente con la Cuenta<br>Online Sin Comisiones</body></html>");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(90, 196, 196));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Cuenta Online Sin Comisiones");

        jLabel10.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(18, 18, 18));
        jLabel10.setText("Sin comisión de administración y mantenimiento de la cuenta");

        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(18, 18, 18));
        jLabel12.setText("Sin comisión por emisión y administración de la tarjeta de débito.");

        jLabel15.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(18, 18, 18));
        jLabel15.setText("Sin comisión por retirar efectivo a débito en los más de 6.000 cajeros");

        jLabel17.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(18, 18, 18));
        jLabel17.setText("Sin comisión por transferencias online en el Espacio Económico Europeo. ");

        jTextField_dni.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextField_dni.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_dni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jTextField_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_dniActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("DNI");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Crear Usuario");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setIconTextGap(5);

        jTextField_cuenta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextField_cuenta.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_cuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jTextField_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cuentaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Numero de Cuenta");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Apellidos");

        jTextField_apellidos.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextField_apellidos.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_apellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jTextField_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_apellidosActionPerformed(evt);
            }
        });

        jTextField_nombre.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextField_nombre.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jTextField_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Saldo Inicial");

        jTextField_saldo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextField_saldo.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_saldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_saldo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jTextField_saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_saldoActionPerformed(evt);
            }
        });

        button_crearUsr.setBackground(new java.awt.Color(20, 84, 156));
        button_crearUsr.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_crearUsr.setForeground(new java.awt.Color(255, 255, 255));
        button_crearUsr.setText("Crear Usuario");
        button_crearUsr.setToolTipText("");
        button_crearUsr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_crearUsr.setBorderPainted(false);
        button_crearUsr.setFocusPainted(false);
        button_crearUsr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_crearUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_crearUsrActionPerformed(evt);
            }
        });

        button_volver.setBackground(new java.awt.Color(57, 104, 158));
        button_volver.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        button_volver.setForeground(new java.awt.Color(255, 255, 255));
        button_volver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_volver.setBorderPainted(false);
        button_volver.setFocusPainted(false);
        button_volver.setLabel("Volver");
        button_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addGap(82, 82, 82)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_crearUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(button_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel6)))))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(button_crearUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_volver)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
     
    private void jTextField_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_apellidosActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_apellidosActionPerformed

    private void jTextField_saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_saldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_saldoActionPerformed

    private void jTextField_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombreActionPerformed

    private void jTextField_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_dniActionPerformed

    private void jTextField_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cuentaActionPerformed
   
    //Comprobamos que sea un DNI valido y que no esté repetido en la Base de datos
    private boolean checkDni(){
        String dni = jTextField_dni.getText();
         if (dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false){
            JOptionPane.showMessageDialog(null, "ERROR, el DNI no es valido.");
            return false;
        }
        return true; 
    }
    
    //Las cuentas de clientes no pueden estar repetidas
    private boolean checkCuenta(){
        String numCuenta = jTextField_cuenta.getText().trim();
        //Nos recorremos la lista de clientes en busca de la cuenta
        for(int i=0; i<SupuestoPractico_UT6.cliente.size(); i++){
            if (i == SupuestoPractico_UT6.cliente.size()-1 && numCuenta.equals(SupuestoPractico_UT6.cliente.get(i).getCuenta())){
                  JOptionPane.showMessageDialog(null, "ERROR, La cuenta introducida no es valida o ya existe.");
                  return false;
            }
        }       
        return true;
    } 
    
    //Comprobamos el nombre introducido
    private boolean checkNombre(){
        //Almacenamos la varibale del JtextField y le quitamos los espacios
        String nombre = jTextField_nombre.getText().trim();
        //Recorremos la string
        for (int x = 0; x < nombre.length(); x++) {
            char c = nombre.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) && x == nombre.length()-1) {
                JOptionPane.showMessageDialog(null, "ERROR, el nombre contiene caracteres no soportados.");
                return false;
            }
        }         
        return true;
    }
    
    //Comprobamos el apellido introducido
    private boolean checkApellido(){
        String apellido = jTextField_apellidos.getText();
        //Quitamos los espacios
        String apellidoTrim = apellido.trim();
        //Recorremos la string
        for (int x = 0; x < apellidoTrim.length(); x++) {
            char c = apellidoTrim.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                JOptionPane.showMessageDialog(null, "ERROR, el apellido contiene caracteres no soportados.");
                return false;
            }
        }         
        return true;       
    }
    
    //Comprobamos que el saldo sea de tipo float
    private boolean checkSaldo(){
        float f;
        //Si la string puede ser convertida a float devolvemos true
         try {
            f=Float.parseFloat(jTextField_saldo.getText().trim());  
          }
          catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERROR, el dinero contiene caracteres no soportados.");
            return false;
        }
         
         if (f<0){
            JOptionPane.showMessageDialog(null, "ERROR, el dinero no puede ser negativo.");
            return false;
         }
         
         return true;
     }
    
    private void button_crearUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_crearUsrActionPerformed
        //Llamamos a los datos de cada JFieldText y los almacenamos       
        Cliente aux;
        
        //Llamamos a todas la variables de los textFiled
        String saldo = jTextField_saldo.getText().trim();
        String apellido = jTextField_apellidos.getText().trim();
        String nombre = jTextField_nombre.getText().trim();
        String numCuenta = jTextField_cuenta.getText().trim();
        String dni = jTextField_dni.getText().trim();
        
        System.out.println(checkDni()+" "+checkNombre()+" "+checkSaldo()+" "+checkApellido()+" "+checkCuenta());
        
        //Comporobamos antes de pasar al constructur si todos los parametros son correctos
        if (checkDni() == true && checkNombre() == true && checkSaldo()== true && checkApellido() == true && checkCuenta() == true){
            System.out.println(checkDni()+" "+checkNombre()+" "+checkNombre()+" "+checkSaldo()+" "+checkApellido()+" "+checkCuenta());
            
            //Mandamos los datos al constructor de Cliente
            aux = new Cliente(dni,nombre,apellido,numCuenta,saldo);
            SupuestoPractico_UT6.cliente.add(aux); 
            //Pasamos un mensaje a la clase que se encarga de escribir en el Log
            logWriter.writingInFile("Usuario creado -> "+dni+" Fecha -> "+SupuestoPractico_UT6.obtFecha());
            
            //Cuando termine volvemos a JFrame inicio
            button_volverActionPerformed(evt);
        } else {
            //Mostramos mensaje de error, ya que los datos no se han podido introducir debido a un error
            JOptionPane.showMessageDialog(null, "ERROR, No se ha podido crear a un usuario.");
        }
    }//GEN-LAST:event_button_crearUsrActionPerformed


    
    private void button_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_volverActionPerformed
        //Creamos un objeto de la ventana a la que queremos acceder y lo llamamos c
        FrameInicio i = new FrameInicio();
        //La hacemos visible
        i.setVisible (true);
        //Dejamos de ver la ventana en la que estamos
        this.setVisible(false);
    }//GEN-LAST:event_button_volverActionPerformed
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_crearUsr;
    private javax.swing.JButton button_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_apellidos;
    private javax.swing.JTextField jTextField_cuenta;
    private javax.swing.JTextField jTextField_dni;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_saldo;
    // End of variables declaration//GEN-END:variables
}

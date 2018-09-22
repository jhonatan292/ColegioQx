/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.models.dto;

import co.com.quipux.colegioquipux.models.entity.control_estudiantes;
import javax.swing.JOptionPane;

/**
 *
 * @author JHONATAN CARDONA
 */
public class Interfaz_estudiantes extends javax.swing.JInternalFrame {

    
    public Interfaz_estudiantes() {
        initComponents();
        limpiar();
        bloquear_cajas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_nuevoreg = new javax.swing.JButton();
        jButton_registrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField_carnet = new javax.swing.JTextField();
        jTextField_documento = new javax.swing.JTextField();
        jTextField_nombres = new javax.swing.JTextField();
        jTextField_apellidos = new javax.swing.JTextField();
        jComboBox_sexo = new javax.swing.JComboBox();
        jComboBox_tipodoc = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox_sexo1 = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(4, 99, 123));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jButton_nuevoreg.setBackground(new java.awt.Color(0, 204, 255));
        jButton_nuevoreg.setText("Crear registro");
        jButton_nuevoreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nuevoregActionPerformed(evt);
            }
        });

        jButton_registrar.setBackground(new java.awt.Color(0, 204, 255));
        jButton_registrar.setText("Agregar Registro");
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 255));
        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField_carnet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_carnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_carnetActionPerformed(evt);
            }
        });

        jTextField_documento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_documentoActionPerformed(evt);
            }
        });

        jTextField_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombresActionPerformed(evt);
            }
        });

        jTextField_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_apellidosActionPerformed(evt);
            }
        });

        jComboBox_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        jComboBox_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_sexoActionPerformed(evt);
            }
        });

        jComboBox_tipodoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CC", "TI", "RC", "PASAPORTE", "CE" }));
        jComboBox_tipodoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_tipodocActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ID Estudiante");
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(84, 84));
        jLabel1.setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Documento");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nombres");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Grado");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("T. Documento");

        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Desktop\\QuipuxV1.png")); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Sexo");

        jComboBox_sexo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6°", "7°", "8°", "9°", "10°", "11°", "Profesor" }));
        jComboBox_sexo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_sexo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox_tipodoc, 0, 168, Short.MAX_VALUE)
                            .addComponent(jTextField_apellidos)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox_sexo1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_nuevoreg, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jButton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_carnet, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox_tipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox_sexo1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_nuevoreg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void limpiar()
    {
       jTextField_carnet.setText("");
       jTextField_documento.setText("");
       jTextField_nombres.setText("");
       jTextField_apellidos.setText("");
       
        
    }
    
    public void  bloquear_cajas()
    {
       jTextField_carnet.setEnabled(false);
       jTextField_documento.setEnabled(false);
       jTextField_nombres.setEnabled(false);
       jTextField_apellidos.setEnabled(false);            
       jComboBox_sexo.setEnabled(false); 
       jButton_nuevoreg.setEnabled(true);
       jButton_registrar.setEnabled(false);
       jComboBox_tipodoc.setEnabled(false);
      
       
    }
    public void  desbloquear()
    {
       jTextField_carnet.setEnabled(true);
       jTextField_documento.setEnabled(true);
       jTextField_nombres.setEnabled(true);
       jTextField_apellidos.setEnabled(true);
       jComboBox_sexo.setEnabled(true);       
       jComboBox_tipodoc.setEnabled(true);        
       jButton_registrar.setEnabled(true);
       jButton_nuevoreg.setEnabled(false);
       
       
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed
    String carnet,nom,ape,doc,sex,tipo; 
      
        carnet = jTextField_carnet.getText();
        tipo= jComboBox_tipodoc.getSelectedItem().toString();                
        nom = jTextField_nombres.getText();
        ape = jTextField_apellidos.getText();              
        sex = jComboBox_sexo.getSelectedItem().toString();
        doc = jTextField_documento.getText();
        control_estudiantes est = new control_estudiantes();
        if(!doc.equals("") && !tipo.equals("") && !nom.equals("") && !ape.equals("")  && !sex.equals("")&& !carnet.equals(""))
        {
        if(est.ingresar_estudiante(carnet,doc,tipo,nom,ape,sex))
        {
        JOptionPane.showMessageDialog(null,"Se registro el estudiante ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        bloquear_cajas();
        }
        else
        {
        JOptionPane.showMessageDialog(this, "Error");
        }
        }
        else
        {
          JOptionPane.showMessageDialog(this, "Digita los campos obligatorios");  
        }
        
       
          
                    
    }//GEN-LAST:event_jButton_registrarActionPerformed

    private void jButton_nuevoregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuevoregActionPerformed
    desbloquear();
    jTextField_carnet.requestFocus();
    }//GEN-LAST:event_jButton_nuevoregActionPerformed

    private void jTextField_carnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_carnetActionPerformed
    jTextField_carnet.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_carnetActionPerformed

    private void jTextField_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_documentoActionPerformed
    jTextField_documento.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_documentoActionPerformed

    private void jComboBox_tipodocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_tipodocActionPerformed
    jComboBox_tipodoc.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_tipodocActionPerformed

    private void jTextField_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombresActionPerformed
    jTextField_nombres.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombresActionPerformed

    private void jTextField_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_apellidosActionPerformed
    jTextField_apellidos.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_apellidosActionPerformed

    private void jComboBox_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_sexoActionPerformed
    jComboBox_sexo.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_sexoActionPerformed

    private void jComboBox_sexo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_sexo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_sexo1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_nuevoreg;
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JComboBox jComboBox_sexo;
    private javax.swing.JComboBox jComboBox_sexo1;
    private javax.swing.JComboBox jComboBox_tipodoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField_apellidos;
    private javax.swing.JTextField jTextField_carnet;
    private javax.swing.JTextField jTextField_documento;
    private javax.swing.JTextField jTextField_nombres;
    // End of variables declaration//GEN-END:variables
}
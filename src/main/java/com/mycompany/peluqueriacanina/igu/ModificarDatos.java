package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.ControladoraLogica;
import com.mycompany.peluqueriacanina.logica.Mascota;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ModificarDatos extends javax.swing.JFrame {
// ######################### Creacion de instancia de la controladora de Logica #########################

    ControladoraLogica controlLogic = new ControladoraLogica();
    private int num_cliente;
    
// ######################### Creacion de Objeto Mascota #########################
    
    Mascota mascota; // Objeto de clase Mascota declarado como variable global

// ######################### Constructor de clase #########################
    public ModificarDatos(int num_cliente) {
        this.num_cliente = num_cliente;
        initComponents();
        cargarDatos(num_cliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTituloModificacionDatos = new javax.swing.JLabel();
        txtNombreCliete = new javax.swing.JLabel();
        txtRaza = new javax.swing.JLabel();
        txtColor = new javax.swing.JLabel();
        txtAlergico = new javax.swing.JLabel();
        txtAtEsp = new javax.swing.JLabel();
        txtNombreDuenio = new javax.swing.JLabel();
        txtCelularDuenio = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JLabel();
        razaTF = new javax.swing.JTextField();
        colorTF = new javax.swing.JTextField();
        nombreClienteTF = new javax.swing.JTextField();
        cmbAtEspTF = new javax.swing.JComboBox<>();
        cmbAlergicoTF = new javax.swing.JComboBox<>();
        nombreDuenioTF = new javax.swing.JTextField();
        celularDuenioTF = new javax.swing.JTextField();
        observacionesTF = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTituloModificacionDatos.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 48)); // NOI18N
        txtTituloModificacionDatos.setText("Modificar Datos");

        txtNombreCliete.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        txtNombreCliete.setText("Nombre Cliente:");

        txtRaza.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        txtRaza.setText("Raza:");

        txtColor.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        txtColor.setText("Color:");

        txtAlergico.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        txtAlergico.setText("Alérgico");

        txtAtEsp.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        txtAtEsp.setText("Atención Especial:");

        txtNombreDuenio.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        txtNombreDuenio.setText("Nombre Dueño:");

        txtCelularDuenio.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        txtCelularDuenio.setText("Celular Dueño:");

        txtObservaciones.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        txtObservaciones.setText("Observaciones:");

        razaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razaTFActionPerformed(evt);
            }
        });

        colorTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorTFActionPerformed(evt);
            }
        });

        nombreClienteTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteTFActionPerformed(evt);
            }
        });

        cmbAtEspTF.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        cmbAtEspTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));

        cmbAlergicoTF.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        cmbAlergicoTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));

        nombreDuenioTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreDuenioTFActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btnLimpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreCliete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAlergico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAtEsp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreDuenio)
                    .addComponent(txtCelularDuenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(razaTF)
                    .addComponent(colorTF, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(nombreClienteTF)
                    .addComponent(cmbAtEspTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAlergicoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreDuenioTF)
                    .addComponent(celularDuenioTF)
                    .addComponent(observacionesTF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(txtTituloModificacionDatos)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTituloModificacionDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCliete)
                            .addComponent(nombreClienteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRaza)
                            .addComponent(razaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtColor)
                            .addComponent(colorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAlergico)
                            .addComponent(cmbAlergicoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAtEsp)
                            .addComponent(cmbAtEspTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreDuenio)
                            .addComponent(nombreDuenioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCelularDuenio)
                            .addComponent(celularDuenioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtObservaciones)
                            .addComponent(observacionesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void razaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_razaTFActionPerformed

    private void colorTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorTFActionPerformed

    private void nombreClienteTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteTFActionPerformed

    private void nombreDuenioTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreDuenioTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreDuenioTFActionPerformed
// ######################### Funciones botón Limpiar #########################

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        nombreClienteTF.setText("");
        razaTF.setText("");
        colorTF.setText("");
        nombreDuenioTF.setText("");
        celularDuenioTF.setText("");
        observacionesTF.setText("");
        cmbAlergicoTF.setSelectedIndex(0);
        cmbAtEspTF.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed
// ######################### Funciones botón Guardar #########################

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombreMascota = nombreClienteTF.getText();
        String razaMascota = razaTF.getText();
        String colorMascota = colorTF.getText();
        String nombreDuenio = nombreDuenioTF.getText();
        String celularDuenio = celularDuenioTF.getText();
        String observaciones = observacionesTF.getText();
        String alergico = (String) cmbAlergicoTF.getSelectedItem();
        String atencionEspecial = (String) cmbAtEspTF.getSelectedItem();
        
        controlLogic.modificarMascota(mascota, nombreMascota, razaMascota, colorMascota, nombreDuenio, celularDuenio, observaciones, alergico, atencionEspecial);
        
        // cuando se guarda, se crea un panel de opcion con JOptionPane
        JOptionPane optionPane = new JOptionPane("Se modificó correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        // con JDialog creamos un cuadro de dialogo
        JDialog dialog = optionPane.createDialog("Modificación exitosa");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
// ######################### Cierre de la ventana de edición #########################
        VerDatos pantalla = new VerDatos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField celularDuenioTF;
    private javax.swing.JComboBox<String> cmbAlergicoTF;
    private javax.swing.JComboBox<String> cmbAtEspTF;
    private javax.swing.JTextField colorTF;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreClienteTF;
    private javax.swing.JTextField nombreDuenioTF;
    private javax.swing.JTextField observacionesTF;
    private javax.swing.JTextField razaTF;
    private javax.swing.JLabel txtAlergico;
    private javax.swing.JLabel txtAtEsp;
    private javax.swing.JLabel txtCelularDuenio;
    private javax.swing.JLabel txtColor;
    private javax.swing.JLabel txtNombreCliete;
    private javax.swing.JLabel txtNombreDuenio;
    private javax.swing.JLabel txtObservaciones;
    private javax.swing.JLabel txtRaza;
    private javax.swing.JLabel txtTituloModificacionDatos;
    // End of variables declaration//GEN-END:variables

// ######################### Búsqueda de Objeto Mascota por parte de la Lógica #########################
// ######################### carga de sus datos para posterior edición de los mismos ######################

    private void cargarDatos(int num_cliente) {
        this.mascota= controlLogic.traerMascota(num_cliente);
        nombreClienteTF.setText(mascota.getNombre());
        razaTF.setText(mascota.getRaza());
        colorTF.setText(mascota.getColor());
        nombreDuenioTF.setText(mascota.getDuenioMascotaM().getNombre());
        celularDuenioTF.setText(mascota.getDuenioMascotaM().getCelDuenio());
        observacionesTF.setText(mascota.getObservaciones());

        if (mascota.getAlergico().equals("SI")) {
            cmbAlergicoTF.setSelectedIndex(0);
        } else {
            cmbAlergicoTF.setSelectedIndex(1);
        }

        if (mascota.getAtencionEspecial().equals("SI")) {
            cmbAtEspTF.setSelectedIndex(0);
        } else {
            cmbAtEspTF.setSelectedIndex(1);
        }
    }
}

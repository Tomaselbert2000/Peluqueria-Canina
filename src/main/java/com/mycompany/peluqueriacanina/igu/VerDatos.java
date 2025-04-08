package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.ControladoraLogica;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {

// ######################### Creacion de instancia de la controladora de Logica #########################
    
    ControladoraLogica controlLogic = null;
// ######################### Constructor de la clase #########################
    public VerDatos() {
        controlLogic = new ControladoraLogica();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTituloVerDatos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btEliminarMascota = new javax.swing.JButton();
        btnEditarMascota = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtTituloVerDatos.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 48)); // NOI18N
        txtTituloVerDatos.setText("Visualización de Datos");

        btEliminarMascota.setText("Eliminar");
        btEliminarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarMascotaActionPerformed(evt);
            }
        });

        btnEditarMascota.setText("Editar");
        btnEditarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMascotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btEliminarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(btnEditarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btEliminarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tablaMascotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Datos de Mascotas:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTituloVerDatos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTituloVerDatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// ######################### Funciones botón Eliminar Mascota #########################
    
    private void btEliminarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarMascotaActionPerformed
        if (tablaMascotas.getRowCount() > 0) { // pregunto si hay más de cero filas, es decir, que no este vacía la tabla
            if (tablaMascotas.getSelectedRow() != -1) {// pregunto si se seleccionó una fila, si el resultado es -1, no se seleccionó nada
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                controlLogic.eliminarMascota(num_cliente);
                mostrarMensaje("Mascota eliminada correctamente", "Info", "Eliminación de mascota");
                cargarTabla(); // se actualizan los datos de la tabla
            } else {
                mostrarMensaje("No se seleccionó ninguna mascota", "Error", "Error al Eliminar");
            }
        } else {
            mostrarMensaje("No hay registros para eliminar", "Error", "Error al Eliminar");
        }
    }//GEN-LAST:event_btEliminarMascotaActionPerformed
// ######################### Carga de la tabla de datos #########################
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened
// ######################### Funciones botón Editar Mascota #########################
    
    private void btnEditarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMascotaActionPerformed
        if (tablaMascotas.getRowCount() > 0) {
            if (tablaMascotas.getSelectedRow() != -1) {
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                ModificarDatos pantallaMod = new ModificarDatos(num_cliente);
                pantallaMod.setVisible(true);
                pantallaMod.setLocationRelativeTo(null);
            } else {
                mostrarMensaje("No se seleccionó ninguna mascota", "Error", "Error al editar");
            }
        } else {
            mostrarMensaje("No hay registros para editar", "Error", "Error al editar");
        }
 // ######################### Cierre de ventana Ver Datos #########################
        this.dispose();
    }//GEN-LAST:event_btnEditarMascotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEliminarMascota;
    private javax.swing.JButton btnEditarMascota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    private javax.swing.JLabel txtTituloVerDatos;
    // End of variables declaration//GEN-END:variables

// ######################### Método para carga de la tabla de datos #########################
    
    private void cargarTabla() {
        // definir el modelo que se busca para la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() { // se crea un MODELO DE TABLA, no la tabla gráfica en si que se muestra en la IU
            // con esta instruccion, hacemos que las filas y columnas de la tabla no sean editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // establecer nombres de las columnas
        String titulos[] = {"Nro de Mascota", "Nombre", "Color", "Raza", "Alérgico", "At. Especial", "Dueño", "Cel"};
        modeloTabla.setColumnIdentifiers(titulos); // seteamos los nombres de las columnas mediante codigo

        //########################### Carga de la lista de mascotas desde la Base de Datos ###########################
        List<Mascota> listaMascotas = controlLogic.traerMascotas();
        if (listaMascotas != null) {
            for (Mascota mascota : listaMascotas) { // usamos un For Each
                Object[] objeto = {mascota.getNumCliente(), mascota.getNombre(), mascota.getRaza(), mascota.getColor(), mascota.getAlergico(), // traemos un objeto genérico y usamos sus metodos
                    mascota.getAtencionEspecial(), mascota.getDuenioMascotaM().getNombre(), mascota.getDuenioMascotaM().getCelDuenio()};
                modeloTabla.addRow(objeto); // añadimos una fila por cada atributo de la tabla
            }
        }
        tablaMascotas.setModel(modeloTabla); // al objeto que representa a la tabla en la IU, le asignamos el modelo creado antes
    }
// ######################### Método para crear ventanas emergentes con información para el usuario #########################
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        // con JDialog creamos un cuadro de dialogo
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}

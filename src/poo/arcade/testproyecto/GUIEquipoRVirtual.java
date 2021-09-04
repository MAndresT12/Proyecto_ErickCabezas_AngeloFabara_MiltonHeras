/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.arcade.testproyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Milton
 */
public class GUIEquipoRVirtual extends javax.swing.JFrame {

    /**
     * Creates new form GUIEquipoRVirtual
     */
    public GUIEquipoRVirtual() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbEquipoVirtual = new javax.swing.JComboBox<>();
        lblEquipo = new javax.swing.JLabel();
        lblRealidadVirtual = new javax.swing.JLabel();
        lblSimulacion = new javax.swing.JLabel();
        cmbTipoSimulacion = new javax.swing.JComboBox<>();
        btnCalcularpago = new javax.swing.JButton();
        btnGuardarCobro = new javax.swing.JButton();
        btnCancelarCobro = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipo Realidad Virtual"));

        cmbEquipoVirtual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Valve Index", "Oculus Rift", "HTC Vive", "Oculus Go" }));
        cmbEquipoVirtual.setSelectedIndex(-1);

        lblEquipo.setText("Equipo");

        lblRealidadVirtual.setText("realidad Virtual:");

        lblSimulacion.setText("Tipo de simulacion:");

        cmbTipoSimulacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conduccion", "Shooter", "Visualizacion de entornos", "Patinaje" }));
        cmbTipoSimulacion.setSelectedIndex(-1);

        btnCalcularpago.setText("Calcular Cobro");
        btnCalcularpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularpagoActionPerformed(evt);
            }
        });

        btnGuardarCobro.setText("Guardar Cobro");

        btnCancelarCobro.setText("Cancelar Cobro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEquipo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRealidadVirtual, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(30, 30, 30)
                        .addComponent(cmbEquipoVirtual, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(lblSimulacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTipoSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnCalcularpago)
                                .addGap(35, 35, 35)
                                .addComponent(btnGuardarCobro)))
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarCobro)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEquipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRealidadVirtual))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(cmbEquipoVirtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSimulacion)
                    .addComponent(cmbTipoSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularpago)
                    .addComponent(btnGuardarCobro)
                    .addComponent(btnCancelarCobro))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularpagoActionPerformed
        // TODO add your handling code here:
        try{

        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(rootPane,"ingresar numeros en CI","ERROR",JOptionPane.ERROR_MESSAGE);
        }catch(NullPointerException npe){
            JOptionPane.showMessageDialog(rootPane,"No se guardo el Estudiante","ERROR",JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"otro erros"+e.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularpagoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIEquipoRVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEquipoRVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEquipoRVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEquipoRVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIEquipoRVirtual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularpago;
    private javax.swing.JButton btnCancelarCobro;
    private javax.swing.JButton btnGuardarCobro;
    private javax.swing.JComboBox<String> cmbEquipoVirtual;
    private javax.swing.JComboBox<String> cmbTipoSimulacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEquipo;
    private javax.swing.JLabel lblRealidadVirtual;
    private javax.swing.JLabel lblSimulacion;
    // End of variables declaration//GEN-END:variables
}

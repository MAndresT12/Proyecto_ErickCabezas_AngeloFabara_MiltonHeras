package poo.arcade.testproyecto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;
import poo.clases.proyecto.ConsolaDeVideojuego;

/**
 *
 * @author USUARIO
 */
public class GUIConsola extends javax.swing.JFrame {
ConsolaDeVideojuego consola;
private double cobro;
    /**
     * Creates new form GUIConsola
     */
    public GUIConsola() {
        initComponents();
        btnGuardarCobro.setEnabled(false);
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
        lblConsola = new javax.swing.JLabel();
        cmbConsola = new javax.swing.JComboBox<>();
        lblNumMandos = new javax.swing.JLabel();
        cmbMandos = new javax.swing.JComboBox<>();
        btnCalcularpago = new javax.swing.JButton();
        btnGuardarCobro = new javax.swing.JButton();
        btnCancelarCobro = new javax.swing.JButton();
        txtHorasAlquiladas = new javax.swing.JTextField();
        lblHorasAlquiladas = new javax.swing.JLabel();

        lblConsola.setText("Consola:");

        cmbConsola.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Xbox One", "Xbox Series x", "Wi", "Play4", "Play5" }));
        cmbConsola.setSelectedIndex(-1);

        lblNumMandos.setText("Numero de mandos:");

        cmbMandos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        cmbMandos.setSelectedIndex(-1);

        btnCalcularpago.setText("Calcular Cobro");
        btnCalcularpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularpagoActionPerformed(evt);
            }
        });

        btnGuardarCobro.setText("Guardar Cobro");
        btnGuardarCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCobroActionPerformed(evt);
            }
        });

        btnCancelarCobro.setText("Cancelar Cobro");
        btnCancelarCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCobroActionPerformed(evt);
            }
        });

        lblHorasAlquiladas.setText("Horas alquiladas:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(lblConsola)
                .addGap(18, 18, 18)
                .addComponent(cmbConsola, 0, 196, Short.MAX_VALUE)
                .addGap(167, 167, 167))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnCalcularpago)
                        .addGap(52, 52, 52)
                        .addComponent(btnGuardarCobro)
                        .addGap(37, 37, 37)
                        .addComponent(btnCancelarCobro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumMandos)
                            .addComponent(lblHorasAlquiladas))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHorasAlquiladas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConsola)
                    .addComponent(cmbConsola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumMandos)
                    .addComponent(cmbMandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorasAlquiladas)
                    .addComponent(txtHorasAlquiladas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCobro)
                    .addComponent(btnCalcularpago)
                    .addComponent(btnCancelarCobro))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularpagoActionPerformed
        // TODO add your handling code here:
        try{
            if(llenos()){
                int horasAlquiladas=Integer.parseInt(txtHorasAlquiladas.getText());
                String tipoDeConsola= (String) cmbConsola.getSelectedItem();
                int numMandos= Integer.parseInt((String) cmbMandos.getSelectedItem());
                bloquearCampos();
                consola=new ConsolaDeVideojuego();
                consola.setTipoDeConsola(tipoDeConsola);
                consola.setHorasDealquiler(horasAlquiladas);
                consola.setNumMandos(numMandos);
                cobro=consola.calcularPago();
                JOptionPane.showMessageDialog(rootPane,"Valor a cobrar: "+cobro+"$"
                           ,"Cobro",JOptionPane.INFORMATION_MESSAGE);
                btnGuardarCobro.setEnabled(true);  
            }else{
                JOptionPane.showMessageDialog(rootPane,"Llenar todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(rootPane,"Ingresar numeros enteros en Horas","ERROR",JOptionPane.ERROR_MESSAGE);
        }catch(NullPointerException npe){
            JOptionPane.showMessageDialog(rootPane,"No se calculo el cobro","ERROR",JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"otro error"+e.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCalcularpagoActionPerformed

    private void btnGuardarCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCobroActionPerformed
        // TODO add your handling code here:
        GUICobro.setCobroTotal(cobro);
        FmrMenu.equiposAlquilados.add(consola);
        llimpiar();
        btnGuardarCobro.setEnabled(false);
        desbloquearCampos();
    }//GEN-LAST:event_btnGuardarCobroActionPerformed

    private void btnCancelarCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCobroActionPerformed
        // TODO add your handling code here:
        llimpiar();
        desbloquearCampos();
        btnGuardarCobro.setEnabled(false);
    }//GEN-LAST:event_btnCancelarCobroActionPerformed

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
            java.util.logging.Logger.getLogger(GUIConsola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIConsola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIConsola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIConsola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIConsola().setVisible(true);
            }
        });
    }
    public boolean llenos(){
    boolean txt1=txtHorasAlquiladas.getText().isEmpty();
        if(cmbConsola.getSelectedIndex()!=-1&&txt1!=true){
            return true;
        }else{
            return false;
        }
    }
    public void llimpiar(){
        cmbConsola.setSelectedIndex(-1);
        cmbMandos.setSelectedIndex(-1);
        txtHorasAlquiladas.setText(null);
    }
    public void bloquearCampos(){
        cmbConsola.setEnabled(false);
        cmbMandos.setEnabled(false);
        txtHorasAlquiladas.setEnabled(false);
    }
    public void desbloquearCampos(){
        cmbConsola.setEnabled(true);
        cmbMandos.setEnabled(false);
        txtHorasAlquiladas.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularpago;
    private javax.swing.JButton btnCancelarCobro;
    private javax.swing.JButton btnGuardarCobro;
    private javax.swing.JComboBox<String> cmbConsola;
    private javax.swing.JComboBox<String> cmbMandos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConsola;
    private javax.swing.JLabel lblHorasAlquiladas;
    private javax.swing.JLabel lblNumMandos;
    private javax.swing.JTextField txtHorasAlquiladas;
    // End of variables declaration//GEN-END:variables
}

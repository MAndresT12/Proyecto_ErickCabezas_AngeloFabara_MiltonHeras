package poo.arcade.testproyecto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;
import poo.clases.proyecto.Arcade;

/**
 *
 * @author USUARIO
 */
public class GUIArcade extends javax.swing.JFrame {
    Arcade arcade;
    private double cobro;
    

    /**
     * Creates new form GUIArcade
     */
    public GUIArcade() {
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

        btgNumJugadores = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cmbArcade = new javax.swing.JComboBox<>();
        lblArcade = new javax.swing.JLabel();
        lblNumJugadores = new javax.swing.JLabel();
        rbt1 = new javax.swing.JRadioButton();
        rbt2 = new javax.swing.JRadioButton();
        btnCalcularpago = new javax.swing.JButton();
        btnGuardarCobro = new javax.swing.JButton();
        btnCancelarCobro = new javax.swing.JButton();
        lblHorasAlquiladas = new javax.swing.JLabel();
        txtHorasAlquiladas = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Arcade"));

        cmbArcade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arcade deportivo", "Arcade carreras", "Arcade simulación", "Arcade acción", "Arcade clasico" }));
        cmbArcade.setSelectedIndex(-1);

        lblArcade.setText("Arcade:");

        lblNumJugadores.setText("Número de jugadores:");

        btgNumJugadores.add(rbt1);
        rbt1.setText("1");

        btgNumJugadores.add(rbt2);
        rbt2.setText("2");

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
                .addGap(116, 116, 116)
                .addComponent(lblArcade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbArcade, 0, 155, Short.MAX_VALUE)
                .addGap(108, 108, 108))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(116, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(rbt2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNumJugadores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbt1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblHorasAlquiladas)
                                .addGap(18, 18, 18)
                                .addComponent(txtHorasAlquiladas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcularpago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarCobro)
                        .addGap(4, 4, 4)))
                .addGap(26, 26, 26)
                .addComponent(btnCancelarCobro)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArcade)
                    .addComponent(cmbArcade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumJugadores)
                    .addComponent(rbt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorasAlquiladas)
                    .addComponent(txtHorasAlquiladas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularpago)
                    .addComponent(btnGuardarCobro)
                    .addComponent(btnCancelarCobro))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                String tipoDeArcade= (String) cmbArcade.getSelectedItem();
                bloquearCampos();
                arcade=new Arcade();
                arcade.setTipoDeArcade(tipoDeArcade);
                arcade.setHorasDealquiler(horasAlquiladas);  
                if(rbt1.isSelected()){
                    arcade.setNumJugadores(1);
                }
                if(rbt2.isSelected()){
                    arcade.setNumJugadores(2);
                }
                cobro=arcade.calcularPago();
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
        FmrMenu.equiposAlquilados.add(arcade);
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
            java.util.logging.Logger.getLogger(GUIArcade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIArcade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIArcade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIArcade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIArcade().setVisible(true);
            }
        });
    }
    public boolean llenos(){
    boolean txt1=txtHorasAlquiladas.getText().isEmpty();
        if(cmbArcade.getSelectedIndex()!=-1&&txt1!=true
                &&(rbt1.isSelected()||rbt2.isSelected())){
            return true;
        }else{
            return false;
        }
    }
    public void llimpiar(){
    cmbArcade.setSelectedIndex(-1);
    txtHorasAlquiladas.setText(null);
    btgNumJugadores.clearSelection();
    }
    public void bloquearCampos(){
        cmbArcade.setEnabled(false);
        txtHorasAlquiladas.setEnabled(false);
        rbt1.setEnabled(false);
        rbt2.setEnabled(false);
    }
    public void desbloquearCampos(){
        cmbArcade.setEnabled(true);
        txtHorasAlquiladas.setEnabled(true);
        rbt1.setEnabled(true);
        rbt2.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgNumJugadores;
    private javax.swing.JButton btnCalcularpago;
    private javax.swing.JButton btnCancelarCobro;
    private javax.swing.JButton btnGuardarCobro;
    private javax.swing.JComboBox<String> cmbArcade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblArcade;
    private javax.swing.JLabel lblHorasAlquiladas;
    private javax.swing.JLabel lblNumJugadores;
    private javax.swing.JRadioButton rbt1;
    private javax.swing.JRadioButton rbt2;
    private javax.swing.JTextField txtHorasAlquiladas;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {

        initComponents();
        this.setLocationRelativeTo(null);

    }

    public String generarTipo() {

        String tipo = "";

        if (this.rb_Amigos.isSelected()) {

            tipo = "Amigos";

        } else if (this.rb_Familiar.isSelected()) {

            tipo = "Familiar";

        } else if (this.rb_Negocios.isSelected()) {

            tipo = "Negocios";

        } else {

            JOptionPane.showMessageDialog(null, "Selecciona un tipo");

        }

        return tipo;

    }

    public String generarDestino() {

        String destino = "";

        if (cb_Cancun.isSelected()) {

            destino = "Cancún";

        } else if (cb_Ixtapa.isSelected()) {

            destino = "Ixtapa";

        } else if (cb_Vallarta.isSelected()) {

            destino = "Vallarta";

        } else {

            JOptionPane.showMessageDialog(null, "Introduce un destiino");

        }

        return destino;

    }

    public void slider() {

        int n = 0;

        n = sliderNumeroViajes.getValue();

        this.txt_CantVeces.setText(String.valueOf(n));

    }

    public void getRespuestas() {

        String mensaje;
        int n;

        n = sliderNumeroViajes.getValue();

        if (!generarDestino().equals("") || !generarTipo().equals("")) {

            mensaje = "Tipo: " + generarTipo() + " \nDestino: " + generarDestino() + " \nViajes por año: " + n;

            JOptionPane.showMessageDialog(null, mensaje);

        }

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GupoTipo = new javax.swing.ButtonGroup();
        GrupoDestino = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rb_Familiar = new javax.swing.JRadioButton();
        rb_Amigos = new javax.swing.JRadioButton();
        rb_Negocios = new javax.swing.JRadioButton();
        cb_Cancun = new javax.swing.JCheckBox();
        cb_Vallarta = new javax.swing.JCheckBox();
        cb_Ixtapa = new javax.swing.JCheckBox();
        sliderNumeroViajes = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        btn_Generar = new javax.swing.JButton();
        txt_CantVeces = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Elige un destino turístico:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel2.setText("Elige tipo de viaje:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        GupoTipo.add(rb_Familiar);
        rb_Familiar.setText("Familiar");
        jPanel1.add(rb_Familiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        GupoTipo.add(rb_Amigos);
        rb_Amigos.setText("Amigos");
        jPanel1.add(rb_Amigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        GupoTipo.add(rb_Negocios);
        rb_Negocios.setText("Negocios");
        jPanel1.add(rb_Negocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        GrupoDestino.add(cb_Cancun);
        cb_Cancun.setText("Cancún");
        jPanel1.add(cb_Cancun, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        GrupoDestino.add(cb_Vallarta);
        cb_Vallarta.setText("Vallarta");
        jPanel1.add(cb_Vallarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        GrupoDestino.add(cb_Ixtapa);
        cb_Ixtapa.setText("Ixtapa");
        jPanel1.add(cb_Ixtapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        sliderNumeroViajes.setMaximum(10);
        sliderNumeroViajes.setValue(0);
        sliderNumeroViajes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderNumeroViajesStateChanged(evt);
            }
        });
        jPanel1.add(sliderNumeroViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 350, -1));

        jLabel3.setText("Cantidad de veces que viajas por año:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        btn_Generar.setText("Generar");
        btn_Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        txt_CantVeces.setForeground(new java.awt.Color(153, 153, 255));
        txt_CantVeces.setText("0");
        jPanel1.add(txt_CantVeces, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 40, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderNumeroViajesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderNumeroViajesStateChanged

        slider();

    }//GEN-LAST:event_sliderNumeroViajesStateChanged

    private void btn_GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerarActionPerformed

        getRespuestas();

    }//GEN-LAST:event_btn_GenerarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoDestino;
    private javax.swing.ButtonGroup GupoTipo;
    private javax.swing.JButton btn_Generar;
    private javax.swing.JCheckBox cb_Cancun;
    private javax.swing.JCheckBox cb_Ixtapa;
    private javax.swing.JCheckBox cb_Vallarta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rb_Amigos;
    private javax.swing.JRadioButton rb_Familiar;
    private javax.swing.JRadioButton rb_Negocios;
    private javax.swing.JSlider sliderNumeroViajes;
    private javax.swing.JLabel txt_CantVeces;
    // End of variables declaration//GEN-END:variables
}

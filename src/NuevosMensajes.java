/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karly
 */
public class NuevosMensajes extends javax.swing.JInternalFrame {

    /**
     * Creates new form NuevosMensajes
     */
    public NuevosMensajes() {
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
        mensajeNuevo = new javax.swing.JLabel();
        mensajeNuevo1 = new javax.swing.JLabel();
        lblTNM1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        mensajeNuevo.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        mensajeNuevo.setForeground(new java.awt.Color(255, 255, 255));
        mensajeNuevo.setText("Haz sido aceptado ");

        mensajeNuevo1.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        mensajeNuevo1.setForeground(new java.awt.Color(255, 255, 255));
        mensajeNuevo1.setText("¡FELICIDADES!");

        lblTNM1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        lblTNM1.setForeground(new java.awt.Color(255, 255, 255));
        lblTNM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/correo-electronico.png"))); // NOI18N
        lblTNM1.setText("Tienes nuevos mensajes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(mensajeNuevo1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(mensajeNuevo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblTNM1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTNM1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mensajeNuevo1)
                .addGap(18, 18, 18)
                .addComponent(mensajeNuevo)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 120, 390, 250);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MENSAJES FONDO.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-30, 0, 671, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTNM1;
    private javax.swing.JLabel mensajeNuevo;
    private javax.swing.JLabel mensajeNuevo1;
    // End of variables declaration//GEN-END:variables
}

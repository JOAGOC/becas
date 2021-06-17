
public class Ventana1 extends javax.swing.JFrame {

    public Ventana1(java.awt.Frame owner, boolean modal) {
        super(owner, modal);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        txtCP1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCP3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        tfEdad = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        tfTeléfono = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        tfCelular = new javax.swing.JTextField();
        lblNacionalidad = new javax.swing.JLabel();
        tfNacionalidad = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblEstadoCivil = new javax.swing.JLabel();
        tfEstadoCivil = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        jdchFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        lblCURP = new javax.swing.JLabel();
        tfCURP = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        jpswPassword = new javax.swing.JPasswordField();
        lblConfirmar = new javax.swing.JLabel();
        jpswConfirmar = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("New Gulim", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        txtCP1.setBackground(java.awt.Color.lightGray);
        txtCP1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N

        jLabel16.setBackground(java.awt.Color.lightGray);
        jLabel16.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Curp:");

        jLabel17.setBackground(java.awt.Color.lightGray);
        jLabel17.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Contraseña:");

        txtCP3.setBackground(java.awt.Color.lightGray);
        txtCP3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCP1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(txtCP3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtCP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Información Personal del Alumno:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 820, 90));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        lblNombre.setBackground(java.awt.Color.lightGray);
        lblNombre.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre: ");
        lblNombre.setToolTipText("Ingresa tu nombre completo");
        lblNombre.setMaximumSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        jPanel2.add(lblNombre, gridBagConstraints);

        tfNombre.setBackground(java.awt.Color.lightGray);
        tfNombre.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        tfNombre.setMaximumSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(tfNombre, gridBagConstraints);

        lblEdad.setBackground(java.awt.Color.lightGray);
        lblEdad.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(255, 255, 255));
        lblEdad.setText("Edad: ");
        lblEdad.setMaximumSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lblEdad, gridBagConstraints);

        tfEdad.setBackground(java.awt.Color.lightGray);
        tfEdad.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        tfEdad.setMaximumSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(tfEdad, gridBagConstraints);

        lblCorreo.setBackground(java.awt.Color.lightGray);
        lblCorreo.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo:");
        lblCorreo.setMaximumSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lblCorreo, gridBagConstraints);

        tfCorreo.setBackground(java.awt.Color.lightGray);
        tfCorreo.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        tfCorreo.setMaximumSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(tfCorreo, gridBagConstraints);

        lblTelefono.setBackground(java.awt.Color.lightGray);
        lblTelefono.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Telefono:");
        lblTelefono.setMaximumSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lblTelefono, gridBagConstraints);

        tfTeléfono.setBackground(java.awt.Color.lightGray);
        tfTeléfono.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        tfTeléfono.setMaximumSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(tfTeléfono, gridBagConstraints);

        lblCelular.setBackground(java.awt.Color.lightGray);
        lblCelular.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(255, 255, 255));
        lblCelular.setText("Celular:");
        lblCelular.setMaximumSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lblCelular, gridBagConstraints);

        tfCelular.setBackground(java.awt.Color.lightGray);
        tfCelular.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        tfCelular.setMaximumSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(tfCelular, gridBagConstraints);

        lblNacionalidad.setBackground(java.awt.Color.lightGray);
        lblNacionalidad.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        lblNacionalidad.setText("Nacionalidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lblNacionalidad, gridBagConstraints);

        tfNacionalidad.setBackground(java.awt.Color.lightGray);
        tfNacionalidad.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(tfNacionalidad, gridBagConstraints);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 450));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        lblEstadoCivil.setBackground(java.awt.Color.lightGray);
        lblEstadoCivil.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblEstadoCivil.setForeground(new java.awt.Color(255, 255, 255));
        lblEstadoCivil.setText("Estado Civil:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        jPanel3.add(lblEstadoCivil, gridBagConstraints);

        tfEstadoCivil.setBackground(java.awt.Color.lightGray);
        tfEstadoCivil.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel3.add(tfEstadoCivil, gridBagConstraints);

        lblFechaNacimiento.setBackground(java.awt.Color.lightGray);
        lblFechaNacimiento.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("Fecha de Nacimiento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel3.add(lblFechaNacimiento, gridBagConstraints);

        jdchFechaNacimiento.setFont(tfNacionalidad.getFont());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel3.add(jdchFechaNacimiento, gridBagConstraints);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 290, 140));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("New Gulim", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setLayout(new java.awt.GridBagLayout());

        lblCURP.setBackground(java.awt.Color.lightGray);
        lblCURP.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblCURP.setForeground(new java.awt.Color(255, 255, 255));
        lblCURP.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCURP.setText("Curp:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(lblCURP, gridBagConstraints);

        tfCURP.setBackground(java.awt.Color.lightGray);
        tfCURP.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 214;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel6.add(tfCURP, gridBagConstraints);

        lblPassword.setBackground(java.awt.Color.lightGray);
        lblPassword.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        jPanel6.add(lblPassword, gridBagConstraints);

        jpswPassword.setBackground(java.awt.Color.lightGray);
        jpswPassword.setFont(tfNombre.getFont());
        jpswPassword.setText("jPasswordField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(30, 10, 0, 0);
        jPanel6.add(jpswPassword, gridBagConstraints);

        lblConfirmar.setBackground(java.awt.Color.lightGray);
        lblConfirmar.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblConfirmar.setText("Confirmar:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        jPanel6.add(lblConfirmar, gridBagConstraints);

        jpswConfirmar.setBackground(java.awt.Color.lightGray);
        jpswConfirmar.setFont(tfNombre.getFont());
        jpswConfirmar.setText("jPasswordField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(30, 10, 0, 0);
        jPanel6.add(jpswConfirmar, gridBagConstraints);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 370, 280));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridBagLayout());

        btnRegistrar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnRegistrar.setText("Registrar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel4.add(btnRegistrar, gridBagConstraints);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha-correcta.png"))); // NOI18N
        jLabel11.setToolTipText("Siguiente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 50;
        jPanel4.add(jLabel11, gridBagConstraints);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 220, 150));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abcd.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private com.toedter.calendar.JDateChooser jdchFechaNacimiento;
    private javax.swing.JPasswordField jpswConfirmar;
    private javax.swing.JPasswordField jpswPassword;
    private javax.swing.JLabel lblCURP;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblConfirmar;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField tfCURP;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfEdad;
    private javax.swing.JTextField tfEstadoCivil;
    private javax.swing.JTextField tfNacionalidad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTeléfono;
    private javax.swing.JTextField txtCP1;
    private javax.swing.JTextField txtCP3;
    // End of variables declaration//GEN-END:variables
}

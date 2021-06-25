import static javax.swing.JOptionPane.showMessageDialog;

public class VentanaClabeInterbancaria extends javax.swing.JDialog implements IValidateTextFields {

    public VentanaClabeInterbancaria(java.awt.Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
        lblSiguiente.setVisible(false);
    }

    public VentanaClabeInterbancaria(java.awt.Frame owner, boolean modal) {
        super(owner, modal);
        initComponents();
        lblSiguiente.setVisible(false);
    }

    public VentanaClabeInterbancaria() {
        initComponents();
        lblSiguiente.setVisible(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblSiguiente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblClave = new javax.swing.JLabel();
        lblNombreBanco = new javax.swing.JLabel();
        lblFechaRegistro = new javax.swing.JLabel();
        txtCLABE = new javax.swing.JTextField();
        cmbNombreBanco = new javax.swing.JComboBox<>();
        txtFechaRegistro = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CLABE Interbancaria ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        btnRegistrar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 150, 50));

        lblSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha-correcta.png"))); // NOI18N
        lblSiguiente.setToolTipText("Siguiente");
        getContentPane().add(lblSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblClave.setBackground(java.awt.Color.lightGray);
        lblClave.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblClave.setForeground(new java.awt.Color(255, 255, 255));
        lblClave.setText("CLABE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel1.add(lblClave, gridBagConstraints);

        lblNombreBanco.setBackground(java.awt.Color.lightGray);
        lblNombreBanco.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblNombreBanco.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreBanco.setText("Nombre Banco");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel1.add(lblNombreBanco, gridBagConstraints);

        lblFechaRegistro.setBackground(java.awt.Color.lightGray);
        lblFechaRegistro.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblFechaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaRegistro.setText("Fecha de Registro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(lblFechaRegistro, gridBagConstraints);

        txtCLABE.setBackground(java.awt.Color.lightGray);
        txtCLABE.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 50);
        jPanel1.add(txtCLABE, gridBagConstraints);

        cmbNombreBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AZTECA", "BANAMEX", "BANCOMER", "BANJIO", "HSBC", "SANTANDER" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 50);
        jPanel1.add(cmbNombreBanco, gridBagConstraints);

        txtFechaRegistro.setFont(txtCLABE.getFont());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 180;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(txtFechaRegistro, gridBagConstraints);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 780, 100));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abcd.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            validarCampos();
            if (javax.swing.JOptionPane.showConfirmDialog(this,"¿Deseas almacenar la información?") != javax.swing.JOptionPane.YES_OPTION)
                return;
            Principal.alumnoSesion.setClaveInterbancaria(new ClaveInterbancaria(Principal.alumnoSesion.getCURP(), txtCLABE.getText(),
                     txtFechaRegistro.getCalendar(), true, (String)cmbNombreBanco.getSelectedItem()));
            RegistrarAlumno.guardarAlumnos();
            showMessageDialog(this, "Paso 3: Registro completado");
            this.dispose();
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_btnRegistrarActionPerformed

    private void validarCampos() throws Exception{
        javax.swing.JLabel[] lbls = { lblClave, lblNombreBanco, lblFechaRegistro };
        javax.swing.JTextField[] jtfs = { txtCLABE, null, null };
        for (int i = 0; i < lbls.length; i++) {
            validarCampoVacio(lbls[i], jtfs[i]);
            switch (i) {
                case 0:
                    if (java.util.regex.Pattern.compile("[^0-9]|^[0-9]{0,17}$|^[0-9]{19,}")
                            .matcher(jtfs[i].getText()).find()) {
                        lbls[i].setForeground(java.awt.Color.red);
                        jtfs[i].requestFocus();
                        throw new RuntimeException("Escribe una clave válida de 18 números");
                    }
                    break;
                case 2:
                    validarJCalendarVacio(txtFechaRegistro, lbls[i],"Selecciona una fecha de registro en el calendario");
                    break;
            }
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaClabeInterbancaria.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaClabeInterbancaria.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaClabeInterbancaria.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaClabeInterbancaria.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaClabeInterbancaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbNombreBanco;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblFechaRegistro;
    private javax.swing.JLabel lblNombreBanco;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JTextField txtCLABE;
    private com.toedter.calendar.JDateChooser txtFechaRegistro;
    // End of variables declaration//GEN-END:variables
}

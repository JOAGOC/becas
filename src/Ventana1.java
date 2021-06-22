import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.JOptionPane.showMessageDialog;

import java.io.IOException;
import java.util.Calendar;

public class Ventana1 extends javax.swing.JDialog implements IValidateTextFields {

    public Ventana1(java.awt.Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
    }

    public Ventana1(java.awt.Frame owner, boolean modal) {
        super(owner, modal);
        initComponents();  
        jLabel11.setVisible(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
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
        tfTelefono = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        tfCelular = new javax.swing.JTextField();
        lblNacionalidad = new javax.swing.JLabel();
        tfNacionalidad = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblEstadoCivil = new javax.swing.JLabel();
        cmbEstadoCivil = new javax.swing.JComboBox<>();
        lblFechaNacimiento = new javax.swing.JLabel();
        jdchFechaNacimiento = new com.toedter.calendar.JDateChooser();
        lblLugarNacimiento = new javax.swing.JLabel();
        tfLugarNacimiento = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        tfEdad.setEditable(false);
        tfEdad.setBackground(new java.awt.Color(255, 255, 255));
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

        tfTelefono.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        tfTelefono.setMaximumSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(tfTelefono, gridBagConstraints);

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
        lblEstadoCivil.setVerifyInputWhenFocusTarget(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        jPanel3.add(lblEstadoCivil, gridBagConstraints);

        cmbEstadoCivil.setFont(tfEdad.getFont());
        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SOLTERO", "CASADO", "DIVORCIADO", "VIUDO" }));
        cmbEstadoCivil.setVerifyInputWhenFocusTarget(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel3.add(cmbEstadoCivil, gridBagConstraints);

        lblFechaNacimiento.setBackground(java.awt.Color.lightGray);
        lblFechaNacimiento.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("Fecha de Nacimiento:");
        lblFechaNacimiento.setVerifyInputWhenFocusTarget(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel3.add(lblFechaNacimiento, gridBagConstraints);

        jdchFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        jdchFechaNacimiento.setFont(tfNacionalidad.getFont());
        jdchFechaNacimiento.setVerifyInputWhenFocusTarget(false);
        jdchFechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdchFechaNacimientoPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel3.add(jdchFechaNacimiento, gridBagConstraints);

        lblLugarNacimiento.setBackground(java.awt.Color.lightGray);
        lblLugarNacimiento.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblLugarNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblLugarNacimiento.setText("Lugar de nacimiento:");
        lblLugarNacimiento.setVerifyInputWhenFocusTarget(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel3.add(lblLugarNacimiento, gridBagConstraints);

        tfLugarNacimiento.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        tfLugarNacimiento.setVerifyInputWhenFocusTarget(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel3.add(tfLugarNacimiento, gridBagConstraints);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 270, 230));

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(30, 10, 0, 0);
        jPanel6.add(jpswConfirmar, gridBagConstraints);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 370, 200));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridBagLayout());

        btnRegistrar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
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
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 50;
        jPanel4.add(jLabel11, gridBagConstraints);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 220, 150));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abcd.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Ventana2 v = new Ventana2(this, true);
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jdchFechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_jdchFechaNacimientoPropertyChange
        try {
            if (evt.getPropertyName().equals("date"))
                tfEdad.setText((java.time.LocalDate.now().getYear() - jdchFechaNacimiento.getCalendar().get(1)) + "");
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_jdchFechaNacimientoPropertyChange

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            validarCamposDeRegistro();
            Calendar c = jdchFechaNacimiento.getCalendar();
            Login.alumnos.add(new Alumno(tfNombre.getText().toUpperCase(), tfCURP.getText().toUpperCase(),
                    jpswConfirmar.getText(), tfTelefono.getText(), tfCorreo.getText().toLowerCase(),
                    tfNacionalidad.getText().toUpperCase(), (String) cmbEstadoCivil.getSelectedItem(),
                    tfCelular.getText(),
                    c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR),
                    tfLugarNacimiento.getText().toUpperCase()));
            guardarAlumnos();
            showMessageDialog(this, "Paso 1: Registro completado");
            btnRegistrar.setEnabled(false);
            jLabel11.setVisible(true);
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_btnRegistrarActionPerformed

    private void validarCamposDeRegistro() throws Exception {
        JLabel[] lbls = { lblNombre, lblEdad, lblCorreo, lblTelefono, lblCelular, lblNacionalidad, lblEstadoCivil,
                lblFechaNacimiento, lblLugarNacimiento, lblCURP, lblPassword, lblConfirmar };
        JTextField[] jtfs = { tfNombre, tfEdad, tfCorreo, tfTelefono, tfCelular, tfNacionalidad, null, null,
                tfLugarNacimiento, tfCURP, jpswPassword, jpswConfirmar };
        for (int i = 0; i < jtfs.length; i++) {
            validarCampoVacio(lbls[i], jtfs[i]);
            switch (i) {
                case 0, 5, 8:
                    validarFormatoTexto(lbls[i], jtfs[i]);
                    break;
                case 1:
                    if (jdchFechaNacimiento.getDate() == null) {
                        throw new RuntimeException("Selecciona en el selector de fechas tu fecha de nacimiento");
                    }
                    int x = Integer.parseInt(jtfs[i].getText());
                    if (x < 17 || x > 60) {
                        lbls[i].setForeground(java.awt.Color.red);
                        jtfs[i].requestFocus();
                        throw new RuntimeException("La edad que se registra no es válida: Parámetro 17-60 años");
                    }
                    break;
                case 2:
                    validarCorreo(lbls[i], jtfs[i]);
                    break;
                case 3, 4:
                    validarFormatoNumerico(lbls[i], jtfs[i]);
                    if (jtfs[i].getText().length() < 10) {
                        lbls[i].setForeground(java.awt.Color.red);
                        jtfs[i].requestFocus();
                        throw new RuntimeException("Error en " + lbls[i].getText()
                                + ":\nEl número telefónico debe tener al menos 10 dígitos");
                    }
                    break;
                case 9:
                    if (jtfs[i].getText().length() != 18) {
                        lbls[i].setForeground(java.awt.Color.red);
                        jtfs[i].requestFocus();
                        throw new RuntimeException("La CURP debe tener 18 caracteres, revisa tu entrada");
                    }
                    break;
                case 10:
                    validarContrasenia(lbls[i], jtfs[i]);
                    break;
                case 11:
                    if (!jtfs[i].getText().equals(jtfs[i - 1].getText())) {
                        lbls[i].setForeground(java.awt.Color.red);
                        jtfs[i].requestFocus();
                        throw new RuntimeException("Las contraseñas no coinciden, revisa tu entrada");
                    }
                    break;
            }
        }
    }

    private void validarContrasenia(JLabel lbl, JTextField jtf) throws RuntimeException {
        if (jtf.getText().length() < 8) {
            lbl.setForeground(java.awt.Color.red);
            jtf.requestFocus();
            throw new RuntimeException("La contraseña debe tener al menos 8 caracteres");
        }
        String entrada = jtf.getText();
        if (!java.util.regex.Pattern.compile("[a-z]").matcher(entrada).find()
                || !java.util.regex.Pattern.compile("[A-Z]").matcher(entrada).find()
                || !java.util.regex.Pattern.compile("[0-9]").matcher(entrada).find()
                || java.util.regex.Pattern.compile("[^\\w]").matcher(entrada).find()) {
            lbl.setForeground(java.awt.Color.red);
            jtf.requestFocus();
            throw new RuntimeException(
                    "La contraseña debe contener solo caracteres alfanuméricos:\nAl menos una letra minúscula, al menos una letra mayúscula y un número (Las letras no deben contener acentos)");
        }
    }

    private void validarCorreo(JLabel lbl, JTextField jtf) throws RuntimeException {
        if (!java.util.regex.Pattern
                .compile("^[_A-Za-z0-9-\\.+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
                .matcher(jtf.getText()).matches()) {
            lbl.setForeground(java.awt.Color.red);
            jtf.requestFocus();
            throw new RuntimeException("El correo introducido no es válido");
        }
    }

    private void guardarAlumnos() throws Exception {
        java.io.BufferedWriter bw = null;
        try {
            bw = new java.io.BufferedWriter(new java.io.FileWriter(Login.FILE_NAME));
        } catch (IOException e) {
        }
        String alumnosTxt = "";
        for (Alumno a : Login.alumnos) {
            alumnosTxt += a.getNombre() + "|" + a.getCURP() + "|" + a.getContraseña() + "|" + a.getTelefono() + "|"
                    + a.getCorreo() + "|" + a.getNacionalidad() + "|" + a.getEstadoCivil() + "|" + a.getCelular() + "|"
                    + a.getFechaDeNacimiento() + "|" + a.getLugarDeNacimiento() + "\n";
        }
        bw.write(alumnosTxt);
        bw.flush();
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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1(new javax.swing.JDialog(), true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbEstadoCivil;
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
    private javax.swing.JLabel lblLugarNacimiento;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField tfCURP;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfEdad;
    private javax.swing.JTextField tfLugarNacimiento;
    private javax.swing.JTextField tfNacionalidad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    private javax.swing.JTextField txtCP1;
    private javax.swing.JTextField txtCP3;
    // End of variables declaration//GEN-END:variables
}

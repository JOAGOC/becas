import java.util.ArrayList;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.io.IOException;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class Ventana2 extends javax.swing.JDialog implements IValidateTextFields {

    public Ventana2(Frame dial, boolean bln) {
        super(dial, bln);
        initComponents();
        txtDUbicacion.setLineWrap(true);
        txtDUbicacion.setWrapStyleWord(true);
        try {
            leerResidenciaAlumno();
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel5 = new javax.swing.JPanel();
        btnRegistrar2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblEstado = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        lblMunicipio = new javax.swing.JLabel();
        cmbMunicipio = new javax.swing.JComboBox<>();
        lblCP = new javax.swing.JLabel();
        txtCP2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblAsentamiento = new javax.swing.JLabel();
        txtAsentamiento = new javax.swing.JTextField();
        lblLocalidad = new javax.swing.JLabel();
        txtLocalidad = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblCalle = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        lblNoInterior = new javax.swing.JLabel();
        txtNumInterior = new javax.swing.JTextField();
        lblNumExterior = new javax.swing.JLabel();
        txtExterior = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDUbicacion = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridBagLayout());

        btnRegistrar2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnRegistrar2.setText("Registrar");
        btnRegistrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel5.add(btnRegistrar2, gridBagConstraints);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha-correcta.png"))); // NOI18N
        jLabel12.setToolTipText("Siguiente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 50;
        jPanel5.add(jLabel12, gridBagConstraints);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 220, 150));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        lblEstado.setBackground(java.awt.Color.lightGray);
        lblEstado.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Estado:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        jPanel2.add(lblEstado, gridBagConstraints);

        cmbEstado.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona tu Estado",
                "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua",
                "Coahuila", "Colima", "Ciudad de México", "Durango", "Estado de México", "Guanajuato", "Guerrero",
                "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro",
                "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz",
                "Yucatán", "Zacatecas" }));
        cmbEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstadoItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(cmbEstado, gridBagConstraints);

        lblMunicipio.setBackground(java.awt.Color.lightGray);
        lblMunicipio.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblMunicipio.setForeground(new java.awt.Color(255, 255, 255));
        lblMunicipio.setText("Municipio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lblMunicipio, gridBagConstraints);

        cmbMunicipio.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        cmbMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona tu municipio" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(cmbMunicipio, gridBagConstraints);

        lblCP.setBackground(java.awt.Color.lightGray);
        lblCP.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblCP.setForeground(new java.awt.Color(255, 255, 255));
        lblCP.setText("C.P.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lblCP, gridBagConstraints);

        txtCP2.setBackground(java.awt.Color.lightGray);
        txtCP2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(txtCP2, gridBagConstraints);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 230, -1));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblAsentamiento.setBackground(java.awt.Color.lightGray);
        lblAsentamiento.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblAsentamiento.setForeground(new java.awt.Color(255, 255, 255));
        lblAsentamiento.setText("Asentamiento: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(lblAsentamiento, gridBagConstraints);

        txtAsentamiento.setBackground(java.awt.Color.lightGray);
        txtAsentamiento.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(txtAsentamiento, gridBagConstraints);

        lblLocalidad.setBackground(java.awt.Color.lightGray);
        lblLocalidad.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblLocalidad.setForeground(new java.awt.Color(255, 255, 255));
        lblLocalidad.setText("Localidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(lblLocalidad, gridBagConstraints);

        txtLocalidad.setBackground(java.awt.Color.lightGray);
        txtLocalidad.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 6, 0);
        jPanel1.add(txtLocalidad, gridBagConstraints);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 210, 140));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        lblCalle.setBackground(java.awt.Color.lightGray);
        lblCalle.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblCalle.setForeground(new java.awt.Color(255, 255, 255));
        lblCalle.setText("Calle:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(lblCalle, gridBagConstraints);

        txtCalle.setBackground(java.awt.Color.lightGray);
        txtCalle.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel3.add(txtCalle, gridBagConstraints);

        lblNoInterior.setBackground(java.awt.Color.lightGray);
        lblNoInterior.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblNoInterior.setForeground(new java.awt.Color(255, 255, 255));
        lblNoInterior.setText("No. Interior:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel3.add(lblNoInterior, gridBagConstraints);

        txtNumInterior.setBackground(java.awt.Color.lightGray);
        txtNumInterior.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        txtNumInterior.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel3.add(txtNumInterior, gridBagConstraints);

        lblNumExterior.setBackground(java.awt.Color.lightGray);
        lblNumExterior.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblNumExterior.setForeground(new java.awt.Color(255, 255, 255));
        lblNumExterior.setText("No. Exterior: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel3.add(lblNumExterior, gridBagConstraints);

        txtExterior.setBackground(java.awt.Color.lightGray);
        txtExterior.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel3.add(txtExterior, gridBagConstraints);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 200, 210));

        jLabel9.setBackground(java.awt.Color.lightGray);
        jLabel9.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descripcion de la ubicación: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Residencia del Alumno:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 502, 90));

        txtDUbicacion.setColumns(20);
        txtDUbicacion.setRows(5);
        jScrollPane1.setViewportView(txtDUbicacion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 660, 160));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abcd.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrar2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRegistrar2ActionPerformed
        try {
            validarCamposDeRegistro();
            ResidenciaAlumnos.add(new ResidenciaAlumno((String)cmbEstado.getSelectedItem(), (String)cmbMunicipio.getSelectedItem(), txtAsentamiento.getText().toUpperCase(), txtLocalidad.getText().toUpperCase(), txtExterior.getText(), txtNumInterior.getText(), txtDUbicacion.getText(), txtCalle.getText().toUpperCase(), Principal.alumnoSesion.getCURP(), txtCP2.getText()));
            guardarResidenciaAlumno();
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_btnRegistrar2ActionPerformed

    private void cmbEstadoItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_cmbEstadoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.cmbEstado.getSelectedIndex() > 0) {
                this.cmbMunicipio.setModel(
                        new DefaultComboBoxModel<String>(this.getMunucipios(this.cmbEstado.getSelectedItem().toString())));
            }
        }
    }// GEN-LAST:event_cmbEstadoItemStateChanged

    private void validarCamposDeRegistro() throws Exception {
        javax.swing.JLabel[] lbls = { lblEstado, lblMunicipio, lblCP, lblCalle, lblNoInterior, lblNumExterior,
                lblAsentamiento, lblLocalidad, jLabel9 };
        JTextField[] jtfs = { null, null, txtCP2, txtCalle, txtNumInterior, txtExterior, txtAsentamiento, txtLocalidad,
                null };
        for (int i = 0; i < jtfs.length; i++) {
            validarCampoVacio(lbls[i], jtfs[i]);
            switch (i) {
                case 0, 1:
                    if (cmbEstado.getSelectedIndex() == 0) {
                        showMessageDialog(this, "Por favor selecciona una opción de " + lbls[i].getText());
                        lbls[i].setForeground(java.awt.Color.red);
                    }
                    break;
                case 2:
                    validarFormatoNumerico(lbls[i], jtfs[i]);
                    if (jtfs[i].getText().length() != 5) {
                        lbls[i].setForeground(java.awt.Color.red);
                        jtfs[i].requestFocus();
                        throw new RuntimeException(
                                "Error en " + lbls[i].getText() + ":\nEl Código Postal debe tener al menos 5 dígitos");
                    }
                    break;
                case 4, 5:
                    validarFormatoNumerico(lbls[i], jtfs[i]);
                    if (jtfs[i].getText().length() < 8) {
                        lbls[i].setForeground(java.awt.Color.red);
                        jtfs[i].requestFocus();
                        throw new RuntimeException("Error en " + lbls[i].getText() + ":\nEl Número debe ser valido");
                    }
                    break;
                case 6, 7:
                    validarFormatoTexto(lbls[i], jtfs[i]);
                    break;
                case 8:
                    if ("".equals(txtDUbicacion.getText())) {
                        lbls[i].setForeground(java.awt.Color.red);
                        txtDUbicacion.requestFocus();
                        throw new RuntimeException(
                                "Error en " + lbls[i].getText() + ":\nLa descripción no puede quedar vacía");
                    }
            }
        }
    }

    public String[] getMunucipios(String Estado) {
        String[] M = new String[12];
        if (Estado.equalsIgnoreCase("Aguascalientes")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "AGUASCALIENTES";
            M[2] = "ASIENTOS";
            M[3] = "CALVILLO";
            M[4] = "COSÍO";
            M[5] = "JESÚS MARÍA";
            M[6] = "PABELLÓN DE ARTEAGA";
            M[7] = "RINCÓN DE ROMOS";
            M[8] = "SAN JOSÉ DE GRACIA";
            M[9] = "TEPEZALÁ";
            M[10] = "EL LLANO";
            M[11] = "SAN FRANCISCO DE LOS ROMO";
        }
        if (Estado.equalsIgnoreCase("Baja California")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "ENSENADA";
            M[2] = "MEXICALI";
            M[3] = "PLAYAS DE ROSARITO";
            M[4] = "TECATE";
            M[5] = "TIJUANA";
        }
        if (Estado.equalsIgnoreCase("Baja California Sur")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "COMONDÚ";
            M[2] = "MULEGÉ";
            M[3] = "LA PAZ";
            M[4] = "LOS CABOS";
            M[5] = "LORETO";
        }
        if (Estado.equalsIgnoreCase("Campeche")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "CALKINÍ";
            M[2] = "CAMPECHE";
            M[3] = "CARMEN";
            M[4] = "CHAMPOTÓN";
            M[5] = "HECELCHAKÁN";
            M[6] = "HOPELCHÉN";
            M[7] = "PALIZADA";
            M[8] = "TENABO";
            M[9] = "ESCÁRCEGA";
            M[10] = "CALAKMUL";
            M[11] = "CANDELARIA";
        }
        if (Estado.equalsIgnoreCase("Chiapas")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "ACACOYAGUA";
            M[2] = "ACALA";
            M[3] = "ACAPETAHUA";
            M[4] = "ALTAMIRANO";
            M[5] = "AMATÁN";
            M[6] = "AMATENANGO DE LA FRONTERA";
            M[7] = "AMATENANGO DEL VALLE";
            M[8] = "ANGEL ALBINO CORZO";
            M[9] = "ARRIAGA";
            M[10] = "BEJUCAL DE OCAMPO";
            M[11] = "BELLA VISTA";
        }
        if (Estado.equalsIgnoreCase("Chihuahua")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "AHUMADA";
            M[2] = "ALDAMA";
            M[3] = "ALLENDE";
            M[4] = "AQUILES SERDÁN";
            M[5] = "ASCENSIÓN";
            M[6] = "BACHÍNIVA";
            M[7] = "BALLEZA";
            M[8] = "BATOPILAS";
            M[9] = "BOCOYNA";
            M[10] = "BUENAVENTURA";
            M[11] = "CAMARGO";
        }
        if (Estado.equalsIgnoreCase("Coahuila")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "ABASOLO";
            M[2] = "ACUÑA";
            M[3] = "ALLENDE";
            M[4] = "ARTEAGA";
            M[5] = "CANDELA";
            M[6] = "CASTAÑOS";
            M[7] = "CUATRO CIÉNEGAS";
            M[8] = "ESCOBEDO";
            M[9] = "FRANCISCO I. MADERO";
            M[10] = "FRONTERA";
            M[11] = "GENERAL CEPEDA";
        }
        if (Estado.equalsIgnoreCase("Colima")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = " ARMERÍA";
            M[2] = "COLIMA";
            M[3] = "COMALA";
            M[4] = "COQUIMATLÁN";
            M[5] = "CUAUHTÉMOC";
            M[6] = "IXTLAHUACÁN";
            M[7] = "MANZANILLO";
            M[8] = "MINATITLÁN";
            M[9] = "TECOMÁN";
            M[10] = "VILLA DE ÁLVAREZ";
        }
        if (Estado.equalsIgnoreCase("Ciudad de México")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "AZCAPOTZALCO";
            M[2] = "COYOACÁN";
            M[3] = "CUAJIMALPA DE MORELOS";
            M[4] = "GUSTAVO A. MADERO";
            M[5] = "IZTACALCO";
            M[6] = "IZTAPALAPA";
            M[7] = "LA MAGDALENA CONTRERAS";
            M[8] = "MILPA ALTA";
            M[9] = "ÁLVARO OBREGÓN";
            M[10] = "TLÁHUAC";
            M[11] = "TLALPAN";
        }
        if (Estado.equalsIgnoreCase("Durango")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "DURANGO";
            M[2] = "CANATLÁN";
            M[3] = "CANELAS";
            M[4] = "CONETO DE COMONFORT";
            M[5] = "CUENCAMÉ";
            M[6] = "GENERAL SIMÓN BOLÍVAR";
            M[7] = "GÓMEZ PALACIO";
            M[8] = "GUADALUPE VICTORIA";
            M[9] = "GUANACEVÍ";
            M[10] = "HIDALGO";
            M[11] = "INDÉ";
        }
        if (Estado.equalsIgnoreCase("Estado de México")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "TULTEPEC";
            M[2] = "TULTITLÁN";
            M[3] = "VALLE DE BRAVO";
            M[4] = "VILLA DE ALLENDE";
            M[5] = "VILLA DEL CARBÓN";
            M[6] = "VILLA GUERRERO";
            M[7] = "VILLA VICTORIA";
            M[8] = "XONACATLÁN";
            M[9] = "ZACAZONAPAN";
            M[10] = "ZACUALPAN";
            M[11] = "ZINACANTEPEC";
        }

        if (Estado.equalsIgnoreCase("Guanajuato")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "CORONEO";
            M[2] = "CORTAZAR";
            M[3] = "CUERÁMARO";
            M[4] = "DOCTOR MORA";
            M[5] = "DOLORES HIDALGO CUNA DE LA INDEPENDENCIA NACIONAL";
            M[6] = "GUANAJUATO";
            M[7] = "HUANÍMARO";
            M[8] = "IRAPUATO";
            M[9] = "JARAL DEL PROGRESO";
            M[10] = "JERÉCUARO";
            M[11] = "LEÓN";
        }

        if (Estado.equalsIgnoreCase("Guerrero")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "ACAPULCO DE JUÁREZ";
            M[2] = "AHUACUOTZINGO";
            M[3] = "AJUCHITLÁN DEL PROGRESO";
            M[4] = "BENITO JUÁREZ";
            M[5] = "BUENAVISTA DE CUÉLLAR";
            M[6] = "COAHUAYUTLA DE JOSÉ MARÍA IZAZAGA";
            M[7] = "COCULA";
            M[8] = "MÁRTIR DE CUILAPAN";
            M[9] = "METLATÓNOC";
            M[10] = "MOCHITLÁN";
            M[11] = "OLINALÁ";
        }

        if (Estado.equalsIgnoreCase("Hidalgo")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "ACATLÁN";
            M[2] = "ACAXOCHITLÁN";
            M[3] = "ACTOPAN";
            M[4] = "CHAPANTONGO";
            M[5] = "CHAPULHUACÁN";
            M[6] = "CHILCUAUTLA";
            M[7] = "ELOXOCHITLÁN";
            M[8] = "IXMIQUILPAN";
            M[9] = "JACALA DE LEDEZMA";
            M[10] = "JALTOCÁN";
            M[11] = "ZIMAPÁN";
        }

        if (Estado.equalsIgnoreCase("Jalisco")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "ACATIC";
            M[2] = "ACATLÁN DE JUÁREZ";
            M[3] = "AHUALULCO DE MERCADO";
            M[4] = "CUAUTITLÁN DE GARCÍA BARRAGÁN";
            M[5] = "CUAUTLA";
            M[6] = "CUQUÍO";
            M[7] = "HOSTOTIPAQUILLO";
            M[8] = "HUEJÚCAR";
            M[9] = "ZAPOTLÁN DEL REY";
            M[10] = "ZAPOTLANEJO";
            M[11] = "SAN IGNACIO CERRO GORDO";
        }
        if (Estado.equalsIgnoreCase("Michoacán")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "ACUITZIO";
            M[2] = "AGUILILLA";
            M[3] = "ÁLVARO OBREGÓN";
            M[4] = "COAHUAYANA";
            M[5] = "COALCOMÁN DE VÁZQUEZ PALLARES";
            M[6] = "COENEO";
            M[7] = "PURÉPERO";
            M[8] = "ZIRACUARETIRO";
            M[9] = "ZITÁCUARO";
            M[10] = "JOSÉ SIXTO VERDUZCO";
            M[11] = "TURICATO";
        }

        if (Estado.equalsIgnoreCase("Morelos")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "AMACUZAC";
            M[2] = "ATLATLAHUCAN";
            M[3] = "AHUALULCO DE MERCADO";
            M[4] = "AYALA";
            M[5] = "COATLÁN DEL RÍO";
            M[6] = "CUAUTLA";
            M[7] = "CUERNAVACA";
            M[8] = "EMILIANO ZAPATA";
            M[9] = "HUITZILAC";
            M[10] = "JANTETELCO";
            M[11] = "JIUTEPEC";
        }
        if (Estado.equalsIgnoreCase("Nayarit")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "ACAPONETA";
            M[2] = "AHUACATLÁN";
            M[3] = "AMATLÁN DE CAÑAS";
            M[4] = "COMPOSTELA";
            M[5] = "HUAJICORI";
            M[6] = "IXTLÁN DEL RÍO";
            M[7] = "JALA";
            M[8] = "XALISCO";
            M[9] = "DEL NAYAR";
            M[10] = "TEPIC";
            M[11] = "LA YESCA";
        }
        if (Estado.equalsIgnoreCase("Nuevo León")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "ABASOLO";
            M[2] = "AGUALEGUAS";
            M[3] = "LOS ALDAMAS";
            M[4] = "ALLENDE";
            M[5] = "ANÁHUAC";
            M[6] = "APODACA";
            M[7] = "ARAMBERRI";
            M[8] = "BUSTAMANTE";
            M[9] = "CADEREYTA JIMÉNEZ";
            M[10] = "EL CARMEN";
            M[11] = "CERRALVO";
        }

        if (Estado.equalsIgnoreCase("Oaxaca")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "ASUNCIÓN OCOTLÁN";
            M[2] = "ASUNCIÓN TLACOLULITA";
            M[3] = "AYOTZINTEPEC";
            M[4] = "EL BARRIO DE LA SOLEDAD";
            M[5] = "CALIHUALÁ";
            M[6] = "CANDELARIA LOXICHA";
            M[7] = "CIÉNEGA DE ZIMATLÁN";
            M[8] = "CIUDAD IXTEPEC";
            M[9] = "COATECAS ALTAS";
            M[10] = "COICOYÁN DE LAS FLORES";
            M[11] = "LA COMPAÑÍA";
        }

        if (Estado.equalsIgnoreCase("Puebla")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "ATZITZINTLA";
            M[2] = "AXUTLA";
            M[3] = "AYOTOXCO DE GUERRERO";
            M[4] = "CALPAN";
            M[5] = "CALTEPEC";
            M[6] = "CAMOCUAUTLA";
            M[7] = "CAXHUACAN";
            M[8] = "COATEPEC";
            M[9] = "COATZINGO";
            M[10] = "COHETZALA";
            M[11] = "COHUECAN";
        }
        if (Estado.equalsIgnoreCase("Querétaro")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "AMEALCO DE BONFIL";
            M[2] = "PINAL DE AMOLES";
            M[3] = "ARROYO SECO";
            M[4] = "CADEREYTA DE MONTES";
            M[5] = "COLÓN";
            M[6] = "CORREGIDORA";
            M[7] = "EZEQUIEL MONTES";
            M[8] = "HUIMILPAN";
            M[9] = "JALPAN DE SERRA";
            M[10] = "LANDA DE MATAMOROS";
            M[11] = "EL MARQUÉS";
        }

        if (Estado.equalsIgnoreCase("Quintana Roo")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "COZUMEL";
            M[2] = "FELIPE CARRILLO PUERTO";
            M[3] = "ISLA MUJERES";
            M[4] = "OTHÓN P. BLANCO";
            M[5] = "BENITO JUÁREZ";
            M[6] = "JOSÉ MARÍA MORELOS";
            M[7] = "LÁZARO CÁRDENAS";
            M[8] = "SOLIDARIDAD";
            M[9] = "TULUM";
            M[10] = "BACALAR";
            M[11] = "PUERTO MORELOS";
        }
        if (Estado.equalsIgnoreCase("Zacatecas")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "HUANUSCO ";
            M[2] = "FRESNILLO";
            M[3] = "CONCEPCIÓN DEL ORO";
            M[4] = "TEPECHITLÁN ";
            M[5] = "SOMBRERETE ";
            M[6] = "SAIN ALTO ";
            M[7] = "MOMAX";
            M[8] = "MAZAPIL";
            M[9] = "JUCHIPILA";
            M[10] = "CALERA ";
            M[11] = "JEREZ ";
        }

        if (Estado.equalsIgnoreCase("Yucatán")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "TEKIT";
            M[2] = "TEKANTÓ";
            M[3] = "PETO";
            M[4] = "OXKUTZCAB ";
            M[5] = "MUNA ";
            M[6] = "DZITÁS ";
            M[7] = "HUHÍ ";
            M[8] = "HOCTÚN ";
            M[9] = "CANSAHCAB ";
            M[10] = "CALOTMUL ";
            M[11] = "AKIL ";
        }
        if (Estado.equalsIgnoreCase("Veracruz")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "UXPANAPA";
            M[2] = "ZENTLA";
            M[3] = "YANGA";
            M[4] = "XOXOCOTLA";
            M[5] = "VERACRUZ";
            M[6] = "TOMATLÁN";
            M[7] = "TLAQUILPA";
            M[8] = "TLACOLULAN";
            M[9] = "TEQUILA";
            M[10] = "TEOCELO";
            M[11] = "NAUTLA";
        }
        if (Estado.equalsIgnoreCase("Tlaxcala")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "HUAMANTLA";
            M[2] = "ESPAÑITA";
            M[3] = "ZACATELCO";
            M[4] = "YAUHQUEMEHCAN";
            M[5] = "XALOZTOC";
            M[6] = "TLAXCALA";
            M[7] = "TERRENATE";
            M[8] = "TEOLOCHOLCO";
            M[9] = "APIZACO";
            M[10] = "CUAPIAXTLA ";
            M[11] = "ATLANGATEPEC ";
        }

        if (Estado.equalsIgnoreCase("Tamaulipas")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "VICTORIA";
            M[2] = "TAMPICO";
            M[3] = "PADILLA";
            M[4] = "OCAMPO";
            M[5] = "MIQUIHUANA";
            M[6] = "MIER";
            M[7] = "JIMÉNEZ";
            M[8] = "GUERRERO";
            M[9] = "GÜÉMEZ";
            M[10] = "CASAS";
            M[11] = "ALDAMA";
        }
        if (Estado.equalsIgnoreCase("Tabasco")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "TEAPA";
            M[2] = "PARAÍSO";
            M[3] = "NACAJUCA";
            M[4] = "JONUTA";
            M[5] = "JALAPA";
            M[6] = "HUIMANGUILLO";
            M[7] = "CUNDUACÁN";
            M[8] = "COMALCALCO";
            M[9] = "CENTLA";
            M[10] = "TENOSIQUE";
            M[11] = "TACOTALPA";
        }

        if (Estado.equalsIgnoreCase("Sonora")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "YÉCORA";
            M[2] = "URES";
            M[3] = "TEPACHE";
            M[4] = "SOYOPA";
            M[5] = "ROSARIO";
            M[6] = "RAYÓN";
            M[7] = "PITIQUITO";
            M[8] = "NAVOJOA";
            M[9] = "MAZATÁN";
            M[10] = "HUÁSABAS";
            M[11] = "HERMOSILLO";
        }

        if (Estado.equalsIgnoreCase("Sinaloa")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "CONCORDIA ";
            M[2] = "COSALÁ ";
            M[3] = "CULIACÁN ";
            M[4] = "CHOIX ";
            M[5] = "ELOTA ";
            M[6] = "ESCUINAPA ";
            M[7] = "GUASAVE ";
            M[8] = "NAVOJOA";
            M[9] = "ROSARIO";
            M[10] = "SINALOA";
            M[11] = "NAVOLATO";
        }

        if (Estado.equalsIgnoreCase("San Luis Potosí")) {
            M[0] = "Selecciona tu Municipio";
            M[1] = "MATLAPA";
            M[2] = "ZARAGOZA";
            M[3] = "XILITLA";
            M[4] = "VENADO";
            M[5] = "VANEGAS";
            M[6] = "TANLAJÁS";
            M[7] = "TAMUÍN";
            M[8] = "TAMPACÁN";
            M[9] = "TAMAZUNCHALE";
            M[10] = "TAMASOPO";
            M[11] = "SAN NICOLÁS TOLENTINO";
        }
        return M;
    }

    private void leerResidenciaAlumno() throws Exception {
        java.io.ObjectInputStream bw = null;
        try {
            bw = new java.io.ObjectInputStream(new java.io.FileInputStream(FILE_NAME));
            var xd = java.util.Arrays.asList((ResidenciaAlumno[]) bw.readObject());
            ResidenciaAlumnos = new ArrayList<>(xd);
        } catch (IOException e){
        } catch (Exception e) {
            throw e;
        }
    }

    private void guardarResidenciaAlumno() throws Exception {
        java.io.ObjectOutputStream bw = null;
        try {
            bw = new java.io.ObjectOutputStream(new java.io.FileOutputStream(FILE_NAME));
        } catch (IOException e) {
        }
        bw.writeObject(ResidenciaAlumnos.toArray());
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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2(new java.awt.Frame(),true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar2;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbMunicipio;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAsentamiento;
    private javax.swing.JLabel lblCP;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNoInterior;
    private javax.swing.JLabel lblNumExterior;
    private javax.swing.JTextField txtAsentamiento;
    private javax.swing.JTextField txtCP2;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextArea txtDUbicacion;
    private javax.swing.JTextField txtExterior;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNumInterior;
    // End of variables declaration//GEN-END:variables
    public static ArrayList<ResidenciaAlumno> ResidenciaAlumnos = new ArrayList<ResidenciaAlumno>();
    public final static String FILE_NAME = "RESIDENCIA_ALUMNOS.TXT";
}

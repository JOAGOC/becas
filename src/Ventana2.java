
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Ventana2 extends javax.swing.JDialog {

    public Ventana2(Dialog dial, boolean bln) {
        super(dial, bln);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        txtInterior = new javax.swing.JTextField();
        txtAsentamiento = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        txtExterior = new javax.swing.JTextField();
        txtDUbicacion = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        cmbMunicipio = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        lblSiguiente = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtCP1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCP3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCP2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(java.awt.Color.lightGray);
        jLabel10.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Calle:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        txtInterior.setBackground(java.awt.Color.lightGray);
        txtInterior.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        txtInterior.setToolTipText("");
        getContentPane().add(txtInterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 90, -1));

        txtAsentamiento.setBackground(java.awt.Color.lightGray);
        txtAsentamiento.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        getContentPane().add(txtAsentamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 210, 30));

        txtLocalidad.setBackground(java.awt.Color.lightGray);
        txtLocalidad.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        getContentPane().add(txtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 210, 30));

        txtExterior.setBackground(java.awt.Color.lightGray);
        txtExterior.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        getContentPane().add(txtExterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 120, 30));

        txtDUbicacion.setBackground(java.awt.Color.lightGray);
        txtDUbicacion.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        getContentPane().add(txtDUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 320, 90));

        txtCalle.setBackground(java.awt.Color.lightGray);
        txtCalle.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        getContentPane().add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 170, -1));

        jLabel4.setBackground(java.awt.Color.lightGray);
        jLabel4.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel5.setBackground(java.awt.Color.lightGray);
        jLabel5.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Municipio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel6.setBackground(java.awt.Color.lightGray);
        jLabel6.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Asentamiento: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel7.setBackground(java.awt.Color.lightGray);
        jLabel7.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Localidad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jLabel8.setBackground(java.awt.Color.lightGray);
        jLabel8.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("No. Exterior: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel9.setBackground(java.awt.Color.lightGray);
        jLabel9.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descripcion de la ubicación: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jLabel13.setBackground(java.awt.Color.lightGray);
        jLabel13.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("No. Interior:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Residencia del Alumno:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 502, 90));

        cmbEstado.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona tu Estado", "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila", "Colima", "Ciudad de México", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));
        cmbEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstadoItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 210, 40));

        cmbMunicipio.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        cmbMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona tu municipio" }));
        getContentPane().add(cmbMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 210, 40));

        btnRegistrar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 120, 50));

        lblSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha-correcta.png"))); // NOI18N
        lblSiguiente.setToolTipText("Siguiente");
        getContentPane().add(lblSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 550, -1, -1));

        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/regreso.png"))); // NOI18N
        getContentPane().add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("New Gulim", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        txtCP1.setBackground(java.awt.Color.lightGray);
        txtCP1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N

        jLabel14.setBackground(java.awt.Color.lightGray);
        jLabel14.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Curp:");

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
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
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
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtCP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 370, 150));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abcd.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 650));

        txtCP2.setBackground(java.awt.Color.lightGray);
        txtCP2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        getContentPane().add(txtCP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 110, -1));

        jLabel16.setBackground(java.awt.Color.lightGray);
        jLabel16.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("C.P.");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstadoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.cmbEstado.getSelectedIndex() > 0) {
                this.cmbMunicipio.setModel(new DefaultComboBoxModel(this.getMunucipios(this.cmbEstado.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_cmbEstadoItemStateChanged

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbMunicipio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JTextField txtAsentamiento;
    private javax.swing.JTextField txtCP1;
    private javax.swing.JTextField txtCP2;
    private javax.swing.JTextField txtCP3;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtDUbicacion;
    private javax.swing.JTextField txtExterior;
    private javax.swing.JTextField txtInterior;
    private javax.swing.JTextField txtLocalidad;
    // End of variables declaration//GEN-END:variables
}

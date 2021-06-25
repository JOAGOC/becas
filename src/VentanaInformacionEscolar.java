import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.Color;
import java.awt.Dialog;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Calendar;

public class VentanaInformacionEscolar extends javax.swing.JDialog implements IValidateTextFields{

    public VentanaInformacionEscolar() {
        initComponents();
        leerUniversidades();
    }
    
    public VentanaInformacionEscolar(Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
        leerUniversidades();
        lblAlumno.setText(Principal.alumnoSesion.getNombre());
	}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblAlumno = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblPromedioAnterior = new javax.swing.JLabel();
        txtPA = new javax.swing.JTextField();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblPromedioGeneral = new javax.swing.JLabel();
        txtPG = new javax.swing.JTextField();
        chbxActivo = new javax.swing.JCheckBox();
        chbxRegular = new javax.swing.JCheckBox();
        lblSiguiente = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTipoPeriodo = new javax.swing.JLabel();
        cmbTperiodo = new javax.swing.JComboBox<>();
        lblTotalPeriodos = new javax.swing.JLabel();
        txtTPeriodos = new javax.swing.JTextField();
        lblPeriodoActual = new javax.swing.JLabel();
        lblFechaInicio = new javax.swing.JLabel();
        jdchsFechaInicio = new com.toedter.calendar.JDateChooser();
        lblFechaCierre = new javax.swing.JLabel();
        jdchsFechaCierre = new com.toedter.calendar.JDateChooser();
        lblUniversidad = new javax.swing.JLabel();
        txtUniversidad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAlumno.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        lblAlumno.setForeground(new java.awt.Color(255, 255, 255));
        lblAlumno.setText("Información Escolar del Alumno:");
        getContentPane().add(lblAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblPromedioAnterior.setBackground(java.awt.Color.lightGray);
        lblPromedioAnterior.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblPromedioAnterior.setForeground(new java.awt.Color(255, 255, 255));
        lblPromedioAnterior.setText("Promedio Anterior: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        jPanel1.add(lblPromedioAnterior, gridBagConstraints);

        txtPA.setBackground(java.awt.Color.lightGray);
        txtPA.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(txtPA, gridBagConstraints);

        lblMatricula.setBackground(java.awt.Color.lightGray);
        lblMatricula.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblMatricula.setForeground(new java.awt.Color(255, 255, 255));
        lblMatricula.setText("Matricula:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(lblMatricula, gridBagConstraints);

        txtMatricula.setBackground(java.awt.Color.lightGray);
        txtMatricula.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(txtMatricula, gridBagConstraints);

        lblPromedioGeneral.setBackground(java.awt.Color.lightGray);
        lblPromedioGeneral.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblPromedioGeneral.setForeground(new java.awt.Color(255, 255, 255));
        lblPromedioGeneral.setText("Promedio General:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(lblPromedioGeneral, gridBagConstraints);

        txtPG.setBackground(java.awt.Color.lightGray);
        txtPG.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(txtPG, gridBagConstraints);

        chbxActivo.setForeground(new java.awt.Color(255, 255, 255));
        chbxActivo.setText("Estudiante Activo");
        chbxActivo.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(chbxActivo, gridBagConstraints);

        chbxRegular.setForeground(new java.awt.Color(255, 255, 255));
        chbxRegular.setText("Estudiante Regular");
        chbxRegular.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(chbxRegular, gridBagConstraints);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 210, 310));

        lblSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha-correcta.png"))); // NOI18N
        lblSiguiente.setToolTipText("Siguiente");
        getContentPane().add(lblSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(51, 204, 0));
        btnRegistrar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 150, 50));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        lblTipoPeriodo.setBackground(java.awt.Color.lightGray);
        lblTipoPeriodo.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblTipoPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoPeriodo.setText("Tipo Periodo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(lblTipoPeriodo, gridBagConstraints);

        cmbTperiodo.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        cmbTperiodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEMESTRE", "BIMESTRE", "TRIMESTRE", "CUATRIMESTRE" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(cmbTperiodo, gridBagConstraints);

        lblTotalPeriodos.setBackground(java.awt.Color.lightGray);
        lblTotalPeriodos.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblTotalPeriodos.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPeriodos.setText("Total de Periodos:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lblTotalPeriodos, gridBagConstraints);

        txtTPeriodos.setBackground(java.awt.Color.lightGray);
        txtTPeriodos.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(txtTPeriodos, gridBagConstraints);

        lblPeriodoActual.setBackground(java.awt.Color.lightGray);
        lblPeriodoActual.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblPeriodoActual.setForeground(new java.awt.Color(255, 255, 255));
        lblPeriodoActual.setText("Periodo Actual");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lblPeriodoActual, gridBagConstraints);

        lblFechaInicio.setBackground(java.awt.Color.lightGray);
        lblFechaInicio.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblFechaInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaInicio.setText("Fecha de inicio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lblFechaInicio, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jdchsFechaInicio, gridBagConstraints);

        lblFechaCierre.setBackground(java.awt.Color.lightGray);
        lblFechaCierre.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblFechaCierre.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaCierre.setText("Fecha de cierre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lblFechaCierre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jdchsFechaCierre, gridBagConstraints);

        lblUniversidad.setBackground(java.awt.Color.lightGray);
        lblUniversidad.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        lblUniversidad.setForeground(new java.awt.Color(255, 255, 255));
        lblUniversidad.setText("Universidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lblUniversidad, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(txtUniversidad, gridBagConstraints);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 210, 400));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Información Escolar del Alumno:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/123.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        try {
            validarCampos();
            if (javax.swing.JOptionPane.showConfirmDialog(this,"¿Deseas almacenar la información?") != javax.swing.JOptionPane.YES_OPTION)
                return;
            guardarInfoAlumnos();
            showMessageDialog(this, "Datos almacenados correctamente");
            dispose();
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_btnRegistrarActionPerformed

    private void validarCampos() throws Exception {
        javax.swing.JLabel[] lbls = {lblTotalPeriodos, lblFechaInicio,lblFechaCierre,lblPromedioAnterior,lblMatricula,lblPromedioGeneral};
        javax.swing.JTextField[] jtfs = {txtTPeriodos,null,null,txtPA,txtMatricula,txtPG};
        for (int i = 0; i < lbls.length; i++)
        {
            validarCampoVacio(lbls[i], jtfs[i]);
            switch (i) {
                case 0,3,5:
                    validarFormatoNumerico(lbls[i], jtfs[i]);
                    break;
                case 1:
                    validarCalendarioVacio(lbls[i], jdchsFechaInicio);
                    break;
                case 2:
                    validarCalendarioVacio(lbls[i], jdchsFechaCierre);
                    if (jdchsFechaInicio.getCalendar().compareTo(jdchsFechaCierre.getCalendar()) >= 0)
                    {
                        lbls[i].setForeground(Color.red);
                        jdchsFechaCierre.requestFocus();
                        throw new RuntimeException("La fecha de inicio no debe ser posterior o igual a la de cierre");
                    }
                    break;
            }
        }
    }

    private void validarCalendarioVacio(javax.swing.JLabel lbl, com.toedter.calendar.JDateChooser jdchs) throws Exception{
        if (jdchs.getCalendar() == null)
        {
            lbl.setForeground(java.awt.Color.red);
            jdchs.requestFocus();
            throw new RuntimeException("Se debe seleccionar una fecha en "+lbl.getText());
        }
    }

    private void guardarInfoAlumnos() throws Exception {
        Calendar f = jdchsFechaInicio.getCalendar();
        Calendar g = jdchsFechaCierre.getCalendar();
        InformacionEscolar.TipoPeriodo t = null;
        switch (cmbTperiodo.getSelectedIndex()) {
            case 0:
            t = InformacionEscolar.TipoPeriodo.Semestre;
            break;
            case 1:
            t = InformacionEscolar.TipoPeriodo.Bimestre;
            case 2:
            t = InformacionEscolar.TipoPeriodo.Trimestre;
            case 3:
            t = InformacionEscolar.TipoPeriodo.Cuatrimestre;
        }
        Principal.alumnoSesion.setInformacionEscolar(new InformacionEscolar(Float.parseFloat(txtPA.getText()),Float.parseFloat(txtPG.getText()),
        chbxRegular.isSelected(),txtMatricula.getText().toUpperCase(), t,Integer.parseInt(txtTPeriodos.getText()),
        new Periodo(f,g), universidades.get(txtUniversidad.getSelectedIndex())));
        RegistrarAlumno.guardarAlumnos();
    }

    private void leerUniversidades(){
        try {
            java.io.FileReader reader = new java.io.FileReader(Universidad.FILE_NAME);
            BufferedReader bf = new BufferedReader(reader);
            String universidad;
            while ((universidad = bf.readLine()) != null) {
                String[] cell = universidad.split("\\|");
                int x = 0;
                Universidad u = new Universidad(cell[x++],cell[x++],cell[x++]);
                universidades.add(u);
                txtUniversidad.addItem(u.getNombre());
            }
        } catch (FileNotFoundException e){
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
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
            java.util.logging.Logger.getLogger(VentanaInformacionEscolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInformacionEscolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInformacionEscolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInformacionEscolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInformacionEscolar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox chbxActivo;
    private javax.swing.JCheckBox chbxRegular;
    private javax.swing.JComboBox<String> cmbTperiodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdchsFechaCierre;
    private com.toedter.calendar.JDateChooser jdchsFechaInicio;
    private javax.swing.JLabel lblAlumno;
    private javax.swing.JLabel lblFechaCierre;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblPeriodoActual;
    private javax.swing.JLabel lblPromedioAnterior;
    private javax.swing.JLabel lblPromedioGeneral;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JLabel lblTipoPeriodo;
    private javax.swing.JLabel lblTotalPeriodos;
    private javax.swing.JLabel lblUniversidad;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtPA;
    private javax.swing.JTextField txtPG;
    private javax.swing.JTextField txtTPeriodos;
    private javax.swing.JComboBox<String> txtUniversidad;
    // End of variables declaration//GEN-END:variables
    private static java.util.ArrayList<Universidad> universidades = new java.util.ArrayList<Universidad>();
}

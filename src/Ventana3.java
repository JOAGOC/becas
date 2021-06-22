import java.awt.Dialog;
import java.io.IOException;
import static javax.swing.JOptionPane.showMessageDialog;

public class Ventana3 extends javax.swing.JDialog {

    public Ventana3(Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
        lblSiguiente.setVisible(false);
    }

    public Ventana3() {
        initComponents();
        lblSiguiente.setVisible(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCLABE = new javax.swing.JTextField();
        txtEstatus = new javax.swing.JTextField();
        txtBanco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblSiguiente = new javax.swing.JLabel();
        txtFechaRegistro = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCLABE.setBackground(java.awt.Color.lightGray);
        txtCLABE.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        getContentPane().add(txtCLABE, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 210, 30));

        txtEstatus.setBackground(java.awt.Color.lightGray);
        txtEstatus.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        getContentPane().add(txtEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 210, -1));

        txtBanco.setBackground(java.awt.Color.lightGray);
        txtBanco.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        getContentPane().add(txtBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 120, 30));

        jLabel4.setBackground(java.awt.Color.lightGray);
        jLabel4.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CLABE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        jLabel5.setBackground(java.awt.Color.lightGray);
        jLabel5.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de Registro");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        jLabel6.setBackground(java.awt.Color.lightGray);
        jLabel6.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estatus");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        jLabel7.setBackground(java.awt.Color.lightGray);
        jLabel7.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Banco");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CLABE Interbancaria ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 502, 90));

        btnRegistrar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnRegistrar.setText("Registrar");
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 150, 60));

        lblSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha-correcta.png"))); // NOI18N
        lblSiguiente.setToolTipText("Siguiente");
        getContentPane().add(lblSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));
        getContentPane().add(txtFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 200, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abcd.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -40, 1130, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarCLABEAlumnos() throws Exception {
        java.io.BufferedWriter bw = null;
        try {
            bw = new java.io.BufferedWriter(new java.io.FileWriter(FILE_NAME));
        } catch (IOException e) {
        }
        String ClabeInterbancariaTxt = "";
        for (ClaveInterbancaria a : CLABEAlumnos) {
            ClabeInterbancariaTxt+= a.getClabe() + "|" + a.getFechaRegistro() + "|" + a.getNombreBanco()+"|"+"\n";
        }
        bw.write(ClabeInterbancariaTxt);
        bw.flush();
    }
    private void AgregarCLABEalumno()  throws Exception{
        try {
            CLABEAlumnos.add(new ClaveInterbancaria(txtCLABE.getText(), txtFechaRegistro.getCalendar(),true,txtBanco.getText()));
            showMessageDialog(this, "Paso 3: Registro completado");
            lblSiguiente.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
}
// ClaveInterbancaria.add(new ClaveInterbancaria(txtCLABE.getText().toUpperCase(),txtFechaRegistro.getText().toUpperCase(),(String)txtBanco.getSelectedItem());
//new ClaveInterbancaria(clabe,fechaRegistro,nombreBanco);


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCLABE;
    private javax.swing.JTextField txtEstatus;
    private com.toedter.calendar.JDateChooser txtFechaRegistro;
    // End of variables declaration//GEN-END:variables
    public static java.util.ArrayList<ClaveInterbancaria> CLABEAlumnos = new java.util.ArrayList<ClaveInterbancaria>();
    public final static String FILE_NAME = "CLABE_ALUMNOS.TXT";
}

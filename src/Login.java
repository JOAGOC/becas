import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JLabel;
import java.awt.Component;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Login extends javax.swing.JDialog implements IValidateTextFields{

    enum UI {
        Inicial, IniciarSesion
    }

    public Login(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        changeUI(UI.Inicial);
        LeerAlumnos();
    }

    private void LeerAlumnos() {
        try {
            java.io.ObjectInputStream reader = new java.io.ObjectInputStream(new java.io.FileInputStream(FILE_NAME));
            alumnos = new ArrayList<Alumno>(Arrays.asList((Alumno[])reader.readObject()));
        } catch (FileNotFoundException e){
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }

    private void changeUI(UI interfaz) {
        Component[] components = { btnIS, btnRegistrarse, btnAceptar, btnCancelar, lblUsuario, lblContraseña,
                txtUsuario, jpswContraseña };
        boolean b = interfaz == UI.Inicial;
        for (int i = 0; i < components.length; i++) {
            if (i <= 1) {
                components[i].setVisible(b);
            } else {
                components[i].setVisible(!b);
            }
        }
    }

    public void login() {
        for (Alumno a : alumnos) {
            if (a.getCURP().equalsIgnoreCase(txtUsuario.getText())) {
                if (String.valueOf(jpswContraseña.getPassword()).equals(a.getContraseña())) {
                    showMessageDialog(this, "Acceso concedido");
                    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    setVisible(false);
                    Principal.alumnoSesion = a;
                    Principal p = (Principal) getParent();
                    p.acceso();
                    p.getMenuA().setEnabled(false);
                    dispose();
                    return;
                } else {
                    showMessageDialog(this, "No coincide la CURP y la contraseña");
                    return;
                }
            }
        }
        showMessageDialog(this, "No se encontró al alumno con CURP " + txtUsuario.getText());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        jpswContraseña = new javax.swing.JPasswordField();
        btnIS = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(51, 0, 51));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtUsuario.setToolTipText("Introduce tu CURP");
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 390, 40));

        lblUsuario.setBackground(new java.awt.Color(0, 0, 0));
        lblUsuario.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario: ");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        lblContraseña.setBackground(new java.awt.Color(255, 153, 0));
        lblContraseña.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Contraseña:");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        jpswContraseña.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jpswContraseña.setToolTipText("Introduce tu contraseña");
        getContentPane().add(jpswContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 390, 40));

        btnIS.setBackground(new java.awt.Color(153, 0, 0));
        btnIS.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnIS.setForeground(new java.awt.Color(255, 255, 255));
        btnIS.setText("Iniciar Sesión");
        btnIS.setBorder(null);
        btnIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnISActionPerformed(evt);
            }
        });
        getContentPane().add(btnIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 220, 90));

        btnRegistrarse.setBackground(new java.awt.Color(0, 0, 255));
        btnRegistrarse.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBorder(null);
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 220, 90));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salida3.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 750, -1, 73));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnAceptar.setBackground(new java.awt.Color(0, 45, 106));
        btnAceptar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel1.add(btnAceptar, gridBagConstraints);

        btnCancelar.setBackground(new java.awt.Color(204, 0, 102));
        btnCancelar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel1.add(btnCancelar, gridBagConstraints);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 796, 145));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abc.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalirActionPerformed
        setVisible(false);
    }// GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelarActionPerformed
        changeUI(UI.Inicial);
    }// GEN-LAST:event_btnCancelarActionPerformed

    private void btnISActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnISActionPerformed
        changeUI(UI.IniciarSesion);
    }// GEN-LAST:event_btnISActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRegistrarseActionPerformed
        this.setVisible(false);
        RegistrarAlumno abrir = new RegistrarAlumno(this, true);
        abrir.setVisible(true);
        this.setVisible(true);
    }// GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAceptarActionPerformed
        try {
            JLabel[] lbls = {lblUsuario,lblContraseña};
            JTextField[] jtfs = {txtUsuario,jpswContraseña};
            validarCamposVacios(lbls, jtfs);
            if (txtUsuario.getText().length() != 18)
                throw new RuntimeException("Inserta una CURP válida");
            login();
        } catch (RuntimeException e) {
            showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_btnAceptarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(new JFrame("xd"), true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIS;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpswContraseña;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    public static java.util.ArrayList<Alumno> alumnos = new java.util.ArrayList<Alumno>();
    public final static String FILE_NAME = "ALUMNOS.OBJ";
}

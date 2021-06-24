import java.awt.Dialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class VentanaConsulta extends javax.swing.JDialog {

    public VentanaConsulta(Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
        m = (DefaultTableModel) jTable1.getModel();
        leerAlumno();
    }

    public VentanaConsulta() {
        initComponents();
        m = (DefaultTableModel) jTable1.getModel();
        leerAlumno();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable() {
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        btnRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

        }, new String[] { "Id", "Nombre", "CURP", "Correo", "Nacionalidad" }));
        jTable1.setToolTipText("Tabla Alumnos");
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setSelectionBackground(new java.awt.Color(0, 204, 51));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 240, 1150, 271));

        btnRegistrar.setBackground(new java.awt.Color(51, 204, 0));
        btnRegistrar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sitio-web.png"))); // NOI18N
        btnRegistrar.setToolTipText("Guardar Información ");
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setHideActionText(true);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 600, 170, 80));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrar información del alumno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 760, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registrar Información");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 670, 220, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/123.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            InicioRegistroInformacionEscolar();
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_btnRegistrarActionPerformed

    private void InicioRegistroInformacionEscolar() throws RuntimeException {
        if (jTable1.getSelectedRow() == -1)
            throw new RuntimeException("No has seleccionado un alumno");
        Principal.alumnoSesion = Login.alumnos.get(jTable1.getSelectedRow());
        setVisible(false);
        new VentanaInformacionEscolar(this, true).setVisible(true);
        setVisible(true);
        if (Principal.alumnoSesion.getInformacionEscolar() != null)
            m.removeRow(jTable1.getSelectedRow());
    }

    public void leerAlumno() {
        for (var al : Login.alumnos) {
            if (al.getInformacionEscolar() == null) {
                String i[] = new String[5];
                i[0] = al.getId() + "";
                i[1] = al.getNombre();
                i[2] = al.getCURP();
                i[3] = al.getCorreo();
                i[4] = al.getNacionalidad();
                m.addRow(i);
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
            java.util.logging.Logger.getLogger(VentanaConsulta.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConsulta.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConsulta.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConsulta.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel m;
    public static java.util.ArrayList<Alumno> A = new java.util.ArrayList<Alumno>();
}

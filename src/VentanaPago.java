import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.Timer;

public class VentanaPago extends javax.swing.JDialog {
    private Timer t;
    private final ActionListener ac;
    int x = 0;
    private Programa p;

    public VentanaPago(Frame owner, boolean modal, int indexOfcmbP) {
        super(owner, modal);
        initComponents();
        panelPago.setVisible(false);
        this.setLocationRelativeTo(null);
        ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                x = x + 1;
                carga.setValue(x);
                if (carga.getValue() == 30) {
                    carga.setVisible(false);
                    t.stop();
                    panelPago.setVisible(true);
                }
            }
    
        };
        t = new Timer(100, ac);
        t.start();
        try {
            cmbPrograma.setSelectedIndex(indexOfcmbP);
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
        Calendar c = Calendar.getInstance();
        Calendar cc = (Calendar)Calendar.getInstance().clone();
        cc.set(c.get(Calendar.YEAR)+1, c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
        Periodo periodo = new Periodo(c, cc);
        switch (indexOfcmbP) {
            case 1:
                p = new Programa("Jovenes Pioneros", "Programa dedicado a incentivar el mejor rendimiento posible para los alumnos, liberando su carga económica directa de colegiaturas.", periodo, 1243);
                break;
            case 2:
                p = new Programa("Excelencia", "Programa dirigido a nuestros mejores alumnos a nivel nacional para lograr exprimir su potencial.", periodo, 1452);
            case 3:
                p = new Programa("Tlautli", "Programa dirigido a nuestros alumnos provenientes de alguna etnia, para lograr que sean alumnos sobresalientes", periodo, 1874);
                default:
                break;
        }
    }

    // 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        carga = new javax.swing.JProgressBar();
        btnEntrar = new javax.swing.JButton();
        panelPago = new javax.swing.JPanel();
        lblFechaPago = new javax.swing.JLabel();
        lblTipoPago = new javax.swing.JLabel();
        txtFechaPago = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        txtTipoPago = new javax.swing.JTextField();
        lblMonto2 = new javax.swing.JLabel();
        cmbPrograma = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1164, 563));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 52)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pago");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, -1, -1));

        carga.setForeground(new java.awt.Color(0, 51, 255));
        carga.setMaximum(375);
        carga.setToolTipText("Selecciona un programa");
        getContentPane().add(carga, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 254, 37));

        btnEntrar.setBackground(new java.awt.Color(0, 255, 0));
        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 670, 170, 50));

        panelPago.setBackground(new java.awt.Color(0, 51, 51));
        panelPago.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaPago.setBackground(java.awt.Color.lightGray);
        lblFechaPago.setFont(new java.awt.Font("Sitka Small", 1, 30)); // NOI18N
        lblFechaPago.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaPago.setText("Fecha de pago: ");
        panelPago.add(lblFechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        lblTipoPago.setBackground(java.awt.Color.lightGray);
        lblTipoPago.setFont(new java.awt.Font("Sitka Small", 1, 30)); // NOI18N
        lblTipoPago.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoPago.setText("Tipo de pago:");
        panelPago.add(lblTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 270, 30));

        txtFechaPago.setEditable(false);
        txtFechaPago.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // NOI18N
        panelPago.add(txtFechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 180, 30));

        txtMonto.setEditable(false);
        txtMonto.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // NOI18N
        panelPago.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 180, 30));

        txtTipoPago.setEditable(false);
        txtTipoPago.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // NOI18N
        panelPago.add(txtTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 180, 30));

        lblMonto2.setBackground(java.awt.Color.lightGray);
        lblMonto2.setFont(new java.awt.Font("Sitka Small", 1, 30)); // NOI18N
        lblMonto2.setForeground(new java.awt.Color(255, 255, 255));
        lblMonto2.setText("Monto:");
        panelPago.add(lblMonto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 120, 30));

        cmbPrograma.setEditable(true);
        cmbPrograma.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        cmbPrograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*Seleccionar*", "Jovenes Pioneros", "Excelencia", "Tlautli" }));
        cmbPrograma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbPrograma.setEnabled(false);
        cmbPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProgramaActionPerformed(evt);
            }
        });
        panelPago.add(cmbPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 200, 40));

        getContentPane().add(panelPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 520, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo pagos.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if (javax.swing.JOptionPane.showConfirmDialog(this,"¿Realmente deseas entrar a este programa?") != javax.swing.JOptionPane.YES_OPTION)
            return;
        Principal.alumnoSesion.setPrograma(p);
        try {
            RegistrarAlumno.guardarAlumnos();
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
        showMessageDialog(this, "Te has registrado en el programa\nFelicitaciones, terminaste tu proceso de registro");
        dispose();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void cmbProgramaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cmbProgramaActionPerformed
        if (cmbPrograma.getSelectedIndex() == 0) {
            showMessageDialog(this, "Por favor selecciona un programa");
            return;
        } else if (cmbPrograma.getSelectedIndex() == 1) {
            txtMonto.setText("$15,000");
            txtFechaPago.setText("20-Agosto-2021");
            txtTipoPago.setText("Deposito");
        } else if (cmbPrograma.getSelectedIndex() == 2) {
            txtMonto.setText("$20,000");
            txtFechaPago.setText("14-Septiembre-2021");
            txtTipoPago.setText("Deposito");
        } else if (cmbPrograma.getSelectedIndex() == 3) {
            txtMonto.setText("$18,000");
            txtFechaPago.setText("02-Julio-2021");
            txtTipoPago.setText("Efectivo");
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
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPago(new javax.swing.JFrame(),true,1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JProgressBar carga;
    private javax.swing.JComboBox<String> cmbPrograma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblFechaPago;
    private javax.swing.JLabel lblMonto2;
    private javax.swing.JLabel lblTipoPago;
    private javax.swing.JPanel panelPago;
    private javax.swing.JTextField txtFechaPago;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtTipoPago;
    // End of variables declaration//GEN-END:variables
}

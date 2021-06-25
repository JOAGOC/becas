import java.awt.Frame;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Ventana5 extends javax.swing.JDialog {

    public Ventana5() {
        initComponents();
        txtSocioEconomica.setLineWrap(true);
        txtSocioEconomica.setWrapStyleWord(true);
        lblFecha.setText(fecha());
        txtFolio.setText(generarFolio());
    }

    public Ventana5(Frame owner, boolean modal) {
        super(owner, modal);
        initComponents();
        txtSocioEconomica.setLineWrap(true);
        txtSocioEconomica.setWrapStyleWord(true);
        lblFecha.setText(fecha());
        txtFolio.setText(generarFolio());
    }

    private String generarFolio() {
        String folio = "";
        for (int i = 0; i < 3; i++) {
            folio += (int) (Math.random() * 9);
        }
        return folio;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVigencia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSocioEconomica = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnObtenerAcuse = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel13.setBackground(java.awt.Color.lightGray);
        jLabel13.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jLabel13, gridBagConstraints);

        lblFecha.setFont(txtSocioEconomica.getFont());
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("DD/MM/YYYY");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lblFecha, gridBagConstraints);

        jLabel6.setBackground(java.awt.Color.lightGray);
        jLabel6.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estatus:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jLabel6, gridBagConstraints);

        jLabel15.setBackground(java.awt.Color.lightGray);
        jLabel15.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("En espera");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jLabel15, gridBagConstraints);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 200, 120));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel4.setBackground(java.awt.Color.lightGray);
        jLabel4.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Folio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel4, gridBagConstraints);

        txtFolio.setEditable(false);
        txtFolio.setBackground(java.awt.Color.lightGray);
        txtFolio.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(txtFolio, gridBagConstraints);

        jLabel5.setBackground(java.awt.Color.lightGray);
        jLabel5.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vigencia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        txtVigencia.setEditable(false);
        txtVigencia.setBackground(java.awt.Color.lightGray);
        txtVigencia.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        txtVigencia.setText("3 Semana ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(txtVigencia, gridBagConstraints);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 190, 140));

        jLabel10.setBackground(java.awt.Color.lightGray);
        jLabel10.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Información Socioeconomica:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 280, -1));

        txtSocioEconomica.setColumns(20);
        txtSocioEconomica.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        txtSocioEconomica.setRows(5);
        txtSocioEconomica.setToolTipText(
                "Aqui redactaras tu situación econimica en general \n* Cantidad de integrantes de tu familia \n* Habitaciones de tu hogar \n* Ingreso mensual total por todos los integrantes de la familia  \n* Entre otros detalles que quisieras contar \n");
        jScrollPane1.setViewportView(txtSocioEconomica);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 430, 250));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 55)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Solicitud");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 220, -1));

        btnObtenerAcuse.setBackground(new java.awt.Color(51, 204, 0));
        btnObtenerAcuse.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnObtenerAcuse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/documentos-oficiales.png"))); // NOI18N
        btnObtenerAcuse.setToolTipText("Obtener Acuse");
        btnObtenerAcuse.setBorder(null);
        btnObtenerAcuse.setBorderPainted(false);
        btnObtenerAcuse.setContentAreaFilled(false);
        btnObtenerAcuse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnObtenerAcuse.setFocusPainted(false);
        btnObtenerAcuse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnObtenerAcuse.setIconTextGap(-3);
        btnObtenerAcuse.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/dc2.png"))); // NOI18N
        btnObtenerAcuse.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/documentos-oficiales.png"))); // NOI18N
        btnObtenerAcuse.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnObtenerAcuse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnObtenerAcuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerAcuseActionPerformed(evt);
            }
        });
        getContentPane().add(btnObtenerAcuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, 120, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abcd.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardar() {
        try {
            // flujo de bytes de salida (escritura)
            java.io.FileOutputStream fbs = new java.io.FileOutputStream(nameFile + ".doc");
            String cad = "***********************ACUSE DE SOLICITU DE BECA***********************" + "\n" + "\n"
                    + "El acuse generado sirve como comprobante de la solicitud, con el puedes presentar a algunas oficinas para presentar aclaraciones, preguntas y quejas, este acuse no garantiza que ya seras beneficiado con la beca."
                    + "\n" + "\n" + "Solicitud con el numero de folio de : " + txtFolio.getText() + "\n " + "\n"
                    + "Con una vigencia : " + txtVigencia.getText() + "\n " + "\n"
                    + "El estatus del estudiante segun su administracion escolar : Espera " + "\n" + "\n"
                    + "Fecha de solicitud : " + fecha() + "\n " + "\n" + "Estado socio economico del solicitante : "
                    + "\n" + txtSocioEconomica.getText() + "\n" + "\n"
                    + "****************************************************************************************" + "\n"
                    + "\n"
                    + "Este acuse es el ultimo paso de la solicitud, por favor espera noticias de las fuentes oficiales de la coordinacion de becas para mantenerte al tanto de posibles resultados  o cambios de fecha de la misma.";
            Principal.alumnoSesion.setSolicitud(new Solicitud(Integer.parseInt(txtFolio.getText()),
                    Calendar.getInstance(), Calendar.getInstance(), Solicitud.Estado.EnProceso, cad));
            RegistrarAlumno.guardarAlumnos();
            byte b[] = cad.getBytes();
            fbs.write(b);
            fbs.flush();

        } catch (FileNotFoundException ex) {
            showMessageDialog(this, "Archivo no encontrado");
        } catch (IOException ex) {
            Logger.getLogger(Ventana5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }

    private void btnObtenerAcuseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnObtenerAcuseActionPerformed
        try {
            int nPalabras = txtSocioEconomica.getText().split("\\s+").length;
            if ((nPalabras < 20) ? true : nPalabras >= 300) {
                throw new RuntimeException(
                        "Asegurate de que tu información socioeconomica este completa y cuente con entre 20 y 300 palabras");
            }
            if (javax.swing.JOptionPane.showConfirmDialog(this,
                    "¿Deseas almacenar la información?") != javax.swing.JOptionPane.YES_OPTION)
                return;
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto,", "txt", "java", "cpp");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                nameFile = chooser.getSelectedFile().getAbsolutePath();
            } else
                return;
            guardar();
            showMessageDialog(this, "Acuse guardado exitosamente");
            dispose();
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_btnObtenerAcuseActionPerformed

    public void limpiar() {
        txtFolio.setText("");
        txtVigencia.setText("");
        txtSocioEconomica.setText("");
    }

    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat ffecha = new SimpleDateFormat("dd/MM/YYYY");
        return ffecha.format(fecha);
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
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana5().setVisible(true);
            }
        });
    }

    private String nameFile = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnObtenerAcuse;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextArea txtSocioEconomica;
    private javax.swing.JTextField txtVigencia;
    // End of variables declaration//GEN-END:variables
}

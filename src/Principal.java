import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showConfirmDialog;
import java.util.Timer;
import java.util.TimerTask;

import javax.management.RuntimeErrorException;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private class ShowLogin implements Runnable {

        private Principal x;

        public ShowLogin(Principal x) {
            this.x = x;
        }

        public void run() {
            x.enableControls(false);
            x.mnuAyuda.setEnabled(true);
            login = new Login(x, true);
            login.setVisible(true);
        }
    }

    public Principal() {
        initComponents();
        Thread h = new Thread(new ShowLogin(this));
        h.start();
        lblFecha.setText(fecha());
        TimerTask x = new TimerTask() {
            public void run() {
                try {
                    lblReloj.setText(
                            java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));
                } catch (Exception e) {
                    showMessageDialog(null, e.getMessage());
                }
            }

        };
        timer.schedule(x, 0, 1000);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblReloj = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuSol = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuJP = new javax.swing.JMenu();
        mnuRegistrarseJP = new javax.swing.JMenuItem();
        menu7 = new javax.swing.JMenu();
        mnuRegistrarseE = new javax.swing.JMenuItem();
        menuT = new javax.swing.JMenu();
        mnuRegistrarseT = new javax.swing.JMenuItem();
        menuS = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuSoporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(51, 102, 255));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/LogoBecat.png")).getImage());
        setSize(new java.awt.Dimension(1280, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblReloj.setForeground(new java.awt.Color(255, 255, 255));
        lblReloj.setText("HH:mm:ss");
        lblReloj.setToolTipText("");
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salida3.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 613, 80, 90));

        lblFecha.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("DD/MM/YYYY");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 710));

        menuBar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        menuBar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSolMouseClicked(evt);
            }
        });

        menuSol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registro.png"))); // NOI18N
        menuSol.setText("Solicitud");
        menuSol.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        menuSol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSolMouseClicked(evt);
            }
        });

        jMenuItem7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beca.png"))); // NOI18N
        jMenuItem7.setText("Solicitar Beca");
        jMenuItem7.setToolTipText("Solicitar beca y obtener acuse");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuSol.add(jMenuItem7);

        menuBar.add(menuSol);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/educacion.png"))); // NOI18N
        jMenu1.setText("Programas");
        jMenu1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSolMouseClicked(evt);
            }
        });

        menuJP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        menuJP.setText("Jovenes Pioneros");
        menuJP.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        menuJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSolMouseClicked(evt);
            }
        });

        mnuRegistrarseJP.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        mnuRegistrarseJP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nota.png"))); // NOI18N
        mnuRegistrarseJP.setText("Registrarse");
        mnuRegistrarseJP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegistrarseJPActionPerformed1(evt);
            }
        });
        menuJP.add(mnuRegistrarseJP);

        jMenu1.add(menuJP);

        menu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/excelencia.png"))); // NOI18N
        menu7.setText("Excelencia");
        menu7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        menu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSolMouseClicked(evt);
            }
        });

        mnuRegistrarseE.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        mnuRegistrarseE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nota.png"))); // NOI18N
        mnuRegistrarseE.setText("Registrarse");
        mnuRegistrarseE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegistrarseEActionPerformed(evt);
            }
        });
        menu7.add(mnuRegistrarseE);

        jMenu1.add(menu7);

        menuT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libro-abierto.png"))); // NOI18N
        menuT.setText("Tlautli");
        menuT.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        menuT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSolMouseClicked(evt);
            }
        });

        mnuRegistrarseT.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        mnuRegistrarseT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nota.png"))); // NOI18N
        mnuRegistrarseT.setText("Registrarse");
        mnuRegistrarseT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegistrarseTActionPerformed(evt);
            }
        });
        menuT.add(mnuRegistrarseT);

        jMenu1.add(menuT);

        menuBar.add(jMenu1);

        menuS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivos.png"))); // NOI18N
        menuS.setText("Seguimiento");
        menuS.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        menuS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSolMouseClicked(evt);
            }
        });

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/correo-electronico.png"))); // NOI18N
        jMenuItem5.setText("Mensajes");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSolMouseClicked(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuS.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodo-de-pago.png"))); // NOI18N
        jMenuItem6.setText("Pagos");
        jMenuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSolMouseClicked(evt);
            }
        });
        menuS.add(jMenuItem6);

        menuBar.add(menuS);

        mnuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo.png"))); // NOI18N
        mnuAyuda.setText("Ayuda");
        mnuAyuda.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N

        mnuSoporte.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        mnuSoporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apoyo-tecnico.png"))); // NOI18N
        mnuSoporte.setText("Soporte");
        mnuSoporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSoporteActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuSoporte);

        menuBar.add(mnuAyuda);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String fecha() {
        return java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/YYYY"));
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }// GEN-LAST:event_btnSalirActionPerformed

    private void mnuRegistrarseEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnuRegistrarseEActionPerformed
        try {
            confirmarRegistroPrograma();
            new VentanaPago(this, true, 2).setVisible(true);
            if (alumnoSesion.getPrograma() != null)
                new Mensajes(this, true).setVisible(true);
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_mnuRegistrarseEActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem7ActionPerformed
        if (comprobarSolicitud() || comprobarInformacionAlumno())
            return;
        new Ventana5(this, true).setVisible(true);
    }// GEN-LAST:event_jMenuItem7ActionPerformed

    private boolean comprobarSolicitud() {
        if (alumnoSesion.getSolicitud() == null) {
            return false;
        }
        showMessageDialog(this, "Ya has registrado tu solicitud");
        return true;
    }

    private void menuSolMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_menuSolMouseClicked
        if (login != null) {
            login.setVisible(true);
        }
    }// GEN-LAST:event_menuSolMouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem5ActionPerformed
        new Mensajes(this, true).setVisible(true);
    }// GEN-LAST:event_jMenuItem5ActionPerformed

    private void mnuSoporteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnuSoporteActionPerformed
        new Ayuda(this, true).setVisible(true);
    }// GEN-LAST:event_mnuSoporteActionPerformed

    private void mnuRegistrarseJPActionPerformed1(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnuRegistrarseJPActionPerformed1
        try {
            confirmarRegistroPrograma();
            new VentanaPago(this, true, 1).setVisible(true);
            if (alumnoSesion.getPrograma() != null)
            new Mensajes(this, true).setVisible(true);
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_mnuRegistrarseJPActionPerformed1

    private void confirmarRegistroPrograma() throws RuntimeException {
        if (alumnoSesion.getSolicitud() == null)
            throw new RuntimeException("Aún no has registrado tu solicitud");
        if (alumnoSesion.getPrograma() != null)
            throw new RuntimeException(
                    "Ya te has registrado en un programa, vuelve a intentar cuando comience un nuevo periodo de selección");
    }

    private void mnuRegistrarseTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnuRegistrarseTActionPerformed
        try {
            confirmarRegistroPrograma();
            new VentanaPago(this, true, 3).setVisible(true);
            if (alumnoSesion.getPrograma() != null)
                new Mensajes(this, true).setVisible(true);
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_mnuRegistrarseTActionPerformed

    public void acceso() {
        enableControls(true);
        login = null;
        comprobarInformacionAlumno();
    }

    private boolean comprobarInformacionAlumno() {
        if (alumnoSesion.getResidenciaAlumno() == null) {
            if (showConfirmDialog(this,
                    "No has registrado tu información de residencia\n¿Deseas registrarla? (Es necesaria para comenzar tu solicitud)") == JOptionPane.YES_OPTION)
                new VentanaResidenciaAlumno(this, true).setVisible(true);
            return true;
        }
        if (alumnoSesion.getClaveInterbancaria() == null) {
            if (showConfirmDialog(this,
                    "No has registrado tu información Bancaria\n¿Deseas registrar tu información? (Es necesaria para comenzar tu solicitud)") == JOptionPane.YES_OPTION)
                new VentanaClabeInterbancaria(this, true).setVisible(true);
            return true;
        }
        if (alumnoSesion.getInformacionEscolar() == null) {
            showMessageDialog(this,
                    "Tu información escolar aún no ha sido registrada por el administrador.\nDeberás esperar que lo haga para solicitar una beca.");
            return true;
        }
        return false;
    }

    private void enableControls(boolean enabled) {
        for (java.awt.Component c : menuBar.getComponents()) {
            c.setEnabled(enabled);
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JMenu menu7;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuJP;
    private javax.swing.JMenu menuS;
    private javax.swing.JMenu menuSol;
    private javax.swing.JMenu menuT;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuRegistrarseE;
    private javax.swing.JMenuItem mnuRegistrarseJP;
    private javax.swing.JMenuItem mnuRegistrarseT;
    private javax.swing.JMenuItem mnuSoporte;
    // End of variables declaration//GEN-END:variables
    public static Alumno alumnoSesion;
    Login login;
    private Timer timer = new Timer();
}

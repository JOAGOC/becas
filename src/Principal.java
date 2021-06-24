import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showConfirmDialog;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private class ShowLogin implements Runnable {

        private Principal x;

        public ShowLogin(Principal x) {
            this.x = x;
        }

        public void run() {
            x.enableControls(false);
            login = new Login(x, true);
            login.setVisible(true);
        }
    }

    public Principal() {
        initComponents();
        Thread h = new Thread(new ShowLogin(this));
        h.start();
        lblFecha.setText(fecha());
        TimerTask x = new TimerTask(){
            public void run(){
                try {
                    lblReloj.setText(java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));
                } catch (Exception e) {
                    showMessageDialog(null,e.getMessage());
                }
            }
            
        };
        timer.schedule(x,0,1000);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        jMenuItem1 = new javax.swing.JMenuItem();
        menuE = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuT = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuS = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuSoporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(51, 102, 255));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource((String)"//LogoBecat.png")).getImage());
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
        menuBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                menuBarFocusGained(evt);
            }
        });
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
        menuSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSolActionPerformed(evt);
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

        jMenuItem1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nota.png"))); // NOI18N
        jMenuItem1.setText("Registrarse");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuJP.add(jMenuItem1);

        jMenu1.add(menuJP);

        menuE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/excelencia.png"))); // NOI18N
        menuE.setText("Excelencia");
        menuE.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        menuE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSolMouseClicked(evt);
            }
        });

        jMenuItem2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nota.png"))); // NOI18N
        jMenuItem2.setText("Registrarse");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuE.add(jMenuItem2);

        jMenu1.add(menuE);

        menuT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libro-abierto.png"))); // NOI18N
        menuT.setText("Tlautli");
        menuT.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        menuT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSolMouseClicked(evt);
            }
        });

        jMenuItem3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nota.png"))); // NOI18N
        jMenuItem3.setText("Registrarse");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuT.add(jMenuItem3);

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

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
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

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
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
        mnuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuAyudamenuSolMouseClicked(evt);
            }
        });

        mnuSoporte.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        mnuSoporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apoyo-tecnico.png"))); // NOI18N
        mnuSoporte.setText("Soporte");
        mnuSoporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSoportemenuSolMouseClicked(evt);
            }
        });
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

    public static String fecha(){
        // Date fecha= new Date();
        // SimpleDateFormat ffecha=new SimpleDateFormat("dd/MM/YYYY");
        // return ffecha.format(fecha);
        return java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/YYYY"));
    }
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        RegistrarAlumno abrir = new RegistrarAlumno(this,true);
        abrir.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if (comprobarInformacionAlumno())
            return;
        new Ventana5().setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void menuSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSolActionPerformed

    }//GEN-LAST:event_menuSolActionPerformed

    private void menuBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_menuBarFocusGained

    }//GEN-LAST:event_menuBarFocusGained

    private void menuSolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSolMouseClicked
        if (login != null) {
            login.setVisible(true);
        }
    }//GEN-LAST:event_menuSolMouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new Mensajes().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void mnuSoportemenuSolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSoportemenuSolMouseClicked
        
    }//GEN-LAST:event_mnuSoportemenuSolMouseClicked

    private void mnuSoporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSoporteActionPerformed
        new Ayuda(this,true);
    }//GEN-LAST:event_mnuSoporteActionPerformed

    private void mnuAyudamenuSolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuAyudamenuSolMouseClicked
        
    }//GEN-LAST:event_mnuAyudamenuSolMouseClicked

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
        if (alumnoSesion.getInformacionEscolar() == null)
        {
            showMessageDialog(this, "Tu información escolar aún no ha sido registrada por el administrador.\nDeberás esperar que lo haga para solicitar una beca.");
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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuE;
    private javax.swing.JMenu menuJP;
    private javax.swing.JMenu menuS;
    private javax.swing.JMenu menuSol;
    private javax.swing.JMenu menuT;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuSoporte;
    // End of variables declaration//GEN-END:variables
    public static Alumno alumnoSesion;
    Login login;
    private Timer timer = new Timer();
}

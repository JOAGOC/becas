import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karly
 */
public class Principal extends javax.swing.JFrame {
    
    /**
     * Creates new form Principal
     */
    
    private class ShowLogin implements Runnable{

        private Principal x;
    
        public ShowLogin(Principal x)
        {
            this.x = x;
        }

        public void run(){
            x.enableControls(false);
            Login login = new Login(x, true);
            login.setVisible(true);
            if (acceso){
                x.enableControls(true);
            }
        }
    }

    public Principal() {
        initComponents();
        Thread h = new Thread(new ShowLogin(this));
        h.start();
        alumnos.add(new Alumno("Angel Gabriel Vizcarra Villavicencio", "VIVA020716HNTZLNA9", "1582", "",
                "vizcarraangel20@gmail.com", "Mexicana", "Soltero", "3112332337", "16 julio del 2002",
                "Tepic,Nayarit"));
        alumnos.add(new Alumno("Karla Esmeralda Marmolejo Uribe", "MAUK020222MNTRRRA9", "8302462", "",
                "karly_1022@outlook.es", "Mexicana", "Soltero", "311-128-49-37", "22 de febrero de 2002",
                "Tepic, Nayarit Mexico"));
        alumnos.add(new Alumno("José Angel González Cruz", "GOCA021024HNTNRNA8", "PATATA", "",
                "angel24gonzalez10@gmail.com", "Mexicana", "Soltero", "311-144-52-95", "24 de Octubre de 2002",
                "Tepic, Nayarit; México"));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuSol = new javax.swing.JMenu();
        menuPro = new javax.swing.JMenu();
        menuJP = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuE = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuT = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuA = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuS = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(51, 102, 255));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/LogoBecat.png")).getImage());
        setSize(new java.awt.Dimension(1280, 900));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen1.png"))); // NOI18N

        menuBar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        menuBar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menuSol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registro.png"))); // NOI18N
        menuSol.setText("Solicitud");
        menuSol.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N

        menuPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/educacion.png"))); // NOI18N
        menuPro.setText("Programas");
        menuPro.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N

        menuJP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        menuJP.setText("Jovenes Pioneros");
        menuJP.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nota.png"))); // NOI18N
        jMenuItem1.setText("Registrarse");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuJP.add(jMenuItem1);

        menuPro.add(menuJP);

        menuE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/excelencia.png"))); // NOI18N
        menuE.setText("Excelencia");
        menuE.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nota.png"))); // NOI18N
        jMenuItem2.setText("Registrarse");
        menuE.add(jMenuItem2);

        menuPro.add(menuE);

        menuT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libro-abierto.png"))); // NOI18N
        menuT.setText("Tlautli");
        menuT.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nota.png"))); // NOI18N
        jMenuItem3.setText("Registrarse");
        menuT.add(jMenuItem3);

        menuPro.add(menuT);

        menuSol.add(menuPro);

        menuBar.add(menuSol);

        menuA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo.png"))); // NOI18N
        menuA.setText("Alumnos");
        menuA.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unido.png"))); // NOI18N
        jMenuItem4.setText("Alumnos Inscritos");
        menuA.add(jMenuItem4);

        menuBar.add(menuA);

        menuS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivos.png"))); // NOI18N
        menuS.setText("Seguimiento");
        menuS.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/correo-electronico.png"))); // NOI18N
        jMenuItem5.setText("Mensajes");
        menuS.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodo-de-pago.png"))); // NOI18N
        jMenuItem6.setText("Pagos");
        menuS.add(jMenuItem6);

        menuBar.add(menuS);
        menuBar.add(jMenu6);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(884, 884, 884)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(531, 531, 531)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Ventana1 abrir=new Ventana1();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
            

    public static void setAcceso(boolean acceso){
        Principal.acceso = acceso;
    }

    private void enableControls(boolean enabled)
    {
        for (int i = 0; i< menuBar.getMenuCount(); i++) {
            menuBar.getMenu(i).setEnabled(enabled);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collaped" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JMenu menuA;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuE;
    private javax.swing.JMenu menuJP;
    private javax.swing.JMenu menuPro;
    private javax.swing.JMenu menuS;
    private javax.swing.JMenu menuSol;
    private javax.swing.JMenu menuT;
    // End of variables declaration//GEN-END:variables
    private static boolean acceso;
    public static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    
}

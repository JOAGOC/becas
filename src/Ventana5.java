
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karly
 */
public class Ventana5 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana5
     */
    public Ventana5() {
        initComponents();
        txtSocioEconomica.setLineWrap(true);
        txtSocioEconomica.setWrapStyleWord(true);
        lblSiguiente.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtEstatus = new javax.swing.JTextField();
        txtFolio = new javax.swing.JTextField();
        txtVigencia = new javax.swing.JTextField();
        txtEstadoCivil = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSocioEconomica = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnObtenerAcuse = new javax.swing.JButton();
        lblSiguiente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(java.awt.Color.lightGray);
        jLabel10.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Información Socioeconomica:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 280, -1));

        txtFecha.setBackground(java.awt.Color.lightGray);
        txtFecha.setFont(new java.awt.Font("New Gulim", 1, 14)); // NOI18N
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 170, -1));

        txtEstatus.setBackground(java.awt.Color.lightGray);
        txtEstatus.setFont(new java.awt.Font("New Gulim", 1, 14)); // NOI18N
        getContentPane().add(txtEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 170, -1));

        txtFolio.setBackground(java.awt.Color.lightGray);
        txtFolio.setFont(new java.awt.Font("New Gulim", 1, 14)); // NOI18N
        getContentPane().add(txtFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 170, -1));

        txtVigencia.setBackground(java.awt.Color.lightGray);
        txtVigencia.setFont(new java.awt.Font("New Gulim", 1, 14)); // NOI18N
        getContentPane().add(txtVigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 110, -1));

        txtEstadoCivil.setBackground(java.awt.Color.lightGray);
        txtEstadoCivil.setFont(new java.awt.Font("New Gulim", 1, 14)); // NOI18N
        getContentPane().add(txtEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 170, -1));

        jLabel4.setBackground(java.awt.Color.lightGray);
        jLabel4.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Folio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 50, -1));

        jLabel5.setBackground(java.awt.Color.lightGray);
        jLabel5.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vigencia:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 90, -1));

        jLabel6.setBackground(java.awt.Color.lightGray);
        jLabel6.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estatus:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 80, -1));

        jLabel13.setBackground(java.awt.Color.lightGray);
        jLabel13.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 70, -1));

        jLabel14.setBackground(java.awt.Color.lightGray);
        jLabel14.setFont(new java.awt.Font("New Gulim", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Estado Civil:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        txtSocioEconomica.setColumns(20);
        txtSocioEconomica.setFont(new java.awt.Font("New Gulim", 1, 14)); // NOI18N
        txtSocioEconomica.setRows(5);
        txtSocioEconomica.setToolTipText("Aqui redactaras tu situación econimica en general\n* Cantidad de integrantes de tu familia\n* Habitaciones de tu hogar\n* Ingreso mensual total por todos los integrantes de la familia \n* Entre otros detalles que quisieras contar");
        jScrollPane1.setViewportView(txtSocioEconomica);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 420, 110));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Solicitud");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 190, -1));

        btnObtenerAcuse.setBackground(new java.awt.Color(51, 204, 0));
        btnObtenerAcuse.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnObtenerAcuse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/documentos-oficiales.png"))); // NOI18N
        btnObtenerAcuse.setToolTipText("Obtener Acuse");
        btnObtenerAcuse.setBorder(null);
        btnObtenerAcuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerAcuseActionPerformed(evt);
            }
        });
        getContentPane().add(btnObtenerAcuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 100, 80));

        lblSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha-correcta.png"))); // NOI18N
        lblSiguiente.setToolTipText("Siguiente");
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseClicked(evt);
            }
        });
        getContentPane().add(lblSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 550, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abcd.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void  guardar(){
        try {
//flujo de bytes de salida (escritura)
            java.io.FileOutputStream fbs=new java.io.FileOutputStream(nameFile+".doc");
            String cad="***********************ACUSE DE SOLICITU DE BECA**********************"+"\n"+"\n"+
                    "El acuse generado sirve como comprobante de a solicitud, con el puedes presentar a algunas oficinas para presentar aclaraciones, preguntas y quejas, este acuse np garantiza que ya seras beneficiado con la beca."+"\n"+"\n"+
                    "Solicitud con el numero de folio de : "+txtFolio.getText()+"\n "+"\n"+
                    "Con una vigencia : "+txtVigencia.getText()+"\n "+"\n"+
                    "El estatus del estudiante segun su administracion escolar : "+txtEstatus.getText()+"\n"+"\n"+
                    "Fecha de solicitud : "+txtFecha.getText()+"\n "+"\n"+
                    "Estado civil : "+txtEstadoCivil.getText()+"\n "+"\n"+
                    "Estado socio economico del solicitante : "+"\n"+txtSocioEconomica.getText()+"\n"+"\n"+
                    "****************************************************************************************"+"\n"+"\n"+
                    "Este acuse es el ultimo paso de la solicitud, por favor espera noticias de las fuentes oficiales de la coordinacion de becas para mantenerte al tanto de posibles resultados  o cambios de fecha de la misma.";
            byte b[]=cad.getBytes();
            fbs.write(b);
            fbs.flush();
        } catch (FileNotFoundException ex) {
                showMessageDialog(this,"Archivo no encontrado");
                //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);  //Leer que esta haciendo aqui
        } catch (IOException ex) {
            Logger.getLogger(Ventana5.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    private void btnObtenerAcuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerAcuseActionPerformed
       lblSiguiente.setVisible(true);
       //********************************************************** 
        if(nameFile.equals("")){
                    JFileChooser chooser = new JFileChooser();
                    FileNameExtensionFilter filter = new FileNameExtensionFilter (
                   "Archivos de texto,","txt","java","cpp");
                    chooser.setFileFilter (filter);
                   int returnVal = chooser.showSaveDialog (this);
                   if (returnVal == JFileChooser.APPROVE_OPTION) {nameFile=chooser.getSelectedFile().getAbsolutePath();}
                   else return;
               }           
       guardar();
       showMessageDialog(this,"Acuse guardado exitosamente");
       limpiar();
       txtFolio.requestFocus();
    }//GEN-LAST:event_btnObtenerAcuseActionPerformed

       public void limpiar(){
           txtFolio.setText("");
           txtEstatus.setText("");
           txtVigencia.setText("");
           txtFecha.setText("");
           txtEstadoCivil.setText("");
           txtSocioEconomica.setText("");
       }
    
    
    
    
    private void lblSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseClicked
       Principal abrir=new Principal();
       abrir.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblSiguienteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana5().setVisible(true);
            }
        });
    }
 private String nameFile=""; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnObtenerAcuse;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtEstatus;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextArea txtSocioEconomica;
    private javax.swing.JTextField txtVigencia;
    // End of variables declaration//GEN-END:variables
}

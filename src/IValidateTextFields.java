public interface IValidateTextFields {

    default void validarJCalendarVacio(com.toedter.calendar.JDateChooser jdchs, javax.swing.JLabel lbl, String message)
            throws RuntimeException {
        if (jdchs.getDate() == null) {
            lbl.setForeground(java.awt.Color.red);
            jdchs.requestFocus();
            throw new RuntimeException(message);
        }
    }

    default void validarCampoVacio(javax.swing.JLabel lbl, javax.swing.JTextField jtf) throws RuntimeException {
        try {
            if (lbl != null)
                lbl.setForeground(java.awt.Color.white);
            else
                return;
            if (jtf == null)
                return;
            lbl.setForeground(java.awt.Color.white);
            if ("".equals(jtf.getText())) {
                lbl.setForeground(java.awt.Color.red);
                jtf.requestFocus();
                throw new RuntimeException("El campo " + lbl.getText() + " está vacío");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    default void validarFormatoTexto(javax.swing.JLabel lbl, javax.swing.JTextField jtf) throws RuntimeException {
        if (lbl != null)
            lbl.setForeground(java.awt.Color.white);
        else
            return;
        if (jtf == null)
            return;
        if (java.util.regex.Pattern.compile("[^áéíóúÁÉÍÓÚÜüa-zA-Z ]+").matcher(jtf.getText()).find()) {
            lbl.setForeground(java.awt.Color.red);
            jtf.requestFocus();
            throw new RuntimeException("En el campo " + lbl.getText() + " solo debe escribir texto");
        }
    }

    default void validarFormatoAlfanumerico(javax.swing.JLabel lbl, javax.swing.JTextField jtf)
            throws RuntimeException {
        if (lbl != null)
            lbl.setForeground(java.awt.Color.white);
        else
            return;
        if (jtf == null)
            return;
        lbl.setForeground(java.awt.Color.white);
        if (java.util.regex.Pattern.compile("[^0-9áéíóúÁÉÍÓÚÜüa-zA-Z ]+").matcher(jtf.getText()).find()) {
            lbl.setForeground(java.awt.Color.red);
            jtf.requestFocus();
            throw new RuntimeException("En el campo " + lbl.getText() + " solo debe escribir texto");
        }
    }

    default void validarFormatoNumerico(javax.swing.JLabel lbl, javax.swing.JTextField jtf) throws RuntimeException {
        if (lbl == null || jtf == null)
            return;
        lbl.setForeground(java.awt.Color.white);
        if (java.util.regex.Pattern.compile("[^\\d]").matcher(jtf.getText()).find()) {
            lbl.setForeground(java.awt.Color.red);
            jtf.requestFocus();
            throw new RuntimeException("En el campo " + lbl.getText() + " solo debe escribir dígitos");
        }
    }

    default void validarCamposVacios(javax.swing.JLabel[] lbls, javax.swing.JTextField[] jtfs) throws RuntimeException {
        for (int i = 0; lbls.length > i; i++)
            validarCampoVacio(lbls[i], jtfs[i]);
    }
}
public interface IValidateTextFields {

    default void validarCampoVacio(javax.swing.JLabel lbl, javax.swing.JTextField jtf) throws RuntimeException {
        try {
            if (lbl == null || jtf == null) {
                return;
            }
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

    default void validarFormatoNumerico(javax.swing.JLabel lbl,javax.swing.JTextField jtf) throws RuntimeException
    {
        for (char caracter : jtf.getText().toCharArray()) {
            if (!java.lang.Character.isDigit(caracter))
                throw new RuntimeException("En el campo "+lbl.getText()+" solo debe escribir dígitos");
        }
    }

    default void validarCamposVacios(javax.swing.JLabel[] lbls, javax.swing.JTextField[] jtfs) throws RuntimeException {
        for (int i = 0; lbls.length > i; i++)
            validarCampoVacio(lbls[i], jtfs[i]);
    }
}
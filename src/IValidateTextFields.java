public interface IValidateTextFields {

    private static void validarCampoVacio(javax.swing.JLabel lbl, javax.swing.JTextField jtf) throws RuntimeException {
        lbl.setForeground(java.awt.Color.white);
        if ("".equals(jtf.getText())) {
            lbl.setForeground(java.awt.Color.red);
            jtf.requestFocus();
            throw new RuntimeException("El campo " + lbl.getText()+" está vacío");
        }
    }

    default void validarCamposVacios(javax.swing.JLabel[] lbls, javax.swing.JTextField[] jtfs) throws RuntimeException{
        for (int i = 0; lbls.length>i;i++)
            validarCampoVacio(lbls[i], jtfs[i]);
    }
}
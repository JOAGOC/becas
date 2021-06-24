public class Universidad implements java.io.Serializable{
    private String nombre, telefono, ubicacion;
    public static final String FILE_NAME = "UNIVERSIDAD.TXT";

    public Universidad(String nombre, String telefono, String ubicacion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }    
}
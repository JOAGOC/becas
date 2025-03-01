public class Programa implements java.io.Serializable{

    private String nombre,descripción;
    private Periodo periodo;
    private int clave;

    public Programa(String nombre, String descripción, Periodo periodo, int clave) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.periodo = periodo;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }  
}
import java.util.Calendar;

public class ClaveInterbancaria {
    private int clabe;
    private Calendar fechaRegistro;
    private boolean activa;
    private String nombreBanco;

    public int getClabe() {
        return clabe;
    }

    public void setClabe(int clabe) {
        this.clabe = clabe;
    }

    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }   
}
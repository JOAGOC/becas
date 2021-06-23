import java.util.Calendar;

public class ClaveInterbancaria {
    private String CURPAlumno;
    private String clabe;
    private Calendar fechaRegistro;
    private boolean activa;
    private String nombreBanco;

    public ClaveInterbancaria(String cURPAlumno, String clabe, Calendar fechaRegistro, boolean activa,
            String nombreBanco) {
        CURPAlumno = cURPAlumno;
        this.clabe = clabe;
        this.fechaRegistro = fechaRegistro;
        this.activa = activa;
        this.nombreBanco = nombreBanco;
    }

    public String getClabe() {
        return clabe;
    }

    public String getCURPAlumno() {
        return CURPAlumno;
    }

    public void setCURPAlumno(String cURPAlumno) {
        CURPAlumno = cURPAlumno;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public Calendar getFechaRegistro(){
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
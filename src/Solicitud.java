import java.util.Calendar;

public class Solicitud {
    enum Estado{EnEspera,EnProceso,Rechazada,Aceptada,Cancelada;}

    private int folio;
    private Calendar vigencia, fecha;
    private Estado estado;
    private String acuse;

    public int getFolio() {
        return folio;
    }
    public void setFolio(int folio) {
        this.folio = folio;
    }
    public Calendar getVigencia() {
        return vigencia;
    }
    public void setVigencia(Calendar vigencia) {
        this.vigencia = vigencia;
    }
    public Calendar getFecha() {
        return fecha;
    }
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public String getAcuse() {
        return acuse;
    }
    public void setAcuse(String acuse) {
        this.acuse = acuse;
    }    
}
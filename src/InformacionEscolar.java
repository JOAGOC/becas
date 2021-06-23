public class InformacionEscolar implements java.io.Serializable{
    enum TipoPeriodo{Semestre, Bimestre, Trimestre, Cuatrimestre;}

    private float promedioAnterior, promedioGeneral;
    private boolean regular;
    private String matricula;
    private TipoPeriodo tipoPeriodo;
    private int totalPeriodos;
    private Periodo periodoActual;
    private Universidad universidad;
    
    public InformacionEscolar(float promedioAnterior, float promedioGeneral, boolean regular, String matricula,
            InformacionEscolar.TipoPeriodo tipoPeriodo, int totalPeriodos, Periodo periodoActual,
            Universidad universidad) {
        this.promedioAnterior = promedioAnterior;
        this.promedioGeneral = promedioGeneral;
        this.regular = regular;
        this.matricula = matricula;
        this.tipoPeriodo = tipoPeriodo;
        this.totalPeriodos = totalPeriodos;
        this.periodoActual = periodoActual;
        this.universidad = universidad;
    }
    
    public float getPromedioAnterior() {
        return promedioAnterior;
    }
    public void setPromedioAnterior(float promedioAnterior) {
        this.promedioAnterior = promedioAnterior;
    }
    public float getPromedioGeneral() {
        return promedioGeneral;
    }
    public void setPromedioGeneral(float promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }
    public boolean isRegular() {
        return regular;
    }
    public void setRegular(boolean regular) {
        this.regular = regular;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public TipoPeriodo getTipoPeriodo() {
        return tipoPeriodo;
    }
    public void setTipoPeriodo(TipoPeriodo tipoPeriodo) {
        this.tipoPeriodo = tipoPeriodo;
    }
    public int getTotalPeriodos() {
        return totalPeriodos;
    }
    public void setTotalPeriodos(int totalPeriodos) {
        this.totalPeriodos = totalPeriodos;
    }
    public Periodo getPeriodoActual() {
        return periodoActual;
    }
    public void setPeriodoActual(Periodo periodoActual) {
        this.periodoActual = periodoActual;
    }
    public Universidad getUniversidad() {
        return universidad;
    }
    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }   

    
}
import java.util.Calendar;

class Periodo implements java.io.Serializable{
    private Calendar inicio;
    private Calendar fin;

    public Periodo(Calendar inicio, Calendar fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

	public Calendar getInicio() {
		return inicio;
	}

	public void setInicio(Calendar inicio) {
		this.inicio = inicio;
	}

	public Calendar getFin() {
		return fin;
	}

	public void setFin(Calendar fin) {
		this.fin = fin;
	}
}
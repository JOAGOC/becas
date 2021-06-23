public class ResidenciaAlumno implements java.io.Serializable {
         private String estado,municipio,asentamiento,localidad,NExterior,NInterior,DUbicacion,calle,idCURPAlumno,codigoPostal; 

    public ResidenciaAlumno(String estado, String municipio, String asentamiento, String localidad, String NExterior, String NInterior, String DUbicacion, String calle, String idCURPAlumno, String codigoPostal) {
        this.estado = estado;
        this.municipio = municipio;
        this.asentamiento = asentamiento;
        this.localidad = localidad;
        this.NExterior = NExterior;
        this.NInterior = NInterior;
        this.DUbicacion = DUbicacion;
        this.calle = calle;
        this.idCURPAlumno = idCURPAlumno;
        this.codigoPostal = codigoPostal;
    }

    public String getIdCURPAlumno() {
		return idCURPAlumno;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public void setIdCURPAlumno(String idCURPAlumno) {
		this.idCURPAlumno = idCURPAlumno;
	}

	public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getAsentamiento() {
        return asentamiento;
    }

    public void setAsentamiento(String asentamiento) {
        this.asentamiento = asentamiento;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNExterior() {
        return NExterior;
    }

    public void setNExterior(String NExterior) {
        this.NExterior = NExterior;
    }

    public String getNInterior() {
        return NInterior;
    }

    public void setNInterior(String NInterior) {
        this.NInterior = NInterior;
    }

    public String getDUbicacion() {
        return DUbicacion;
    }

    public void setDUbicacion(String DUbicacion) {
        this.DUbicacion = DUbicacion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
    
}
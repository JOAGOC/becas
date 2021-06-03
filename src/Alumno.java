public class Alumno {

    private String nombre, CURP, contraseña, telefono, correo, nacionalidad, estadoCivil, celular, fechaDeNacimiento,
            lugarDeNacimiento;
    private int id;
    private static int idN = 0;

    public Alumno() {
    }

    public Alumno(String nombre, String CURP, String contraseña, String telefono, String correo, String nacionalidad,
            String estadoCivil, String celular, String fechaDeNacimiento, String lugarDeNacimiento) {
        this.id = increaseIdN();
        this.nombre = nombre;
        this.CURP = CURP;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.correo = correo;
        this.nacionalidad = nacionalidad;
        this.estadoCivil = estadoCivil;
        this.celular = celular;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.lugarDeNacimiento = lugarDeNacimiento;
    }//

    private int increaseIdN(){
        return ++Alumno.idN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String cURP) {
        CURP = cURP;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getLugarDeNacimiento() {
        return lugarDeNacimiento;
    }

    public void setLugarDeNacimiento(String lugarDeNacimiento) {
        this.lugarDeNacimiento = lugarDeNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdN() {
        return idN;
    }

    public static void setIdN(int idN) {
        Alumno.idN = idN;
    }

    
}
package beans;

/**
 *
 * @author pedro
 */
public abstract class Persona {

    public Persona() {
    }

    public Persona(long dpi, String nombres, String apellidos, String telefono, String direccion, String genero, String fecha_na) {
        this.dpi = dpi;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.genero = genero;
        this.fecha_na = fecha_na;
    }

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFecha_na() {
        return fecha_na;
    }

    public void setFecha_na(String fecha_na) {
        this.fecha_na = fecha_na;
    }
        
    
    long dpi;
    String nombres;
    String apellidos;
    String telefono;
    String direccion;
    String genero;
    String fecha_na;
}

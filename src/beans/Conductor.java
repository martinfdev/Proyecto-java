package beans;


/**
 *
 * @author pedro
 */
public class Conductor extends Persona {

    public Conductor() {
    }

    public Conductor(char tipo_licencia, long dpi, String nombres, String apellidos, String telefono, String direccion, String genero, String fecha_na) {
        super(dpi, nombres, apellidos, telefono, direccion, genero, fecha_na);
        this.tipo_licencia = tipo_licencia;
    }

    
    public char getTipo_licencia() {
        return tipo_licencia;
    }

    public void setTipo_licencia(char tipo_licencia) {
        this.tipo_licencia = tipo_licencia;
    }

    @Override
    public long getDpi() {
        return dpi;
    }

    @Override
    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    @Override
    public String getNombres() {
        return nombres;
    }

    @Override
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String getApellidos() {
        return apellidos;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getGenero() {
        return genero;
    }

    @Override
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String getFecha_na() {
        return fecha_na;
    }

    @Override
    public void setFecha_na(String fecha_na) {
        this.fecha_na = fecha_na;
    }
    
    private char tipo_licencia;
}

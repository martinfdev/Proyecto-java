package beans;

/**
 *
 * @author pedro
 */
public class Cliente extends Persona {

    public Cliente() {
    }

    /**
     *
     * @param dpi
     * @param nombres
     * @param apellidos
     * @param telefono
     * @param direccion
     * @param genero
     */
    public Cliente(long dpi, String nombres, String apellidos, String telefono, String direccion, char genero) {
        super(dpi, nombres, apellidos, telefono, direccion, genero);
    }

    @Override
    public long getDpi() {
        return dpi;
    }

    /**
     *
     * @param dpi
     */
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
    public char getGenero() {
        return genero;
    }

    @Override
    public void setGenero(char genero) {
        this.genero = genero;
    }
}

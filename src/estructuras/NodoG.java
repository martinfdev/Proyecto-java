package estructuras;

/**
 *
 * @author pedro
 */
public class NodoG {

    public NodoG(String nombre) {
        this.nombre = nombre;
        siguiente = null;
        adyacencia = null;
    }

    public NodoG getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoG siguiente) {
        this.siguiente = siguiente;
    }

    public ArcoG getAdyacencia() {
        return adyacencia;
    }

    public void setAdyacencia(ArcoG adyacencia) {
        this.adyacencia = adyacencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    NodoG siguiente;
    ArcoG adyacencia;
    String nombre;
}

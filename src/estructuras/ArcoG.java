package estructuras;

/**
 *
 * @author pedro
 */
public class ArcoG {

    public ArcoG(int peso) {
        this.peso = peso;
        siguiente = null;
        adyacencia = null;
    }

    public ArcoG getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ArcoG siguiente) {
        this.siguiente = siguiente;
    }

    public NodoG getAdyacencia() {
        return adyacencia;
    }

    public void setAdyacencia(NodoG adyacencia) {
        this.adyacencia = adyacencia;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    ArcoG siguiente;
    NodoG adyacencia;
    int peso;
}

package grafo;

/**
 *
 * @author Angel López
 */
public class NodoVertice {
    
    private String lugarInicio;
    public NodoVertice abajo;
    public ListaAdyacente lista;
    
    public NodoVertice(String lugarInicio ){
        this.lugarInicio=lugarInicio;
        this.abajo=null;
        this.lista=null;
    }

    public String getLugarInicio() {
        return lugarInicio;
    }

    public void setLugarInicio(String lugarInicio) {
        this.lugarInicio = lugarInicio;
    }
    
    
}

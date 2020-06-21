
package estructuras;

/**
 *
 * @author pedro
 * @param <T>
 */
// T es el tipo de datos que se alamacenara
public class NodoB<T> {

    public NodoB(int orden, boolean hijo){
        this.m = orden;
        this.hijo = hijo;
        claves = (T[]) new Object[m];
        ramas = new NodoB[m];
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public void setHijo(boolean hijo) {
        this.hijo = hijo;
    }
    
    
    private final int m; //maximo numero de claves que puede almacenar la pagina
    private int cuenta; //contiene el numero maximo de claves que almacena la pagina
    protected T[] claves; //array de claves de la pagina
    protected NodoB<T>[] ramas; //array que contiene las ramas de la pagina
    private boolean hijo; //es verdadero cuando es un nodo hoja de lo contrario es falso
}


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
    
    /*
     *Nos dice que si la pagina esta llena
    */
    protected boolean nodoLLeno(){
        return (cuenta ==m-1);
    }
    
    /*
     *metodo que dice que si una pagina tiene menos de la mitad
     *de claves
    */
    protected boolean nodeSemiVacio(){
        return (cuenta<m/2);
    }
    
    /*metodo que obtiene la clave en una posicion i del array de claves*/
    protected T obtenerClave(int i){
        return claves[i];
    }
    
    
    
    
    
    
    
    private final int m; //maximo numero de claves que puede almacenar la pagina
    private int cuenta; //contiene el numero maximo de claves que almacena la pagina
    protected T[] claves; //array de claves de la pagina
    protected NodoB<T>[] ramas; //array que contiene las ramas de la pagina
    private boolean hijo; //es verdadero cuando es un nodo hoja de lo contrario es falso
}


package estructuras;

/**
 *
 * @author pedro
 * @param <T>
 * @param <G>
 */
public class BTree<T, G> {
    
    public BTree(int grado){
     this.m = grado;
    }
    
    
    

    int m; //grado del arbol
    NodoB<T> raiz; //raiz del arbol
}

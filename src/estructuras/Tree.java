package estructuras;

/**
 *
 * @author pedro
 */
public class Tree {

    public Tree() {
        raiz = null;
    }

    public NodeT getRaiz() {
        return raiz;
    }

    public void setRaiz(NodeT raiz) {
        this.raiz = raiz;
    }

    public Tree(char s, Integer frecuencia) {
        raiz = new NodeT(s, frecuencia);
    }

    public void AgregarHojas(NodeT izq, NodeT der) {
        raiz.derecha = der;
        raiz.izquierda=izq;
    }
    private NodeT raiz;
}

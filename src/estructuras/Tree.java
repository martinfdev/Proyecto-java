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

    public Tree(String s, Integer frecuencia) {
        raiz = new NodeT(s , frecuencia);
    }

    public void addLeaf(NodeT izq, NodeT der) {
        raiz.derecha = der;
        raiz.izquierda=izq;
    }
    private NodeT raiz;
}

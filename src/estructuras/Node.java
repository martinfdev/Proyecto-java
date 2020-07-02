
package estructuras;

/**
 *
 * @author pedro
 * @param <T>
 */
public class Node<T>  {
    private T data;
    int i;//dato que se usa para poder guardar un dato extra si se inserta de manera ordenada
    Node next;
    Node back;

    public Node(T data) {
        this.data = data;
        this.back = this.next = null;
    }

    public Node(T data, int i) {
        this.data = data;
        this.i = i;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public Node getBack() {
        return back;
    }
    
}

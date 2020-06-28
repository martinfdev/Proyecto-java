
package estructuras;

/**
 *
 * @author pedro
 * @param <T>
 */
public class Node<T>  {
    private T data;
    Node next;
    Node back;

    public Node(T data) {
        this.data = data;
        this.back = this.next = null;
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

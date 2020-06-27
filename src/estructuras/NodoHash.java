
package estructuras;
/**
 *
 * @author pedro
 * @param <T>
 */
public class NodoHash<T> {
    DoubleLinkedList<T> list_client;

    public NodoHash() {
        list_client = new DoubleLinkedList<>();
    }

    public DoubleLinkedList<T> getList_client() {
        return list_client;
    }

    public void setList_user(DoubleLinkedList<T> list_client) {
        this.list_client = list_client;
    }
}

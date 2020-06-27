package estructuras;

/**
 *
 * @author pedro
 * @param <T>
 */
//El parametro T para la lista sera el dato almacenado
public class DoubleLinkedList<T> {

    private Node<T> head, queue, getaux;
    private int size;

    //constuctor por defecto
    public DoubleLinkedList() {
        this.head = queue = null;
    }

    //vuelve el tamanio de la lista
    public int getSize() {
        return size;
    }

    //funcion util para saver si la lista esta vacia
    public boolean isEmpty() {
        return head != null && queue != null;
    }

    //metodo privado para insertar en la en donde correspoonde ya sea de primero o de ultimo en la lista
    private void insert(Node n, T data, boolean in) {
        Node<T> newnode = new Node<>(data);
        if (!isEmpty()) {
            head = queue = newnode;
            size++;
        } //si n es igual a la cabeza de la lista e in es falso insertar de primero
        else if (n == head && in == false) {
            newnode.next = head;
            head.back = newnode;
            head = newnode;
            size++;
        } //si n es igual a la cola de la lista e in es true se insertaa al final de la lista
        else if (n == queue && in == true) {
            newnode.back = queue;
            queue.next = newnode;
            queue = newnode;
            size++;
        } //otro caso insertar el nuevo nodo antes de un nodo dado
        else {
            n.back.next = newnode;
            newnode.back = n.back;
            n.back = newnode;
            newnode.next = n;
            size++;
        }
    }

    //metodo para insertar en la cabeza de la lista
    public void add_head(T data) {
        insert(head, data, false);
    }

    //metodo para insertar la cola de la lista
    public void add_end(T data) {
        insert(queue, data, true);
    }

    //funcion publica para buscar un dato dentro de la lista
    public Node<T> search(T data) {
        if (isEmpty()) {
            Node<T> aux = head;
            while (aux != null) {
                if (aux.getData() == data) {
                    return aux;
                }
                aux = aux.next;
            }
        }
        return null;
    }

    //metodo retornar los datos en el nodo de la lista 
    public T getData() {
        if (isEmpty()) {
            if (getaux == null) {
                getaux = head;
                T tmp = (T) getaux.getData();
                getaux = getaux.next;
                return tmp;
            }
            if (getaux != null) {
                T tmp = (T) getaux.getData();
                getaux = getaux.next;
                return tmp;
            }
        } else {
            return null;
        }
        return null;
    }

    //metodo para eliminar 
    private void delete(Node<T> n) {
        if (isEmpty()) {
            if (n == head) {
                head = head.next;
                size--;
            } else if (n == queue) {
                queue = queue.back;
                size--;
            } else {
                n.back.next = n.next;
                n.next.back = n.back;
                size--;
            }
        }
    }

    //funcion util para borrar en la cabeza de la lista
    public void delete_head() {
        delete(head);
    }

    //metodo privado que inserta de forma cicular al inicio recibe como parametro Un nodo, dato y un bool si es verdadero inserta al inicio falso inserta al final
    private void insertC(Node<T> n, T data, boolean in) {
        Node<T> newnode = new Node<>(data);
        if (!isEmpty()) {
            head = queue = newnode;
            head.back = queue;
            queue.next = head;
            size++;
        } //si n es igual a la cabeza de la lista e in es falso insertar de primero
        else if (n == head && in == false) {
            newnode.next = head;
            head.back = newnode;
            queue.next = newnode;
            newnode.back = queue;
            head = newnode;
            size++;
        } //si n es igual a la cola de la lista e in es true se insertaa al final de la lista
        else if (n == queue && in == true) {
            newnode.back = queue;
            queue.next = newnode;
            newnode.next = head;
            head.back = newnode;
            queue = newnode;
            size++;
        } //otro caso insertar el nuevo nodo antes de un nodo dado
        else {
            n.back.next = newnode;
            newnode.back = n.back;
            n.back = newnode;
            newnode.next = n;
            size++;
        }

    }

    //metodo para agregar al principio en una lista comportamiento circular 
    public void add_headc(T data) {
        insertC(head, data, false);
    }

    //metodo para insertar al final en una lista de coportamiento circular    
    public void add_endc(T data) {
        insertC(head, data, true);
    }

    //funcion util para borra en la cola de la lista
    public void delete_end() {
        delete(queue);
    }

    //eliminar con parametro
    public void delete_data(T data) {
        delete(search(data));
    }

    //metodo que devuelve el nodo cabeza
    public Node<T> getHead() {
        return head;
    }

    //metodo que devuelve el ultimo nodo insertado en la lista
    public Node<T> getEnd() {
        return queue;
    }

}

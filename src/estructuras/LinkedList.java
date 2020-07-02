package estructuras;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 * @param <T>
 */
public class LinkedList<T> {

    private Node<T> head, last;
    private int size;
    private Node<T> getaux;

    public LinkedList() {
        head = last = null;
        size = 0;
    }

    //devuelve el tamanio de la lista
    public int getSize() {
        return size;
    }

    //devuelve un booleano con valor true si la la lista esta vacia
    public boolean isEmpty() {
        return head == null;
    }

    //metodo para insertar un nodo dentro de la lista pide como parametro un nodo
    //un boolean si es true se agrega en al inicio como una pila si es false se agrega al final
    //se comporta como una cola
    private void insertNode(Node n, boolean tipo, T data) {
        Node<T> newnode = new Node<>(data);
        if (isEmpty()) {
            head = last = newnode;
            size++;
            return;
        }
        if (n == head && tipo == true) {
            newnode.next = head;
            head = newnode;
            size++;
            return;
        }
        if (n == last && tipo == false) {
            last.next = newnode;
            last = newnode;
            size++;
        }
    }

    //ingresar un nuevo nodo pide como parametro el dato
    public void add_head(T data) {
        insertNode(head, true, data);
    }

    //agregar un nuevo dato en la cola de la lista
    public void add_queue(T data) {
        insertNode(last, false, data);
    }

    //borrar elemento de lista pide como parametro el elemento a eliminar
    private void deleteNode(Node n) {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia!");
        } else if (n != null && n.next == last) {
            last = n;
            n.next = null;
            size--;
        } else if (n != null) {
            Node tmp = n.next;
            n.next = n.next.next;
            size--;
            tmp = null;
        }
    }

    //busca un nodo con el dato especificado y lo devuelve
    private Node searchNode_delete(T data) {
        if (!isEmpty()) {
            Node aux = head;
            do {
                if (aux.getData() == data) {
                    head = head.next;
                    size--;
                    return null;
                } else if (aux.next.getData() == data) {
                    return aux;
                }
                aux = aux.next;
            } while (aux.next != null);
        }
        return null;
    }

    //metodo para borrar en la cabeza de la lista
    public T delete_head() {
        return del_head();
    }

    //metodo para borrar con parametro
    public void delete_data(T data) {
        deleteNode(searchNode_delete(data));
    }

    //buscar dato especifico
    public T search(T data) {
        if (!isEmpty()) {
            Node aux = head;
            do {
                if (aux.getData() == data) {
                    return (T) aux.getData();
                }
                aux = aux.next;
            } while (aux != null);
        }
        return null;
    }

    //Devuelve dato por dato en la lista
    public T getData() {
        if (!isEmpty()) {
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

    private T del_head() {
        T dtmp;
        if (head == null) {
            System.out.println(isEmpty());
            JOptionPane.showMessageDialog(null, "La lista esta vacia!");
            return null;
        }
        if (head == last) {
            dtmp = head.getData();
            head = last = null;
            return dtmp;
        } else {
            dtmp = head.getData();
            head = head.next;
            size--;
            return dtmp;
        }
    }

    public Node getHead() {
        return head;
    }

    //funcion pila pop
    public T pop() {
        return del_head();
    }

    //funcion de la pila push
    public void push(T data) {
        insertNode(head, true, data);
    }

    //puncion pila peek
    public T peek() {
        return head.getData();
    }

    //funcion pila top
    public T top() {
        return head.getData();
    }

    //eliminar por poscion indicado
    public T detePosition(int posicion) {
        if (head != null) {
            if (posicion > 0 && posicion <= size) {
                Node ant = null;
                Node aux = head;
                int cont = 1;
                while ((aux != null) && (cont != posicion)) {
                    cont++;
                    ant = aux;
                    aux = aux.next;
                }
                if (aux == null) {
                    return null;
                }
                if (ant == null) {
                    T tmpd = head.getData();
                    head = head.next;
                    aux.next = null;
                    aux = null;
                    size--;
                    return tmpd;
                } else {
                    T tmpd = (T) aux.getData();
                    ant.next = aux.next;
                    aux.next = null;
                    aux = null;
                    size--;
                    return tmpd;
                }
            } else {
                System.out.println("Indice fuera de rango!");
                return null;
            }
        } else {
            System.out.println("Lista Vacia!");
        }
        return null;
    }

    //Agregar de forma ordenada
    public void add_sort(T data, int index) {
        Node<T> nuevo = new Node<>(data, index);
        if (head == null) {
            head = nuevo;
            size++;
        } else {
            Node<T> aux = head;
            Node<T> aux2 = null;
            while (aux != null && aux.i < index) {
                aux2 = aux;
                aux = aux.next;
            }
            if (aux2 == null) {
                nuevo.next = head;
                head = nuevo;
                size++;
            } else if (aux == null) {
                aux2.next = nuevo;
                size++;
            } else {
                aux2.next = nuevo;
                nuevo.next = aux;
                size++;
            }
        }
    }
}

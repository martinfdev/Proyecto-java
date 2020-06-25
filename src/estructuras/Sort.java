package estructuras;

import beans.Conductor;

/**
 *
 * @author pedro
 */
public class Sort {

    public Sort() {
    }

    //metodo para ordenar la lista doble de forma ascendente
    public DoubleLinkedList<Conductor> ordenarListaDoble(DoubleLinkedList<Conductor> list) {
        if (list.getSize() == 0) {
            return null;
        }
        Node<Conductor> aux_node = list.getHead();
        Node<Conductor> temp;
        do {
            temp = aux_node;
            do {
                if (aux_node.getData().getDpi() < temp.getData().getDpi()) {
                    Conductor tmp = aux_node.getData();
                    aux_node.setData(temp.getData());
                    temp.setData(tmp);
                }
                temp = temp.next;
            } while (temp != aux_node);

            aux_node = aux_node.next;
        } while (aux_node != list.getHead());

        return list;
    }

}

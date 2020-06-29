package estructuras;

import beans.Cliente;
//import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 * @param <T>
 */
public class HashTable<T> {

    private int busy; //tamanio del vector y porcetaje ocupado actualmente
    private int size; //tamanio del vector que se utilizara
    NodoHash[] array; //lista de donde se almacenara los datos

    public HashTable(int size) {
        this.size = size;
        array = new NodoHash[this.size];
        busy = 0;
    }

    //una funcion util para generar el hash
    private int function_hash(long key) {
        return (int) ((key % size));
    }

    //funcion util que devuelve el porcentaje ocupado
    private float busy_porcent() {
        return ((float) busy / (float) size) * 100;
    }

    //funcion util para insertar un elemento dentro del array
    public void insert(Cliente data, long key) {
        if (busy_porcent() <= 75.00) {
            int hash = function_hash(key);
            if (this.array[hash] == null) {
                array[hash] = new NodoHash();
                array[hash].getList_client().add_head(data);
                busy++;
            } else if (array[hash] != null) {
                array[hash].getList_client().add_head(data);
            }
        } else {
            //JOptionPane.showMessageDialog(null, "Porcentaje de la tabla minima lleno\nse reorganizara nuevamente el vector");
            new_vector();
        }
    }

    //metodo para buscar en tabla hash
    public Cliente search(long key) {
        int i = function_hash(key);
        if (array[i] != null) {
            DoubleLinkedList<Cliente> tmp = array[i].getList_client();
            for (int j = 0; j < tmp.getSize(); j++) {
                Cliente ctmp = tmp.getData();
                if (ctmp.getDpi() == key) {
                    return ctmp;
                }
            }
        }
        return null;
    }

    //metodo para eliminar de la tabla hash
    public boolean delete(long key) {
        int i = function_hash(key);
        if (array[i] != null) {
            DoubleLinkedList<Cliente> tmp = array[i].getList_client();
            for (int j = 0; j < tmp.getSize(); j++) {
                Cliente temp = tmp.getData();
                if (temp.getDpi() == key) {
                    tmp.delete_data(temp);
                    if(tmp.getSize()==0)
                        array[i]=null;
                    return true;
                }
            }
        }
        return false;
    }

    /*
    public void setSizeVector(int sizeVector) {
        this.size = sizeVector;
    }*/
    //genera el grafico de la tabla hash
    public String graphHashTable() {
        Report re = new Report();
        return re.reportHashTable(array);
    }

    //metodo que comprueba si es un numero primo o impar
    //esto para evitar que sea un numero par,  esto para evitar demesiadas colisiones
    private void impar() {
        if (size % 2 == 0) {
            size = size - 1;
        }
    }

    //metodo que genera el siguiente vector si el primero supera el 
    //75% de capacidadad
    private void new_vector() {
        size = size + 37;
        NodoHash[] tmp = array;
        impar();
        array = new NodoHash[size + 1];
        busy = 0;
        DoubleLinkedList<Cliente> ltmp;
        for (NodoHash tmp1 : tmp) {
            if (tmp1 != null) {
                ltmp = tmp1.getList_client();
                for (int j = 0; j < ltmp.getSize(); j++) {
                    Cliente ctmp = ltmp.getData();
                    insert(ctmp, ctmp.getDpi());
                }
            }
        }
    }

    //metodo que devuelve el tamanio del vector utilzado
    public int getSize() {
        return size;
    }

    //metodo que devuelve una lista doble en el indice i que pide como parametro
    public DoubleLinkedList<T> getIndexI(int i) {
        if (i < size) {
            if (array[i] != null) {
                return array[i].list_client;
            }
        }
        return null;
    }

    public NodoHash<T>[] getArray(){
        return array;
    }
}

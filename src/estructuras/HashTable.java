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
       return ((float)busy / (float)size)*100;
    }

    //funcion util para insertar un elemento dentro del array
    public void insert(T data, long key) {
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
                if (tmp.getData().getDpi() == key) {
                    return tmp.getData();
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
    public void graphHashTable() {
        Report re = new Report();
        re.reportHashTable(array);
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
        size = size*2;
        NodoHash[] tmp = array;
        impar();
        array = new NodoHash[size];
        System.arraycopy(tmp, 0, array, 0, tmp.length); 
    }
}

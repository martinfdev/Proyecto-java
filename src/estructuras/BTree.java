package estructuras;

import beans.Vehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class BTree {

    public BTree(int grado) {
        this.orden = grado;
        raiz = null;
    }

    //retorna si el arbol esta vacio
    public boolean siEmpty() {
        return (raiz == null);
    }

    /*metodo publico para buscar en el arbol*/
    public Vehiculo buscar(String placa) {
        return buscar(raiz, placa);
    }

    //metodo privado para hacer la busqueda dentro del arbol
    //busqueda interna
    private Vehiculo buscar(NodoB<Vehiculo> raiz, String placa) {
        int i = 0;
        if (raiz == null) {
            return null;
        }
        while (i < raiz.getNumero_claves() && raiz.getClave(i).getPlaca().compareTo(placa) < 0) {
            i++;
        }

        try {
            if (placa.equalsIgnoreCase(raiz.getClave(i).getPlaca())) {
                return raiz.getClave(i);
            }
        } catch (Exception e) {
        }

        if (raiz.getEsHoja()) {
            return null;
        }
        return buscar(raiz.getNodo(i), placa);
    }

    //metodo public para insertar
    public void insertar(Vehiculo dato) {
        raiz = insertar(raiz, dato);
    }

    //metodo privado para poder insertar
    private NodoB<Vehiculo> insertar(NodoB<Vehiculo> raiz, Vehiculo dato) {
        //creamos un nuevo nodo si la raiz esta vacia
        if (raiz == null) {
            raiz = new NodoB<>(orden, true);//creamos el nuevo nodo
            raiz.setClave(0, dato);//insertamos la clave en el nuevo nodo 
            raiz.setNumero_claves(1);//incrementamos el numero de claves existentes ene el nodo
        } else {//cuando la raiz no esta vacia           
            //si el nodo esta lleno, entonces el arbol crece en altura
            if (raiz.getNumero_claves() == orden - 1) {//comprobrobamos que el numero de claves es igual a el orden -1
                //creamos un nuevo nodo
                NodoB<Vehiculo> nuevo = new NodoB<>(orden, false);
                //hacer la raiz actual como hija de la raiz nueva
                nuevo.setNodo(0, nuevo);

                //dividir la raiz anterior y mover 1 clave a la nueva raiz
            }
        }
        return raiz;
    }

    //metodo privado para insertar claves cuando el nodo no esta lleno
    private NodoB<Vehiculo> insertarClaveNodoNoLleno(NodoB<Vehiculo> raiz, Vehiculo dato) {
        int i = raiz.getNumero_claves() - 1;//al numero de claves insetados le restamos una unidad para que sea
        //indice correcto al acual vamos a insertar la nueva clave

        //comprobamos si no es un nodo hoja
        if (raiz.getEsHoja()) {
            /*hacemos dos cosas en esta parte del metodo
             * a) econtrar la nueva ubicacion de la nueva clave
             * b) mover todas las claves mayores un lugar adelante
             */
            while (i >= 0 && raiz.getClave(i).getPlaca().compareToIgnoreCase(dato.getPlaca()) > 0) {
                //raiz.claves[i+1]=raiz.claves[i];
                raiz.setClave(i + 1, raiz.getClave(i));
                i--;
            }
            //insertar la nueva clave en la ubicacion adecuada
            raiz.setClave(i + 1, dato);
            raiz.setNumero_claves(raiz.getNumero_claves() + 1);
            return raiz;
        } else {//en caso de que el nodo no sea hija
            //buscamos el nodo hijo que tendra la nueva clave
            while (i >= 0 && raiz.getClave(i).getPlaca().compareToIgnoreCase(dato.getPlaca()) > 0) {
                i--;
            }
            //ver si el hijo encontrado esta lleno
            if (raiz.getNodo(i + 1).getNumero_claves() == orden - 1) {
                raiz = dividirNodo(i + 1, raiz.getNodo(i + 1));
            }
            /*Despues de dividir el nodo en la posicion [i] en dos
             *ver en cual de los dos se va insertar la nueva clave
             */
            if (raiz.getClave(i + 1).getPlaca().compareToIgnoreCase(dato.getPlaca()) < 0) {
                i++;
            }
            raiz = insertarClaveNodoNoLleno(raiz.getNodo(i + 1), dato);
        }
        return raiz;
    }

    //metodo para dividir un nodo lleno
    private NodoB<Vehiculo> dividirNodo(int i, NodoB<Vehiculo> raiz) {
        //crea un nuevo nodo que almacenara las nuevas claves
        NodoB<Vehiculo> tmpz = new NodoB<>(orden, raiz.getEsHoja());
        
        //copiar las ultimas claves al nuevo nodo tempz
        int k=orden-1;
        for (int j = 0; j <= k; j++) {
            tmpz.setClave(j, raiz.getClave(k));
            
        }
        
       return raiz; 
    }

    private final int orden; //grado del arbol
    private NodoB<Vehiculo> raiz; //raiz del arbol
}

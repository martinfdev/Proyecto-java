package estructuras;

import beans.Vehiculo;

/**
 *
 * @author pedro
 */
public class BTree {

    public BTree(int t) {
        raiz = null;
        this.m = t;
    }

    public void recorrer() {
        if (this.raiz != null) {
            this.raiz.recorrerN();
            System.out.println("");
        }
    }

    //funcion para buscar una clave en el arbol
    public Vehiculo buscar(String placa) {
        if (this.raiz == null) {
            return null;
        } else {
            return this.raiz.buscarN(placa);
        }
    }

    public void insertar(Vehiculo data) {
        // Si el árbol está vacío
        if (raiz == null) {
            // Asigna memoria para la raiz 
            raiz = new NodoB(m, true);
            raiz.llave[0] = data;  // Insetar la clave 
            raiz.n_clave = 1;  // Actualiza el numero de claves en la raiz 
        } else // Si el arbol no esta vacio 
        {
            // Si la raíz está llena, entonces el árbol crece en altura
            if (raiz.n_clave == 2 * m - 1) {
                // Asigna memoria para la nueva raiz
                NodoB s = new NodoB(m, false);

                // Hacer antigua la raiz como hija de la nueva raiz 
                s.hijo[0] = raiz;

                // Divide la raíz anterior y mueve 1 clave a la nueva raíz
                s.dividirEnHijos(0, raiz);

                // La nueva raíz tiene dos hijos ahora. Decidir cuál de los
                // dos hijos van a tener una nueva clave
                int i = 0;
                if (s.llave[0].getPlaca().compareToIgnoreCase(data.getPlaca()) < 0) {
                    i++;
                }
                s.hijo[i].insertarNoLLeno(data);

                // cambiar la raiz 
                raiz = s;
            } else // Si la raíz no está llena, llamar a insertNonFull para la raíz
            {
                raiz.insertarNoLLeno(data);
            }
        }
    }

    public void eliminar(String placa) {
        if (raiz == null) {
            System.out.println("El arbol esta vacio");
            return;
        }
        // // Llamar a la función remove para la raiz
        raiz.borrar(placa);

        // Si el nodo raíz tiene 0 claves, hacer su primer hijo como la nueva raíz
        // si tiene un hijo, de lo contrario establecer la raiz como null
        if (raiz.n_clave == 0) {
            NodoB tmp = raiz;
            if (raiz.es_hoja) {
                raiz = null;
            } else {
                raiz = raiz.hijo[0];
            }
        }
    }

    private final int m; //grado del arbol
    private NodoB raiz; //raiz del arbol
}

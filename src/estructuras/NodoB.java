package estructuras;

import beans.Vehiculo;

/**
 *
 * @author pedro
 */
public class NodoB {

    //constructor con parametros
    public NodoB(int t, boolean leaf) {
        this.m = t;
        this.es_hoja = leaf;
        llave = new Vehiculo[2 * t - 1];
        hijo = new NodoB[2 * t];
    }

    //una funcion que recorre todo los nodos enraizados en el subarbol de este nodo
    void recorrerN() {
        int i;
        // Hay n_clave claves y n_clave + 1 hijos, atraviesa n_clave claves
        // y primero n_clave hijos
        for (i = 0; i < this.n_clave; i++) {
            // Si esto no es hoja, entonces antes de imprimir la clave [i],
            // atraviesa el subárbol enraizado con el hijo hijo[i].
            if (es_hoja == false) {
                hijo[i].recorrerN();
            }
            System.out.print(llave[i].getPlaca() + " ");
        }
        //Imprime el subárbol enraizado derecho con el último hijo
        if (es_hoja == false) {
            hijo[i].recorrerN();
        }
    }

    //una funcion que busca la clave dentro en un subarbol enraizado con este nodo
    public Vehiculo search(String placa) {
        // Encuentra la primera clave mayor o igual a k
        int i = 0;
        while (i < n_clave && placa.compareToIgnoreCase(llave[i].getPlaca()) > 0) {
            i++;
        }

        try {
            // Si la clave encontrada es igual a k, devuelve este nodo
            if (llave[i].getPlaca() == placa) {
                return this.llave[i];
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "No existe el libro");
        }

        // Si la clave no se encuentra aquí y este es un nodo hoja
        if (es_hoja == true) {
            return null;
        }

        // Ir al nodo hoja apropiado
        return hijo[i].search(placa);
    }

    // Una función que devuelve el índice de la primera clave que es mayor
    // o igual a k
    int findKey(String placa) {
        int idx = 0;
        while (idx < this.n_clave && llave[idx].getPlaca().compareToIgnoreCase(placa) < 0) {
            ++idx;
        }
        return idx;
    }

    // Una función de utilidad para insertar una nueva clave en el subárbol enraizado con
    // este nodo. La suposición es que el nodo no debe estar lleno cuando esta
    // función se llama
    void insertNonFull(Vehiculo data) {
        // Inicializa el índice como índice del elemento más a la derecha 
        int i = n_clave - 1;

        // Si este es un nodo hoja
        if (es_hoja == true) {
            // El siguiente ciclo hace dos cosas
            // a) Encuentra la ubicación de la nueva clave para insertar
            // b) Mueve todas las claves mayores a un lugar adelante
            while (i >= 0 && llave[i].getPlaca().compareToIgnoreCase(data.getPlaca()) > 0) {
                llave[i + 1] = llave[i];
                i--;
            }

            // Inserte la nueva clave en la ubicación encontrada
            llave[i + 1] = data;
            n_clave = n_clave + 1;
        } else // Si este nodo no es hoja
        {
            // Encuentra el hijo que tendrá la nueva clave 
            while (i >= 0 && llave[i].getPlaca().compareToIgnoreCase(data.getPlaca()) > 0) {
                i--;
            }

            // Ver si el hijo encontrado está lleno
            if (hijo[i + 1].n_clave == 2 * m - 1) {
                // Si el hijo está lleno, separarlo
                splitChild(i + 1, hijo[i + 1]);

                // Después de dividir, la clave central de hijo[i] sube y
                // hijo [i] se divide en dos. Ver cuál de los dos
                // va a tener la nueva clave
                if (llave[i + 1].getPlaca().compareToIgnoreCase(data.getPlaca()) < 0) {
                    i++;
                }
            }
            hijo[i + 1].insertNonFull(data);
        }
    }

    // Una función de utilidad para dividir el hijo y de este nodo. yo soy indice
    // de y en la matriz secundaria C []. El niño debe estar lleno cuando esto
    // la función se llama
    void splitChild(int i, NodoB y) {
        // Create a new node which is going to store (m-1) keys 
        // of y 
        NodoB z = new NodoB(y.m, y.es_hoja);
        z.n_clave = m - 1;

        // Copy the last (m-1) keys of y to z 
        for (int j = 0; j < m - 1; j++) {
            z.llave[j] = y.llave[j + m];
        }

        // Copy the last m children of y to z 
        if (y.es_hoja == false) {
            for (int j = 0; j < m; j++) {
                z.hijo[j] = y.hijo[j + m];
            }
        }
        // Reduce the number of keys in y 
        y.n_clave = m - 1;

        // Since this node is going to have a new hijo, 
        // create space of new hijo 
        for (int j = n_clave; j >= i + 1; j--) {
            hijo[j + 1] = hijo[j];
        }

        // Link the new hijo to this node 
        hijo[i + 1] = z;

        // A llave of y will move to this node. Find location of 
        // new llave and move all greater keys one space ahead 
        for (int j = n_clave - 1; j >= i; j--) {
            llave[j + 1] = llave[j];
        }

        // Copy the middle llave of y to this node 
        llave[i] = y.llave[m - 1];

        // Increment count of keys in this node 
        n_clave = n_clave + 1;
    }

    // Una función de contenedor para eliminar la clave k en el subárbol enraizado con
    // este nodo.
    void remove(String k) {
        int idx = findKey(k);

        // La clave a eliminar está presente en este nodo
        if (idx < n_clave && llave[idx].getPlaca().equals(k)) {

            // Si el nodo es un nodo hoja, se llama a removeFromLeaf
            // De lo contrario, la función removeFromNonLeaf 
            if (es_hoja) {
                removeFromLeaf(idx);
            } else {
                removeFromNonLeaf(idx);
            }
        } else {

            // Si este nodo es un nodo hoja, entonces la clave no está presente en el árbol
            if (es_hoja) {
                System.out.println("El libro con ISB " + k + " no existe en el arbol");
                return;
            }

            // La clave a eliminar está presente en el subárbol enraizado con este nodo
            // La bandera indica si la clave está presente en el subárbol enraizado
            // con el último hijo de este nodo
            boolean flag = ((idx == n_clave) ? true : false);

            // Si el hijo donde se supone que existe la clave tiene menos de m claves,
            // llenamos a ese hijo
            if (hijo[idx].n_clave < m) {
                fill(idx);
            }

            // Si el último hijo se ha fusionado, debe haberse fusionado con el anterior
            // hijo y, por lo tanto, recurrimos en el (idx-1) th hijo. De lo contrario, recurrimos en el
            // (idx) th hijo que ahora tiene al menos m claves
            if (flag && idx > n_clave) {
                hijo[idx - 1].remove(k);
            } else {
                hijo[idx].remove(k);
            }
        }
    }

    // Una función para eliminar la clave presente en la posición idx-th en
    // este nodo que es una hoja
    void removeFromLeaf(int idx) {

        // Move all the keys after the idx-th pos one place backward 
        for (int i = idx + 1; i < n_clave; ++i) {
            llave[i - 1] = llave[i];
        }

        // Reduce the count of keys 
        n_clave--;
    }

    // Una función para eliminar la clave presente en la posición idx-th en
    // este nodo que es un nodo no hoja
    void removeFromNonLeaf(int idx) {
        String k = llave[idx].getPlaca();

        // Si el hijo que precede a k (hijo [idx]) tiene al menos m claves,
        // encuentra el predecesor 'pred' de k en el subárbol enraizado en
        // hijo [idx]. Reemplace k por pred. Eliminar recursivamente pred
        // en hijo [idx]
        if (hijo[idx].n_clave >= m) {
            Vehiculo pred = getPred(idx);
            llave[idx] = pred;
            hijo[idx].remove(pred.getPlaca());
        } // Si el hijo hijo [idx] tiene menos de m claves, examinar hijo[idx + 1].
        // Si hijo [idx + 1] tiene al menos m claves, busque el sucesor 'succ' de k en
        // el subárbol enraizado en hijo [idx + 1]
        // Reemplazar k por succ
        // Elimina recursivamente succ en hijo[idx + 1]
        else if (hijo[idx + 1].n_clave >= m) {
            Vehiculo succ = getSucc(idx);
            llave[idx] = succ;
            hijo[idx + 1].remove(succ.getPlaca());
        } // Si tanto hijo[idx] como hijo[idx + 1] tienen menos de m claves, combinar k y todo hijo[idx + 1] 
        // en hijo[idx]
        // Ahora hijo[idx] contiene claves 2t-1
        // Liberar hijo[idx + 1] y eliminar recursivamente k de hijo[idx]
        else {
            merge(idx);
            hijo[idx].remove(k);
        }
    }

    // Una función para obtener el predecesor de la clave, donde la clave
    // está presente en la posición idx-th en el nodo
    Vehiculo getPred(int idx) {
        // Seguir moviendose hacia el nodo más a la derecha hasta llegar a una hoja
        NodoB cur = hijo[idx];
        while (!cur.es_hoja) {
            cur = cur.hijo[cur.n_clave];
        }

        // Devuelve la última clave de la hoja
        return cur.llave[cur.n_clave - 1];
    }

    // Una función para obtener el sucesor de la clave, donde la clave
    // está presente en la posición idx-th en el nodo
    Vehiculo getSucc(int idx) {
        // Sigue moviendo el nodo más a la izquierda comenzando desde hijo[idx + 1] hasta que alcancemos una hoja
        NodoB cur = hijo[idx + 1];
        while (!cur.es_hoja) {
            cur = cur.hijo[0];
        }

        // Devuelve la primera clave de la hoja
        return cur.llave[0];
    }

    // Una función para llenar el nodo hijo presente en el idx-th
    // posición en la matriz hijo [] si ese hijo tiene menos de m-1 claves
    void fill(int idx) {
        // Si el hijo anterior (hijo [idx-1]) tiene más de m-1 claves, pida prestada una clave
        // de ese hijo
        if (idx != 0 && hijo[idx - 1].n_clave >= m) {
            borrowFromPrev(idx);
        } // Si el siguiente elemento secundario (hijo [idx + 1]) tiene más de m-1 claves, pida prestada una clave
        // de ese hijo
        else if (idx != n_clave && hijo[idx + 1].n_clave >= m) {
            borrowFromNext(idx);
        } // Combinar hijo [idx] con su hermano
        // Si hijo [idx] es el último hijo, fusionarlo con su hermano anterior
        // De lo contrario, combinar con su próximo hermano
        else {
            if (idx != n_clave) {
                merge(idx);
            } else {
                merge(idx - 1);
            }
        }
    }

    // Una función para tomar prestada una clave del nodo hijo [idx-1] -th y colocar
    // en el nodo hijo[idx]
    void borrowFromPrev(int idx) {
        NodoB child1 = hijo[idx];
        NodoB sibling = hijo[idx - 1];

        // La última clave de hijo [idx-1] sube al padre y la clave [idx-1]
        // desde padre se inserta como la primera clave en hijo [idx]. Así, el pierde
        // hermano una clave y el hijo gana una clave
        // Mover todas las claves en hijo [idx] un paso adelante
        for (int i = child1.n_clave - 1; i >= 0; --i) {
            child1.llave[i + 1] = child1.llave[i];
        }

        // Si hijo [idx] no es una hoja, mueve todos sus punteros hijo un paso adelante    
        if (!child1.es_hoja) {
            for (int i = child1.n_clave; i >= 0; --i) {
                child1.hijo[i + 1] = child1.hijo[i];
            }
        }
        // Establecer la primera clave del hijo igual a las claves [idx-1] del nodo actual
        child1.llave[0] = llave[idx - 1];

        // Moving sibling's last hijo as C[idx]'s first hijo 
        if (!child1.es_hoja) {
            child1.hijo[0] = sibling.hijo[sibling.n_clave];
        }

        // Mover la clave del hermano al padre
        // Esto reduce el número de claves en el hermano
        llave[idx - 1] = sibling.llave[sibling.n_clave - 1];
        child1.n_clave += 1;
        sibling.n_clave -= 1;
    }

    // Una función para tomar prestada una clave de hijo [idx + 1] y colocar
    // en hijo [idx]
    void borrowFromNext(int idx) {
        NodoB child1 = hijo[idx];
        NodoB sibling = hijo[idx + 1];

        // keys [idx] se inserta como la última clave en hijo [idx]
        child1.llave[(child1.n_clave)] = llave[idx];

        // El primer hijo del hermano se inserta como el último hijo
        // en hijo [idx]
        if (!(child1.es_hoja)) {
            child1.hijo[(child1.n_clave) + 1] = sibling.hijo[0];
        }

        // La primera clave del hermano se inserta en las claves [idx]
        llave[idx] = sibling.llave[0];

        // Mover todas las llaves en el hermano un paso atrás
        for (int i = 1; i < sibling.n_clave; ++i) {
            sibling.llave[i - 1] = sibling.llave[i];
        }

        // Mover los punteros del hijo un paso atrás
        if (!sibling.es_hoja) {
            for (int i = 1; i <= sibling.n_clave; ++i) {
                sibling.hijo[i - 1] = sibling.hijo[i];
            }
        }
        // Aumentando y disminuyendo la cantidad de claves de hijo[idx] y hijo[idx + 1]
        // respectivamente
        child1.n_clave += 1;
        sibling.n_clave -= 1;
    }

    // Una función para fusionar idx-th hijo del nodo con (idx + 1) th hijo de
    // el nodo
    void merge(int idx) {
        NodoB child1 = hijo[idx];
        NodoB sibling = hijo[idx + 1];

        // Extraer una clave del nodo actual e insertarla en (m-1) th
        // posición de hijo[idx]
        child1.llave[m - 1] = llave[idx];

        // Copiando las claves de hijo[idx + 1] a hijo [idx] al final
        for (int i = 0; i < sibling.n_clave; ++i) {
            child1.llave[i + m] = sibling.llave[i];
        }

        // Copiar los punteros secundarios de hijo[idx + 1] a hijo[idx] 
        if (!child1.es_hoja) {
            for (int i = 0; i <= sibling.n_clave; ++i) {
                child1.hijo[i + m] = sibling.hijo[i];
            }
        }

        // Mover todas las claves después de idx en el nodo actual un paso antes -
        // para llenar el vacío creado moviendo las claves [idx] a hijo [idx]
        for (int i = idx + 1; i < n_clave; ++i) {
            llave[i - 1] = llave[i];
        }

        // Mover los punteros secundarios después (idx + 1) en el nodo actual uno
        // paso antes
        for (int i = idx + 2; i <= n_clave; ++i) {
            hijo[i - 1] = hijo[i];
        }
        // Actualización del recuento de claves del elemento secundario y el nodo actual
        child1.n_clave += sibling.n_clave + 1;
        n_clave--;
    }
   
    Vehiculo[] llave; //array de claves de la pagina
    int m; //maximo numero de claves que puede almacenar la pagina
    NodoB[] hijo; //puntero de los hijos
    int n_clave; //actual numero de claves
    boolean es_hoja; //es verdadero cuando el nodo es hoja, otro caso es falso
}

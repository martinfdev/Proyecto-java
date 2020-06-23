package estructuras;

import beans.Vehiculo;

/**
 *
 * @author pedro
 */
public class NodoB {

    //constructor con parametros
    public NodoB(int m, boolean es_hoja) {
        this.m = m;
        this.es_hoja = es_hoja;
        llave = new Vehiculo[2 * m - 1];
        hijo = new NodoB[2 * m];
    }

    //una funcion que recorre todo los nodos enraizados en el subarbol de este nodo
    protected void recorrerN() {
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
    public Vehiculo buscarN(String placa) {
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
        return hijo[i].buscarN(placa);
    }

    // Una función que devuelve el índice de la primera clave que es mayor
    // o igual a k
    private int utlimoIndice(String placa) {
        int indice = 0;
        while (indice < this.n_clave && llave[indice].getPlaca().compareToIgnoreCase(placa) < 0) {
            ++indice;
        }
        return indice;
    }

    // Una función de utilidad para insertar una nueva clave en el subárbol enraizado con
    // este nodo. La suposición es que el nodo no debe estar lleno cuando esta
    // función se llama
    protected void insertarNoLLeno(Vehiculo data) {
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
                dividirEnHijos(i + 1, hijo[i + 1]);

                // Después de dividir, la clave central de hijo[i] sube y
                // hijo [i] se divide en dos. Ver cuál de los dos
                // va a tener la nueva clave
                if (llave[i + 1].getPlaca().compareToIgnoreCase(data.getPlaca()) < 0) {
                    i++;
                }
            }
            hijo[i + 1].insertarNoLLeno(data);
        }
    }

    // Una función de utilidad para dividir el hijo y de este nodo. yo soy indice
    // de y en la matriz secundaria C []. El niño debe estar lleno cuando esto
    // la función se llama
    void dividirEnHijos(int i, NodoB ndo) {
        // Create a new node which is going to store (m-1) keys 
        // of y 
        NodoB z = new NodoB(ndo.m, ndo.es_hoja);
        z.n_clave = m - 1;

        // Copy the last (m-1) keys of y to z 
        for (int j = 0; j < m - 1; j++) {
            z.llave[j] = ndo.llave[j + m];
        }

        // Copy the last m children of y to z 
        if (ndo.es_hoja == false) {
            for (int j = 0; j < m; j++) {
                z.hijo[j] = ndo.hijo[j + m];
            }
        }
        // Reduce the number of keys in y 
        ndo.n_clave = m - 1;

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
        llave[i] = ndo.llave[m - 1];

        // Increment count of keys in this node 
        n_clave = n_clave + 1;
    }

    // Una función de contenedor para eliminar la clave k en el subárbol enraizado con
    // este nodo.
    public void borrar(String placa) {
        int indicex = utlimoIndice(placa);

        // La clave a eliminar está presente en este nodo
        if (indicex < n_clave && llave[indicex].getPlaca().equals(placa)) {

            if (es_hoja) {
                borrarDeHoja(indicex);
            } else {
                borrarDeNoHoja(indicex);
            }
        } else {

            // Si este nodo es un nodo hoja, entonces la clave no está presente en el árbol
            if (es_hoja) {
                System.out.println("El Vehiculo con: " + placa + " no existe en el arbol");
                return;
            }

            // La clave a eliminar está presente en el subárbol enraizado con este nodo
            // La bandera indica si la clave está presente en el subárbol enraizado
            // con el último hijo de este nodo
            boolean flag = ((indicex == n_clave) ? true : false);

            // Si el hijo donde se supone que existe la clave tiene menos de m claves,
            // llenamos a ese hijo
            if (hijo[indicex].n_clave < m) {
                llenar(indicex);
            }

            // Si el último hijo se ha fusionado, debe haberse fusionado con el anterior
            // hijo y, por lo tanto, recurrimos en el (indicex-1) th hijo. De lo contrario, recurrimos en el
            // (indicex) th hijo que ahora tiene al menos m claves
            if (flag && indicex > n_clave) {
                hijo[indicex - 1].borrar(placa);
            } else {
                hijo[indicex].borrar(placa);
            }
        }
    }

    // Una función para eliminar la clave presente en la posición indicex-th en
    // este nodo que es una hoja
    private void borrarDeHoja(int indice) {

        // Move all the keys after the indicex-th pos one place backward 
        for (int i = indice + 1; i < n_clave; ++i) {
            llave[i - 1] = llave[i];
        }

        // Reduce the count of keys 
        n_clave--;
    }

    // Una función para eliminar la clave presente en la posición indicex-th en
    // este nodo que es un nodo no hoja
    private void borrarDeNoHoja(int indicex) {
        String k_placa = llave[indicex].getPlaca();

        // Si el hijo que precede a k (hijo [indicex]) tiene al menos m claves,
        // encuentra el predecesor 'pred' de k en el subárbol enraizado en
        // hijo [indicex]. Reemplace k por pred. Eliminar recursivamente pred
        // en hijo [indicex]
        if (hijo[indicex].n_clave >= m) {
            Vehiculo pred = getPredecesor(indicex);
            llave[indicex] = pred;
            hijo[indicex].borrar(pred.getPlaca());
        } // Si el hijo hijo [indicex] tiene menos de m claves, examinar hijo[indicex + 1].
        // Si hijo [indicex + 1] tiene al menos m claves, busque el sucesor 'succ' de k en
        // el subárbol enraizado en hijo [indicex + 1]
        // Reemplazar k por succ
        // Elimina recursivamente succ en hijo[indicex + 1]
        else if (hijo[indicex + 1].n_clave >= m) {
            Vehiculo succ = getSucesor(indicex);
            llave[indicex] = succ;
            hijo[indicex + 1].borrar(succ.getPlaca());
        } // Si tanto hijo[indicex] como hijo[indicex + 1] tienen menos de m claves, combinar k y todo hijo[indicex + 1] 
        // en hijo[indicex]
        // Ahora hijo[indicex] contiene claves 2t-1
        // Liberar hijo[indicex + 1] y eliminar recursivamente k de hijo[indicex]
        else {
            mezclar(indicex);
            hijo[indicex].borrar(k_placa);
        }
    }

    // Una función para obtener el predecesor de la clave, donde la clave
    // está presente en la posición indicex-th en el nodo
    private Vehiculo getPredecesor(int indicex) {
        // Seguir moviendose hacia el nodo más a la derecha hasta llegar a una hoja
        NodoB cur = hijo[indicex];
        while (!cur.es_hoja) {
            cur = cur.hijo[cur.n_clave];
        }

        // Devuelve la última clave de la hoja
        return cur.llave[cur.n_clave - 1];
    }

    // Una función para obtener el sucesor de la clave, donde la clave
    // está presente en la posición indicex-th en el nodo
    private Vehiculo getSucesor(int idx) {
        // Sigue moviendo el nodo más a la izquierda comenzando desde hijo[indicex + 1] hasta que alcancemos una hoja
        NodoB camb = hijo[idx + 1];
        while (!camb.es_hoja) {
            camb = camb.hijo[0];
        }

        // Devuelve la primera clave de la hoja
        return camb.llave[0];
    }

    // Una función para llenar el nodo hijo presente en el indicex-th
    // posición en la matriz hijo [] si ese hijo tiene menos de m-1 claves
    void llenar(int indicex) {
        // Si el hijo anterior (hijo [indicex-1]) tiene más de m-1 claves, pida prestada una clave
        // de ese hijo
        if (indicex != 0 && hijo[indicex - 1].n_clave >= m) {
            intercambioConPrev(indicex);
        } // Si el siguiente elemento secundario (hijo [indicex + 1]) tiene más de m-1 claves, pida prestada una clave
        // de ese hijo
        else if (indicex != n_clave && hijo[indicex + 1].n_clave >= m) {
            intercambioConSig(indicex);
        } // Combinar hijo [indicex] con su hermano
        // Si hijo [indicex] es el último hijo, fusionarlo con su hermano anterior
        // De lo contrario, combinar con su próximo hermano
        else {
            if (indicex != n_clave) {
                mezclar(indicex);
            } else {
                mezclar(indicex - 1);
            }
        }
    }

    // Una función para tomar prestada una clave del nodo hijo [indicex-1] -th y colocar
    // en el nodo hijo[indicex]
    private void intercambioConPrev(int idx) {
        NodoB hijo1 = hijo[idx];
        NodoB hermano = hijo[idx - 1];

        // La última clave de hijo [indicex-1] sube al padre y la clave [indicex-1]
        // desde padre se inserta como la primera clave en hijo [indicex]. Así, el pierde
        // hermano una clave y el hijo gana una clave
        // Mover todas las claves en hijo [indicex] un paso adelante
        for (int i = hijo1.n_clave - 1; i >= 0; --i) {
            hijo1.llave[i + 1] = hijo1.llave[i];
        }

        // Si hijo [indicex] no es una hoja, mueve todos sus punteros hijo un paso adelante    
        if (!hijo1.es_hoja) {
            for (int i = hijo1.n_clave; i >= 0; --i) {
                hijo1.hijo[i + 1] = hijo1.hijo[i];
            }
        }
        // Establecer la primera clave del hijo igual a las claves [indicex-1] del nodo actual
        hijo1.llave[0] = llave[idx - 1];

        // Moving hermano's last hijo as C[indicex]'s first hijo 
        if (!hijo1.es_hoja) {
            hijo1.hijo[0] = hermano.hijo[hermano.n_clave];
        }

        // Mover la clave del hermano al padre
        // Esto reduce el número de claves en el hermano
        llave[idx - 1] = hermano.llave[hermano.n_clave - 1];
        hijo1.n_clave += 1;
        hermano.n_clave -= 1;
    }

    // Una función para tomar prestada una clave de hijo [indicex + 1] y colocar
    // en hijo [indicex]
    private void intercambioConSig(int indicex) {
        NodoB hijo1 = hijo[indicex];
        NodoB hermano = hijo[indicex + 1];

        // keys [indicex] se inserta como la última clave en hijo [indicex]
        hijo1.llave[(hijo1.n_clave)] = llave[indicex];

        // El primer hijo del hermano se inserta como el último hijo
        // en hijo [indicex]
        if (!(hijo1.es_hoja)) {
            hijo1.hijo[(hijo1.n_clave) + 1] = hermano.hijo[0];
        }

        // La primera clave del hermano se inserta en las claves [indicex]
        llave[indicex] = hermano.llave[0];

        // Mover todas las llaves en el hermano un paso atrás
        for (int i = 1; i < hermano.n_clave; ++i) {
            hermano.llave[i - 1] = hermano.llave[i];
        }

        // Mover los punteros del hijo un paso atrás
        if (!hermano.es_hoja) {
            for (int i = 1; i <= hermano.n_clave; ++i) {
                hermano.hijo[i - 1] = hermano.hijo[i];
            }
        }
        // Aumentando y disminuyendo la cantidad de claves de hijo[indicex] y hijo[indicex + 1]
        // respectivamente
        hijo1.n_clave += 1;
        hermano.n_clave -= 1;
    }

    // Una función para fusionar indicex-th hijo del nodo con (indicex + 1) th hijo de
    // el nodo
    private void mezclar(int indicex) {
        NodoB hijo1 = hijo[indicex];
        NodoB hermano = hijo[indicex + 1];

        // Extraer una clave del nodo actual e insertarla en (m-1) th
        // posición de hijo[indicex]
        hijo1.llave[m - 1] = llave[indicex];

        // Copiando las claves de hijo[indicex + 1] a hijo [indicex] al final
        for (int i = 0; i < hermano.n_clave; ++i) {
            hijo1.llave[i + m] = hermano.llave[i];
        }

        // Copiar los punteros secundarios de hijo[indicex + 1] a hijo[indicex] 
        if (!hijo1.es_hoja) {
            for (int i = 0; i <= hermano.n_clave; ++i) {
                hijo1.hijo[i + m] = hermano.hijo[i];
            }
        }

        // Mover todas las claves después de indicex en el nodo actual un paso antes -
        // para llenar el vacío creado moviendo las claves [indicex] a hijo [indicex]
        for (int i = indicex + 1; i < n_clave; ++i) {
            llave[i - 1] = llave[i];
        }

        // Mover los punteros secundarios después (indicex + 1) en el nodo actual uno
        // paso antes
        for (int i = indicex + 2; i <= n_clave; ++i) {
            hijo[i - 1] = hijo[i];
        }
        // Actualización del recuento de claves del elemento secundario y el nodo actual
        hijo1.n_clave += hermano.n_clave + 1;
        n_clave--;
    }

    Vehiculo[] llave; //array de claves de la pagina
    int m; //maximo numero de claves que puede almacenar la pagina
    NodoB[] hijo; //puntero de los hijos
    int n_clave; //actual numero de claves
    boolean es_hoja; //es verdadero cuando el nodo es hoja, otro caso es falso
}

package estructuras;

/**
 *
 * @author pedro
 */
public class Grafo {

    public Grafo() {
        inicio = null;
    }

    //grafo vacio develve true cuando esta vacio
    public boolean vacio() {
        return inicio == null;
    }

    //metodo que retorna cuantas nodos tiene el grafo
    public int getSize() {
        return size;
    }

    //funcion que devuelve un Nodo o vertice si existe
    private NodoG getNodo(String nombre) {
        NodoG aux = inicio;
        while (aux != null) {
            if (aux.nombre.equals(nombre)) {
                return aux;
            }
            aux = aux.siguiente;
        }
        return null;
    }

    //metodo para insertar un nuevo nodo o vertice
    public void insertarNodo(String nombre) {
        NodoG nuevo = new NodoG(nombre);
        if (vacio()) {
            inicio = nuevo;
            size++;
        } else {
            NodoG aux = inicio;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
            size++;
        }
    }

    //metodo privado para poder hacer la insercion del arco
    private void insertarArco(NodoG origen, NodoG destino, int peso) {
        ArcoG nuevo = new ArcoG(peso);
        ArcoG aux = origen.adyacencia;
        if (aux == null) {
            origen.adyacencia = nuevo;
            nuevo.adyacencia = destino;
        } else {
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
            nuevo.adyacencia = destino;
        }

    }

    //metodo public para crear nuevas rutas
    public void insertarArco(String origen, String destino, int peso) {
        NodoG or = getNodo(origen);
        NodoG des = getNodo(destino);
        if (or == null) {
            insertarNodo(origen);
        }
        if (des == null) {
            insertarNodo(destino);
        }
        or = getNodo(origen);
        des = getNodo(destino);
        insertarArco(or, des, peso);
    }

    //creamos la lista de adyacencia
    public void listaAdyacencia() {
        NodoG naux = inicio;
        ArcoG aaux;
        while (naux != null) {
            System.out.print(naux.nombre + "-");
            aaux = naux.adyacencia;
            while (aaux != null) {
                System.out.println("-" + aaux.peso + "-> " + aaux.adyacencia.nombre);
                aaux = aaux.siguiente;
            }
            naux = naux.siguiente;
            System.out.println("");
        }
    }

    //metodo para hacer el reporte en graphiz del frafo
    public String reporte() {
        Report r = new Report();
        return r.resporteGrafos(inicio);
    }

    //recorrido en Anchura
    private void recorridoAnchura(NodoG origen) {
        boolean bandera, bandera2;
        NodoG current;
        LinkedList<NodoG> cola = new LinkedList<>();
        LinkedList<NodoG> lista = new LinkedList<>();
        cola.add_head(origen);
        while (!cola.isEmpty()) {
            bandera = false;
            current = cola.delete_head();
            for (int i = 0; i < lista.getSize(); i++) {
                if (lista.getData() == current) {
                    bandera = true;
                }
            }
            if (bandera == false) {
                System.out.print(current.nombre + "->");
                lista.add_queue(current);
                ArcoG aux = current.adyacencia;
                while (aux != null) {
                    bandera2 = false;
                    for (int i = 0; i < lista.getSize(); i++) {
                        if (aux.adyacencia == lista.getData()) {
                            bandera2 = true;
                        }
                    }
                    if (bandera2 == false) {
                        cola.add_head(aux.adyacencia);
                    }
                    aux = aux.siguiente;
                }
            }
        }
    }

    //metodo para recorrido en anchura
    public void recorridoAnchura(String nombre) {
        if (inicio != null) {
            if ("".equals(nombre)) {
                recorridoAnchura(inicio);
            } else {
                NodoG aux = getNodo(nombre);
                if (aux != null) {
                    recorridoAnchura(getNodo(nombre));
                } else {
                    System.out.println("No existe el vertice!");
                }
            }
        } else {
            System.out.println("No hay nodos para recorrer");
        }
    }

    public LinkedList<NodoG> caminoMinimo(String origen, String destino) {
        if (inicio != null) {
            NodoG or = getNodo(origen);
            NodoG de = getNodo(destino);
            if (or == null) {
                System.out.println("No existe el Nodo Origen");
                return null;
            }
            if (de == null) {
                System.out.println("No existe el Nodo destino");
                return null;
            }
            return primeroAnchura(or, de);
        } else {
            System.out.println("No existen nodos");
        }
        return null;
    }

    //metodo que compara el costo de los caminos
    public boolean compareTo(Pair<NodoG, Integer> a, Pair<NodoG, Integer> b) {
        return (int) a.second < (int) b.second;
    }

    //metodo que determina el camino mas simple y ruta con el menor coste
    private LinkedList<NodoG> primeroAnchura(NodoG origen, NodoG destino) {
        LinkedList<NodoG> listRuta = new LinkedList<>();
        LinkedList<Pair<NodoG, Integer>> listacostos = new LinkedList<>();
        java.util.LinkedList<Pair<NodoG, Integer>> listaOrdenada = new java.util.LinkedList<>();
        LinkedList<Pair<NodoG, NodoG>> pila = new LinkedList<>();
        listacostos.add_queue(new Pair(origen, 0));
        listaOrdenada.addLast(new Pair(origen, 0));
        int costoActual=0;
        NodoG nodActual, destinoActual = null;
        Pair<NodoG, Integer> nodoCosto;
        ArcoG aux;
        boolean bandera, bandera2 = false;
        while (!listaOrdenada.isEmpty()) {
            nodoCosto = listaOrdenada.removeFirst();
            nodActual = nodoCosto.first;
            costoActual = nodoCosto.second;
            if (nodActual == destino) {
                 //System.out.println(costoActual);
                bandera2 = true;
                destinoActual = destino;
                while (!pila.isEmpty()) {
                    listRuta.add_head(destinoActual);                  
                    while (!pila.isEmpty() && pila.peek().second != destinoActual) {
                        pila.pop();
                    }
                    if (!pila.isEmpty()) {
                        destinoActual = pila.peek().first;
                    }
                }
                break;
            }
            aux = nodActual.adyacencia;
            while (aux != null) {
                bandera = false;
                costoActual = costoActual + aux.getPeso();
                for (int i = 0; i < listacostos.getSize(); i++) {
                    Pair<NodoG, Integer> tempPa = listacostos.getData();
                    if (aux.adyacencia == tempPa.first) {
                        bandera = true;
                        if (costoActual < tempPa.second) {
                            tempPa.second = costoActual;
                            for (Pair<NodoG, Integer> pair : listaOrdenada) {
                                if (pair.first == aux.adyacencia) {
                                    pair.second = costoActual;
                                }
                            }
                            java.util.Collections.sort(listaOrdenada);
                            pila.push(new Pair(nodActual, aux.adyacencia));
                            costoActual = costoActual - aux.peso;
                        }
                    }
                }
                if (bandera == false) {
                    listacostos.add_queue(new Pair(aux.adyacencia, costoActual));
                    listaOrdenada.addLast(new Pair(aux.adyacencia, costoActual));
                    java.util.Collections.sort(listaOrdenada);
                    pila.push(new Pair(nodActual, aux.adyacencia));
                    costoActual = costoActual - aux.peso;
                }
                aux = aux.siguiente;
            }
        }
        if (bandera2 == false) {
            System.out.println("No es encontro ruta para destino");
        }
        return listRuta;
    }

    //funcion que devuelve un true si exite nodo
    public boolean getExistNodo(String nombre) {
        NodoG aux = inicio;
        while (aux != null) {
            if (aux.nombre.equals(nombre)) {
                return true;
            }
            aux = aux.siguiente;
        }
        return false;
    }

    private NodoG inicio;
    private int size;

//          En el caso de java usamos una clase que representara el pair de C++
//    class Pair implements Comparable<Node>{
//        int first, second;
//        Pair( int d , int p ){                          //constructor
//            this.first = d;
//            this.second = p;
//        }
//        public int compareTo( Pair other){              //es necesario definir un comparador para el correcto funcionamiento del PriorityQueue
//            if( second > other.second ) return 1;
//            if( second == other.second ) return 0;
//            return -1;
//        }
//
//        @Override
//        public int compareTo(Node t) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    };
}

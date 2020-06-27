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
            return dijkstra(or, de);
        } else {
            System.out.println("No existen nodos");
        }
        return null;
    }
    
    
    //metodo que determina el camino mas simple y ruta con el menor coste
    
    private LinkedList<NodoG> dijkstra(NodoG origen, NodoG destino){
        
    return null;
    }
    
//      //En el caso de java usamos una clase que representara el pair de C++
//    class NodeG implements Comparable<Node>{
//        int first, second;
//        NodeG( int d , int p ){                          //constructor
//            this.first = d;
//            this.second = p;
//        }
//        public int compareTo( NodeG other){              //es necesario definir un comparador para el correcto funcionamiento del PriorityQueue
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

    private NodoG inicio;
    private int size;

}

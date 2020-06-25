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
    public void insertarArco(String origen, String destino, int peso){
        NodoG or = getNodo(origen);
        NodoG des = getNodo(destino);
        if(or==null){
            insertarNodo(origen);
        }
        if(des==null){
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
            System.out.print(naux.nombre+"-");
            aaux = naux.adyacencia;
            while (aaux != null) {
                System.out.println("-"+aaux.peso+"-> "+aaux.adyacencia.nombre);
                aaux = aaux.siguiente;
            }
            naux = naux.siguiente;
            System.out.println("");
        }
    }
    
    //metodo para hacer el reporte en graphiz del frafo
    public String reporte(){
        Report r = new Report();
    return  r.resporteGrafos(inicio);
    }
    

    private NodoG inicio;
    private int size;
}

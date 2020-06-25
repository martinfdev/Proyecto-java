
package beans;

/**
 *
 * @author pedro
 */
public class Ruta {
   
    
    public Ruta(){} 
    
    //clase arista o arco
    class Arco{
        
        public Arco(){}

        public Arco(Arco siguiente, Nodo adyacencia, String nombre) {
            this.siguiente = siguiente;
            this.adyacencia = adyacencia;
            this.nombre = nombre;
        }
        
        public Arco getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Arco siguiente) {
            this.siguiente = siguiente;
        }

        public Nodo getAdyacencia() {
            return adyacencia;
        }

        public void setAdyacencia(Nodo adyacencia) {
            this.adyacencia = adyacencia;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        Arco siguiente;
        Nodo adyacencia;
        String nombre;
    }
    
    //clase vertice o nodo
    class Nodo{
    Arco siguiente;
    Nodo adyacencia;
    int peso;
    
    }
}

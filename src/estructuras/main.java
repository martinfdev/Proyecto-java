
package estructuras;

import grafo.VerticeAdyacente;

/**
 *
 * @author pedro
 */
public class main {
    
    public static void main(String[] args) {
      //Init init = new Init();   
      VerticeAdyacente listaAdy = new VerticeAdyacente();
      listaAdy.addRuta("madrid", "zaragoza", 10);
        listaAdy.addRuta("madrid", "barcelona", 120);
        listaAdy.addRuta("bilbao", "malaga", 80);
        listaAdy.addRuta("barcelona", "bilbao", 82);
        listaAdy.addRuta("osasuna", "bilbao", 90);
        listaAdy.addRuta("madrid", "malaga", 40);
        listaAdy.addRuta("malaga", "madrid", 120);
        listaAdy.addRuta("malaga", "gerona", 70);
        listaAdy.addRuta("gerona", "barcelona", 660);
        listaAdy.addRuta("valladolid", "malaga", 40);
        listaAdy.addRuta("oviedo", "madrid", 120);
        listaAdy.addRuta("oviedo", "gerona", 70);
        listaAdy.addRuta("valladolid", "oviedo", 660);
        
        listaAdy.mostrarElementos();
    }
}

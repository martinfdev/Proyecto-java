package estructuras;

import beans.Cliente;
import beans.Vehiculo;
import grafo.VerticeAdyacente;

/**
 *
 * @author pedro
 */
public class Init {

    public Init() {
        test();
    }

    //metod para probar las estructuras miestras se van implementando
    private void test() {
        HashTable<Cliente> htclientes = new HashTable<>(37);
        /* htclientes.insert(new Cliente(2574151141308L, "", "", "", "", 'M'), 2574151141308L);
        System.out.println(htclientes.search(2574151141308L).getDpi());
        System.out.println("-------");
         */

        //ReadFile rf = new ReadFile();
        //System.out.println(rf.getText("/home/pedro/Documents/NetBeansProjects/[EDD]Proyecto2_201700656/Clientes.txt"));
        CargaMasiva cm = new CargaMasiva();
        cm.cargarClientes("/home/pedro/Documents/NetBeansProjects/[EDD]Proyecto2_201700656/Clientes.txt", htclientes);
        htclientes.graphHashTable();

        //NodoB<Vehiculo> nuevo_nodo = new NodoB<>(10, false);
      /*  VerticeAdyacente listaAdy = new VerticeAdyacente();
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
        */
    }

}

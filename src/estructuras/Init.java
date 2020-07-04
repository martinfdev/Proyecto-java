package estructuras;

import beans.Cliente;
import beans.Conductor;
import vistas.*;

/**
 *
 * @author pedro
 */
public class Init {

    public Init() {
        blockchain = new BlockChain();
        btree = new BTree(3); //arbol de grado 5
        rutas = new Grafo();
        tablahash = new HashTable<>(37); //tabla hash con tamanio inicial del vector igual 37
        lconductor = new DoubleLinkedList<>();
      //
        Vprincipal p = new Vprincipal(blockchain, rutas, tablahash, btree, lconductor);
        p.setVisible(true);
        
    }

    //metod para probar las estructuras miestras se van implementando
    private void test() {
        CargaMasiva cm = new CargaMasiva();
        cm.cargarClientes("/home/pedro/Documents/ArchivosPrueba/Clientes.txt", tablahash);
        cm.cargarConductores("/home/pedro/Documents/ArchivosPrueba/Conductores.txt", lconductor);
        cm.cargarRutas("/home/pedro/Documents/ArchivosPrueba/Rutas.txt", rutas);
        cm.cargarVehiculos("/home/pedro/Documents/ArchivosPrueba/Vehiculos.txt", btree);
    }

    private static BlockChain blockchain;
    private static Grafo rutas;
    private static HashTable<Cliente> tablahash;
    private static BTree btree;
    private static DoubleLinkedList<Conductor> lconductor;
}

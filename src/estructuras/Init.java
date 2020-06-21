package estructuras;

import beans.Cliente;
import beans.Vehiculo;

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
       
    }

}

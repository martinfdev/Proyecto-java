package estructuras;

import beans.Cliente;
import beans.Conductor;
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
        //  HashTable<Cliente> htclientes = new HashTable<>(37);
        /* htclientes.insert(new Cliente(2574151141308L, "", "", "", "", 'M'), 2574151141308L);
        System.out.println(htclientes.search(2574151141308L).getDpi());
        System.out.println("-------");
         */
        // ReadFile rf = new ReadFile();
        // System.out.println(rf.getText("/home/pedro/Documents/NetBeansProjects/[EDD]Proyecto2_201700656/Clientes"));
        // CargaMasiva cm = new CargaMasiva();
        //  cm.cargarClientes("/home/pedro/Documents/NetBeansProjects/[EDD]Proyecto2_201700656/Clientes", htclientes);
        //  htclientes.graphHashTable();     

        //    String p1= "654CRV", p2 ="876GDW", p3 ="345RTX";
        //    
        //        if (p1.compareTo(p2)<0) {
        //            System.out.println(p1.compareTo(p2));
        //            System.out.println("------");
        //        }else
        //            System.out.println(p1.compareToIgnoreCase(p2));
//        BTree ab = new BTree(5);
        CargaMasiva cm = new CargaMasiva();
//        cm.cargarVehiculos("/home/pedro/Documents/NetBeansProjects/[EDD]Proyecto2_201700656/vehiculos", ab);
//        ab.recorrer();
//           Vehiculo v1, v2, v3, v4, v5, v6, v7;
        //           v1 = new Vehiculo();
        //           v2 = new Vehiculo();
        //           v3 = new Vehiculo();
        //           v4 = new Vehiculo();
        //           v5 = new Vehiculo();
        //           v6 = new Vehiculo();
        //           v7 = new Vehiculo();
        //           v1.setPlaca("P123SDF");
        //           v2.setPlaca("D123GSD");
        //           v3.setPlaca("C345GSD");
        //           v4.setPlaca("M233GSD");
        //           v5.setPlaca("P345GSD");
        //           v6.setPlaca("P742GSD");
        //           v7.setPlaca("P453GSD");
        //           
        //           ab.insertar(v1);
        //           ab.insertar(v3);
        //           ab.insertar(v4);
        //           ab.insertar(v5);
        //           ab.insertar(v6);
        //           ab.insertar(v2);
        //           ab.insertar(v7);
        //           ab.insertar(v2);
        //           ab.recorrer();
        //           ab.eliminar(v4.getPlaca());
        //           ab.recorrer();
        //           System.out.println((ab.buscar("asdfa")));
        //        int j = 7/2;
        //        for (int i = 0; i < j; i++) {
        //            System.out.println(i+j);
        //        }
//        DoubleLinkedList<Conductor> ls = new DoubleLinkedList<>();
//        cm.cargarConductores("/home/pedro/Documents/NetBeansProjects/[EDD]Proyecto2_201700656/Conductores", ls);
//        Conductor c1, c2, c3, c4, c5, c6, c7, c8, c9;
//        c1 = new Conductor('M', 9575131141301L, "", "", "", "", "", "");
//        c2 = new Conductor('M', 4235131141302L, "", "", "", "", "", "");
//        c3 = new Conductor('M', 6545131141303L, "", "", "", "", "", "");
//        c4 = new Conductor('M', 5745131141304L, "", "", "", "", "", "");
//        c5 = new Conductor('M', 3235131141305L, "", "", "", "", "", "");
//        c6 = new Conductor('M', 2645131141306L, "", "", "", "", "", "");
//        c7 = new Conductor('M', 8755131141307L, "", "", "", "", "", "");
//        c8 = new Conductor('M', 1645131141308L, "", "", "", "", "", "");
//        c9 = new Conductor('M', 7455131141309L, "", "", "", "", "", "");
//        ls.add_headc(c1);
//        ls.add_endc(c2);
//        ls.add_endc(c3);
//        ls.add_endc(c4);
//        ls.add_endc(c5);
//        ls.add_endc(c6);
//        ls.add_endc(c7);
//        ls.add_endc(c8);
//        ls.add_endc(c9);
//          Sort s = new Sort();
//         s.ordenarListaDoble(ls);
//        for (int i = 0; i < ls.getSize(); i++) {
//            System.out.println(ls.getData().getDpi());
//        }
//        for (int i = 0; i < ls.getSize(); i++) {
//            System.out.println(ls.getData().getDpi());
//        }
//        System.out.println("\n\n");
//        s.ordenarListaDoble(ls);
//        for (int i = 0; i < ls.getSize(); i++) {
//            System.out.println(ls.getData().getDpi());
//        }
//        Grafo gr = new Grafo();    
//        gr.insertarArco("Oviedo", "Bilbao", 304);
//        gr.insertarArco("Bilbao", "Zaragoza", 324);
//        gr.insertarArco("Bilbao", "Madrid", 395);
//        gr.insertarArco("Bilbao", "Valladolid", 280);
//        gr.insertarArco("Zaragoza", "Barcelona", 296);
//        gr.insertarArco("Barcelona", "Gerona", 100);
//        gr.insertarArco("Zaragoza", "Madrid", 325);
        //gr.listaAdyacencia();
        //cm.cargarRutas("/home/pedro/Documents/NetBeansProjects/[EDD]Proyecto2_201700656/Rutas", gr);
//        gr.reporte();
//        gr.recorridoAnchura("");
//        LinkedList<String> ls = new LinkedList<>();
//        ls.add_queue("1");
//        ls.add_queue("2");
//        ls.add_queue("3");
//        ls.add_queue("4");
//        ls.add_queue("5");
//        ls.add_queue("6");
//        ls.add_queue("7");
//        ls.add_queue("8");
//        Node<String> tmp = ls.getHead();
//        while (tmp != null) {
//            System.out.println(tmp.getData());
//            tmp = tmp.next;
//        }
//        ls.delete_head();
//        ls.delete_head();
//        ls.delete_head();
//        ls.delete_head();
//        ls.delete_head();
//        System.out.println("\n");
//        Node<String> tmp2 = ls.getHead();
//        while (tmp2 != null) {
//            System.out.println(tmp2.getData());
//            tmp2 = tmp2.next;
//        }
//1c91a3a29a89b61b15adf8240cbb7f9ca0b7e35e38fc9b9a52b01c2629666752
//    Block b = new Block("50e62ad72913c2456885f3525fe2efaa541c3666", "M123MGT", "26-06-20::20:06");
//       // b.mineBlock(4);
//        System.out.println(b.getHash());
//        System.out.println(b.getTimestamp());
//        System.out.println(b.getData());
//
    }
}

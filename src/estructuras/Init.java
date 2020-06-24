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
        //  HashTable<Cliente> htclientes = new HashTable<>(37);
        /* htclientes.insert(new Cliente(2574151141308L, "", "", "", "", 'M'), 2574151141308L);
        System.out.println(htclientes.search(2574151141308L).getDpi());
        System.out.println("-------");
         */
        //ReadFile rf = new ReadFile();
        //System.out.println(rf.getText("/home/pedro/Documents/NetBeansProjects/[EDD]Proyecto2_201700656/Clientes.txt"));
//        CargaMasiva cm = new CargaMasiva();
        //   cm.cargarClientes("/home/pedro/Documents/NetBeansProjects/[EDD]Proyecto2_201700656/Clientes.txt", htclientes);
        //   htclientes.graphHashTable();     

        //    String p1= "654CRV", p2 ="876GDW", p3 ="345RTX";
        //    
        //        if (p1.compareTo(p2)<0) {
        //            System.out.println(p1.compareTo(p2));
        //            System.out.println("------");
        //        }else
        //            System.out.println(p1.compareToIgnoreCase(p2));
        BTree ab = new BTree(5);
        CargaMasiva cm = new CargaMasiva();
        cm.cargarVehiculos("/home/pedro/Documents/NetBeansProjects/[EDD]Proyecto2_201700656/vehiculos.txt", ab);
        ab.recorrer();
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

    }

}

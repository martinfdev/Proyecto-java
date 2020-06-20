package estructuras;

import beans.Cliente;
/**
 *
 * @author pedro
 */
public class Init {
    
    public Init(){
        test();
    }
    //metod para probar las estructuras miestras se van implementando
    private void test(){
        HashTable<Cliente> htclientes = new HashTable<>(37);
        htclientes.insert(new Cliente(2574151141308L, "", "", "", "", 'M'), 2574151141308L);
        System.out.println(htclientes.search(2574151141308L).getDpi());
        System.out.println("-------");
    }
    
}

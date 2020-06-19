/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    //metod para probar las estructura miestras se van implementando
    public void test(){
        HashTable<Cliente> htclientes = new HashTable<>(37);
        htclientes.insert(new Cliente(257415114, "", "", "", "", 'M'), 257415114);
        System.out.println(htclientes.search(257415114).getDpi());
        System.out.println("-------");
    }
    
}

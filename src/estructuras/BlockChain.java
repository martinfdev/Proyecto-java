/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author pedro
 */
public class BlockChain {

    private DoubleLinkedList<Block> lblock;
    private int index;
//    private final int dificultNonce = 4;

    public BlockChain() {
        lblock = new DoubleLinkedList<>();
        this.index = lblock.getSize();
    }

    //crear el bloque genesis 
    private void generateGensisBlock() {
        //Block genesis = new Block("", "0", "");
        //genesis.mineBlock(index);
    }

    //comprobar que el hash del bloque anterior es igual al que tengo en lista
    public boolean noChanges() {
        int cont = 1;
        Node<Block> aux = lblock.getHead();
        Node<Block> aux2;
        while (aux.next != null) {
            aux2 = aux.next;
            if (!aux.getData().getHash().equals(aux2.getData().getPreovioushash())) {
                System.out.println("Cambio en el hash del bloque: " + cont);
                return true;
            }
            cont++;
            aux = aux.next;
        }
        return false;
    }

    //retorna el indece hasta donde va la lista de bloques
    public int getIndex() {
        return index = lblock.getSize();
    }
    
    //retorna una lista de bloques
    public DoubleLinkedList<Block> getListBlock(){
        return lblock;
    }

}

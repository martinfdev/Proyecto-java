/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import beans.Viaje;

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
    }

    //crear el bloque genesis 
    private void generateGensisBlock() {
        //Block genesis = new Block("", "0", "");
        //genesis.mineBlock(index);
    }

    //comprobar que el hash del bloque anterior es igual al que tengo en lista
    public boolean changes() {
        int cont = 1;
        Node<Block> aux = lblock.getHead();
        Node<Block> aux2;
        if (aux != null && aux.next != null) {
            while (aux.next != null) {
                aux2 = aux.next;
                if (!aux.getData().getHash().equals(aux2.getData().getPreovioushash())) {
                    System.out.println("Cambio en el hash del bloque: " + cont);
                    return true;
                }
                cont++;
                aux = aux.next;
            }
        }
        return false;
    }

    //retorna el indece hasta donde va la lista de bloques
    public int getIndex() {
        return index = lblock.getSize();
    }

    //retorna una lista de bloques
    public DoubleLinkedList<Block> getListBlock() {
        return lblock;
    }

    //retorna el hash de ultimo elemento insertado en la lista
    private String getPreviosHas() {
        Node<Block> aux = lblock.getEnd();
        if (aux != null && !changes()) {
            return aux.getData().getHash();
        }
        return "0";
    }
    
    public void createBlock(Viaje viaje){
        Block blk = new Block(getPreviosHas(), viaje);
        lblock.add_end(blk);
    }  
}

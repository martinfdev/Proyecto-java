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
public class NodoHash {
    DoubleLinkedList<Cliente> list_client;

    public NodoHash() {
        list_client = new DoubleLinkedList<>();
    }

    public DoubleLinkedList<Cliente> getList_client() {
        return list_client;
    }

    public void setList_user(DoubleLinkedList<Cliente> list_client) {
        this.list_client = list_client;
    }
}

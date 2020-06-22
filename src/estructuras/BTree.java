package estructuras;

import beans.Vehiculo;

/**
 *
 * @author pedro
 */
public class BTree {

    public BTree(int grado) {
        this.orden = grado;
        raiz = null;
    }

    //retorna si el erabol esta vacio
    public boolean siEmpty() {
        return (raiz == null);
    }

    //metodo privado buscar internamente en el arbol b devuelve un obejeto de tipo T libro estructura de datos joyanes c++
    private Vehiculo buscarNodo(NodoB<Vehiculo> raiz, String placa) {
        int indice;
        if (placa.compareToIgnoreCase(raiz.obtenerClave(1).getPlaca()) < 0) {
            indice = 0;
        } else {
            indice = raiz.getNumeroClaves();
            while (placa.compareToIgnoreCase(raiz.obtenerClave(indice).getPlaca())<0 && indice > 1) {                
                indice--;
                if(raiz.obtenerClave(indice).getPlaca().equals(placa))
                    return raiz.obtenerClave(indice);
            }
        }
        return null;
    }
    
    //metodo para insertar
    public void insertar(Vehiculo dato){
        raiz = insertar(raiz, dato);    
    }
    
    //metodo privado quehace la insercion el arbolB
    private NodoB<Vehiculo> insertar(NodoB<Vehiculo> raiz, Vehiculo dato){
        
        
        return raiz;
    }

    int orden; //grado del arbol
    NodoB<Vehiculo> raiz; //raiz del arbol
}

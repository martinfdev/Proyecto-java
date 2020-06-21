/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

/**
 *
 * @author Angel López
 */

public class ListaAdyacente {
    
    NodoLista cola;
    NodoLista inicio;
    
    public ListaAdyacente(){
        this.cola=null;
    }
    
    public void addlista(String lugarDestino,int tiempoViaje){
        NodoLista nuevo;
        
        if(cola==null){
            cola=new NodoLista(lugarDestino,tiempoViaje);
            cola.siguiente=null;
            inicio=cola;
        }else{
        
        nuevo = new NodoLista(lugarDestino,tiempoViaje);
        
        nuevo.siguiente=inicio;
        inicio=nuevo;        
        }
    
    }
    
    public void deliteNodoLista(String valor){
        
        NodoLista aux = inicio;
        NodoLista aux2 = null;

        while (aux != null) {
            if (aux.getLugarDestino().equals(valor)) {

                if (inicio.getLugarDestino().equals(valor)) {
                    inicio = inicio.siguiente;
                } else if (aux2 != null) {
                    aux2.siguiente = aux.siguiente;

                } else {
                    aux2.siguiente = null;
                }

                System.out.println("nodo borrado");

                return;
            } else {
                aux2 = aux;
            }

            aux = aux.siguiente;
        }

        System.out.println("no se encontro el nodo a borrar");
    
    
    
    
    
    }
    
    public void mostrar(){
    NodoLista aux;
    aux=inicio;
    
    while(aux!=null){
    
        System.out.print("["+aux.getLugarDestino()+"]["+aux.getTiempoViaje()+"]->");
        aux=aux.siguiente;
    
    }
    
    
    
    }
}


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
public class NodoLista {
    
    private String lugarDestino;
    private int tiempoViaje;
    
    public NodoLista siguiente;
    
    public NodoLista(String lugarDestino,int tiempoViaje){
        this.lugarDestino=lugarDestino;
        this.tiempoViaje=tiempoViaje;
        this.siguiente=null;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public int getTiempoViaje() {
        return tiempoViaje;
    }

    public void setTiempoViaje(int tiempoViaje) {
        this.tiempoViaje = tiempoViaje;
    }
    
    
}

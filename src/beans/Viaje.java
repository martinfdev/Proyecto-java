/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import estructuras.LinkedList;
import estructuras.NodoG;

/**
 *
 * @author pedro
 */
public class Viaje {
    
    
    private String origen, destino, fehca_hora;
    private Cliente cliente;
    private Conductor conductor;
    private Vehiculo vehiculo;
    private LinkedList<NodoG> ruta;
}

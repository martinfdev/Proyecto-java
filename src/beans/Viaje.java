package beans;

import estructuras.LinkedList;
import estructuras.NodoG;

/**
 *
 * @author pedro
 */
public class Viaje {

    public Viaje(){}
    
    public Viaje(String origen, String destino, String fehca_hora, Cliente cliente, Conductor conductor, Vehiculo vehiculo, LinkedList<NodoG> ruta) {
        this.origen = origen;
        this.destino = destino;
        this.fecha_hora = fehca_hora;
        this.cliente = cliente;
        this.conductor = conductor;
        this.vehiculo = vehiculo;
        this.ruta = ruta;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fehca_hora) {
        this.fecha_hora = fehca_hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LinkedList<NodoG> getRuta() {
        return ruta;
    }

    public void setRuta(LinkedList<NodoG> ruta) {
        this.ruta = ruta;
    }
    
    
    
    private String origen, destino, fecha_hora;
    private Cliente cliente;
    private Conductor conductor;
    private Vehiculo vehiculo;
    private LinkedList<NodoG> ruta;
}

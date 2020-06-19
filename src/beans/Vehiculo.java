/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author pedro
 */
public class Vehiculo {

    private String placa, marca, color;
    private int modelo, anio;
    private float precio;
    private boolean transmision; //transmision es falso cuando es mecanico y true cuando es automatico\
    
    public Vehiculo(){}

    public Vehiculo(String placa, String marca, String color, int modelo, int anio, float precio, boolean transmision) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.transmision = transmision;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isTransmision() {
        return transmision;
    }

    public void setTransmision(boolean transmision) {
        this.transmision = transmision;
    }
       
}

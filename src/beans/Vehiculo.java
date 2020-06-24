package beans;

/**
 *
 * @author pedro
 */
public class Vehiculo {

    private String placa, marca, color, transmision, modelo, precio, anio;
     
    
    public Vehiculo(){}

    public Vehiculo(String placa, String marca, String color, String modelo, String anio, String precio, String transmision) {
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
       
}

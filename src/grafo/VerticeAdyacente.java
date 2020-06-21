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
public class VerticeAdyacente {

    NodoVertice Cabeza;
    NodoVertice auxCabeza;

    public VerticeAdyacente() {
        this.Cabeza = null;
    }

    public void addVertice(String nombreLugar) {
        NodoVertice nuevo;
        //lista vacia
        if (Cabeza == null) {

            Cabeza = new NodoVertice(nombreLugar);
            Cabeza.abajo = null;

        } else {
            nuevo = new NodoVertice(nombreLugar);

            //solo hay un elemento en la lista;
            if (Cabeza.abajo == null) {
                auxCabeza = Cabeza;
            }

            auxCabeza.abajo = nuevo;
            nuevo.abajo = null;
            auxCabeza = nuevo;
        }
    }

    public void deliteNodoVertice(String valor) {
        NodoVertice aux = Cabeza;
        NodoVertice aux2 = null;

        while (aux != null) {
            if (aux.getLugarInicio().equals(valor)) {

                if (Cabeza.getLugarInicio().equals(valor)) {
                    Cabeza = Cabeza.abajo;
                } else if (aux2 != null) {
                    aux2.abajo = aux.abajo;

                } else {
                    aux2.abajo = null;
                }

                System.out.println("nodo borrado");

                return;
            } else {
                aux2 = aux;
            }

            aux = aux.abajo;
        }

        System.out.println("no se encontro el nodo a borrar");

    }

    public void mostrar() {
        NodoVertice aux;

        aux = Cabeza;

        while (aux != null) {
            System.out.println("El valor es: " + aux.getLugarInicio());
            aux = aux.abajo;
        }
    }

    public boolean VerificarVertice(String lugarInicio) {
        boolean bandera = false;
        /*false[no existe]*//*true[existe]*/
        NodoVertice aux = Cabeza;

        while (aux != null) {
            if (aux.getLugarInicio().equals(lugarInicio)) {
                bandera = true;
                break;
            }
            aux = aux.abajo;
        }

        return bandera;
    }

    /*--------------------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------------------*/
    public void addRuta(String lugarInicio, String lugarFin, int tiempo) {
        if (!VerificarVertice(lugarInicio)) {
            addVertice(lugarInicio);
        }

        NodoVertice aux = Cabeza;

        while (aux != null) {
            if (aux.getLugarInicio().equals(lugarInicio)) {
                if (aux.lista == null) {
                    aux.lista = new ListaAdyacente();
                    aux.lista.addlista(lugarFin, tiempo);

                } else {
                    aux.lista.addlista(lugarFin, tiempo);
                }

            }
            aux = aux.abajo;
        }
    }

    public void mostrarElementos() {
        NodoVertice aux;

        aux = Cabeza;

        while (aux != null) {
            System.out.print(/*"El vertice es: " + */aux.getLugarInicio() + "->");
            if (aux.lista != null) {
                aux.lista.mostrar();
                System.out.println("");
            }

            aux = aux.abajo;
        }

    }

    /*--------------------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------------------*/
}

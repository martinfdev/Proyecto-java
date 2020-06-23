package estructuras;

/**
 *
 * @author pedro
 * @param <T>
 */
// T es el tipo de datos que se alamacenara
public class NodoB<T> {

    public NodoB(int orden, boolean hijo) {
        this.m = orden;
        claves = (T[]) new Object[m];
        nodo_pagina = new NodoB[m];
    }

    public int getNumero_claves() {
        return numero_claves;
    }

    public void setNumero_claves(int numero_claves) {
        this.numero_claves = numero_claves;
    }

    public boolean getEsHoja() {
        return hoja;
    }

    public void setEsHoja(boolean hija) {
        this.hoja = hija;
    }

    public T getClave(int i) {
        return claves[i];
    }

    public void setClave(int i, T dato) {
        claves[i] = dato;
    }

    public NodoB<T> getNodo(int i) {
        return nodo_pagina[i];
    }

    public void setNodo(int i, NodoB<T> nodo) {
        nodo_pagina[i] = nodo;
    }

    private final int m; //maximo numero de claves que puede almacenar la pagina
    private T[] claves; //array de claves de la pagina
    private int numero_claves; //contiene el actual numero de claves en el array de claves
    private NodoB<T>[] nodo_pagina; //array que contiene las ramas de la pagina
    private boolean hoja; //es verdadero cuando es un nodo hoja de lo contrario es falso
}

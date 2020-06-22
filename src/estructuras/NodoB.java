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
        this.hijo = hijo;
        claves = (T[]) new Object[m];
        nodo_pagina = new NodoB[m];
    }

    public void setNumeroClaves(int numero_claves) {
        this.numero_claves = numero_claves;
    }

    public void setHijo(boolean hijo) {
        this.hijo = hijo;
    }

    /*
     *Nos dice que si la pagina esta llena
     */
    protected boolean nodoLLeno() {
        return (numero_claves == m - 1);
    }

    /*
     *metodo que dice que si una pagina tiene menos de la mitad
     *de claves
     */
    protected boolean nodeSemiVacio() {
        return (numero_claves < m / 2);
    }

    /*metodo que obtiene la clave en una posicion i del array de claves*/
    protected T obtenerClave(int i) {
        return claves[i];
    }

    /*cambiar la clave que ocupa la  posicion en el vector de ramas*/
    protected void poneClave(int i, T clave) {
        claves[i] = clave;
    }

    /*Retornar un hijo en una posicon i de una pagina o rama*/
    protected NodoB<T> obtenerHijo(int i) {
        return nodo_pagina[i];
    }

    /*Cambiar la posicion de una pagina en una posicion i en el array de paginas*/
    protected void posicionHijo(int i, NodoB<T> pagina) {
        nodo_pagina[i] = pagina;
    }

    //retorna el maximo de claves hasta el momento
    protected int getNumeroClaves() {
        return numero_claves;
    }
    private final int m; //maximo numero de claves que puede almacenar la pagina
    protected T[] claves; //array de claves de la pagina
    private int numero_claves; //contiene el actual numero de claves en el array de claves
    protected NodoB<T>[] nodo_pagina; //array que contiene las ramas de la pagina
    private boolean hijo; //es verdadero cuando es un nodo hoja de lo contrario es falso
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author pedro
 * @param <T>
 */
public class NodeT<T> implements Comparable<NodeT> {

    public NodeT(T data) {
        izquierda = derecha = null;
    }

    public NodeT(T s, Integer n) {
        data = s;
        frecuencia = n;
        izquierda = derecha = null;
    }

    @Override
    public int compareTo(NodeT nodo) {
        return frecuencia - nodo.frecuencia;
    }

    int frecuencia;
    T data;
    NodeT izquierda;
    NodeT derecha;
}

package estructuras;

/**
 *
 * @author pedro
 */
public class Huffman {

    public Huffman() {
    }

    public String[] comprimir(String mensaje) {
        //creamos una lista para almacenar el mensaje
        LinkedList lschar = new LinkedList<>();
        char texto[] = mensaje.toCharArray();
        for (int i = 0; i < texto.length; i++) {
            lschar.add_queue(texto[i]);
        }

        //Se crea una lista de arboles para almacenar el caracter y su frecuencia
        LinkedList<Tree> ltree = new LinkedList<>();
        fillTree(lschar, ltree);//Creamos la listaArbol, el caracter y su frecuencia
        Node<Tree> aux = ltree.getHead();
        while (aux!=null) {
            System.out.println(aux.getData().getRaiz().data+" = "+aux.i);
            aux=aux.next;
        }
        

        return null;

    }


    private void fillTree(LinkedList lchar, LinkedList<Tree> ltree) {
        if (lchar.getHead() == null && ltree != null) {
            System.out.println("Lista caractares vacio y lista arbol vacio");
        } else {
            char caracter;
            int frecuencia = 0;
            //Node auxchar = lchar.getHead();
            while (lchar.getHead() != null) {
                caracter = (char) lchar.getData();
                frecuencia = countCharacterEqueals(lchar, caracter);
                if (frecuencia > 0) {
                    ltree.add_sort(new Tree(caracter, frecuencia), frecuencia);
                }
                
                frecuencia = 0;
            }
        }
    }

    //contar caracteres iguales
    private int countCharacterEqueals(LinkedList lch, Object d) {
        Node aux = lch.getHead();
        int contador = 0;
        int contador2 = 0;
        while (aux != null) {
            contador2++;
            if (aux.getData() == d) {
                contador++;
                aux = aux.next;
                lch.detePosition(contador2);
                contador2--;
            } else {
                aux = aux.next;
            }
        }
        return contador;
    }
}

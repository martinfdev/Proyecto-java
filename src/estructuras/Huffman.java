package estructuras;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class Huffman {

    public Huffman() {
    }

    public String compress(String mensaje, String nombreArchivo) {
        //creamos una lista para almacenar el mensaje
        LinkedList lschar = new LinkedList<>();
        char texto[] = mensaje.replaceAll("\n", " ").toCharArray();
        for (int i = 0; i < texto.length; i++) {
            lschar.add_queue(texto[i]);
        }
        //Se crea una lista de arboles para almacenar el caracter y su frecuencia
        LinkedList<Tree> ltree = new LinkedList<>();
        fillTree(lschar, ltree);//Creamos la listaArbol, el caracter y su frecuencia
        //De la lista anterior se crea el arbol
        generateTree(ltree);//generamos el arbol de huffman
        //Creamos una lista para almacenar el caracter y su direccion en el arbol(la tabla)
        LinkedList<Ubicacion> ltabla = new LinkedList<>();
        ltabla = getLeaf("", ltabla, ltree.pop().getRaiz());

        //Unimos todas las direcciones en un string con el metodo getEncod y le pasamos la tabla y el mensaje       
        //llamamos la clase Readfile y el metodo para crear el archivo
        return ReadFile.writeFile(getEncod(ltabla, mensaje.replaceAll("\n", " ")), nombreArchivo+".edd", ltabla);
    }

    public String unzip(String path) {
        try {
            if (path == null) {
                return null;
            }
            ReadFile rf =  new ReadFile();
            return rf.unzipHuffman(path);
        } catch (IOException ex) {
            Logger.getLogger(Huffman.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
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
                    ltree.add_sort(new Tree(String.valueOf(caracter), frecuencia), frecuencia);
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

    private void generateTree(LinkedList<Tree> lst) {
        NodeT one, two;
        int auxfre;
        while (lst.getHead().next != null) {
            one = lst.pop().getRaiz();
            two = lst.pop().getRaiz();
            auxfre = one.frecuencia + two.frecuencia;
            Tree nuevo = new Tree(null, auxfre);
            nuevo.addLeaf(one, two);
            lst.add_sort(nuevo, auxfre);
        }
    }

    //metodo para generar un listado de hojas
    public LinkedList<Ubicacion> getLeaf(String ubi, LinkedList<Ubicacion> ltabla, NodeT raiz) {
        if (raiz.data == null) {
            ltabla = getLeaf(ubi + 0, ltabla, raiz.izquierda);
            ltabla = getLeaf(ubi + 1, ltabla, raiz.derecha);
        } else {
            ltabla.add_head(new Ubicacion(raiz.data + "", ubi));
        }
        return ltabla;
    }

    private String getEncod(LinkedList<Ubicacion> lstable, String text) {
        StringBuilder encoding = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            encoding.append(codigChar(lstable, text.charAt(i) + ""));
        }
        return encoding.toString();
    }

    private String codigChar(LinkedList<Ubicacion> lstable, String character) {
        Ubicacion ub;
        for (int i = 0; i < lstable.getSize(); i++) {
            ub = lstable.getData();
            if (ub.data.equals(character)) {
                return ub.ubicacion;
            }
        }
        return null;
    }

}

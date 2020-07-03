package estructuras;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class ReadFile {

    public ReadFile() {
    }

    //metodo que espera como paraemtro un string ruta para un archivo
    //devuleve la cadena leida en el documento
    public String getText(String ruta) {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(ruta)));
        } catch (IOException ex) {
            //  Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return data;
    }

    //metodo para escrbir el cualquier archivo
    public static boolean writefile(String path, String text) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(path));
            writer.write(text);
            writer.close();
            return true;
        } catch (IOException ex) {
            return false;
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
            }
        }
    }
    //metodo para generar los archivos comprimidos de Huffman

    public static String writeFile(String cadena, String nombre, LinkedList<Ubicacion> tabla) {
        FileWriter w = null;
        try {
            //Creamos los objetos necesarios para escribir
            File f = new File(nombre);
            w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter escritor = new PrintWriter(bw);
            String bits = "";
            String codificado = "";
            int falta = 0;
            byte bin;
            char car;
            //Convertimos los 1 y 0 a bytes y despues a caracter, y lo vamos concatenando
            for (int i = 0; i < cadena.length(); i++) {
                if (bits.length() == 8) {
                    bin = (byte) Short.parseShort(bits, 2);
                    car = (char) (bin & 0xFF);
                    codificado += car;
                    bits = "";
                    i--;
                } else {
                    bits += cadena.charAt(i);
                }
            }
            if (bits.length() != 0) {
                bin = (byte) Short.parseShort(bits, 2);
                car = (char) (bin & 0xFF);
                codificado += car;
                falta = 8 - bits.length();
            }
            //Escribimos en el archivo la cadena de caracteres generada
            escritor.write(codificado + "\n");
            escritor.write(falta + "\n");
            Node<Ubicacion> aux = tabla.getHead();
            //A partir de nuestra ListaTabla escribimos el caracter seguido de la direccion
            while (aux != null) {
                escritor.write(aux.getData().data + aux.getData().ubicacion + "\n");
                aux = aux.next;
            }
            escritor.close();
            bw.close();

            //retornamos el path del archivo creado
            return f.getAbsolutePath();
        } catch (IOException ex) {
            //Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                w.close();
            } catch (IOException ex) {
              //  Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    //metodo para descomprimir huffman
    public String unzipHuffman(String archivo) throws IOException {
        if (archivo == null) {
            return null;
        }
        File doc = new File(archivo);
        FileReader fr = new FileReader(doc);
        BufferedReader lector = new BufferedReader(fr);
        //Cargamos en aux2 el mensaje de caracteres
        String aux2 = lector.readLine();
        Integer falta = Integer.parseInt(lector.readLine());
        String aux = "";
        String mensaje = "";
        byte bit2;
        //los convertimos a binario y rellenamos con ceros en caso de que no sea de longitud 8
        for (int i = 0; i < aux2.length(); i++) {
            bit2 = (byte) aux2.charAt(i);
            aux = Integer.toBinaryString(bit2 & 0xFF);
            if (aux.length() < 8) {
                aux = rellenar(aux);
                if (i == (aux2.length() - 1)) {
                    aux = quitar(aux, falta);
                }
            }
            mensaje += aux;
        }
        //Creamos una listaTabla para cargar los caracteres y sus direcciones
        LinkedList<Ubicacion> tabla = new LinkedList<>();
        aux = lector.readLine();
        while (aux != null) {
            tabla.add_head(new Ubicacion(aux.charAt(0) + "", quitar(aux, 1)));
            aux = lector.readLine();
        }
        aux = "";
        String original = "";
        aux2 = "";
        //Decodificamos el string de direcciones para obtener el mensaje original
        for (int i = 0; i < mensaje.length(); i++) {
            aux = aux + mensaje.charAt(i);
            aux2 = LetraDe(aux, tabla);
            if (aux2 != null) {
                original = original + aux2;
                aux = "";
                aux2 = "";
            }
        }
        return original;
    }

    private String rellenar(String cadena) {
        //Rellenamos la cadena con ceros a la izquierda
        String nueva = "";
        for (int i = 0; i < 8 - cadena.length(); i++) {
            nueva += "0";
        }
        nueva += cadena;
        return nueva;
    }

    private String quitar(String cad, Integer n) {
        //Quitamos a la cadena n caracteres 
        String nueva = "";
        for (int i = n; i < cad.length(); i++) {
            nueva += cad.charAt(i);
        }
        return nueva;
    }

    private String LetraDe(String ubicacion, LinkedList<Ubicacion> lsU) {
        String letra = null;
        Node<Ubicacion> aux = lsU.getHead();
        while (aux != null && !(aux.getData().ubicacion.equals(ubicacion))) {
            aux = aux.next;
        }
        if (aux != null) {
            letra = aux.getData().data;
        }
        return letra;
    }
}

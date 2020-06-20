package estructuras;

import java.io.IOException;
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
        }
        return data;
    }

}

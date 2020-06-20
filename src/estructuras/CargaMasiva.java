package estructuras;
import beans.*;
import javax.swing.JOptionPane;


/**
 *
 * @author pedro
 */
public class CargaMasiva {
   
    public CargaMasiva(){
    }
    
    public boolean cargarClientes(String rutaArchivo, HashTable<Cliente> tabla_lientes){
        if("".equals(rutaArchivo))
            JOptionPane.showMessageDialog(null, "La Ruta del archivo esta vacia!");
        if(tabla_lientes==null)
            JOptionPane.showMessageDialog(null, "La tabla clientes no esta incializada");
               
        return false;        
        
    }
}

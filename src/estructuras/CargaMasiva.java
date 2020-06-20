package estructuras;

import beans.*;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class CargaMasiva {

    public CargaMasiva() {
    }

    //metodo public para la carga de clientes recibe como parametro la ruta del archivo
    //para la carga de datos y la tabla que se llenara
    public boolean cargarClientes(String rutaArchivo, HashTable<Cliente> tabla_lientes) {
        if ("".equals(rutaArchivo)) {
            JOptionPane.showMessageDialog(null, "La Ruta del archivo esta vacia!");
            return false;
        }
        if (tabla_lientes == null) {
            JOptionPane.showMessageDialog(null, "La tabla clientes no esta incializada");
            return false;
        }
        ReadFile rf = new ReadFile();
        String tmp = rf.getText(rutaArchivo);
        tmp = tmp.replaceAll("\n", "");
        String[] out = tmp.split(";");
        for (String out1 : out) {
            Cliente ctemp = generarCliente(out1);
            tabla_lientes.insert(ctemp, ctemp.getDpi());
        }
        return true;
    }

    /*Metodo privado que genera un nuevo cliente y lo retorna
     *con los datos seteados recibe como parametro un 
     *string de cliente
     */
    private Cliente generarCliente(String cliente) {
        Cliente n_clie = new Cliente();
        String[] dcli = cliente.split(",");
        for (int i = 0; i < dcli.length; i++) {
            switch (i) {
                case 0:
                    n_clie.setDpi(Long.parseLong(dcli[i]));
                    break;
                case 1:
                    n_clie.setNombres(dcli[i]);
                    break;
                case 2:
                    n_clie.setApellidos(dcli[i]);
                    break;
                case 3:
                    n_clie.setGenero(dcli[i]);
                    break;
                case 4:
                    n_clie.setFecha_na(dcli[i]);
                    break;
                case 5:
                    n_clie.setTelefono(dcli[i]);
                    break;
                case 6:
                    n_clie.setDireccion(dcli[i]);
                    break;
                default:
                    return null;
            }
        }
        return n_clie;
    }
    
    //metodo para la carga masiva de vehiculos recibe como parametro un string ruta del archivo
    //y ub arbol b
    public boolean cargarVehiculos(String ruta){
        return true;
    
    }
    
}

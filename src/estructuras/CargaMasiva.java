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
        String[] out = rf.getText(rutaArchivo).replaceAll("\n", "").split(";");
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
                    if (!"".equals(dcli[i])) {
                        n_clie.setDpi(Long.parseLong(dcli[i]));
                    }
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
    public boolean cargarVehiculos(String rutaArchivo, BTree arbol) {
        if ("".equals(rutaArchivo)) {
            JOptionPane.showMessageDialog(null, "La Ruta del archivo esta vacia!");
            return false;
        }
        if (arbol == null) {
            JOptionPane.showMessageDialog(null, "El arbol no esta inicializado!");
            return false;
        }
        ReadFile rf = new ReadFile();
        String[] out = rf.getText(rutaArchivo).replaceAll("\n", "").split(";");
        for (String out1 : out) {
            Vehiculo vh = generarVehiculo(out1);
            if (vh != null) {
                arbol.insertar(vh);
            }
        }
        return true;
    }

    //metodo privado que genera y devuleve un objeto de tipo vehiculo con todos los datos seteados
    private Vehiculo generarVehiculo(String vehiculo_) {
        String[] vehiculo = vehiculo_.split(":");
        Vehiculo ve = new Vehiculo();
        for (int i = 0; i < vehiculo.length; i++) {
            switch (i) {
                case 0:
                    ve.setPlaca(vehiculo[i]);
                    break;
                case 1:
                    ve.setMarca(vehiculo[i]);
                    break;
                case 2:
                    ve.setModelo(vehiculo[i]);
                    break;
                case 3:
                    ve.setAnio(vehiculo[i]);
                    break;
                case 4:
                    ve.setColor(vehiculo[i]);
                    break;
                case 5:
                    ve.setPrecio(vehiculo[i]);
                    break;
                case 6:
                    ve.setTransmision(vehiculo[i]);
                    break;
                default:
                    return null;
            }
        }
        return ve;
    }

    //metodo para la carga masiva de conductores espera como parametro una listasdoblemente enlazada
    //y un string para la ruta del archivo
    public boolean cargarConductores(String rutaArchivo, DoubleLinkedList<Conductor> lDoble) {
        if ("".equals(rutaArchivo)) {
            JOptionPane.showMessageDialog(null, "La Ruta del archivo esta vacia!");
            return false;
        }
        if (lDoble == null) {
            JOptionPane.showMessageDialog(null, "La lista no esta inicializada!");
            return false;
        }
        ReadFile rd = new ReadFile();
        String out[] = rd.getText(rutaArchivo).replaceAll("\n", "").split(";");
        for (String out1 : out) {
            lDoble.add_endc(generarCondutor(out1));
        }
        return true;
    }

    //metodo privado donde se crea un un objeto de tipo Conductor con los datos ya seteandos y lo devuelve
    //recibe como parametro una cadena string de tipo conductor
    private Conductor generarCondutor(String conductor) {
        String con[] = conductor.split("%");
        Conductor c = new Conductor();
        for (int i = 0; i < con.length; i++) {
            switch (i) {
                case 0:
                    c.setDpi(Long.parseLong(con[i]));
                    break;
                case 1:
                    c.setNombres(con[i]);
                    break;
                case 2:
                    c.setApellidos(con[i]);
                    break;
                case 3:
                    c.setTipo_licencia(con[i]);
                    break;
                case 4:
                    c.setGenero(con[i]);
                    break;
                case 5:
                    c.setFecha_na(con[i]);
                    break;
                case 6:
                    c.setTelefono(con[i]);
                    break;
                case 7:
                    c.setDireccion(con[i]);
                    break;
                default:
                    System.out.println("Dato demas!\t" + con[i]);
                    break;
            }
        }
        return c;
    }

    //metodo para la carga masiva de rutas pide como parametro la ruta del archivo 
    //y un objeto de tipo Grafo
    public boolean cargarRutas(String rutaArchivo, Grafo grafo) {
        if ("".equals(rutaArchivo)) {
            JOptionPane.showMessageDialog(null, "La Ruta del archivo esta vacia!");
            return false;
        }
        if (grafo == null) {
            JOptionPane.showMessageDialog(null, "El grafo no esta inicializado!");
            return false;
        }
        ReadFile rd = new ReadFile();
        String out[] = rd.getText(rutaArchivo).replaceAll("\n", "").split("%");
        for (String out1 : out) {
            String ruta[] = out1.split("/");
            if (ruta.length > 1) {
                grafo.insertarArco(ruta[0], ruta[1], Integer.parseInt(ruta[2]));
            }
        }
        return true;
    }

}

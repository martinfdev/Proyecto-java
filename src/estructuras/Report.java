
package estructuras;
import beans.Cliente;
import java.io.File;

/**
 *
 * @author pedro
 */
public class Report {
    
    public Report() {
    }

    /*metodo que grafica la matriz dispersa este metodo 
    * es privado puesto que es llamando por el metodo publico
    * pide como parametro el vector y un StringBuilder donde
    * se va concatenando el codigo dot para generar la grafica
     */
    private void generate_source_dot(StringBuilder dotsource, NodoHash[] array) {
        dotsource.append("nodel[label=\"Vector");
        StringBuilder nodes = new StringBuilder(); //string para nodos
        StringBuilder dir = new StringBuilder(); //string para direccion a que nodos debe apuntar
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                // System.out.print("[" + i + "] -> ");//encabezado
                dotsource.append("|<f").append(i).append(">").append(i);//vector posiciones llenas
                dir.append("nodel:f").append(i).append(" -> ");
                DoubleLinkedList<Cliente> tmp = array[i].getList_client();
                nodes.append("node").append(i).append("[label=\"{<g> |");
                for (int j = 0; j < tmp.getSize(); j++) {
                    Cliente temp = tmp.getData();
                    nodes.append("Nombre: ").append(temp.getNombres()).append("\\n").append("DPI: ").append(temp.getDpi()).append("\\n").append("Telefono: ").append(temp.getTelefono()).append("|");
                }
                nodes.append("<s>}\"]\n");
                dir.append("node").append(i).append(":g[arrowtail=dot, dir=both,tailclip=false];\n");
            }
        }
        dotsource.append("\", height=.5];\n");
        dotsource.append(nodes);
        dotsource.append(dir);
    }

    //metodo publico para generar imagen pide como parametro el vector
    public String report(NodoHash[] array) {
        StringBuilder dotsource = new StringBuilder();
        Graphviz graph = new Graphviz();
        graph.addln(graph.start_graph());
        graph.addln("rankdir=LR;");
        graph.addln("node [shape=record, color=blue, height=.1, widht=.1];");
        graph.addln("edge[color=red];");
        graph.addln("graph [nodesep=0.5];");
        generate_source_dot(dotsource, array);
        graph.add(dotsource.toString());
        graph.add(graph.end_graph());
        File f = new File("Hashtable.png");
        graph.writeGraphToFile(graph.getGraph(graph.getDotSource(), "png"), f);
        return graph.getPath();
    }
}

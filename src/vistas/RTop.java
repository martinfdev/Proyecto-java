package vistas;

import beans.Cliente;
import beans.Conductor;
import beans.Vehiculo;
import beans.Viaje;
import estructuras.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author pedro
 */
public class RTop extends javax.swing.JFrame {

    /**
     * Creates new form RTop
     *
     * @param blockchain
     * @param grafo
     * @param tablahash
     * @param btree
     * @param vp
     * @param lconductor
     */
    public RTop(BlockChain blockchain, Grafo grafo, HashTable<Cliente> tablahash, BTree btree, DoubleLinkedList<Conductor> lconductor, Vprincipal vp) {
        this.blockchain = blockchain;
        this.grafo = grafo;
        this.btree = btree;
        this.tablahash = tablahash;
        this.lconductor = lconductor;
        this.vp = vp;
        rgeneral = new StringBuilder();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Reportes Top y Huffman");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnViaje = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnConductor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnVehiculos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        txtRutaviaje = new javax.swing.JTextField();
        btnGuardarReporte = new javax.swing.JButton();
        btnGuardarRzip = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnDescomprimirR = new javax.swing.JButton();
        btnAbrirReporte = new javax.swing.JButton();
        bntRTop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Top 10 viajes mas largos (por numero de destinos)");

        btnViaje.setText("TOP VIAJES");
        btnViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajeActionPerformed(evt);
            }
        });

        jLabel2.setText("Top 10 clientes con mayor cantidad de viajes");

        btnCliente.setText("TOP CLIENTES");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Top 10 conductores que generan mayor cantidad de ingreso");

        btnConductor.setText("TOP CONDUCTORES");
        btnConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConductorActionPerformed(evt);
            }
        });

        jLabel4.setText("Top 10 Vehiculos con mayor cantidad de viaje");

        btnVehiculos.setText("TOP VEHICULOS");
        btnVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculosActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane1);

        jLabel5.setText("Ruta de Viaje");

        txtRutaviaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRutaviajeMouseClicked(evt);
            }
        });

        btnGuardarReporte.setText("GUARDAR REPORTE");
        btnGuardarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarReporteActionPerformed(evt);
            }
        });

        btnGuardarRzip.setText("GUARDAR REPORTE COMPRIMIDO");
        btnGuardarRzip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRzipActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel6.setText("Llave");

        btnDescomprimirR.setText("DESCOMPRIMIR REPORTE");
        btnDescomprimirR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescomprimirRActionPerformed(evt);
            }
        });

        btnAbrirReporte.setText("ABRIR REPORTE");
        btnAbrirReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirReporteActionPerformed(evt);
            }
        });

        bntRTop.setText("GENERAR REPORTE TOP");
        bntRTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRTopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(143, 143, 143))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(btnCliente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btnConductor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(btnViaje))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(btnVehiculos)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRutaviaje, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGuardarReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAbrirReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDescomprimirR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGuardarRzip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(bntRTop)))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViaje)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConductor)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVehiculos)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtRutaviaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarReporte)
                            .addComponent(btnGuardarRzip))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDescomprimirR)
                            .addComponent(btnAbrirReporte))
                        .addGap(18, 18, 18)
                        .addComponent(bntRTop)
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajeActionPerformed
        String txt = "-----------------------Top viajes----------------------------\n";
        txt = txt + topViajes();
        jTextPane1.setText(txt);
    }//GEN-LAST:event_btnViajeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        vp.setVisible(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnDescomprimirRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescomprimirRActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        file.addChoosableFileFilter(new FileNameExtensionFilter("Archivo tipo .edd", "edd"));
        file.setAcceptAllFileFilterUsed(true);
        int option = file.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            String path = file.getSelectedFile().getPath();
            ReadFile rf = new ReadFile();
            Huffman h = new Huffman();
            rgeneral.setLength(0);
            rgeneral.append("Caractres Comprimido\n").append(rf.getText(path)).append("\nTexto Original\n").append(h.unzip(path));
            jTextPane1.setText(rgeneral.toString());
        }
        rgeneral.setLength(0);
    }//GEN-LAST:event_btnDescomprimirRActionPerformed

    private void btnGuardarRzipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRzipActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.home")));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("Archivo tipo edd", "edd"));
        int userSelection = fc.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fc.getSelectedFile();
            String path = fileToSave.getAbsolutePath();
            Huffman h = new Huffman();
            if (!jTextPane1.getText().equals("")) {
                h.compress(jTextPane1.getText(), path);
            }
        }
        jTextPane1.setText("");
    }//GEN-LAST:event_btnGuardarRzipActionPerformed

    private void btnGuardarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarReporteActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.home")));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("Archivo tipo edd", "edd"));
        int userSelection = fc.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fc.getSelectedFile();
            String path = fileToSave.getAbsolutePath();
            if (!"".equals(jTextPane1.getText())) {
                if (ReadFile.writefile(path, jTextPane1.getText())) {
                    JOptionPane.showMessageDialog(null, "Arcivo Creado Correctamente!");
                }
            }
        }
    }//GEN-LAST:event_btnGuardarReporteActionPerformed

    private void btnAbrirReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirReporteActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        // file.addChoosableFileFilter(new FileNameExtensionFilter("Archivo tipo ", "edd"));
        file.setAcceptAllFileFilterUsed(true);
        int option = file.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            String path = file.getSelectedFile().getPath();
            ReadFile rf = new ReadFile();
            jTextPane1.setText(rf.getText(path));
        }
    }//GEN-LAST:event_btnAbrirReporteActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        String txt = "-----------------------Top clientes----------------------------\n";
        txt = txt + topCliente();
        jTextPane1.setText(txt);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void bntRTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRTopActionPerformed
        rgeneral.append("-----------------------Top Viajes mas largos------------------------\n");
        rgeneral.append(topViajes());
        rgeneral.append("-----------------------Top Clientes con mas viajes-----------------------\n");
        rgeneral.append(topCliente());
        rgeneral.append("-----------------------Top Conductores-----------------------\n");
        rgeneral.append(topConductor());
        rgeneral.append("---------------------- Top Vehiculos ------------------------\n");
        rgeneral.append(topVehculos());
        jTextPane1.setText(rgeneral.toString());
    }//GEN-LAST:event_bntRTopActionPerformed

    private void btnConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConductorActionPerformed
        String txt = "-----------------------Top Conductor----------------------------\n";
        txt = txt + topConductor();
        jTextPane1.setText(txt);
    }//GEN-LAST:event_btnConductorActionPerformed

    private void btnVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculosActionPerformed
        String txt = "-----------------------Top Vehiculo----------------------------\n";
        txt = txt + topVehculos();
        jTextPane1.setText(txt);
    }//GEN-LAST:event_btnVehiculosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (!txtRutaviaje.getText().equals("")) {
            String r = "-------------------------Ruta de viaje-----------------------------------\n";
            r = r + rutaViaje(txtRutaviaje.getText());
            jTextPane1.setText(r);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtRutaviajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRutaviajeMouseClicked
        String text = "---------------------------------Cadena de bloques--------------------------------\n";
        text = text + filljtextBlochain();
        jTextPane1.setText(text);
    }//GEN-LAST:event_txtRutaviajeMouseClicked

    //metodo privado para generar el top 10 de viajes mas largos por destino
    private String topViajes() {
        StringBuilder string = new StringBuilder();
        DoubleLinkedList<Block> listaT = blockchain.getListBlock();
        int costo = 0, destino = 0;
        for (int i = 0; i < listaT.getSize(); i++) {
            Viaje tmp = listaT.getData().getViaje();
            destino = tmp.getRuta().getSize() - 1;
            Node<NodoG> tmpG = tmp.getRuta().getHead();
            string.append("No. destinos ").append(destino).append(" ");
            while (tmpG.getNext() != null) {
                string.append(tmpG.getData().getNombre()).append(" -> ");
                costo = costo + tmpG.getData().getAdyacencia().getPeso();
                tmpG = tmpG.getNext();
            }
            string.append(tmpG.getData().getNombre()).append(" Costo: ").append(costo).append("\n");
        }
        return string.toString();
    }

    //metodo para generar los clietnes con mayor cantidad de viajes
    private String topCliente() {
        StringBuilder string = new StringBuilder();
        DoubleLinkedList<Block> listaT = blockchain.getListBlock();
        LinkedList<Pair<Cliente, Integer>> lsaux = new LinkedList();
        for (int i = 0; i < listaT.getSize(); i++) {
            Viaje tmpv = listaT.getData().getViaje();//viaje
            if (!contarCliente(lsaux, tmpv.getCliente())) {
                lsaux.add_queue(Pair.of(tmpv.getCliente(), 1));
            }
        }
        for (int i = 0; i < lsaux.getSize(); i++) {
            Pair<Cliente, Integer> tmpp = lsaux.getData();
            string.append("DPI: ").append(tmpp.first.getDpi()).append(" Nombre: ").append(tmpp.first.getNombres()).append(" Viajes: ").append(tmpp.second).append("\n");
        }
        return string.toString();
    }

    //submetodo de clientes
    private boolean contarCliente(LinkedList<Pair<Cliente, Integer>> lsaux, Cliente cli) {
        for (int j = 0; j < lsaux.getSize(); j++) {
            Pair<Cliente, Integer> tmpa = lsaux.getData();//par de valores
            if (tmpa.first.getDpi() == cli.getDpi()) {
                tmpa.second = tmpa.second + 1;
                return true;
            }
        }
        return false;
    }

    //private generar conductor con mayor numero de viajes
    private String topConductor() {
        StringBuilder string = new StringBuilder();
        DoubleLinkedList<Block> listaT = blockchain.getListBlock();
        LinkedList<Pair<Conductor, Integer>> lsaux = new LinkedList();
        for (int i = 0; i < listaT.getSize(); i++) {
            Viaje tmpv = listaT.getData().getViaje();//viaje
            if (!contarCoductor(lsaux, tmpv.getConductor())) {
                lsaux.add_queue(Pair.of(tmpv.getConductor(), 1));
            }
        }
        for (int i = 0; i < lsaux.getSize(); i++) {
            Pair<Conductor, Integer> tmpp = lsaux.getData();
            string.append("DPI: ").append(tmpp.first.getDpi()).append(" Nombre: ").append(tmpp.first.getNombres()).append(" Viajes hechos: ").append(tmpp.second).append("\n");
        }
        return string.toString();
    }

    //submetodo de conductor
    private boolean contarCoductor(LinkedList<Pair<Conductor, Integer>> lsaux, Conductor con) {
        for (int j = 0; j < lsaux.getSize(); j++) {
            Pair<Conductor, Integer> tmpa = lsaux.getData();//par de valores
            if (tmpa.first.getDpi() == con.getDpi()) {
                tmpa.second = tmpa.second + 1;
                return true;
            }
        }
        return false;
    }

    //metodo privado para generar el top de los vehiculos con mas viajes
    private String topVehculos() {
        StringBuilder string = new StringBuilder();
        DoubleLinkedList<Block> listaT = blockchain.getListBlock();
        LinkedList<Pair<Vehiculo, Integer>> lsaux = new LinkedList();
        for (int i = 0; i < listaT.getSize(); i++) {
            Viaje tmpv = listaT.getData().getViaje();//viaje
            if (!contarVehiculo(lsaux, tmpv.getVehiculo())) {
                lsaux.add_queue(Pair.of(tmpv.getVehiculo(), 1));
            }
        }
        for (int i = 0; i < lsaux.getSize(); i++) {
            Pair<Vehiculo, Integer> tmpp = lsaux.getData();
            string.append("Marca: ").append(tmpp.first.getMarca()).append(" Modelo: ").append(tmpp.first.getModelo()).append(" Placa: ").append(tmpp.first.getPlaca()).append(" Viajes: ").append(tmpp.second).append("\n");
        }
        return string.toString();
    }

    //submetodo para contar vehiculos
    private boolean contarVehiculo(LinkedList<Pair<Vehiculo, Integer>> lsaux, Vehiculo vehi) {
        Pair<Vehiculo, Integer> tmpa;
        for (int j = 0; j < lsaux.getSize(); j++) {
            tmpa = lsaux.getData();//par de valores
            if (tmpa.first.getPlaca().equals(vehi.getPlaca())) {
                tmpa.second = tmpa.second + 1;
                return true;
            }
        }
        return false;
    }

    //metodo para llenar jtextpane con los datos de blockchain
    private String filljtextBlochain() {
        StringBuilder txt = new StringBuilder();
        DoubleLinkedList<Block> ls = blockchain.getListBlock();
        Block tmp;
        String st = null;
        for (int i = 0; i < ls.getSize(); i++) {
            tmp = ls.getData();
            txt.append("Bloque No. ").append(i).append(" Hash: ")
                    .append(tmp.getHash()).append(" Fecha: ").append(tmp.getViaje().getFecha_hora())
                    .append(" Placa: ").append(tmp.getViaje().getVehiculo().getPlaca()).append("\n");
        }
        return txt.toString();
    }

    //metodo para imprimir la ruta de un viaje
    private String rutaViaje(String hash) {
        StringBuilder sb = new StringBuilder();
        DoubleLinkedList<Block> tmp = blockchain.getListBlock();
        Block tmpb;
        for (int i = 0; i < tmp.getSize(); i++) {
            tmpb = tmp.getData();
            if (tmpb.getHash().equals(hash)) {
                generateRut(tmpb.getViaje().getRuta(), sb);
            }
        }
        return sb.toString();
    }

    //submetodo para generar la ruta del viaje
    private void generateRut(LinkedList<NodoG> ls, StringBuilder sb) {
        Node<NodoG> aux = ls.getHead();
        while (aux.getNext() != null) {
            sb.append(aux.getData().getNombre()).append(" -> ");
            aux = aux.getNext();
        }
        sb.append(aux.getData().getNombre()).append("\n");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntRTop;
    private javax.swing.JButton btnAbrirReporte;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnConductor;
    private javax.swing.JButton btnDescomprimirR;
    private javax.swing.JButton btnGuardarReporte;
    private javax.swing.JButton btnGuardarRzip;
    private javax.swing.JButton btnVehiculos;
    private javax.swing.JButton btnViaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField txtRutaviaje;
    // End of variables declaration//GEN-END:variables
    private BlockChain blockchain;
    private Grafo grafo;
    private HashTable<Cliente> tablahash;
    private BTree btree;
    private DoubleLinkedList<Conductor> lconductor;
    private Vprincipal vp;
    private StringBuilder rgeneral;
}

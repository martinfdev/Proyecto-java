package vistas;

import beans.Cliente;
import beans.Conductor;
import beans.Vehiculo;
import beans.Viaje;
import estructuras.BTree;
import estructuras.BlockChain;
import estructuras.DoubleLinkedList;
import estructuras.Grafo;
import estructuras.HashTable;
import estructuras.Node;
import estructuras.Report;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Vviaje extends javax.swing.JFrame {

    /**
     * Creates new form Vviaje
     *
     * @param blockchain
     * @param grafo
     * @param tablahash
     * @param btree
     * @param lconductor
     * @param vp
     */
    public Vviaje(BlockChain blockchain, Grafo grafo, HashTable<Cliente> tablahash, BTree btree, DoubleLinkedList<Conductor> lconductor, Vprincipal vp) {
        this.blockchain = blockchain;
        this.grafo = grafo;
        this.btree = btree;
        this.tablahash = tablahash;
        this.lconductor = lconductor;
        this.vp = vp;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        txtNoEditable();
        jTextPane1.setEditable(false);
        jTextPane2.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        txtOrigen = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtConductor = new javax.swing.JTextField();
        txtVehiculo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        btnAceptar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Lugar de Origen");

        jLabel2.setText("Lugar Destino");

        jLabel3.setText("Fecha y Hora");

        jLabel4.setText("Cliente");

        jLabel5.setText("Conductor");

        jLabel6.setText("Vehiculo");

        jLabel7.setText("IFORMACION DEL VIAJE");

        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteKeyTyped(evt);
            }
        });

        txtConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConductorKeyTyped(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane1);

        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel8.setText("RUTA");

        jButton1.setText("REPORTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("BLOCKCHAIN");

        jScrollPane3.setViewportView(jTextPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                            .addComponent(txtOrigen)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(199, 199, 199))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAceptar)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jButton1)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        vp.setVisible(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (txtIsEmpty()) {
            JOptionPane.showMessageDialog(null, "No puede haber ningun campo vacio!");
        } else {
            if (!grafo.getExistNodo(txtOrigen.getText())) {
                JOptionPane.showMessageDialog(null, "No existe el origen");
                return;
            }
            if (!grafo.getExistNodo(txtDestino.getText())) {
                JOptionPane.showMessageDialog(null, "No existe el destino");
                return;
            }
            long dpiclie = Long.parseLong(txtCliente.getText());
            Cliente tmpc = tablahash.search(dpiclie);
            if (tmpc == null) {
                JOptionPane.showMessageDialog(null, "No existe el cliente!");
                return;
            }
            long dpicon = Long.parseLong(txtConductor.getText());
            Conductor tmpcon = buscar(dpicon);
            if (tmpcon == null) {
                JOptionPane.showMessageDialog(null, "No existe conductor!");
                return;
            }
            Vehiculo tmpvehi = btree.buscar(txtVehiculo.getText());
            if (tmpvehi == null) {
                JOptionPane.showMessageDialog(null, "No existe el Vehiculo");
                return;
            }//falta la lista de la ruta mas corta
            Viaje nv = new Viaje(txtOrigen.getText(), txtDestino.getText(), txtFecha.getText(), tmpc, tmpcon, tmpvehi, null);
            blockchain.createBlock(nv);
            Report r = new Report();
            reportSetBlockChain(r.reporteBlockChain(blockchain.getListBlock(), false));
            cleantTxt();
            txtNoEditable();

        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyTyped
        if ((int) evt.getKeyChar() > 31 && (int) evt.getKeyChar() < 48 || (int) evt.getKeyChar() > 57 && (int) evt.getKeyChar() <= 255) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números");
        }
    }//GEN-LAST:event_txtClienteKeyTyped

    private void txtConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConductorKeyTyped
        if ((int) evt.getKeyChar() > 31 && (int) evt.getKeyChar() < 48 || (int) evt.getKeyChar() > 57 && (int) evt.getKeyChar() <= 255) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números");
        }
    }//GEN-LAST:event_txtConductorKeyTyped

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        txtEditable();
        txtFecha.setText(Viaje.getDate());
    }//GEN-LAST:event_btnCrearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Report r = new Report();
        Rgeneral rg = new Rgeneral(r.reporteGeneral(blockchain.getListBlock(), lconductor, btree, tablahash.getArray()), this);
        rg.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    //metodo para comprobar si los jtext estan vacios
    private boolean txtIsEmpty() {
        return "".equals(txtCliente.getText()) || "".equals(txtConductor.getText()) || "".equals(txtDestino.getText())
                || "".equals(txtFecha.getText()) || "".equals(txtOrigen.getText()) || "".equals(txtVehiculo.getText());
    }

    //busqueda conductor
    private Conductor buscar(long dpi) {
        Node<Conductor> aux = lconductor.getHead();
        if (aux == null) {
            return null;
        }
        do {
            if (aux.getData().getDpi() == dpi) {
                return aux.getData();
            }
            aux = aux.getNext();
        } while (aux != lconductor.getHead());
        return null;
    }

    private void cleantTxt() {
        txtCliente.setText("");
        txtConductor.setText("");
        txtDestino.setText("");
        txtFecha.setText("");
        txtOrigen.setText("");
        txtVehiculo.setText("");
    }

    private void txtNoEditable() {
        txtCliente.setEditable(false);
        txtConductor.setEditable(false);
        txtDestino.setEditable(false);
        txtFecha.setEditable(false);
        txtOrigen.setEditable(false);
        txtVehiculo.setEditable(false);
    }

    private void txtEditable() {
        txtCliente.setEditable(true);
        txtConductor.setEditable(true);
        txtDestino.setEditable(true);
        //txtFecha.setEditable(true);
        txtOrigen.setEditable(true);
        txtVehiculo.setEditable(true);
    }

    private void reportSetBlockChain(String path) {
        String url_image = path;
        String content = "<img src=\"file:" + url_image + "\">";
        jTextPane2.setContentType("text/html");
        jTextPane2.setText(content);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtConductor;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtVehiculo;
    // End of variables declaration//GEN-END:variables
    private BlockChain blockchain;
    private Grafo grafo;
    private HashTable<Cliente> tablahash;
    private BTree btree;
    private DoubleLinkedList<Conductor> lconductor;
    private Vprincipal vp;

}

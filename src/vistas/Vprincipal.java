package vistas;

import estructuras.*;
import beans.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author pedro
 */
public final class Vprincipal extends javax.swing.JFrame {

    public Vprincipal(BlockChain blockchain, Grafo grafo, HashTable<Cliente> tablahash, BTree btree, DoubleLinkedList<Conductor> lconductor) {
        initComponents();
        this.blockchain = blockchain;
        this.grafo = grafo;
        this.tablahash = tablahash;
        this.btree = btree;
        this.lconductor = lconductor;
        this.setLocationRelativeTo(null);
        setResizable(false);
        loadRoutes();

    }

    //metodo para pedir la carga de las rutas
    public void loadRoutes() {
        int option = JOptionPane.showConfirmDialog(null, "Desea cargar el Archivo de Rutas?");
        if (option == 0) {
            CargaMasiva cm = new CargaMasiva();
            String path = getPathFile();
            if (path!=null && grafo!=null) {
                if (cm.cargarRutas(path, grafo)) {
                    bgrafo = true;
                    JOptionPane.showMessageDialog(null, "Carga Exitosa!");
                } else {
                    JOptionPane.showMessageDialog(null, "No se cargaron las rutas!");
                }
            }
        }
    }

    //metodo para buscar la ubicacion del archivo de carga devuelva la ruta del archivo
    //como una cadena
    private String getPathFile() {
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        file.addChoosableFileFilter(new FileNameExtensionFilter("Archivo tipo txt", "txt"));
        file.setAcceptAllFileFilterUsed(true);
        int option = file.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            String path = file.getSelectedFile().getPath();
            return path;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnVehiculos = new javax.swing.JButton();
        btnViajes = new javax.swing.JButton();
        btnConductor = new javax.swing.JButton();
        btnGrafo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCliente.setText("CLIENTES");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnVehiculos.setText("VEHICULOS");
        btnVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculosActionPerformed(evt);
            }
        });

        btnViajes.setText("VIAJES");
        btnViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajesActionPerformed(evt);
            }
        });

        btnConductor.setText("CONDUCTORES");
        btnConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConductorActionPerformed(evt);
            }
        });

        btnGrafo.setText("GRAFO");
        btnGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrafoActionPerformed(evt);
            }
        });

        jButton1.setText("REPORTE TOP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConductor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btnViajes, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConductor, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnViajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrafoActionPerformed
        if(bgrafo){
           Rgrafo rg = new Rgrafo(grafo, this);
           rg.setVisible(bgrafo);
           dispose();
        }else{
            loadRoutes();
        }
    }//GEN-LAST:event_btnGrafoActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        Vcliente vc = new Vcliente(tablahash, this);
        vc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculosActionPerformed
        Vvehiculo v = new Vvehiculo(btree, this);
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVehiculosActionPerformed

    private void btnConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConductorActionPerformed
       Vconductor vc = new Vconductor(lconductor, this);
       vc.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnConductorActionPerformed

    private void btnViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajesActionPerformed
        Vviaje vv = new Vviaje(blockchain, grafo, tablahash, btree, lconductor, this);
        vv.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnViajesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RTop rt = new RTop(blockchain, grafo, tablahash, btree, lconductor, this);
        rt.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    private boolean bgrafo = false;
    private BlockChain blockchain;
    private Grafo grafo;
    private HashTable<Cliente> tablahash;
    private BTree btree;
    private DoubleLinkedList<Conductor>lconductor;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnConductor;
    private javax.swing.JButton btnGrafo;
    private javax.swing.JButton btnVehiculos;
    private javax.swing.JButton btnViajes;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

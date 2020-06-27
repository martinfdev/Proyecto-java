package vistas;

import beans.Cliente;
import estructuras.HashTable;
import estructuras.Report;

/**
 *
 * @author pedro
 */
public class Rtablahash extends javax.swing.JFrame {

    public Rtablahash(HashTable<Cliente> tablahash, Vcliente vCliente) {
        initComponents();
        this.vCliente = vCliente;
        this.tablahash = tablahash;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setTitle("Reporte Tabla Hash de Clientes");
        report();
        jTextPane1.setEditable(false);
    }

    //metodo para generar el report
    private void report() {
        Report r = new Report();
        String url_image = tablahash.graphHashTable();
        String content = "<img src=\"file:" + url_image + "\">";
        jTextPane1.setContentType("text/html");
        jTextPane1.setText(content);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1256, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        vCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private HashTable<Cliente> tablahash;
    private Vcliente vCliente;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}

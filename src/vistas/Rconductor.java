package vistas;

import beans.Conductor;
import estructuras.DoubleLinkedList;
import estructuras.Report;
/**
 *
 * @author pedro
 */
public class Rconductor extends javax.swing.JFrame {

    public Rconductor(DoubleLinkedList<Conductor> ldc, Vconductor Vconductor) {
        initComponents();
        this.Vconductor = Vconductor;
        this.ldc = ldc;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setTitle("Lista Circular Conductores");
        report();
        jTextPane1.setEditable(false);
    }
    
    //metodo para generar el report
    private void report(){
        String url_image = Report.reportListaDobleCircular(ldc, "ListaCircularConductores");
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Vconductor.setVisible(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private DoubleLinkedList<Conductor> ldc;
    private Vconductor Vconductor;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}

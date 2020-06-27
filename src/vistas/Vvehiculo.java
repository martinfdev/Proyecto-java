package vistas;

import beans.Vehiculo;
import estructuras.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro
 */
public class Vvehiculo extends javax.swing.JFrame {

    /**
     * @param tablahash
     * @param wm
     */
    public Vvehiculo(BTree tablahash, Vprincipal wm) {
        this.tree = tablahash;
        this.wm = wm;
        initComponents();
        llenarTabla_no_vacio();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        disbleTxt();
        flagedit = flagdelVehiculo = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBusqueda = new javax.swing.JTable();
        btnCarcaVehiculos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCrearVehiculo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtEliminarPlaca = new javax.swing.JLabel();
        txtDeletePlaca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();
        txtTransmision = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        tblBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Marca", "Modelo", "Precio"
            }
        ));
        tblBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBusquedaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBusqueda);
        if (tblBusqueda.getColumnModel().getColumnCount() > 0) {
            tblBusqueda.getColumnModel().getColumn(0).setMinWidth(30);
            tblBusqueda.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblBusqueda.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        btnCarcaVehiculos.setText("CARGAR VEHICULOS");
        btnCarcaVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarcaVehiculosActionPerformed(evt);
            }
        });

        jLabel7.setText("INFORMACION DEL VEHICULO");

        jLabel1.setText("Placa");

        jLabel2.setText("Marca");

        jLabel3.setText("Modelo");

        jLabel4.setText("Año");

        jLabel5.setText("Color");

        jLabel6.setText("Precio");

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGuardarCambios.setText("GUARDAR");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCrearVehiculo.setText("CREAR VEHICULO");
        btnCrearVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearVehiculoActionPerformed(evt);
            }
        });

        jLabel11.setText("Buscar");

        txtEliminarPlaca.setText("Eliminar por Placa");

        txtDeletePlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDeletePlacaKeyTyped(evt);
            }
        });

        jLabel8.setText("Transmision");

        btnReporte.setText("REPORTE");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtColor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTransmision)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAnio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEditar)
                                .addGap(39, 39, 39)
                                .addComponent(btnGuardarCambios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar)
                                .addGap(38, 38, 38))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEliminarPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(40, 40, 40)
                                .addComponent(txtDeletePlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(57, 57, 57)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCrearVehiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCarcaVehiculos))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReporte)
                .addGap(249, 249, 249))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnReporte)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEliminarPlaca)
                            .addComponent(txtDeletePlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnGuardarCambios)
                    .addComponent(btnEliminar)
                    .addComponent(btnCrearVehiculo)
                    .addComponent(btnCarcaVehiculos))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        wm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnCrearVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVehiculoActionPerformed
        flagnewVehiculo = true;
        enableTxt();
    }//GEN-LAST:event_btnCrearVehiculoActionPerformed

    private void btnCarcaVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarcaVehiculosActionPerformed
        if (tree != null) {
            JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File(System.getProperty("user.home")));
            file.setFileSelectionMode(JFileChooser.FILES_ONLY);
            file.addChoosableFileFilter(new FileNameExtensionFilter("Archivo tipo texto", "txt"));
            file.setAcceptAllFileFilterUsed(true);
            int option = file.showOpenDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                String path = file.getSelectedFile().getPath();
                CargaMasiva cm = new CargaMasiva();
                if (cm.cargarVehiculos(path, tree)) {
                    fill_table();
                    JOptionPane.showMessageDialog(null, "Carga Existosa!");
                }
            }
        }
    }//GEN-LAST:event_btnCarcaVehiculosActionPerformed

    private void tblBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBusquedaMouseClicked
        String placa = (String) tblBusqueda.getValueAt(tblBusqueda.getSelectedRow(), 0);
        Vehiculo tmp = tree.buscar(placa);
        if (tmp != null) {
            txtColor.setText(tmp.getColor());
            txtModelo.setText(tmp.getModelo());
            txtAnio.setText(tmp.getAnio());
            txtPlaca.setText(tmp.getPlaca());
            txtMarca.setText(tmp.getMarca());
            txtPrecio.setText(tmp.getPrecio());
            txtTransmision.setText(tmp.getTransmision());
            disbleTxt();
        } else {
            System.out.println("No encontro placa " + placa);
        }
    }//GEN-LAST:event_tblBusquedaMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (noEmptytxt()) {
            Vehiculo tmp = tree.buscar(txtPlaca.getText());
            if (tmp != null) {
                enableTxt();
                txtPlaca.setEditable(false);
                flagedit = true;
            } else {
                JOptionPane.showMessageDialog(null, "No se puede modificar el Vehiculo!!");
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        if (noEmptytxt()) {
            Vehiculo ctmp = tree.buscar(txtPlaca.getText());
            if (ctmp != null && flagedit == true) {
                ctmp.setAnio(txtAnio.getText());
                ctmp.setColor(txtColor.getText());
                ctmp.setMarca(txtMarca.getText());
                ctmp.setModelo(txtModelo.getText());
                ctmp.setPrecio(txtPrecio.getText());
                ctmp.setTransmision(txtTransmision.getText());
                fill_table();
                flagedit = false;
                clearTXT();
                disbleTxt();
                JOptionPane.showMessageDialog(null, "Cambio Guardado!");
            } else if (flagnewVehiculo) {
                Vehiculo vh = new Vehiculo(txtPlaca.getText(), txtMarca.getText(), txtColor.getText(), txtModelo.getText(), txtAnio.getText(), txtPrecio.getText(), txtTransmision.getText());
                tree.insertar(vh);
                fill_table();
                JOptionPane.showMessageDialog(null, "Vehiculo creado con exito!");
                disbleTxt();
                clearTXT();
                flagnewVehiculo = false;
            } else {
                disbleTxt();
                clearTXT();
                flagdelVehiculo = flagedit = flagnewVehiculo = false;
            }
        }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (flagdelVehiculo || !"".equalsIgnoreCase(txtPlaca.getText())) {
            if (flagdelVehiculo) {
                String placa = txtDeletePlaca.getText();
                Vehiculo tp = tree.buscar(placa);
                if (tp == null) {
                    JOptionPane.showMessageDialog(null, "Vehiculo con Placa " + txtDeletePlaca.getText() + " No existe!");
                    txtDeletePlaca.setText("");
                    flagdelVehiculo = false;
                    return;
                }
                tree.eliminar(placa);
                Vehiculo tp1 = tree.buscar(placa);
                if (tp1 == null) {
                    JOptionPane.showMessageDialog(null, "Vehiculo con Placa " + txtDeletePlaca.getText() + " eliminado!");
                    txtDeletePlaca.setText("");
                     fill_table();
                }
            }
            if (!"".equalsIgnoreCase(txtPlaca.getText()) && !flagdelVehiculo) {
                String placa = txtPlaca.getText();
                tree.eliminar(placa);
                Vehiculo tmp = tree.buscar(placa);
                if (tmp == null) {
                    clearTXT();
                    fill_table();
                    JOptionPane.showMessageDialog(null, "Vehiculo con Placa " + placa + " eliminado!");
                    txtDeletePlaca.setText("");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Veehiculo para eliminar o Ingrese la Placa");
        }
        flagdelVehiculo = false;
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        if (!"".equals(txtBuscar.getText())) {
            fillTablefilter(txtBuscar.getText());
        } else
            fill_table();
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        if (tree != null) {
//            Rtablahash r = new Rtablahash(tree, this);
//            r.setVisible(true);
//            dispose();
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void txtDeletePlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeletePlacaKeyTyped
        flagdelVehiculo = true;
    }//GEN-LAST:event_txtDeletePlacaKeyTyped

    protected void clearTXT() {
        txtColor.setText("");
        txtModelo.setText("");
        txtAnio.setText("");
        txtPlaca.setText("");
        txtMarca.setText("");
        txtPrecio.setText("");
        txtTransmision.setText("");
    }

    //no tiene que haber ningun campo vacio
    private boolean noEmptytxt() {
        if (!"".equals(txtColor.getText()) && !"".equals(txtModelo.getText())
                && !"".equals(txtAnio.getText()) && !"".equals(txtPlaca.getText())
                && !"".equals(txtPrecio.getText()) && !"".equals(txtMarca.getText())) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios selecione un\nVehiculo para editar o crea uno nuevo!");
            return false;
        }
    }

    //metodo para llenar la tabla
    protected void fill_table() {
        DefaultTableModel tabla = (DefaultTableModel) tblBusqueda.getModel();
        LinkedList<Vehiculo> tmpl = tree.getAllData();
        tabla.setRowCount(0);
        if (tmpl != null) {
            for (int i = 0; i < tmpl.getSize(); i++) {
                Vehiculo temp = tmpl.getData();
                Object[] tbl = {
                    temp.getPlaca(),
                    temp.getMarca(),
                    temp.getModelo(),
                    temp.getPrecio()
                };
                tabla.addRow(tbl);
            }
        }
    }

    private void llenarTabla_no_vacio() {
        if (tree != null) {
            fill_table();
        }
    }

    private void disbleTxt() {
        txtColor.setEditable(false);
        txtModelo.setEditable(false);
        txtAnio.setEditable(false);
        txtPlaca.setEditable(false);
        txtMarca.setEditable(false);
        txtPrecio.setEditable(false);
        txtTransmision.setEditable(false);
    }

    private void enableTxt() {
        txtColor.setEditable(true);
        txtModelo.setEditable(true);
        txtAnio.setEditable(true);
        txtPlaca.setEditable(true);
        txtMarca.setEditable(true);
        txtPrecio.setEditable(true);
        txtTransmision.setEditable(true);
    }

    private void fillTablefilter(String keytyped) {
        DefaultTableModel tabla = (DefaultTableModel) tblBusqueda.getModel();
        tabla.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarcaVehiculos;
    private javax.swing.JButton btnCrearVehiculo;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBusqueda;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDeletePlaca;
    private javax.swing.JLabel txtEliminarPlaca;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTransmision;
    // End of variables declaration//GEN-END:variables
    BTree tree;
    Vprincipal wm;
    private boolean flagedit, flagdelVehiculo, flagnewVehiculo;

}

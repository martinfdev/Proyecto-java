package vistas;

import beans.Conductor;
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
public class Vconductor extends javax.swing.JFrame {

    /**
     * @param ldc lista doblemente circular
     * @param wm
     */
    public Vconductor(DoubleLinkedList<Conductor> ldc, Vprincipal wm) {
        this.ldc = ldc;
        this.wm = wm;
        initComponents();
        llenarTabla_no_vacio();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setTitle("Conductor");
        disbleTxt();
        flagedit = flagdelCon = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBusqueda = new javax.swing.JTable();
        btnCarcaConductores = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDPI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCrearCliente = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDeleteDPI = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();
        txtGenero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtLicencia = new javax.swing.JTextField();

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
                "DPI", "Nombre", "Licencia"
            }
        ));
        tblBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBusquedaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBusqueda);
        if (tblBusqueda.getColumnModel().getColumnCount() > 0) {
            tblBusqueda.getColumnModel().getColumn(0).setMinWidth(100);
            tblBusqueda.getColumnModel().getColumn(0).setPreferredWidth(120);
            tblBusqueda.getColumnModel().getColumn(0).setMaxWidth(170);
            tblBusqueda.getColumnModel().getColumn(2).setMinWidth(40);
            tblBusqueda.getColumnModel().getColumn(2).setPreferredWidth(80);
            tblBusqueda.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        btnCarcaConductores.setText("CARGAR CONDUCTORES");
        btnCarcaConductores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarcaConductoresActionPerformed(evt);
            }
        });

        jLabel7.setText("INFORMACION DEL CONDUCTOR");

        txtDPI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDPIKeyTyped(evt);
            }
        });

        jLabel1.setText("DPI");

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Fecha de Nacimiento");

        jLabel5.setText("Telefono");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel6.setText("Direccion");

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

        btnCrearCliente.setText("CREAR CONDUCTOR");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });

        jLabel11.setText("Buscar");

        jLabel12.setText("Eliminar por DPI");

        txtDeleteDPI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDeleteDPIKeyTyped(evt);
            }
        });

        jLabel8.setText("Genero");

        btnReporte.setText("REPORTE");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo de Licencia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDeleteDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addGap(39, 39, 39)
                        .addComponent(btnGuardarCambios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(39, 39, 39)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGenero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtDPI)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellidos)
                                    .addComponent(txtFechaNacimiento))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtLicencia))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCrearCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCarcaConductores))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReporte)
                        .addGap(282, 282, 282))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReporte)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDeleteDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnGuardarCambios)
                    .addComponent(btnEliminar)
                    .addComponent(btnCrearCliente)
                    .addComponent(btnCarcaConductores))
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

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        flagnewCondu = true;
        enableTxt();
        clearTXT();
    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void btnCarcaConductoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarcaConductoresActionPerformed
        if (ldc != null) {
            JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File(System.getProperty("user.home")));
            file.setFileSelectionMode(JFileChooser.FILES_ONLY);
            file.addChoosableFileFilter(new FileNameExtensionFilter("Archivo tipo texto", "txt"));
            file.setAcceptAllFileFilterUsed(true);
            int option = file.showOpenDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                String path = file.getSelectedFile().getPath();
                CargaMasiva cm = new CargaMasiva();
                if (cm.cargarConductores(path, ldc)) {
                    fill_table();
                    JOptionPane.showMessageDialog(null, "Carga Existosa!");
                }
            }
        }
    }//GEN-LAST:event_btnCarcaConductoresActionPerformed

    private void txtDPIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDPIKeyTyped
        if ((int) evt.getKeyChar() > 31 && (int) evt.getKeyChar() < 48 || (int) evt.getKeyChar() > 57 && (int) evt.getKeyChar() <= 255) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números");
        }
    }//GEN-LAST:event_txtDPIKeyTyped

    private void tblBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBusquedaMouseClicked
        long dpi = (long) tblBusqueda.getValueAt(tblBusqueda.getSelectedRow(), 0);
        Conductor tmp = buscar(dpi);
        if (tmp != null) {
            txtTelefono.setText(tmp.getTelefono());
            txtApellidos.setText(tmp.getApellidos());
            txtFechaNacimiento.setText(tmp.getFecha_na());
            txtDPI.setText(tmp.getDpi() + "");
            txtDireccion.setText(tmp.getDireccion());
            txtNombre.setText(tmp.getNombres());
            txtGenero.setText(tmp.getGenero());
            txtLicencia.setText(tmp.getTipo_licencia());
            disbleTxt();
        } else {
            System.out.println("No encontro dpi " + dpi);
        }
    }//GEN-LAST:event_tblBusquedaMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (noEmptytxt()) {
            long dpi = Long.parseLong(txtDPI.getText());
            if (buscar(dpi) != null) {
                enableTxt();
                txtDPI.setEditable(false);
                flagedit = true;
            } else {
                JOptionPane.showMessageDialog(null, "No se puede modificar el conductor!!");
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        if (noEmptytxt()) {
            Conductor ctmp = buscar(Long.parseLong(txtDPI.getText()));
            if (ctmp != null && flagedit == true) {
                ctmp.setNombres(txtNombre.getText());
                ctmp.setApellidos(txtApellidos.getText());
                ctmp.setFecha_na(txtFechaNacimiento.getText());
                ctmp.setDireccion(txtDireccion.getText());
                ctmp.setTelefono(txtTelefono.getText());
                ctmp.setGenero(txtGenero.getText());
                ctmp.setTipo_licencia(txtLicencia.getText());
                fill_table();
                flagedit = false;
                clearTXT();
                disbleTxt();
                JOptionPane.showMessageDialog(null, "Cambio Guardado!");
            } else if (flagnewCondu) {
                long dpi = Long.parseLong(txtDPI.getText());
                Conductor n = new Conductor(txtLicencia.getText(), dpi, txtNombre.getText(), txtApellidos.getText(), txtTelefono.getText(), txtDireccion.getText(), txtGenero.getText(), txtFechaNacimiento.getText());
                ldc.add_endc(n);
                Sort.ordenarListaDoble(ldc);//reordenamos la lista
                fill_table();
                JOptionPane.showMessageDialog(null, "Conductor creado con exito!");
                disbleTxt();
                clearTXT();
                flagnewCondu = false;
            } else {
                disbleTxt();
                clearTXT();
                flagdelCon = flagedit = flagnewCondu = false;
            }
        }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (flagdelCon || !"".equalsIgnoreCase(txtDPI.getText())) {
            if (flagdelCon) {
                long dpi = Long.parseLong(txtDeleteDPI.getText());
                if (ldc.delete_data(buscar(dpi))) {
                    Sort.ordenarListaDoble(ldc);
                    fill_table();
                    JOptionPane.showMessageDialog(null, "Conductor con DPI " + txtDeleteDPI.getText() + " eliminado!");
                    txtDeleteDPI.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Conductor con DPI " + txtDeleteDPI.getText() + " No existe!");
                    txtDeleteDPI.setText("");
                }
            }
            if (!"".equalsIgnoreCase(txtDPI.getText()) && !flagdelCon) {
                long dpi = Long.parseLong(txtDPI.getText());
                if (ldc.delete_data(buscar(dpi))) {
                    clearTXT();
                    Sort.ordenarListaDoble(ldc);
                    fill_table();
                    JOptionPane.showMessageDialog(null, "Conductor con DPI " + dpi + " eliminado!");
                    txtDeleteDPI.setText("");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Conductor para eliminar o Ingrese DPI");
        }
        flagdelCon = false;
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        if (!"".equals(txtBuscar.getText())) {
            fillTablefilter(txtBuscar.getText());
        } else
            fill_table();
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtDeleteDPIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeleteDPIKeyTyped
        if ((int) evt.getKeyChar() > 31 && (int) evt.getKeyChar() < 48 || (int) evt.getKeyChar() > 57 && (int) evt.getKeyChar() <= 255) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números");
        } else {
            flagdelCon = true;
            disbleTxt();
            clearTXT();
        }
    }//GEN-LAST:event_txtDeleteDPIKeyTyped

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        if (ldc != null) {
            Rconductor r = new Rconductor(ldc, this);
            r.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if ((int) evt.getKeyChar() > 31 && (int) evt.getKeyChar() < 48 || (int) evt.getKeyChar() > 57 && (int) evt.getKeyChar() <= 255) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números");
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    protected void clearTXT() {
        txtTelefono.setText("");
        txtApellidos.setText("");
        txtFechaNacimiento.setText("");
        txtDPI.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtGenero.setText("");
        txtLicencia.setText("");
    }

    //no tiene que haber ningun campo vacio
    private boolean noEmptytxt() {
        if (!"".equals(txtTelefono.getText()) && !"".equals(txtApellidos.getText())
                && !"".equals(txtFechaNacimiento.getText()) && !"".equals(txtDPI.getText())
                && !"".equals(txtDireccion.getText()) && !"".equals(txtNombre.getText())) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios selecione un\nconductor para editar o crea uno nuevo!");
            return false;
        }
    }

    //metodo para llenar la tabla
    protected void fill_table() {
        DefaultTableModel tabla = (DefaultTableModel) tblBusqueda.getModel();
        tabla.setRowCount(0);
        Node<Conductor> aux = ldc.getHead();
        Conductor tmpc;
        do {
            tmpc = aux.getData();
            if (tmpc != null) {
                Object[] tbl = {
                    tmpc.getDpi(),
                    tmpc.getNombres(),
                    tmpc.getTipo_licencia()
                };
                tabla.addRow(tbl);
            }
            aux = aux.getNext();
        } while (aux != ldc.getHead());
    }

    private void llenarTabla_no_vacio() {
        if (ldc.getSize() > 0) {
            fill_table();
        }
    }

    private void disbleTxt() {
        txtTelefono.setEditable(false);
        txtApellidos.setEditable(false);
        txtFechaNacimiento.setEditable(false);
        txtDPI.setEditable(false);
        txtNombre.setEditable(false);
        txtDireccion.setEditable(false);
        txtGenero.setEditable(false);
        txtLicencia.setEditable(false);
    }

    private void enableTxt() {
        txtTelefono.setEditable(true);
        txtApellidos.setEditable(true);
        txtFechaNacimiento.setEditable(true);
        txtDPI.setEditable(true);
        txtNombre.setEditable(true);
        txtDireccion.setEditable(true);
        txtGenero.setEditable(true);
        txtLicencia.setEditable(true);
    }

    private void fillTablefilter(String keytyped) {
        DefaultTableModel tabla = (DefaultTableModel) tblBusqueda.getModel();
        tabla.setRowCount(0);
    }

    private Conductor buscar(long dpi) {
        Node<Conductor> aux = ldc.getHead();
        if (aux == null) {
            return null;
        }
        do {
            if (aux.getData().getDpi() == dpi) {
                return aux.getData();
            }
            aux = aux.getNext();
        } while (aux != ldc.getHead());
        return null;
    }

//    private boolean deleteClientDPI() {
//        return false;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarcaConductores;
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTable tblBusqueda;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDPI;
    private javax.swing.JTextField txtDeleteDPI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtLicencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
    DoubleLinkedList<Conductor> ldc;
    Vprincipal wm;
    private boolean flagedit, flagdelCon, flagnewCondu;

}

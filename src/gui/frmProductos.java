package gui;

import db.Conexion;

import java.util.Date;
import java.sql.*;

import java.time.LocalDate;
import java.time.ZoneId;

import javax.swing.table.DefaultTableModel;

public class frmProductos extends javax.swing.JFrame {

    public frmProductos() {
        initComponents();
        cargar();

        Tabla.setDefaultRenderer(Tabla.getColumnClass(7), new ColorCell());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtVencimiento = new com.toedter.calendar.JYearChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        cboCategoria = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("AGREGAR PRODUCTO");

        jLabel2.setText("Codigo");

        txtCodigo.setCaretColor(new java.awt.Color(255, 51, 102));
        txtCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCodigo.setNextFocusableComponent(txtDescripcion);

        jLabel3.setText("Descripcion");

        jLabel4.setText("Unidad");

        jLabel5.setText("Categoria");

        jLabel6.setText("Precio");

        btnGuardar.setBackground(new java.awt.Color(87, 204, 153));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/check.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha de vencimiento");

        txtVencimiento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true));

        Tabla.setAutoCreateRowSorter(true);
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Unidad", "Categoria", "Precio", "vence", "fecha", "Descuento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla.setAlignmentX(1.0F);
        Tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        Tabla.setFocusable(false);
        Tabla.setGridColor(new java.awt.Color(255, 255, 255));
        Tabla.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Tabla.setName(""); // NOI18N
        Tabla.setSelectionBackground(new java.awt.Color(102, 102, 255));
        Tabla.setSelectionForeground(new java.awt.Color(204, 255, 255));
        Tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Tabla.setShowGrid(true);
        Tabla.getTableHeader().setReorderingAllowed(false);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        btnEliminar.setBackground(new java.awt.Color(255, 102, 153));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(102, 102, 255));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edit.png"))); // NOI18N
        btnActualizar.setText("Actulizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Granos", "Bebidas", "Abarrotes", "Lacteos", "medicamentos" }));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/close.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(70, 70, 70)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(44, 44, 44))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(70, 70, 70)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUnidad)
                                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel2)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnGuardar)
                        .addGap(10, 10, 10)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Limpiar() {
        txtCodigo.setText("");
        txtDescripcion.setText("");
        cboCategoria.setSelectedIndex(0);
        txtPrecio.setText("");
        txtUnidad.setText("");
        txtCodigo.requestFocus();
        txtVencimiento.setValue(2021);
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();

            PreparedStatement ps = cn.prepareStatement("INSERT INTO productos VALUES(?, ?, ?, ?, ?, ?, ?)");

            String descripcion = txtDescripcion.getText();
            String unidad = txtUnidad.getText();
            String categoria = (String) cboCategoria.getSelectedItem();
            int codigo = Integer.parseInt(txtCodigo.getText());
            int precio = Integer.parseInt(txtPrecio.getText());
            long fecha = localDate.getYear();
            int vencimiento = txtVencimiento.getYear();

            ps.setInt(1, codigo);
            ps.setString(2, descripcion);
            ps.setString(3, unidad);
            ps.setString(4, categoria);
            ps.setInt(5, precio);
            ps.setInt(6, vencimiento);
            ps.setLong(7, fecha);

            ps.executeUpdate();
            Limpiar();
            cargar();

        } catch (SQLException ex) {
            System.out.println("qui error" + ex.getMessage());
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();

            PreparedStatement ps = cn.prepareStatement("DELETE FROM productos WHERE codigo = ?;");

            int codigo = Integer.parseInt(txtCodigo.getText());

            ps.setInt(1, codigo);

            ps.executeUpdate();

            Limpiar();
            cargar();

        } catch (SQLException ex) {
            System.out.println("qui error" + ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked

        int fila = Tabla.getSelectedRow();

        txtCodigo.setText(Tabla.getValueAt(fila, 0).toString());
        txtDescripcion.setText(Tabla.getValueAt(fila, 1).toString());
        txtUnidad.setText(Tabla.getValueAt(fila, 2).toString());
        cboCategoria.setSelectedItem(Tabla.getValueAt(fila, 3).toString());
        txtPrecio.setText(Tabla.getValueAt(fila, 4).toString());
        txtVencimiento.setValue(Integer.parseInt(Tabla.getValueAt(fila, 6).toString()));

    }//GEN-LAST:event_TablaMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();

            PreparedStatement ps = cn.prepareStatement("UPDATE productos SET  descripcion = ?, unidad = ?, categoria = ?, precio = ?, vencimiento = ? WHERE codigo = ?;");

            String descripcion = txtDescripcion.getText();
            String unidad = txtUnidad.getText();
            String categoria = (String) cboCategoria.getSelectedItem();
            int codigo = Integer.parseInt(txtCodigo.getText());
            int precio = Integer.parseInt(txtPrecio.getText());

            int vencimiento = txtVencimiento.getYear();

            ps.setString(1, descripcion);
            ps.setString(2, unidad);
            ps.setString(3, categoria);
            ps.setInt(4, precio);
            ps.setInt(5, vencimiento);
            ps.setInt(6, codigo);

            ps.executeUpdate();
            Limpiar();
            cargar();

        } catch (SQLException ex) {
            System.out.println("qui error" + ex.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void cargar() {
        try {

            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("Codigo");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Unidad");
            modelo.addColumn("Categoria");
            modelo.addColumn("Precio");
            modelo.addColumn("fecha");
            modelo.addColumn("Vence");
            modelo.addColumn("Descuento");
            modelo.addColumn("Precio final");

            Conexion cc = new Conexion();
            Connection cn = cc.conectar();

            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM productos ORDER BY codigo DESC");
            double desc1 = 20.0 / 100;
            double desc2 = 50.0 / 100;
            
            
            while (rs.next()) {

                String[] fila = new String[9];

                fila[0] = rs.getString("codigo");

                fila[1] = rs.getString("descripcion");

                fila[2] = rs.getString("unidad");

                fila[3] = rs.getString("categoria");

                fila[4] = rs.getString("precio");

                fila[5] = rs.getString("fecha");

                fila[6] = rs.getString("vencimiento");

                int venceEn = Integer.parseInt(fila[5]) - Integer.parseInt(rs.getString("vencimiento"));
                double precioDesc1 = Integer.parseInt(rs.getString("precio")) - (Integer.parseInt(rs.getString("precio")) * desc2);
                double precioDesc2 = Integer.parseInt(rs.getString("precio")) - (Integer.parseInt(rs.getString("precio")) * desc1);

                if (venceEn == -1 || venceEn == 0) {
                    fila[7] = "50 %";
                    fila[8] = String.valueOf(precioDesc1);
                } else if (Integer.parseInt(rs.getString("vencimiento")) < Integer.parseInt(rs.getString("fecha"))) {
                    fila[7] = "Vencio";
                    fila[8] = "Vencio";
                } else if (venceEn == -2) {
                    fila[7] = "20 %";
                    fila[8] = rs.getString("precio");
                    fila[8] = String.valueOf(precioDesc2);
                } else {
                    fila[7] = "No aplica";
                    fila[8] = rs.getString("precio");
                }

                modelo.addRow(fila);

            }

            Tabla.setModel(modelo);

        } catch (SQLException ex) {
            System.out.println("error" + ex);

        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtUnidad;
    private com.toedter.calendar.JYearChooser txtVencimiento;
    // End of variables declaration//GEN-END:variables
}

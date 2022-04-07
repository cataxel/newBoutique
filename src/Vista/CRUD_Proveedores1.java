/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import DataBase.Conexion;
import Modelo.Usuario;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableRowSorter;
import Negocio.CategoriaControl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author axel
 */
public class CRUD_Proveedores1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmCategoria
     */
    public final CategoriaControl control;
    String accion;
    private Usuario user;
    private String ImagenProveedor;
    private String NombreOpAnt;
    public CRUD_Proveedores1() {
        initComponents();
        control = new CategoriaControl();
        accion = "guardar";
        ImagenProveedor = "imagenDefault.jpg";
        txtIdProveedor.setVisible(false);
        listar("");
        
        
        //Activar tab 0 y desactivar tab 1
        TabCategorias.setSelectedIndex(0); // selecciona el tab(0)
        TabCategorias.setEnabledAt(0, true);
        TabCategorias.setEnabledAt(1, false);
    }
     public void listar(String texto){
        JTListadoCategorias.setModel(control.listar(texto));
        Connection con2 = Conexion.getCon();
        //Configurar la tabla
        
        //para ordenar datos en la tabla de acuerdo a la columna
         TableRowSorter modeloOrdenado = new TableRowSorter(JTListadoCategorias.getModel());
         JTListadoCategorias.setRowSorter(modeloOrdenado);
         
         LvlRegistrosMostrados.setText("Mostrados" + control.totaalMostrados() + " registros de " + control.total());
        
    }
     public void msjOk(String mensaje){
         JOptionPane.showMessageDialog(this, mensaje ,"Sistema de Administración SubMenu Proveedores",JOptionPane.INFORMATION_MESSAGE);
     }
     public void msjError(String mensaje){
         JOptionPane.showMessageDialog(this, mensaje,"Sistema de Administración SubMenu Proveedores", JOptionPane.ERROR_MESSAGE);
     }
     public void limpiar(){
         txtNombreProv.setText("");
         txtTelefonoProv.setText("");
         txtDireccionProv.setText("");
         txtNombreEmpresaProveedor.setText("");
         //lblProveedor.setIcon(null);
     }
     /*public void pintarImagen(JLabel lbl, String ruta){
         ImageIcon imagen = new ImageIcon(ruta);
         Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
         lbl.setIcon(icono);
         repaint();   
     }*/
//     private int regresarIndice(String valor){
//         for(int j = 0;j< cmdDescuento.getItemCount(); j++)
//         {
//             if(valor.equals(cmdDescuento.getItemAt(j)))
//                 return j;
//         }
//         return 0;
//     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        TabCategorias = new javax.swing.JTabbedPane();
        JPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtVolver = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        BtnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();
        LvlRegistrosMostrados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTListadoCategorias = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreProv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombreEmpresaProveedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefonoProv = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccionProv = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);

        TabCategorias.setBackground(new java.awt.Color(255, 255, 255));

        JPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(147, 204, 204));

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Listado de Proveedores:");

        txtVolver.setText("< Volver al menu");
        txtVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtVolver))
                .addGap(0, 239, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txtVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel3.setText("Nombre de Proveedor:");

        BtnBuscar.setBackground(new java.awt.Color(0, 153, 153));
        BtnBuscar.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setText("Encontrar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnNuevo.setBackground(new java.awt.Color(0, 153, 153));
        BtnNuevo.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        BtnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        BtnNuevo.setText("Nuevo");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 153, 153));
        btnEditar.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDesactivar.setBackground(new java.awt.Color(0, 153, 153));
        btnDesactivar.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        btnDesactivar.setForeground(new java.awt.Color(255, 255, 255));
        btnDesactivar.setText("Desactivar");
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarActionPerformed(evt);
            }
        });

        btnActivar.setBackground(new java.awt.Color(0, 153, 153));
        btnActivar.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        btnActivar.setForeground(new java.awt.Color(255, 255, 255));
        btnActivar.setText("Activar");
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        LvlRegistrosMostrados.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        LvlRegistrosMostrados.setForeground(new java.awt.Color(0, 102, 102));
        LvlRegistrosMostrados.setText("Registros");

        JTListadoCategorias.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        JTListadoCategorias.setForeground(new java.awt.Color(0, 102, 102));
        JTListadoCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JTListadoCategorias);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/pulpo1.png"))); // NOI18N

        javax.swing.GroupLayout JPanel1Layout = new javax.swing.GroupLayout(JPanel1);
        JPanel1.setLayout(JPanel1Layout);
        JPanel1Layout.setHorizontalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel1Layout.createSequentialGroup()
                        .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel1Layout.createSequentialGroup()
                                .addComponent(btnDesactivar)
                                .addGap(46, 46, 46)
                                .addComponent(btnActivar)
                                .addGap(41, 41, 41)
                                .addComponent(LvlRegistrosMostrados, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel1Layout.createSequentialGroup()
                                .addComponent(BtnBuscar)
                                .addGap(95, 95, 95)
                                .addComponent(BtnNuevo)
                                .addGap(111, 111, 111)
                                .addComponent(btnEditar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPanel1Layout.createSequentialGroup()
                        .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37))))
        );
        JPanel1Layout.setVerticalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnNuevo)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDesactivar)
                    .addComponent(btnActivar)
                    .addComponent(LvlRegistrosMostrados))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabCategorias.addTab("Listado", JPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(147, 204, 204));

        jLabel4.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Edición de Proveedores:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Nombre del Proveedor:");

        jLabel6.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Teléfono Proveedor:");

        jLabel7.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Dirección Proveedor");

        jLabel8.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Nombre empresa Proveedor:");

        btnCancelar.setBackground(new java.awt.Color(0, 102, 102));
        btnCancelar.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 102, 102));
        btnGuardar.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/pulpo1.png"))); // NOI18N

        txtIdProveedor.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        txtIdProveedor.setForeground(new java.awt.Color(0, 102, 102));
        txtIdProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        jLabel11.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Id Proveedor:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreEmpresaProveedor))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccionProv, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefonoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(btnCancelar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(103, 103, 103))))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTelefonoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDireccionProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtNombreEmpresaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnGuardar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        TabCategorias.addTab("Operaciones", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 677, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabCategorias)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        //Activar tab 1 y desactivar tab 0
        TabCategorias.setSelectedIndex(1); // selecciona el tab(1)
        TabCategorias.setEnabledAt(1, true);
        TabCategorias.setEnabledAt(0, false);

        accion="guardar";
        btnGuardar.setText(accion);
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        listar(txtNombreProv.getText().trim());
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //Verificar si el usuario selecciono un registro
        if(JTListadoCategorias.getSelectedRowCount() == 1){
            //llenar los controles
            txtIdProveedor.setText(JTListadoCategorias.getValueAt(JTListadoCategorias.getSelectedRow(),0).toString());
            txtNombreProv.setText(JTListadoCategorias.getValueAt(JTListadoCategorias.getSelectedRow(),1).toString());
            NombreOpAnt = (JTListadoCategorias.getValueAt(JTListadoCategorias.getSelectedRow(),1).toString());
            txtTelefonoProv.setText(JTListadoCategorias.getValueAt(JTListadoCategorias.getSelectedRow(),2).toString());
            txtDireccionProv.setText(JTListadoCategorias.getValueAt(JTListadoCategorias.getSelectedRow(),3).toString());
            txtNombreEmpresaProveedor.setText(JTListadoCategorias.getValueAt(JTListadoCategorias.getSelectedRow(),4).toString());            
            //vamos a mostrar el TAB 1 y desactivar el TAB 0
            TabCategorias.setSelectedIndex(1);
            TabCategorias.setEnabledAt(1, true);
            TabCategorias.setEnabledAt(0, false);
            //indicar la accion
            accion = "editar";
        }else
        {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un registro", "Sistema Administrativo SubMenu Proveedores",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed
        String respuesta = "";
        //Preguntar que se haya seleccionado un elemento
        if(JTListadoCategorias.getSelectedRowCount()==1){
            //obtener el ID
            txtIdProveedor.setText(JTListadoCategorias.getValueAt(JTListadoCategorias.getSelectedRow(),0).toString());
            txtNombreProv.setText(JTListadoCategorias.getValueAt(JTListadoCategorias.getSelectedRow(),1).toString());
            if(JOptionPane.showConfirmDialog(this, "¿Deseas desactivar la categoria?"+txtNombreProv.getText(),"Sistema Administrativo SubMenu Proveedores",JOptionPane.YES_NO_OPTION)==0){
                respuesta = control.desactivar(Integer.parseInt(txtIdProveedor.getText()));
                if(respuesta.equals("OK")){
                    msjOk("Registro desactivado");
                    limpiar();
                }else{
                    msjError(respuesta);
                }
            }

        }else
        JOptionPane.showMessageDialog(this, "Debes seleccionar un registro","Sistema Administrativo SubMenu Proveedores",JOptionPane.WARNING_MESSAGE);
        
    }//GEN-LAST:event_btnDesactivarActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        String respuesta = "";
        //Preguntar que se haya seleccionado un elemento
        if(JTListadoCategorias.getSelectedRowCount()==1){
            //obtener el ID
            txtIdProveedor.setText(JTListadoCategorias.getValueAt(JTListadoCategorias.getSelectedRow(),0).toString());
            txtNombreProv.setText(JTListadoCategorias.getValueAt(JTListadoCategorias.getSelectedRow(),1).toString());
            if(JOptionPane.showConfirmDialog(this, "¿Deseas activar la categoria?"+txtNombreProv.getText(),"Sistema Administrativo SubMenu Proveedores",JOptionPane.YES_NO_OPTION)==0){
                respuesta = control.activar(Integer.parseInt(txtIdProveedor.getText()));
                if(respuesta.equals("OK")){
                    msjOk("Registro activar");
                    limpiar();
                }else{
                    msjError(respuesta);
                }
            }

        }else
        JOptionPane.showMessageDialog(this, "Debes seleccionar un registro","Sistema Administrativo SubMenu Proveedores",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnActivarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //Regresar al primer tab
        TabCategorias.setSelectedIndex(0);
        TabCategorias.setEnabledAt(0, true);
        TabCategorias.setEnabledAt(1, false);
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String reps;
        //Verificar que el campo nombre no este vacio
        if(txtNombreProv.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this, "No debe de estar vacio el nombre","Sistema Administrativo SubMenu Proveedores",JOptionPane.WARNING_MESSAGE);
            txtNombreProv.requestFocus();
            return;
        }
        else
        {
            //se debe de sacar del else
            if(accion.equals("editar"))
            {
                System.out.println(NombreOpAnt);
                //codigo de editar o actualizar
                reps = control.actualizar(Integer.parseInt(txtIdProveedor.getText()),NombreOpAnt,txtNombreProv.getText(), txtTelefonoProv.getText(), txtDireccionProv.getText(), txtNombreEmpresaProveedor.getText(),true);
                if(reps.equals("ok")){
                    msjOk("Registro editado correctamente");
                    listar("");
                    limpiar();
                    //activar el tab 0
                    TabCategorias.setSelectedIndex(0);
                    TabCategorias.setEnabledAt(0, true);
                    TabCategorias.setEnabledAt(1, false);
                }else{
                    msjError(reps);
                    //txtNombreOp.requestFocus();
                }
            }else
            {
                //codigo de guardar o insertar
                reps = control.insertar(txtNombreProv.getText(), txtTelefonoProv.getText(), txtDireccionProv.getText(), txtNombreEmpresaProveedor.getText(),true);
                if(reps.equals("ok")){
                    msjOk("Registro insertado correctamente");
                    listar("");
                    limpiar();
                }else{
                    msjError(reps);
                    txtNombreProveedor.requestFocus();
                    listar("");
                    limpiar();
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVolverMouseClicked
        MenuPrincipal obm = new MenuPrincipal(user);
        obm.setVisible(true);
        /*dispose();
        MenuPrincipal.frmCusers = null;
        */dispose();
    }//GEN-LAST:event_txtVolverMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JPanel JPanel1;
    private javax.swing.JTable JTListadoCategorias;
    private javax.swing.JLabel LvlRegistrosMostrados;
    private javax.swing.JTabbedPane TabCategorias;
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDireccionProv;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtNombreEmpresaProveedor;
    private javax.swing.JTextField txtNombreProv;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtTelefonoProv;
    private javax.swing.JLabel txtVolver;
    // End of variables declaration//GEN-END:variables
}

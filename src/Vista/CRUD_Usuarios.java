/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.*;
import Controlador.*;
import DataBase.Conexion;

/**
 *
 * @author axellopez
 */
public class CRUD_Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form CRUD_Usuarios
     */
    ButtonGroup btnGr;
    private Usuario user;
    
    public CRUD_Usuarios(Usuario user) {
        
        this.user=user;
        initComponents();
        btnGr = new ButtonGroup();
        
        btnGr.add(checkboxadmin);
        btnGr.add(checkboxusernormal);
        CargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Volver = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablausuarios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        checkboxadmin = new javax.swing.JCheckBox();
        checkboxusernormal = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        bttagregar = new javax.swing.JButton();
        btteliminar = new javax.swing.JButton();
        bttmodificar = new javax.swing.JButton();
        bttlimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        filtro = new javax.swing.JComboBox<>();
        txtbuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(java.awt.Color.white);

        Volver.setText("Volver al menu");
        Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
        });

        tablausuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Contraseña", "Correo", "Nombre Usuario", "Tipo Usuario"
            }
        ));
        tablausuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablausuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablausuarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Volver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 3, 14))); // NOI18N

        jLabel1.setText("Nombre");

        jLabel2.setText("id:");

        jLabel3.setText("Contraseña");

        jLabel4.setText("Correo");

        checkboxadmin.setText("Admin");

        checkboxusernormal.setText("Usuario normal");

        jLabel5.setText("Nombre Usuario");

        bttagregar.setText("Agregar");
        bttagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttagregarActionPerformed(evt);
            }
        });

        btteliminar.setText("Eliminar");
        btteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btteliminarActionPerformed(evt);
            }
        });

        bttmodificar.setText("Modificar");
        bttmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttmodificarActionPerformed(evt);
            }
        });

        bttlimpiar.setText("Limpiar");
        bttlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(43, 43, 43))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContraseña)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtusuario)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkboxadmin)
                            .addComponent(bttmodificar)
                            .addComponent(bttlimpiar))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(checkboxusernormal)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btteliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(bttagregar)
                                .addGap(8, 8, 8)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkboxadmin)
                    .addComponent(checkboxusernormal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttagregar)
                    .addComponent(btteliminar)
                    .addComponent(bttmodificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(bttlimpiar)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 3, 14))); // NOI18N

        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombre", "Nombre usuario", "Correo" }));

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        jButton1.setText("Restablecer Tabla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscar)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
        MenuPrincipal obm = new MenuPrincipal(user);
        obm.setVisible(true);
        /*dispose();
        MenuPrincipal.frmCusers = null;
        */dispose();
    }//GEN-LAST:event_VolverMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CargarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bttagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttagregarActionPerformed
        SQL_Usuario modsql = new SQL_Usuario();
        SQL_Usuarios modsql2 = new SQL_Usuarios();
        int resultado;
        Usuario mod = new Usuario();
        String nombre = txtNombre.getText();
        if(nombre.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Debes ingresar un nombre");
        }
        else
        {
            mod.setNombre(nombre);
            String correo = txtCorreo.getText();
            if(correo.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Debes ingresar un correo electronico");
            }
            else
            {
                mod.setCorreo(correo);               
                //try{
                    //int id = Integer.parseInt(txtID.getText());
                    //mod.setId_tipo(id);
                    
                //}catch(NumberFormatException e)
                //{
                  //  JOptionPane.showMessageDialog(null, "Debes ingresar un numero");
                //}
                String contra = txtContraseña.getText();
                if(contra.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Debes ingresar una contraseña");
                }
                else
                {
                    mod.setContra(contra);
                    String usuario = txtusuario.getText();
                    if(usuario.equals("")){
                        JOptionPane.showMessageDialog(null, "Debes ingresar un nombre de usuario");
                    }
                    else {
                        mod.setUsuario(usuario);
                        boolean tipo = checkboxusernormal.isSelected();
                        if(tipo==true){
                            resultado = 2;
                            mod.setId_tipo(resultado);
                        }
                        else{
                            resultado = 1;
                            mod.setId_tipo(resultado);
                        }
                        
                        DefaultTableModel model = (DefaultTableModel) tablausuarios.getModel();
                        if (modsql.Agregar(mod)) {
                            JOptionPane.showMessageDialog(this, "Cuenta creada con exito", "Registro", JOptionPane.INFORMATION_MESSAGE);
                            Limpiar();
                        } else {
                            JOptionPane.showMessageDialog(this, "Error al guardar la cuenta", "Registro", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_bttagregarActionPerformed

    private void btteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btteliminarActionPerformed
        int id = 0;
        try
        {
            id = Integer.parseInt(txtID.getText());
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla para obtener un id");
        }
        if(!txtID.getText().equals(""))
        {
            DefaultTableModel model = (DefaultTableModel) tablausuarios.getModel();
                if(model.getRowCount()>0){/*
                        for (int i = 0; i<model.getRowCount(); i++) {
                        final String col1 = (String) model.getValueAt(i, 0);
                        final String col2 = (String) model.getValueAt(i, 1);
                        System.out.println("Talla: " + col1 + " Existencia: " + col2);
                    }*/
             //DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
             /*if(model.getRowCount()>0){
                SQL_Ropa_Tallas sqlropatallas = new SQL_Ropa_Tallas();
                for (int i = 0; i<model.getRowCount(); i++) 
                {
                    Ropa_Tallas rt =new Ropa_Tallas();
                    rt.setIdropa(id);
                    rt.setIdtalla(traerIDTalla((String) model.getValueAt(i, 0), 0));
                    rt.setExistencias(Integer.parseInt(model.getValueAt(i, 1).toString()));
                    sqlropatallas.Eliminar(id);
                }
             }*/
            try
            {
                Connection con = Conexion.getCon();
                PreparedStatement ps = con.prepareStatement("DELETE FROM usuarios WHERE idusuario=?");
                ps.setInt(1, Integer.parseInt(txtID.getText()));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Registro eliminado", "Registro", JOptionPane.INFORMATION_MESSAGE);
                Limpiar();
                CargarTabla();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(this, "Error al eliminar el registro", "Registro", JOptionPane.ERROR_MESSAGE);
            }
            }
        }
    }//GEN-LAST:event_btteliminarActionPerformed

    private void bttmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttmodificarActionPerformed
        int id = 0;
        int resultado = 0;
        boolean ban = false;
        try {
            id = Integer.parseInt(txtID.getText());
            ban = true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla para obtener un id");
        }
        SQL_Usuario modSql = new SQL_Usuario();
        Usuario mod = new Usuario();
        String usuario = txtusuario.getText();
        if (ban) {
            if (usuario.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes de ingresar un nombre a la prenda");
            } else {
                mod.setUsuario(usuario);
                String contra = txtContraseña.getText();
                if (contra.equals("")) {
                    JOptionPane.showMessageDialog(null, "Debes de ingresar una contraseña");
                } else {
                    mod.setContra(contra);
                    String nombre = txtNombre.getText();
                    if (nombre.equals("")) {
                        JOptionPane.showMessageDialog(null, "Debe ingresar un nombre");
                    } else {
                        mod.setNombre(nombre);
                        String correo = txtCorreo.getText();
                        if (correo.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar un correo");
                        } else {
                            mod.setCorreo(correo);
                            boolean tipo = checkboxusernormal.isSelected();
                            if (tipo == true) {
                                resultado = 2;
                                mod.setId_tipo(resultado);
                            } else {
                                resultado = 1;
                                mod.setId_tipo(resultado);
                            }
                            mod.setIdusuario(Integer.parseInt(txtID.getText()));
                            DefaultTableModel model = (DefaultTableModel) tablausuarios.getModel();                        
                            if (modSql.Modificar(mod)) {
                                JOptionPane.showMessageDialog(this, "Cuenta actualizado con exito", "Registro", JOptionPane.INFORMATION_MESSAGE);
                                Limpiar();
                            } else {
                                JOptionPane.showMessageDialog(this, "Error al guardar la cuenta", "Registro", JOptionPane.ERROR_MESSAGE);
                            }
                        }

                    }
                }
            }
        }
    }//GEN-LAST:event_bttmodificarActionPerformed

    private void bttlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttlimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_bttlimpiarActionPerformed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        DefaultTableModel modelotabla = (DefaultTableModel) tablausuarios.getModel();
        modelotabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        String busqueda = txtbuscar.getText();
        if (busqueda.trim().equals("")) {
            CargarTabla();
        } else {
            int columnas;
            int[] anchos = {30, 100, 150, 40, 30, 60, 40, 70, 80, 124};
            for (int i = 0; i < tablausuarios.getColumnCount(); i++) {
                tablausuarios.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            try {
                Connection con = Conexion.getCon();
                String consultaSQL = "";
                String filtro = this.filtro.getSelectedItem().toString();
                if (filtro.equals("ID")) {
                    consultaSQL = "SELECT * FROM usuarios WHERE idusuario = '" + busqueda + "' ";
                } else {
                    if (filtro.equals("Nombre")) {
                        consultaSQL = "SELECT * FROM usuarios WHERE nombre like '%" + busqueda + "%' ";
                    } else {
                        if (filtro.equals("Correo")) {
                            consultaSQL = "SELECT * FROM usuarios WHERE correo like '%" + busqueda + "%' ";
                        } else {
                            if (filtro.equals("Nombre usuario")) {
                                consultaSQL = "SELECT * from usuarios WHERE usuario like '%" + busqueda + "%' ";
                            } else {
                                /*if (filtro.equals("Tipo de Usuario")) {
                                    consultaSQL = "SELECT * FROM usuarios WHERE id_tipo = '" + busqueda + "' ";
                                }*/
                            }
                        }
                    }
                }
                ps = con.prepareStatement(consultaSQL);
                rs = ps.executeQuery();
                rsmd = rs.getMetaData();
                columnas = rsmd.getColumnCount();
                while (rs.next()) {
                    Object[] fila = new Object[columnas];
                    for (int indice = 0; indice < columnas; indice++) {
                        fila[indice] = rs.getObject(indice + 1);
                    }
                    modelotabla.addRow(fila);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void tablausuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablausuariosMouseClicked
         try
        {
            int fila = tablausuarios.getSelectedRow();
            int id = Integer.parseInt(tablausuarios.getValueAt(fila, 0).toString());
            PreparedStatement ps, ps2;
            ResultSet rs, rs2;
            ResultSetMetaData rsm;
            Connection con = Conexion.getCon();
            Connection con2 = Conexion.getCon();
            String consultaSQL = "SELECT idusuario, nombre, contra, correo, usuario, id_tipo FROM usuarios WHERE idusuario= ? ";
            //String consulta_talla = "SELECT t.nombre, rt.existencias FROM Tallas t INNER JOIN ropa_talla rt ON t.idtalla = rt.idtalla INNER JOIN ropa r ON rt.idropa = r.idropa WHERE r.idropa=?";
            ps=con.prepareStatement(consultaSQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next())
            {
                txtID.setText(String.valueOf(id));
                txtNombre.setText(rs.getString(2));
                txtContraseña.setText(rs.getString(3));
                txtCorreo.setText(rs.getString(4));
                txtusuario.setText(rs.getString(5));
                //cmbtalla.setSelectedItem(rs.getString("talla"));
                if(rs.getString(6).equals("1")) //admin 1 , otro 2
                {
                    checkboxadmin.setSelected(true);
                }else if(rs.getString(6).equals("2"))
                {
                    checkboxusernormal.setSelected(true);
                }
                
                
                DefaultTableModel modelotabla = (DefaultTableModel) tablausuarios.getModel();
                modelotabla.setRowCount(0);
                
                //ps2 = con2.prepareStatement(consulta_talla);
                //ps2.setInt(1, id);
                //rs2 = ps2.executeQuery();
                //rsm = rs2.getMetaData();
                //int columnas = rsm.getColumnCount();;
                //while(rs2.next())
               /*{
                    Object[] fila2 = new Object[columnas];
                    for(int indice=0; indice<columnas; indice++)
                    {
                        fila2[indice] = rs2.getObject(indice+1);
                    }
                    modelotabla.addRow(fila2);
                }*/
            }
            CargarTabla();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tablausuariosMouseClicked

    private void Limpiar(){
        txtNombre.setText("");
        txtCorreo.setText("");
        txtID.setText("");
        txtContraseña.setText("");
        txtusuario.setText("");
        txtbuscar.setText("");
        
    }
    
    private void CargarTabla()
    {
        DefaultTableModel modelotabla = (DefaultTableModel) tablausuarios.getModel();
        modelotabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        //724 tamano tabla de forma horizontal
        int[] anchos = {40,100,150,50,50,50,60,70,80,110};
        for(int i = 0; i<tablausuarios.getColumnCount(); i++)
        {
            tablausuarios.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        try
        {
            Connection con = Conexion.getCon();
            //String consultaSQL = "SELECT idropa, nombre, descripcion, precio, genero, marca FROM ropa";
            String consultaSQL = "Select idusuario, nombre, contra,correo,usuario, id_tipo from usuarios";
            ps = con.prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            Object[] fila = new Object[columnas];
            while(rs.next())
            {
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getInt(6);
                modelotabla.addRow(fila);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CRUD_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_Usuarios(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Volver;
    private javax.swing.JButton bttagregar;
    private javax.swing.JButton btteliminar;
    private javax.swing.JButton bttlimpiar;
    private javax.swing.JButton bttmodificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox checkboxadmin;
    private javax.swing.JCheckBox checkboxusernormal;
    private javax.swing.JComboBox<String> filtro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablausuarios;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}

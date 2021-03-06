/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.SQL_Usuario;
import Controlador.Opiniones;
import DataBase.Conexion;
import Modelo.Opinion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author gisel
 */
public class CRUDOpinion extends javax.swing.JFrame {
    private Usuario user;
    Opiniones opinion = new Opiniones();
    Opinion op = new Opinion();
    boolean delet = false;
    boolean update = false;
    String ced;
    /**
     * Creates new form CRUDOpinion
     */
    public CRUDOpinion() {
        initComponents();
        CargarTabla();
    }
    
    private void CargarTabla() {
        DefaultTableModel modelotabla = (DefaultTableModel) TableOpinion.getModel();
        modelotabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        //724 tamano tabla de forma horizontal
        int[] anchos = {40, 100, 150, 50, 50, 50, 60, 70, 80, 110};
        for (int i = 0; i < TableOpinion.getColumnCount(); i++) {
            TableOpinion.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        try {
            Connection con = Conexion.getCon();
            
            String consultaSQL = "SELECT idopinion, Nombre, Opinion FROM Opinion";
            ps = con.prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            Object[] fila = new Object[columnas];
            while (rs.next()) {
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                modelotabla.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public void limpiar() {
        txtNombre.setText("");
        txtOpinion.setText("");
        id.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtOpinion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableOpinion = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        VolverM = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setText("Nombre");

        jLabel2.setText("Opinion");

        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtOpinion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAgregar.setBackground(new java.awt.Color(83, 184, 178));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(83, 184, 178));
        btnLimpiar.setText("Limpiar ");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        TableOpinion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TableOpinion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Opinion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableOpinion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableOpinionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableOpinion);

        jLabel5.setText("ID");

        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBuscarMouseReleased(evt);
            }
        });

        jLabel3.setText("Buscar ID: ");

        jPanel2.setBackground(new java.awt.Color(83, 184, 178));

        VolverM.setText("Volver al menu");
        VolverM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(VolverM, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(519, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(VolverM)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/pulpo1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOpinion, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(69, 69, 69))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOpinion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
          
    private void TableOpinionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableOpinionMouseClicked
        try
        {
            int fila = TableOpinion.getSelectedRow();
            int id = Integer.parseInt(TableOpinion.getValueAt(fila, 0).toString());
            PreparedStatement ps, ps2;
            ResultSet rs, rs2;
            ResultSetMetaData rsm;
            Connection con = Conexion.getCon();
            Connection con2 = Conexion.getCon();
            String consultaSQL = "SELECT idopinion, Nombre, Opinion FROM Opinion WHERE idopinion= ? ";
            ps=con.prepareStatement(consultaSQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next())
            {
                this.id.setText(String.valueOf(id));
                txtNombre.setText(rs.getString(2));
                txtOpinion.setText(rs.getString(3));
                DefaultTableModel modelotabla = (DefaultTableModel) TableOpinion.getModel();
                modelotabla.setRowCount(0);
            }
            CargarTabla();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_TableOpinionMouseClicked

    private void VolverMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMMouseClicked
        MenuPrincipal obm = new MenuPrincipal(user);
        obm.setVisible(true);
        dispose();
    }//GEN-LAST:event_VolverMMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Opiniones modsql = new Opiniones();
        Opinion mod = new Opinion();
        String nombre = txtNombre.getText();
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(null, " ingresa tu nombre");
        } else {
            mod.setNombre(nombre);
            String opinion = txtOpinion.getText();
            if (txtOpinion.getText().equals("")) {
                JOptionPane.showMessageDialog(null, " ingresa tu opinion");
            } else {
                mod.setOpinion(opinion);
                DefaultTableModel model = (DefaultTableModel) TableOpinion.getModel();
                if (modsql.Insertar(mod)) {
                    JOptionPane.showMessageDialog(this, "creada con exito", "Registro", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar la opinion", "Registro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int id;
        int resultado = 0;
        boolean ban = false;
        try {
            id = Integer.parseInt(this.id.getText());
            ban = true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla para obtener un id");
        }
        Opiniones modSql = new Opiniones();
        Opinion mod = new Opinion();
        String nombre = txtNombre.getText();
        if (ban) {
            if (nombre.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes de ingresar un nombre");
            } else {
                mod.setNombre(nombre);
                String contra = txtOpinion.getText();
                if (contra.equals("")) {
                    JOptionPane.showMessageDialog(null, "Debes de ingresar una opinion");
                } else {
                    mod.setOpinion(contra);

                    mod.setId(Integer.parseInt(this.id.getText()));
                    DefaultTableModel model = (DefaultTableModel) TableOpinion.getModel();
                    if (modSql.Modificar(mod)) {
                        JOptionPane.showMessageDialog(this, "Cuenta actualizado con exito", "Registro", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al guardar la cuenta", "Registro", JOptionPane.ERROR_MESSAGE);
                    }
                }

            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       int id = 0;
        try {
            id = Integer.parseInt(this.id.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla para obtener un id");
        }
        if (!this.id.getText().equals("")) {
            DefaultTableModel model = (DefaultTableModel) TableOpinion.getModel();
            if (model.getRowCount() > 0) {
                try {
                    Connection con = Conexion.getCon();
                    PreparedStatement ps = con.prepareStatement("DELETE FROM Opinion WHERE idopinion=?");
                    ps.setInt(1, Integer.parseInt(this.id.getText()));
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Registro eliminado", "Registro", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    CargarTabla();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error al eliminar el registro", "Registro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseReleased
        DefaultTableModel modelotabla = (DefaultTableModel) TableOpinion.getModel();
        modelotabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        String busqueda = txtBuscar.getText();
        if (busqueda.trim().equals("")) {
            CargarTabla();
        } else {
            int columnas;
            int[] anchos = {30, 100, 150, 40, 30, 60, 40, 70, 80, 124};
            for (int i = 0; i < TableOpinion.getColumnCount(); i++) {
                TableOpinion.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            try {
                Connection con = Conexion.getCon();
                String consultaSQL = "";
                if (!txtBuscar.getText().equals("")) {
                    consultaSQL = "SELECT * FROM Opinion WHERE idopinion = '" + busqueda + "' ";
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
    }//GEN-LAST:event_txtBuscarMouseReleased

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(CRUDOpinion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDOpinion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDOpinion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDOpinion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDOpinion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableOpinion;
    private javax.swing.JLabel VolverM;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOpinion;
    // End of variables declaration//GEN-END:variables

    
}

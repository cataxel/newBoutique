/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author axel
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import DataBase.Conexion;
import Modelo.Compras;


public class SQL_Compra extends Conexion {
    Connection con = getConexion();
    public boolean Agregar(Compras compra)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String consultaSQL = " insert into Compra (FechaCompra, MontoCompra, DescripcionCompra) values('?', '?', '?');";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setInt(1, compra.getIdCompra());
          ps.setInt(2,compra.getIdProveedor());
          ps.setString(3,compra.getFechaCompra());
          ps.setString(4, compra.getMontoCompra());
          ps.setString(5, compra.getDescripcionCompra());
       
          ps.executeUpdate();
          return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
    }
    public int total() {
        int numeroderegistros = 0;
        PreparedStatement ps;
        ResultSet rs;
        try{
            ps = con.prepareStatement("SELECT COUNT(*) FROM Compra");
            rs = ps.executeQuery();
            while(rs.next()){    
                numeroderegistros=rs.getInt(1); // getString(String);
            }
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps=null;
            rs=null;
        }
        
        return numeroderegistros;
    }
}

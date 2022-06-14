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
import Modelo.Ropa;
import Modelo.Ventas;


public class SQL_Ventas extends Conexion {
    Connection con = getConexion();
    public boolean Agregar(Ventas ventas)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String consultaSQL = "INSERT INTO Ventas(idRopa,folioVenta,Fecha,Total,Descuento,IVA,Estado,existencias) "
                + "VALUES(?,?,?,?,?,?,?,?);";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setInt(1, ventas.getIdRopa());
          ps.setString(2,ventas.getFolioVenta());
          ps.setString(3,ventas.getFecha());
          ps.setDouble(4, ventas.getTotal());
          ps.setDouble(5, ventas.getDescuento());
          ps.setDouble(6, ventas.getIva());
          ps.setBoolean(7, ventas.isEstado());
          ps.setInt(8, ventas.getCantidad());
          ps.executeUpdate();
          return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
    }
    public boolean Modificar(Ropa ropa)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String consultaSQL = "UPDATE ropa SET existencias=? WHERE idropa = ?";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setInt(1, ropa.getExistencias());
          ps.setInt(2, ropa.getIdropa());
          ps.executeUpdate();
          return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
    }
    public int existencias(int id)
    {
        
        PreparedStatement ps;
        ResultSet rs;
        int result = 0;
        try{
            ps = con.prepareStatement("select existencias from ropa where idropa = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){    
                result=rs.getInt(1);
            }
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps=null;
            rs=null;
        }
        return result;
    }
    public int total() {
        int numeroderegistros = 0;
        PreparedStatement ps;
        ResultSet rs;
        try{
            ps = con.prepareStatement("SELECT COUNT(*) FROM Ventas");
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

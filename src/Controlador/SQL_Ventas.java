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
import Modelo.Ventas;


public class SQL_Ventas extends Conexion {
    Connection con = getConexion();
    public boolean Agregar(Ventas ventas)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String consultaSQL = "INSERT INTO Ventas(idRopa,folioVenta,Fecha,Total,Descuento,IVA,Estado) "
                + "VALUES(?,?,?,?,?,?,?);";
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

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

public class SQL_Ropa extends Conexion
{
    
    public boolean Agregar(Ropa ropa)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String consultaSQL = "INSERT INTO ropa(nombre, descripcion, precio_costo, precio_venta, ganancia, genero, marca, imagen, idtipoprenda)";
        consultaSQL += "VALUES(?,?,?,?,?,?,?,?,?) ;";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setString(1, ropa.getNombre());
          ps.setString(2, ropa.getDescripcion());
          ps.setDouble(3, ropa.getPrecio_costo());
          ps.setDouble(4, ropa.getPrecio_venta());
          ps.setDouble(5, ropa.getGanancia());
          ps.setString(6, ropa.getGenero());
          ps.setString(7, ropa.getMarca());
          ps.setString(8, ropa.getImagen());
          ps.setInt(9, ropa.getIdtipoprenda());
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
        String consultaSQL = "UPDATE ropa SET nombre = ?, descripcion = ?, precio_costo = ?, precio_venta = ?, ganancia = ?, genero = ?, marca = ?,imagen = ?, idtipoprenda = ? WHERE idropa = ?";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setString(1, ropa.getNombre());
          ps.setString(2, ropa.getDescripcion());
          ps.setDouble(3, ropa.getPrecio_costo());
          ps.setDouble(4, ropa.getPrecio_venta());
          ps.setDouble(5, ropa.getGanancia());
          ps.setString(6, ropa.getGenero());
          ps.setString(7, ropa.getMarca());
          ps.setString(8, ropa.getImagen());
          ps.setInt(9, ropa.getIdtipoprenda());
          ps.setInt(10, ropa.getIdropa());
          ps.executeUpdate();
          return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
    }
    
}

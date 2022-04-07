/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DataBase.Conexion;
import static DataBase.Conexion.getCon;
import Modelo.Opinion;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author gisel
 */
public class Opiniones {
    
    Conexion bd = new Conexion();
    
    public boolean Insertar(Opinion opinion)
    {
        Connection con = bd.getConexion();
        PreparedStatement ps = null;
        String consultaSQL = "INSERT INTO Opinion(Nombre, Opinion)";
        consultaSQL += "VALUES(?,?) ;";
         try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setString(1, opinion.getNombre());
          ps.setString(2, opinion.getOpinion());
          ps.executeUpdate();
          return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(Opiniones.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
        }
    
    public boolean Eliminar(Opinion opinion) {
        Connection con = getCon();
        String delete = "Delete from Opinion where idopinion = ?";
        PreparedStatement ps = null;
        try {
            ps= con.prepareStatement(delete);
            ps.setString(1, opinion.getOpinion());
            ps.executeUpdate();
            bd.Desconectar();
        } catch (Exception ex) {
            System.out.println(ex);
        } catch (Throwable ex) {
            Logger.getLogger(Opiniones.class.getName()).log(Level.SEVERE, null, ex);
        }
      //  bd.desconectar();
        return true;
    }
    
    public boolean Modificar(Opinion usr)
    {
        PreparedStatement ps = null;
        Connection con = getCon();
        String consultaSQL = "UPDATE Opinion SET nombre = ?, Opinion = ? WHERE idopinion = ?;";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          
          ps.setString(1, usr.getNombre());
          ps.setString(2, usr.getOpinion());
          ps.setInt(3, usr.getId());
          
          ps.executeUpdate();
          return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
    }
}

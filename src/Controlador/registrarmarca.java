/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DataBase.Conexion;
import static DataBase.Conexion.getCon;
import Modelo.Marca;
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
 * @author andreaas
 */
public class registrarmarca {
    
    Conexion bd = new Conexion();
   
    public boolean Insertar(Marca marca)
    {
        Connection con = bd.getConexion();
        PreparedStatement ps = null;
        String consultaSQL = "INSERT INTO Marca(Codigomarca, nombreMarca)";
        consultaSQL += "VALUES(?,?) ;";
         try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setInt(1, marca.getCodigomarca());
          ps.setString(2, marca.getNombremarca());
          ps.executeUpdate();
          return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(registrarmarca.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
        }

   public boolean Eliminar(Marca marca) {
        Connection con = getCon();
        String delete = "Delete from Marca where idMarca = ?";
        PreparedStatement ps = null;
        try {
            ps= con.prepareStatement(delete);
            ps.setInt(1, marca.getId());
            ps.executeUpdate();
            bd.Desconectar();
        } catch (Exception ex) {
            System.out.println(ex);
        } catch (Throwable ex) {
            Logger.getLogger(registrarmarca.class.getName()).log(Level.SEVERE, null, ex);
        }
      //  bd.desconectar();
        return true;
    }
   public boolean Modificar(Marca usr)
    {
        PreparedStatement ps = null;
        Connection con = getCon();
        String consultaSQL = "UPDATE Marca SET nombreMarca = ?, Codigomarca = ? WHERE idMarca = ?;";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setString(1, usr.getNombremarca());
          ps.setInt(2, usr.getCodigomarca());
          ps.setInt(3,usr.getId());
          
          ps.executeUpdate();
          return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
    }
   
    static DefaultTableModel dato;

    /*public static int etique_tabla() {
        String[] column = {"Codigo", "Nombre"};
        dato = new DefaultTableModel(null, column) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        return 0;
    }*/
      
 }

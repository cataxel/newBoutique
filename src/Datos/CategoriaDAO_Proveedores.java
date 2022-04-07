/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import DataBase.Conexion;
import Entidades.Categoria;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author axellopez
 */
public class CategoriaDAO_Proveedores {
    private final Conexion con;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean respuesta;
    
    public CategoriaDAO_Proveedores(){
        con = Conexion.getinstancia();
    }
    
   
    public List<Categoria> listar(String texto) {
        List<Categoria> registros = new ArrayList();
        try{
            ps = con.getConexion().prepareStatement("select * from Proveedor WHERE NombreProveedor like ?");
            ps.setString(1, "%" + texto +"%" );
            rs = ps.executeQuery();
            while(rs.next()){    
                registros.add(new Categoria(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getBoolean(6)));
            }
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps=null;
            rs=null;
            con.Desconectar();
        }
        
        return registros;
    }

   
    public boolean insertar(Categoria obj) {
        respuesta = false;
        String consulta = "insert into Proveedor(NombreProveedor, TelefonoProveedor, DireccionProveedor, NombreEmpresaProveedor, ActivoProveedor) values(?, ?, ?, ?,?)";
        try{
            ps = con.getConexion().prepareStatement(consulta);
            ps.setString(1,obj.getNombreProveedor());
            ps.setString(2, obj.getTelefonoProveedor());
            ps.setString(3, obj.getDireccionProveedor());
            ps.setString(4, obj.getNombreEmpresaProveedor());
            ps.setBoolean(5,true);
            
            if (ps.executeUpdate() > 0)
                respuesta = true;
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps=null;
            con.Desconectar();
        }
        return respuesta;
    }

 
    public boolean actualizar(Categoria obj) {
        respuesta = false;
        String consulta = "UPDATE Proveedor SET NombreProveedor=?, Telefonoproveedor=?,DireccionProveedor=?,NombreEmpresaProveedor=? WHERE CveProveedor = ?";
        try{
            ps = con.getConexion().prepareStatement(consulta);
            ps.setString(1,obj.getNombreProveedor());
            ps.setString(2, obj.getTelefonoProveedor());
            ps.setString(3, obj.getDireccionProveedor());
            ps.setString(4, obj.getNombreEmpresaProveedor());
            ps.setInt(5,obj.getIdProveedor());
            
            if (ps.executeUpdate() > 0)
                respuesta = true;
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps=null;
            con.Desconectar();
        }
        return respuesta;
    }

  
    public boolean desactivar(int id) {
        respuesta = false;
        String consulta = "UPDATE Proveedor SET ActivoProveedor=0 WHERE CveProveedor = ?";
        try{
            ps = con.getConexion().prepareStatement(consulta);
            ps.setInt(1,id);
            
            if (ps.executeUpdate() > 0)
                respuesta = true;
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps=null;
            con.Desconectar();
        }
        return respuesta;
    }

   
    public boolean activar(int id) {
        respuesta = false;
        String consulta = "UPDATE Proveedor SET ActivoProveedor=1 WHERE CveProveedor = ?";
        try{
            ps = con.getConexion().prepareStatement(consulta);
            ps.setInt(1,id);
            
            if (ps.executeUpdate() > 0)
                respuesta = true;
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps=null;
            con.Desconectar();
        }
        return respuesta;
    }

 
    public int total() {
        int numeroderegistros = 0;
        try{
            ps = con.getConexion().prepareStatement("SELECT COUNT(*) FROM Proveedor");
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
            con.Desconectar();
        }
        
        return numeroderegistros;
    }

  
    public boolean existe(String texto) {
        boolean respuest = false;
        try{
            ps = con.getConexion().prepareStatement("SELECT * FROM Proveedor WHERE NombreProveedor =?");
            ps.setString(1, texto);
            rs = ps.executeQuery();
            if(rs.next())
                respuest=true;
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps=null;
            rs=null;
            con.Desconectar();
        }
        
        return respuest;
    }
    
}

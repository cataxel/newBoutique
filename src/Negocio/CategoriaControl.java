/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;


import Datos.CategoriaDAO_Proveedores;
import Entidades.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author axel
 */
public class CategoriaControl {
    private final CategoriaDAO_Proveedores Datos;     
    private Categoria obj;
    private DefaultTableModel modelotabla;
    private int registrosMostrados;

    public CategoriaControl() {
        Datos = new CategoriaDAO_Proveedores();
        obj = new Categoria();
        registrosMostrados = 0;
    }
    public DefaultTableModel listar(String texto){
        List<Categoria> lista = new ArrayList();
        lista.addAll(Datos.listar(texto));
        
        //Crear el modelo y establecer los titulos del modelo
        String titulos[] = {"Id","Nombre","Teléfono","Dirección","Nombre Empresa","Imagen","Estatus"};
        modelotabla = new DefaultTableModel(null,titulos);
        
        //Recorrer los elementos de la lista con FOR EACH
        String registro[] = new String[7];
        registrosMostrados = 0;
        for(Categoria item:lista){
            registro[0] = Integer.toString(item.getIdProveedor());
            registro[1] = item.getNombreProveedor();
            registro[2] = item.getTelefonoProveedor();
            registro[3] = item.getDireccionProveedor();
            registro[4] = item.getNombreEmpresaProveedor();
//            registro[5] = item.getImagenProveedor();
            registro[5] = (item.isActivo() ? "Activo": "Inactivo");
            //insertar el registro en el modelo
            modelotabla.addRow(registro);
            registrosMostrados += 1;
            
        }
        return modelotabla;
    }
    public String insertar(String NombreProveedor, String TelefonoProveedor, String DireccionProveedor, String NombreEmpresaProveedor,String ImagenProveedor,boolean activo)
    {
        //verificar si existe la categoria
        if(Datos.existe(NombreProveedor))
            return "El registro ya existe";
        else{
            //llenar el objeto
            obj.setNombreProveedor(NombreProveedor);
            obj.setTelefonoProveedor(TelefonoProveedor);
            obj.setDireccionProveedor(DireccionProveedor);
            obj.setNombreEmpresaProveedor(NombreEmpresaProveedor);
//            obj.setImagenProveedor(ImagenProveedor);
            obj.setActivo(activo);
            //insertar el objeto en la BD
            if(Datos.insertar(obj))
                return "ok";
            else
                return "Error al insertar";
            
        }
    }
    public String actualizar(String NombreAnt,String NombreProveedor, String TelefonoProveedor, String DireccionProveedor, String NombreEmpresaProveedor,String ImagenProveedor,boolean activo) {
        //verificar si el usuario esta cambiando el nombre de la categoria
        if (NombreProveedor.equals(NombreAnt)) {
            //llenar el objeto
                obj.setNombreProveedor(NombreProveedor);
            obj.setTelefonoProveedor(TelefonoProveedor);
            obj.setDireccionProveedor(DireccionProveedor);
            obj.setNombreEmpresaProveedor(NombreEmpresaProveedor);
//            obj.setImagenProveedor(ImagenProveedor);
            obj.setActivo(activo);
                //actualizar el objeto en la BD
                if (Datos.actualizar(obj)) {
                    return "ok";
                } else {
                    return "error al actualizar";
                }
        } else {
            if (!Datos.existe(NombreProveedor)) {
                return "El nombre del proveedor no existe";
            } else {
                //llenar el objeto
                obj.setNombreProveedor(NombreProveedor);
            obj.setTelefonoProveedor(TelefonoProveedor);
            obj.setDireccionProveedor(DireccionProveedor);
            obj.setNombreEmpresaProveedor(NombreEmpresaProveedor);
//            obj.setImagenProveedor(ImagenProveedor);
            obj.setActivo(activo);
                //actualizar el objeto en la BD
                if (Datos.actualizar(obj)) {
                    return "ok";
                } else {
                    return "Error al actualizar";
                }
            }
        }
    }
    public String desactivar(int id){
        return (Datos.desactivar(id)?"OK":"No se pudo desactivar el registro");
    }
    public String activar(int id){
        return (Datos.activar(id)?"OK":"No se pudo activar el registro");
    }
    public int total(){
        return Datos.total();
    }
    public int totaalMostrados(){
        return registrosMostrados;
    }
}

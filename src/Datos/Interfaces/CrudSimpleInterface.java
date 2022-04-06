/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Datos.Interfaces;

import java.util.List;

/**
 *
 * @author axellopez
 */
public interface CrudSimpleInterface<T> {
    public List<T> listar(String texto); // regresa un listado de tipo list de objetos t
    public boolean insertar(T obj); // inserta un objeto de tipo t
    public boolean actualizar(T obj); // actualizar un registro de acuerdo a un objeto de tipo t
    public boolean desactivar(int id); // desactiva un borrado logico 
    public boolean activar(int id); // activa un registro borrado logicamente
    public int total(); //regresa el total de registros de una tabla
    public boolean existe(String texto); //regresar true/false si existe un registro
}

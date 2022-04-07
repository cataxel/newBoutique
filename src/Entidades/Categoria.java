/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author axellopez
 */
public class Categoria {
    private int IdProveedor;
    private String NombreProveedor;
    private String TelefonoProveedor ;
    private String DireccionProveedor;
    private String NombreEmpresaProveedor;
    private boolean activo;
    
//constructores

    public Categoria() {
        
    }

    public Categoria(int IdProveedor, String NombreProveedor, String TelefonoProveedor, String DireccionProveedor, String NombreEmpresaProveedor, boolean activo) {
        this.IdProveedor= IdProveedor;
        this.NombreProveedor= NombreProveedor;
        this.TelefonoProveedor = TelefonoProveedor ;
        this.DireccionProveedor= DireccionProveedor;
        this.NombreEmpresaProveedor= NombreEmpresaProveedor;
        this.activo = activo;
    }

    public String getDireccionProveedor() {
        return DireccionProveedor;
    }

    public void setDireccionProveedor(String DireccionProveedor) {
        this.DireccionProveedor = DireccionProveedor;
    }
    
// setters and getters 

    public int getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(int IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    public String getNombreProveedor() {
        return NombreProveedor;
    }

    public void setNombreProveedor(String NombreProveedor) {
        this.NombreProveedor = NombreProveedor;
    }

    public String getTelefonoProveedor() {
        return TelefonoProveedor;
    }

    public void setTelefonoProveedor(String TelefonoProveedor) {
        this.TelefonoProveedor = TelefonoProveedor;
    }

    

    public String getNombreEmpresaProveedor() {
        return NombreEmpresaProveedor;
    }

    public void setNombreEmpresaProveedor(String NombreEmpresaProveedor) {
        this.NombreEmpresaProveedor = NombreEmpresaProveedor;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    

    @Override
    public String toString() {
        return "Proveedores{" + "IdProveedor=" + IdProveedor+ ", NombreProveedor=" + NombreProveedor + ", TelefonoProveedor =" + TelefonoProveedor  + ", DireccionProveedor=" + DireccionProveedor + ", NombreEmpresaProveedor=" + NombreEmpresaProveedor + ", activo=" + activo + '}';
    }
}

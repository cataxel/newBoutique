/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DELL
 */
public class Compras {
    private int IdCompra, IdProveedor;
    private String FechaCompra, MontoCompra, DescripcionCompra;

    public int getIdCompra() {
        return IdCompra;
    }

    public void setIdCompra(int IdCompra) {
        this.IdCompra = IdCompra;
    }

    public int getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(int IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    public String getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(String FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public String getMontoCompra() {
        return MontoCompra;
    }

    public void setMontoCompra(String MontoCompra) {
        this.MontoCompra = MontoCompra;
    }

    public String getDescripcionCompra() {
        return DescripcionCompra;
    }

    public void setDescripcionCompra(String DescripcionCompra) {
        this.DescripcionCompra = DescripcionCompra;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.compraventa;

import java.util.List;

/**
 *
 * @author Silvia
 */
public class Detalle {
    private int id;
    private String cantidad;
    private List <Factura> idFactura;
    private List <Producto> idProducto;
    
    public Detalle(){
        
    }

    public Detalle(int id, String cantidad, List<Factura> idFactura, List<Producto> idProducto) {
        this.id = id;
        this.cantidad = cantidad;
        this.idFactura = idFactura;
        this.idProducto = idProducto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public List<Factura> getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(List<Factura> idFactura) {
        this.idFactura = idFactura;
    }

    public List<Producto> getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(List<Producto> idProducto) {
        this.idProducto = idProducto;
    }
    
}

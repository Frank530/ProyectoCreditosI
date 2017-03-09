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
public class Factura {
    private int id;
    private String numFactura;
    private String fecha;
    private List <Cliente> idCliente;
    public Factura(){
        
    }

    public Factura(int id, String numFactura, String fecha, List<Cliente> idCliente) {
        this.id = id;
        this.numFactura = numFactura;
        this.fecha = fecha;
        this.idCliente = idCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Cliente> getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(List<Cliente> idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
}

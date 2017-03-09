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
public class Producto {
    private int id;
    private String descripcion;
    private int valor;
    private List <Categoria> idCategoria;
    
    public Producto(){
        
    }

    public Producto(int id, String descripcion, int valor, List<Categoria> idCategoria) {
        this.id = id;
        this.descripcion = descripcion;
        this.valor = valor;
        this.idCategoria = idCategoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public List<Categoria> getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(List<Categoria> idCategoria) {
        this.idCategoria = idCategoria;
    }
            
            
}

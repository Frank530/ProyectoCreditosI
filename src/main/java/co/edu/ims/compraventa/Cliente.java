/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.compraventa;

/**
 *
 * @author Silvia
 */
public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private int cedula;
    private String ciudad;
    private String telefono;
    
    public Cliente(){
        
    }

    public Cliente(int id, String nombre, String direccion, int cedula, String ciudad, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cedula = cedula;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}

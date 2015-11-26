/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

/**
 *
 * @author Parisan
 */
public class Producto_unidad {
    private int id_unidad;
    private int id_producto;
    private int nro_unidades;
    private double precio;

    public Producto_unidad() {
    }

    public int getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(int id_unidad) {
        this.id_unidad = id_unidad;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getNro_unidades() {
        return nro_unidades;
    }

    public void setNro_unidades(int nro_unidades) {
        this.nro_unidades = nro_unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}

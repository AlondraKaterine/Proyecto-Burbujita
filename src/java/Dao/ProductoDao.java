/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Entidad.Persona;
import Entidad.Producto;
import java.util.List;

/**
 *
 * @author Parisan
 */
public interface ProductoDao {
    public boolean agregarProducto(Producto producto);
    public List<Producto> listarProducto(String buscar);
    public boolean eliminarProducto(int id_producto);
    public boolean actualizarProducto(Producto producto);
}

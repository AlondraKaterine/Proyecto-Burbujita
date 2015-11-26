/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Entidad.Producto;
import Entidad.Proveedor;
import java.util.List;

/**
 *
 * @author Parisan
 */
public interface ProveedorDao {
     public boolean agregarProveedor(Proveedor proveedor);
    public List<Proveedor> listarProveedor();
    public boolean eliminarProveedor(int id_proveedor);
    public boolean actualizarProveedor(Proveedor proveedor);
}

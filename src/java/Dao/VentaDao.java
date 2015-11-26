/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Entidad.Persona;
import Entidad.Venta;
import java.util.List;

/**
 *
 * @author Parisan
 */
public interface VentaDao {
    public boolean agregarVenta(Venta venta);
    public List<Venta> listarVenta();
    public boolean eliminarVenta(int id_venta);
    public boolean actualizarVenta(Venta venta);
}

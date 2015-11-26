/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Entidad.Cliente;
import Entidad.Compra;
import java.util.List;

/**
 *
 * @author Parisan
 */
public interface CompraDao {
     public boolean agregarCompra(Compra compra);
    public List<Compra> listarCompra();
    public boolean eliminarCompra(int id_compra);
    public boolean actualizarCompra(Compra compra);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidad.Producto;
import Entidad.Unidad_medida;
import java.util.List;

/**
 *
 * @author Liliana
 */
public interface UnidadMedidaDao {

    public boolean agregarUnidadMedida(Unidad_medida unidad_medida);

    public List<Unidad_medida> listarUnidadMedida(String buscar);

    public boolean eliminarUnidadMedida(int id_unidad_medida);

    public boolean actualizarUnidadMedida(Unidad_medida unidad_medida);
}

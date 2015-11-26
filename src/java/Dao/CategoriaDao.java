/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidad.Categoria;
import Entidad.Cliente;
import java.util.List;

/**
 *
 * @author Liliana
 */
public interface CategoriaDao {

    public boolean agregarCategoria(Categoria categoria);

    public List<Categoria> listarCategoria(String buscar);

    public boolean eliminarCategoria(String id_categoria);

    public Categoria DatosCategoria(String id_categoria);

    public boolean actualizarCategoria(Categoria categoria);
}

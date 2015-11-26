/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Entidad.Persona;
import Entidad.Usuario;
import java.util.List;

/**
 *
 * @author Parisan
 */
public interface UsuarioDao {
    public boolean agregarUsuario(Usuario usuario);
    public List<Usuario> listarUsuario();
    public boolean eliminarUsuario(int id_usuario);
    public boolean actualizarUsuario(Usuario usuario);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Entidad.Cliente;
import Entidad.Persona;
import java.util.List;

/**
 *
 * @author Parisan
 */
public interface ClienteDao {
    public boolean agregarCliente(Cliente cliente);
    public List<Cliente> listarCliente();
    public boolean eliminarCliente(int id_cliente);
    public boolean actualizarCliente(Cliente cliente);
}

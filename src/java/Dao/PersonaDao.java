/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Entidad.Persona;
import java.util.List;

/**
 *
 * @author Parisan
 */
public interface PersonaDao {
    public boolean agregarPersona(Persona persona);
    public List<Persona> listarPersona();
    public boolean eliminarPersona(int id_persona);
    public boolean actualizarPersona(Persona persona);
}

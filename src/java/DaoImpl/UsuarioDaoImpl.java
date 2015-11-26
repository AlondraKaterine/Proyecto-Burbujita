/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DaoImpl;

import Conexion.conexionMYSQL;
import Dao.PersonaDao;
import Dao.UsuarioDao;
import Entidad.Persona;
import Entidad.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Parisan
 */
public class UsuarioDaoImpl implements UsuarioDao {
    conexionMYSQL cn= new conexionMYSQL();
   

    @Override
    public boolean agregarUsuario(Usuario usuario) {
        boolean flat=false;
        Statement st=null;
        String query="INSERT INTO persona VALUES (0,'"+usuario.getUsuario()+"','"+usuario.getPassword()+"','"+usuario.getRol()+"','"+usuario.getEstado()+"')";
        try {
            st=cn.conexion().createStatement();
            st.executeUpdate(query);
            
            cn.conexion().getAutoCommit();
            cn.conexion().close();
            flat=true;
            } catch (Exception e) {
                 System.out.println("ERROR:"+e.getMessage());
                 try {
                     cn.conexion().rollback();
                     cn.conexion().close();
            } catch (Exception ex) {
            }
       }finally{
            if (cn.conexion() !=null) 
                try {
                    cn.conexion().rollback();
                    cn.conexion().close();
                } catch (Exception e) {
                }
{
                
            }
                } return flat;
    
    
    }

    @Override
    public List<Usuario> listarUsuario() {
        List<Usuario> lista=null;
        Statement st=null;
        ResultSet rs=null;
        Usuario usu=null;
        String query="select * from persona";
        try {
            lista = new ArrayList<>();
            st= cn.conexion().createStatement();
            rs=st.executeQuery(query);
            while (rs.next()) {
                
                usu =new Usuario();
               
                usu.setUsuario(rs.getString("Usuario"));
                usu.setPassword(rs.getString("Password"));
                usu.setRol(rs.getString("Rol"));
//              per.setFecha_nac(rs.getNString("yyyy-mm-dd"));
                usu.setEstado(rs.getString("Estado"));
                
                lista.add(usu);
            }
            cn.cerrar();
        } catch (Exception e) {
            System.out.println("ERROR:"+e.getMessage());
            e.printStackTrace();
           cn.cerrar();
        }
        return lista;
    
    }
  

    @Override
    public boolean eliminarUsuario(int id_usuario) {
        boolean flat=false;
        String query="DELETE FROM persona WHERE id_persona="+id_usuario+"";
        Statement st=null;
        try {
            st=cn.conexion().createStatement();
            st.executeUpdate(query);
            cn.guardar();
            cn.cerrar();
            flat=true;
        } catch (Exception e) {
            cn.restaurar();
            cn.cerrar();
            System.out.println("ERROR"+e.getMessage());
        }finally{
            if (cn.conexion()!=null) {
                
             
            cn.cerrar();
                
            }
        }
       
    return  flat;
    
    }

    @Override
    public boolean actualizarUsuario(Usuario usuario) {
         boolean flat=false;
          String query="UPDATE persona SET Usuario='"+usuario.getUsuario()+"',Password='"+usuario.getPassword()+"',Rol='"+usuario.getRol()+"',Estado='"+usuario.getEstado()+"')";
          Statement st=null;
        try {
            st=cn.conexion().createStatement();
            st.executeUpdate(query);
            cn.guardar();
            cn.cerrar();
            flat=true;
        } catch (Exception e) {
            cn.restaurar();
            cn.cerrar();
            System.out.println("ERROR"+e.getMessage());
        }finally{
            if (cn.conexion()!=null) {
                cn.cerrar();
            }
        }
        
         return flat;
    }
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DaoImpl;

import Conexion.conexionMYSQL;
import Dao.PersonaDao;
import Entidad.Persona;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class PersonaDaoImpl implements PersonaDao{
    conexionMYSQL cn= new conexionMYSQL();

    @Override
    public boolean agregarPersona(Persona persona) {
        boolean flat=false;
        Statement st=null;
        String query="INSERT INTO persona VALUES (0,'"+persona.getNombre()+"','"+persona.getApell_pater()+"','"+persona.getApell_mater()+"','"+persona.getDireccion()+"','"+persona.getCorreo()+"','"+persona.getTelefono()+"','"+persona.getCelular()+"','"+persona.getRuc()+"','"+persona.getNro_documento()+"','"+persona.getTipo_persona()+"','"+persona.getTipo_documento()+"','"+persona.getGenero()+"')";

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
    public List<Persona> listarPersona() {
        List<Persona> lista=null;
        Statement st=null;
        ResultSet rs=null;
        Persona p=null;
        String query="select * from persona";
        try {
            lista = new ArrayList<>();
            st= cn.conexion().createStatement();
            rs=st.executeQuery(query);
            while (rs.next()) {
                
                p =new Persona();
                p.setId_persona(rs.getInt("id_persona"));
                p.setNombre(rs.getString("nombre"));
                p.setApell_pater(rs.getString("apell_pater"));
                p.setApell_mater(rs.getNString("apell_mater"));
//              per.setFecha_nac(rs.getNString("yyyy-mm-dd"));
                p.setDireccion(rs.getNString("direccion"));
                p.setCorreo(rs.getString("correo"));
                p.setTelefono(rs.getString("telefono"));
                p.setCelular(rs.getString("celular"));
                p.setRuc(rs.getString("ruc"));
                p.setNro_documento(rs.getInt("nro_documento"));
                p.setTipo_persona(rs.getString("tipo_persona"));
                p.setTipo_documento(rs.getString("tipo_documento"));
                p.setGenero(rs.getString("genero"));
                lista.add(p);
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
    public boolean eliminarPersona(int id_persona) {
        
       boolean flat=false;
       String query="DELETE FROM persona WHERE id_persona="+id_persona+"";
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
    public boolean actualizarPersona(Persona persona) {
          boolean flat=false;
          String query="UPDATE persona SET nombre='"+persona.getNombre()+"',"
                  + "apell_pater='"+persona.getApell_pater()+"',"
                  + "apell_mater='"+persona.getApell_mater()+"',"
                  + "direccion='"+persona.getDireccion()+"',"
                  + "correo='"+persona.getCorreo()+"',"
                  + "telefono="+persona.getTelefono()+","
                  + "celular='"+persona.getCelular()+"',"
                  + "ruc='"+persona.getRuc()+"',"
                  + "nro_documento ='"+persona.getNro_documento()+"',"
                  + "tipo_persona='"+persona.getTipo_persona()+"'," 
                  + "tipo_documento ='"+persona.getTipo_documento()+"'," 
                  + "genero ='"+persona.getGenero()+"' WHERE id_persona ="+persona.getId_persona()+"";
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
  

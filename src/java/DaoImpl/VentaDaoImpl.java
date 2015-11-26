/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DaoImpl;

import Conexion.conexionMYSQL;
import Dao.VentaDao;
import Entidad.Persona;
import Entidad.Venta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Parisan
 */
public class VentaDaoImpl implements VentaDao {
    conexionMYSQL cn= new conexionMYSQL();
     

    @Override
    public boolean agregarVenta(Venta venta) {
         boolean flat=false;
        Statement st=null;
        //String query="INSERT INTO persona VALUES (0,'"+persona.getNombre()+"','"+persona.getApepat()+"','"+persona.getApemat()+"','"+persona.getFecha_nac()+"','"+persona.getSexo()+"','"+persona.getDni()+"','"+persona.getCelular()+"','"+persona.getTelefono()+"','"+persona.getDireccion()+"')";
        try {
            st=cn.conexion().createStatement();
            st.executeUpdate(cn.query);
            
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
    /*public List<Venta> listarVenta() {
        List<Venta> lista=null;
        Statement st=null;
        ResultSet rs=null;
        Venta ve=null;
        String query="select * from persona";
        try {
            lista = new ArrayList<>();
            st= conexion().createStatement();
            rs=st.executeQuery(query);
            while (rs.next()) {
                
                ve =new Venta();
                ve.setId_persona(rs.getInt("id_persona"));
                ve.setNombre(rs.getString("nombre"));
                ve.setApepat(rs.getString("apepat"));
                ve.setApemat(rs.getNString("apemat"));
//              per.setFecha_nac(rs.getNString("yyyy-mm-dd"));
                ve.setSexo(rs.getNString("sexo"));
                ve.setDni(rs.getInt("dni"));
                ve.setCelular(rs.getInt("celular"));
                ve.setTelefono(rs.getInt("telefono"));
                ve.setDireccion(rs.getString("direccion"));
                lista.add(ve);
            }
            cerrar();
        } catch (Exception e) {
            System.out.println("ERROR:"+e.getMessage());
            e.printStackTrace();
           cerrar();
        }
        return lista;
    
    }*/
    
    @Override
    public boolean eliminarVenta(int id_venta) {
      boolean flat=false;
       String query="DELETE FROM persona WHERE id_persona="+id_venta+"";
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
    }
   /* @Override
    public boolean actualizarVenta(Venta venta) {
         boolean flat=false;
          String query="UPDATE persona SET nombre='"+persona.getNombre()+"',apepat='"+persona.getApepat()+"',apemat='"+persona.getApemat()+"',fecha_nac='"+persona.getFecha_nac()+"',sexo='"+persona.getSexo()+"',dni="+persona.getDni()+",celular='"+persona.getCelular()+"',telefono='"+persona.getTelefono()+"',direccion ='"+persona.getDireccion()+"' WHERE id_persona ="+persona.getId_persona()+"";
          Statement st=null;
        try {
            st=conexion().createStatement();
            st.executeUpdate(query);
            guardar();
            cerrar();
            flat=true;
        } catch (Exception e) {
            restaurar();
            cerrar();
            System.out.println("ERROR"+e.getMessage());
        }finally{
            if (conexion()!=null) {
                cerrar();
            }
        }
        
         return flat;
    }
    }
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DaoImpl;

import Conexion.conexionMYSQL;
import Dao.ClienteDao;
import Entidad.Cliente;
import Entidad.Persona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoImpl implements ClienteDao{
    conexionMYSQL cn= new conexionMYSQL();

    @Override
    public boolean agregarCliente(Cliente cliente) {
       boolean flat=false;
       Statement st=null;
       String query="INSERT INTO cliente VALUES (0,'"+cliente.getId_persona()+"','"+cliente.getEstado()+"')";
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
    public List<Cliente> listarCliente() {
       List<Cliente> lista=null;
        Statement st=null;
        ResultSet rs=null;
        Cliente cl=null;
        String query="select * from persona";
        try {
            lista = new ArrayList<>();
            st= cn.conexion().createStatement();
            rs=st.executeQuery(query);
            while (rs.next()) {
                
                cl =new Cliente();
                cl.setId_persona(rs.getInt("id_persona"));
                cl.setEstado(rs.getString("estado"));
                lista.add(cl);
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
    public boolean eliminarCliente(int id_cliente) {
       boolean flat=false;
       String query="DELETE FROM persona WHERE id_persona="+id_cliente+"";
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
    public boolean actualizarCliente(Cliente cliente) {
       boolean flat=false;
       String query="UPDATE persona SET nombre='"+cliente.getId_persona()+"','"+cliente.getEstado()+"')";
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


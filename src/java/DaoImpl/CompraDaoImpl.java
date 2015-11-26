

package DaoImpl;

import Conexion.conexionMYSQL;
import Dao.CompraDao;
import Entidad.Compra;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CompraDaoImpl implements CompraDao{
    conexionMYSQL cn= new conexionMYSQL();

    @Override
    public boolean agregarCompra(Compra compra) {
       boolean flat=false;
       Statement st=null;
       String query="INSERT INTO compra VALUES (0,'"+compra.getFecha_registro()+"',"
               + "'"+compra.getHora_registro()+"',"
               + "'"+compra.getNro_comprobante()+"',"
               + "'"+compra.getIgv_porcentaje()+"',"
               + "'"+compra.getFecha_emision()+"',"
               + "'"+compra.getId_persona()+"',"
               + "'"+compra.getId_comprobante()+"',"
               + "'"+compra.getMonto_total()+"',"
               + "'"+compra.getId_proveedor()+"',"
               + "'"+compra.getFlete()+"'"
               + "'"+compra.getEstado()+"' )";
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
    public List<Compra> listarCompra() {
      List<Compra> lista=null;
        Statement st=null;
        ResultSet rs=null;
        Compra co=null;
        String query="select * from compra";
        try {
            lista = new ArrayList<>();
            st= cn.conexion().createStatement();
            rs=st.executeQuery(query);
            while (rs.next()) {
                
                co =new Compra();
                co.setId_compra(rs.getInt("id_pcompra"));
                co.setFecha_registro(rs.getString("fecha_registro"));
                co.setHora_registro(rs.getString("hora_registro"));
                co.setNro_comprobante(rs.getNString("nro_comprobante"));
//              per.setFecha_nac(rs.getNString("yyyy-mm-dd"));
                co.setIgv_porcentaje(rs.getNString("igv_porcentaje"));
                co.setFecha_emision(rs.getString("fecha_emision"));
                co.setId_persona(rs.getInt("id_persona"));
                co.setId_comprobante(rs.getInt("id_comprobante"));
                co.setMonto_total(rs.getInt("monto_total"));
                co.setId_proveedor(rs.getInt("id_proveedor"));
                co.setFlete(rs.getInt("flete"));
                co.setEstado(rs.getString("estado"));
                lista.add(co);
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
    public boolean eliminarCompra(int id_compra) {
       boolean flat=false;
       String query="DELETE FROM compra WHERE id_compra="+id_compra+"";
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
    public boolean actualizarCompra(Compra compra) {
       boolean flat=false;
       String query="UPDATE persona SET fecha_registro='"+compra.getFecha_registro()+"',"
               + "hora_registro='"+compra.getHora_registro()+"',"
               + "nro_comprobante='"+compra.getNro_comprobante()+"',"
               + "igv_porcentaje='"+compra.getIgv_porcentaje()+"',"
               + "fecha_emision='"+compra.getFecha_emision()+"',"
               + "id_persona="+compra.getId_persona()+","
               + "id_comprobante='"+compra.getId_comprobante()+"',"
               + "monto_total='"+compra.getMonto_total()+"',"
               + "id_proveedor='"+compra.getId_proveedor()+"',"
               + "flete='"+compra.getFlete()+"',"
               + "id_proveedor ='"+compra.getId_proveedor()+"' WHERE id_persona ="+compra.getId_compra()+"";
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


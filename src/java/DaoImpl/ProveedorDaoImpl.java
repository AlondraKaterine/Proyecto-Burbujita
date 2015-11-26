/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import Conexion.conexionMYSQL;
import Dao.ProveedorDao;
import Entidad.Persona;
import Entidad.Proveedor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Parisan
 */
public class ProveedorDaoImpl implements ProveedorDao {

    conexionMYSQL cn = new conexionMYSQL();

    @Override
    public boolean agregarProveedor(Proveedor proveedor) {
        boolean flat = false;
        Statement st = null;
        String query = "INSERT INTO persona VALUES (0,'" + proveedor.getNombre() + "','" + proveedor.getCorreo() + "','" + proveedor.getDireccion() + "','" + proveedor.getTelefono_celular() + "','" + proveedor.getRuc() + "','" + proveedor.getEstado() + "')";
        try {
            st = cn.conexion().createStatement();
            st.executeUpdate(query);

            cn.conexion().getAutoCommit();
            cn.conexion().close();
            flat = true;
        } catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
            try {
                cn.conexion().rollback();
                cn.conexion().close();
            } catch (Exception ex) {
            }
        } finally {
            if (cn.conexion() != null) {
                try {
                    cn.conexion().rollback();
                    cn.conexion().close();
                } catch (Exception e) {
                }
            }
            {

            }
        }
        return flat;

    }

    @Override
    public List<Proveedor> listarProveedor() {
        List<Proveedor> lista = null;
        Statement st = null;
        ResultSet rs = null;
        Proveedor prove = null;
        String query = "select * from persona";
        try {
            lista = new ArrayList<>();
            st = cn.conexion().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {

                prove = new Proveedor();
                prove.setId_proveedor(rs.getInt("Id_proveedor"));
                prove.setNombre(rs.getString("nombre"));
                prove.setCorreo(rs.getString("Correo"));
                prove.setDireccion(rs.getString("Santa lucia"));
                prove.setTelefono_celular(rs.getString("987657687"));
                prove.setRuc(rs.getString("976323467"));
                prove.setEstado(rs.getString("1"));

                lista.add(prove);
            }
            cn.cerrar();
        } catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
            e.printStackTrace();
            cn.cerrar();
        }
        return lista;

    }

    @Override
    public boolean eliminarProveedor(int id_proveedor) {
        boolean flat = false;
        String query = "DELETE FROM persona WHERE id_persona=" + id_proveedor + "";
        Statement st = null;
        try {
            st = cn.conexion().createStatement();
            st.executeUpdate(query);
            cn.guardar();
            cn.cerrar();
            flat = true;
        } catch (Exception e) {
            cn.restaurar();
            cn.cerrar();
            System.out.println("ERROR" + e.getMessage());
        } finally {
            if (cn.conexion() != null) {

                cn.cerrar();

            }
        }

        return flat;

    }

    @Override
    public boolean actualizarProveedor(Proveedor proveedor) {
        boolean flat = false;
        String query = "UPDATE proveedor SET nombre='" + proveedor.getNombre() + "',Correo='" + proveedor.getCorreo() + "',Direccion='" + proveedor.getDireccion() + "',Telefono_celular='" + proveedor.getTelefono_celular() + "',Ruc='" + proveedor.getRuc() + "',Estado=" + proveedor.getEstado() + "' WHERE id_persona =" + proveedor.getId_persona() + "";
        Statement st = null;
        try {
            st = cn.conexion().createStatement();
            st.executeUpdate(query);
            cn.guardar();
            cn.cerrar();
            flat = true;
        } catch (Exception e) {
            cn.restaurar();
            cn.cerrar();
            System.out.println("ERROR" + e.getMessage());
        } finally {
            if (cn.conexion() != null) {
                cn.cerrar();
            }
        }

        return flat;
    }
}

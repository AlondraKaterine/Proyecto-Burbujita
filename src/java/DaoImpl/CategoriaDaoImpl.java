/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import Conexion.conexionMYSQL;
import Dao.CategoriaDao;
import Entidad.Categoria;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Liliana
 */
public class CategoriaDaoImpl implements CategoriaDao {

    conexionMYSQL cn = new conexionMYSQL();

    @Override
    public boolean agregarCategoria(Categoria cat) {
        boolean flat = false;
        Statement st = null;
        String query = "INSERT INTO categoria(id_categoria, nombre, descripcion, estado) "
                + " VALUES("+cat.getId_categoria()+",'" + cat.getNombre() + "','" + cat.getDescripcion() + "','" + cat.getEstado() + "')";
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
        }

        return flat;

    }

    @Override
    public List<Categoria> listarCategoria(String buscar) {

        List<Categoria> lista = null;
        Statement st = null;
        ResultSet rs = null;
        Categoria ca = null;
        String query = "select "
                + " id_categoria,"
                + " nombre,"
                + " descripcion,"
                + " case estado"
                + " when '1' then 'Activo' "
                + " else 'Desactivo' "
                + " end estado,"
                + " id_linea "
                + " from categoria"
                + " where UPPER(nombre) like ('%" + buscar + "%')";
        System.out.println(query);
        try {
            lista = new ArrayList<>();
            st = cn.conexion().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {

                ca = new Categoria();
                ca.setId_categoria(rs.getInt("id_categoria"));
                ca.setNombre(rs.getString("nombre"));
                ca.setDescripcion(rs.getString("descripcion"));
                ca.setEstado(rs.getString("estado"));
                ca.setId_linea(rs.getInt("id_linea"));
                lista.add(ca);
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
    public boolean eliminarCategoria(String id_categoria) {
        boolean flat = false;
        String query = "DELETE FROM categoria WHERE id_categoria=" + id_categoria;
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
    public boolean actualizarCategoria(Categoria cat) {
        boolean flat = false;
        String query = "UPDATE categoria SET nombre='" + cat.getNombre() + "',"
                + " descripcion='" + cat.getDescripcion()+ "',"
                + " estado='" + cat.getEstado() + "' "
                + " where "
                + " id_categoria="+cat.getId_categoria();
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
    public Categoria DatosCategoria(String id_categoria) {

        Statement st = null;
        ResultSet rs = null;
        Categoria ca = null;
        String query = "select "
                + " id_categoria,"
                + " nombre,"
                + " descripcion,"
                + " estado "
                + " from categoria"
                + " where id_categoria=" + id_categoria;
        System.out.println(query);
        ca = new Categoria();

        try {
            st = cn.conexion().createStatement();
            rs = st.executeQuery(query);
            rs.next();

            ca.setId_categoria(rs.getInt("id_categoria"));
            ca.setNombre(rs.getString("nombre"));
            ca.setDescripcion(rs.getString("descripcion"));
            ca.setEstado(rs.getString("estado"));
            ca.setId_linea(rs.getInt("id_linea"));
            cn.cerrar();
        } catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
            e.printStackTrace();
            cn.cerrar();
        }
        return ca;

    }
}

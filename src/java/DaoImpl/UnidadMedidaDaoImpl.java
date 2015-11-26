/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import Conexion.conexionMYSQL;
import Dao.UnidadMedidaDao;
import Entidad.Producto;
import Entidad.Unidad_medida;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Liliana
 */
public class UnidadMedidaDaoImpl implements UnidadMedidaDao {

    conexionMYSQL cn = new conexionMYSQL();

    @Override
    public boolean agregarUnidadMedida(Unidad_medida unidad_medida) {
        boolean flat = false;
        Statement st = null;
        String query = "INSERT INTO unidad_medida VALUES (0,'" + unidad_medida.getNombre() + "',"
                + "'" + unidad_medida.getAbreviatura() + "')";
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
    public List<Unidad_medida> listarUnidadMedida(String buscar) {
        List<Unidad_medida> lista = null;
        Statement st = null;
        ResultSet rs = null;
        Unidad_medida um = null;
        String query = "select "
                + " id_unidad_medida,"
                + " nombre,"
                + " abreviatura"
                + " from unidad_medida"
                + " where UPPER(nombre) like ('%"+buscar+"%')";
        System.out.println(query);
        try {
            lista = new ArrayList<>();
            st = cn.conexion().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {

                um = new Unidad_medida();
                um.setId_unidad_medida(rs.getInt("id_unidad_medida"));
                um.setNombre(rs.getString("nombre"));
                um.setAbreviatura(rs.getString("abreviatura"));

                lista.add(um);
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
    public boolean eliminarUnidadMedida(int id_unidad_medida) {
        boolean flat = false;
        String query = "DELETE FROM unidad_medida WHERE id_unidad_medida=" + id_unidad_medida + "";
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
    public boolean actualizarUnidadMedida(Unidad_medida unidad_medida) {
        boolean flat = false;
        String query = "UPDATE unidad_medida SET Nombre:='" + unidad_medida.getNombre() + "',"
                + "Abreviatura:='" + unidad_medida.getAbreviatura() + "";
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

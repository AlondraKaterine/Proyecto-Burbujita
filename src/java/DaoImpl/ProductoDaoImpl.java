/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import Conexion.conexionMYSQL;
import Dao.ProductoDao;
import Entidad.Persona;
import Entidad.Producto;
//import coneccion_mysql.Coneccion_mysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Parisan
 */
public class ProductoDaoImpl implements ProductoDao {

    conexionMYSQL cn = new conexionMYSQL();

    @Override
    public boolean agregarProducto(Producto producto) {
        boolean flat = false;
        Statement st = null;
        String query = "INSERT INTO producto VALUES (0,'" + producto.getCodigo() + "',"
                + "'" + producto.getNombre() + "',"
                + "'" + producto.getId_categoria() + "',"
                + "'" + producto.getPresentacion() + "',"
                + "'" + producto.getMarca() + "',"
                + "'" + producto.getModelo() + "',"
                + "'" + producto.getId_unidad_medida() + "',"
                + "'" + producto.getPrecio_compra() + "',"
                + "'" + producto.getEstado() + "')";
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
    public List<Producto> listarProducto(String buscar) {
        List<Producto> lista = null;
        Statement st = null;
        ResultSet rs = null;
        Producto pro = null;
        String query = "select "
                + " pr.id_producto,"
                + " pr.codigo,"
                + " pr.nombre,"
                + " cat.nombre nombre_categoria,"
                + " pr.presentacion,"
                + " pr.marca,"
                + " pr.modelo,"
                + " um.nombre nombre_unidad_medida,"
                + " pr.precio_compra,"
                + " case pr.estado "
                + " when '1' then 'Activo' "
                + " else 'Desactivo' "
                + " end estado "
                + " from producto pr,"
                + " categoria cat, "
                + " unidad_medida um "
                + " where "
                + " pr.id_categoria=cat.id_categoria and "
                + " pr.id_unidad_medida=um.id_unidad_medida and "
                + " UPPER(pr.nombre) like ('%" + buscar + "%')";
        System.out.println(query);
        try {
            lista = new ArrayList<>();
            st = cn.conexion().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {

                pro = new Producto();
                pro.setId_producto(rs.getInt("id_producto"));
                pro.setCodigo(rs.getString("codigo"));
                pro.setNombre(rs.getString("nombre"));
                pro.setNombre_categoria(rs.getString("nombre_categoria"));
//              per.setFecha_nac(rs.getNString("yyyy-mm-dd"));
                pro.setPresentacion(rs.getNString("presentacion"));
                pro.setMarca(rs.getString("marca"));
                pro.setModelo(rs.getString("modelo"));
                pro.setNombre_unidad_medida(rs.getString("nombre_unidad_medida"));
                pro.setPrecio_compra(rs.getInt("precio_compra"));
                pro.setEstado(rs.getString("estado"));
                lista.add(pro);
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
    public boolean eliminarProducto(int id_producto) {
        boolean flat = false;
        String query = "DELETE FROM producto WHERE id_producto=" + id_producto + "";
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
    public boolean actualizarProducto(Producto producto) {
        boolean flat = false;
        String query = "UPDATE producto SET Codigo:='" + producto.getCodigo() + "',"
                + "Nombre:='" + producto.getNombre() + "',"
                + "Id_categoria:='" + producto.getId_categoria() + "',"
                + "Presentacion:='" + producto.getPresentacion() + "',"
                + "Marca='" + producto.getMarca() + "',"
                + "Modelo=" + producto.getModelo() + ","
                + "Id_unidad_medida='" + producto.getId_unidad_medida() + "',"
                + "Precio_compra='" + producto.getPrecio_compra() + "',"
                + "Estado ='" + producto.getEstado() + "' WHERE id_persona =" + producto.getId_producto() + "";
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

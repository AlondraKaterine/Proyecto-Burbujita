<%-- 
    Document   : categoria
    Created on : 16/11/2015, 04:06:19 PM
    Author     : Liliana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Dao.CategoriaDao" %>
<%@page import="Entidad.Categoria" %>
<%@page import="DaoImpl.CategoriaDaoImpl" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario categoría</title>
        <%!
            String id_categoria, nombre, descripcion, estado, opcion;
        %>
        <%
            id_categoria = request.getParameter("id_categoria");
            if (id_categoria == null) {
                id_categoria = "";
            }
            nombre = request.getParameter("nombre");
            if (nombre == null) {
                nombre = "";
            }
            descripcion = request.getParameter("descripcion");
            if (descripcion == null) {
                descripcion = "";
            }
            estado = request.getParameter("estado");
            if (estado == null) {
                estado = "";
            }
            opcion = request.getParameter("opcion");
            if (opcion == null) {
                opcion = "";
            }


        %>
    </head>
    <body>
        <%@include file="index.jsp" %>
        <%            if (opcion.equals("Actualizar")) {
                Categoria cat = new Categoria();
                cat.setId_categoria(Integer.parseInt(id_categoria));
                cat.setNombre(nombre);
                cat.setDescripcion(descripcion);
                cat.setEstado(estado);
                CategoriaDao dao = new CategoriaDaoImpl();
                if (dao.actualizarCategoria(cat)) {
                    out.print("Actualizado correctamente");
                    response.sendRedirect("categoria.jsp");
                } else {
                    out.print("No se pudo actualizar");
                }
            }
            if (opcion.equals("Registrar")) {
                Categoria cat = new Categoria();
                cat.setId_categoria(4);
                cat.setNombre(nombre);
                cat.setDescripcion(descripcion);
                cat.setEstado(estado);
                cat.setId_linea(2);
                CategoriaDao dao = new CategoriaDaoImpl();
                if (dao.agregarCategoria(cat)) {
                    out.print("Registrado correctamente");
                    response.sendRedirect("categoria.jsp");
                } else {
                    out.print("No se pudo registrar");
                }
            }
            if (opcion.equals("Eliminar")) {
                CategoriaDao dao = new CategoriaDaoImpl();
                if (dao.eliminarCategoria(id_categoria)) {
                    out.print("Eliminado correctamente");
                    response.sendRedirect("categoria.jsp");
                } else {
                    out.print("No se pudo eliminar porque se está usando");
                }
            }
        %>
    <center>Datos categoría</center>
        <%
            if (!id_categoria.equals("")) {
                CategoriaDao dao = new CategoriaDaoImpl();
                Categoria cat = dao.DatosCategoria(id_categoria);
        %>
    <form name="categoria" method="post" action="categoria_form.jsp" autocomplete="off">
        <input type="hidden" name="id_categoria" value="<%=id_categoria%>"/>
        <table align="center">
            <tr>
                <td height="28">Nombre:</td>
                <td>
                    <input type="text" name="nombre" value="<%=cat.getNombre()%>" maxlength="50" size="30"/>
                </td>
            </tr>
            <tr>
                <td height="28">Descripción:</td>
                <td>
                    <input type="text" name="descripcion" value="<%=cat.getDescripcion()%>" maxlength="50" size="30"/>
                </td>
            </tr>
            <tr>
                <td height="28">Estado:</td>
                <td>
                    <input type="radio" name="estado" value="1"/> Activo
                    <input type="radio" name="estado" value="0"/> Desactivo
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" name="opcion" value="Actualizar"/>
                </td>
            </tr>
        </table>

    </form>
    <script type="text/javascript">
        document.categoria.estado.value = '<%=cat.getEstado()%>';
    </script>
    <%} else {%>
    <form name="categoria" method="post" action="categoria_form.jsp" autocomplete="off">
        <table align="center">
            <tr>
                <td height="28">Nombre:</td>
                <td>
                    <input type="text" name="nombre" value="" maxlength="50" size="30"/>
                </td>
            </tr>
            <tr>
                <td height="28">Descripción:</td>
                <td>
                    <input type="text" name="descripcion" value="" maxlength="50" size="30"/>
                </td>
            </tr>
            <tr>
                <td height="28">Estado:</td>
                <td>
                    <input type="radio" name="estado" value="1" checked=""/> Activo
                    <input type="radio" name="estado" value="0"/> Desactivo
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" name="opcion" value="Registrar"/>
                </td>
            </tr>
        </table>

    </form>
    <%}%>
</body>
</html>

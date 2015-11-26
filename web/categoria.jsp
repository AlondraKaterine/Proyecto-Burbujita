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
        <title>Categorías</title>
        <%!
            String buscar;
        %>
        <%
            buscar = request.getParameter("buscar");
            if (buscar == null) {
                buscar = "";
            }

        %>
    </head>
    <body>
        <%@include file="index.jsp" %>
    <center>Lista de categorías</center>
    <form name="form" method="post" action="categoria.jsp">
        <table align="center" width="100%">
            <tr>
                <td align="left" width="50%">
                    Nombre:
                     <input type="text" name="buscar" value="<%=buscar%>" placeholder="Buscar" size="15"/>
                    <input type="submit" name="btn btn-defaul" value="Buscar"/>
                    
                </td>
                <td align="right" width="50%">
                    <a href="categoria_form.jsp" class="btn btn-primary">Nueva categoria</a>
                 </td>
            </tr>
        </table>
    </form>
    <div class="container">
        <table class="table table-bordered class-hover">
            <tr>
                <th>#</th>
                <th>Nombre</th>
                <th>Descripción</th>
                <th>estado</th>
                <th colspan="2">Opciones</th>
            </tr>
            
            <% int i = 0;
                CategoriaDao dao = new CategoriaDaoImpl();
                for (Categoria cat : dao.listarCategoria(buscar)) {
                    i = i + 1;
            %>
            <tr>
                <td><%=i%></td>
                <td><%=cat.getNombre()%></td>
                <td><%=cat.getDescripcion()%></td>
                <td><%=cat.getEstado()%></td>
                <td><a href="categoria_form.jsp?id_categoria=<%=cat.getId_categoria()%>">Editar</a></td>
                <td><a href="categoria_form.jsp?id_categoria=<%=cat.getId_categoria()%>&opcion=Eliminar">Eliminar</a></td>
              </tr>
            <%}%>
        </table>
    </div>

</body>
</html>

<%-- 
    Document   : categoria
    Created on : 16/11/2015, 04:06:19 PM
    Author     : Liliana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Dao.UnidadMedidaDao" %>
<%@page import="Entidad.Unidad_medida" %>
<%@page import="DaoImpl.UnidadMedidaDaoImpl" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Unidades de Medida</title>
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
    <center>Lista de Unidad Medida</center>
    <form name="form" method="post" action="unidad_medida.jsp">
        <table align="center" width="100%">
            <tr>
                <td align="right">
                    <input type="text" name="buscar" value="<%=buscar%>" placeholder="Buscar" size="15"/>
                    <input type="submit" name="" value="Buscar"/>
                </td>
            </tr>
        </table>
    </form>
    <div class="container">
        <table class="table table-bordered class-hover">
            <tr>
                <th>#</th>
                <th>Nombre</th>
                <th>Abreviatura</th>
                
                <th colspan="2">Opciones</th>
            </tr>
            <% int i = 0;
                UnidadMedidaDao dao = new UnidadMedidaDaoImpl();
                for (Unidad_medida um : dao.listarUnidadMedida(buscar)) {
                    i = i + 1;
            %>
            <tr>
                <td><%=i%></td>
                <td><%=um.getNombre()%></td>
                <td><%=um.getAbreviatura()%></td>
                <td><a href="">Editar</a></td>
                <td><a href="">Borrar</a></td>
            </tr>
            <%}%>
        </table>
    </div>

</body>
</html>

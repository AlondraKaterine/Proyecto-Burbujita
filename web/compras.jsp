<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title></title>
  <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="estilos/menu.css">
</head>
<body>
   <header class="navbar navbar-static-top bs-docs-nav" id="top" role="banner">
  <div class="container">
    <div class="navbar-header">
      <button class="navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#bs-navbar" aria-controls="bs-navbar" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      
    </div>
   
  </div>
  <nav class="navbar navbar-inverse navbar-static-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navegacion-fm">
            <span class="sr-only">Desplegar / Ocultar Menu</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a href="#" class="navbar-brand"><font face="Lucida Calligraphy">Multiservicios El Burbujita</font></a>
        </div>
        <!-- Inicia Menu -->
        <div class="collapse navbar-collapse" id="navegacion-fm">
          <ul class="nav navbar-nav">
            <li class="active"><a href="index.jsp" class="glyphicon glyphicon-home">Inicio</a></li>
            
            <li><a href="ventas.jsp" class="glyphicon glyphicon-usd">Ventas</a></li>
            <li><a href="compras.jsp" class="glyphicon glyphicon-shopping-cart">Compra</a></li>
            <li><a href="catalogo.jsp" class="glyphicon glyphicon-picture">Catalogo</a></li>
             <li class="dropdown">
              <a href="#"  class="glyphicon glyphicon-calendar" class="dropdown-toggle" data-toggle="dropdown" role="button">
                Reportes <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="ventas.jsp">Reporte de Ventas</a></li>
                <li><a href="#">Reporte de Compras</a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#"  class="glyphicon glyphicon-list" class="dropdown-toggle" data-toggle="dropdown" role="button">Acerca de <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" role="menu">
              <li><a href="historia.jsp"> Nosotros</a></li>
              </ul>
            </li>
            <li><a href="listado.jsp" class="glyphicon glyphicon-user">Contacto</a></li>
          </ul>

          <form action="" class="navbar-form navbar-right" role="search">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="buscar">
            </div>
            <button type="submit" class="btn btn-primary">
              <span class="glyphicon glyphicon-search"></span>
            </button>
          </form>
        </div>
      </div>
    </nav>
  </header>
</header>
  <h2>
  <p></p>

  </h2>
  <div><a href="colaboradora.jsp" class="">
        <span class="" aria-hidden="true"></span>
        </a></div>
  
  <script tipe= "text/javascript" src="jquery/jquery-2.1.4.min.js"></script> 
  <script tipe= "text/javascript" src="bootstrap/js/bootstrap.min.js"></script> 
</header>
<div class="container">
  <h2>Mis compras</h2>
    <%-- 
    Document   : categoria
    Created on : 16/11/2015, 04:06:19 PM
    Author     : Liliana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Dao.CompraDao" %>
<%@page import="Entidad.Compra" %>
<%@page import="DaoImpl.CompraDaoImpl" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compras</title>
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
    <center>Registro de compras </center>
    <form name="form" method="post" action="compras.jsp">
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
                <th>Fecha Registro</th>
                <th>Hora Registro</th>
                <th>Numero Comprobante</th>
                <th colspan="2">Opciones</th>
            </tr>
            <% int i = 0;
                C dao = new CategoriaDaoImpl();
                for (Categoria cat : dao.listarCategoria(buscar)) {
                    i = i + 1;
            %>
            <tr>
                <td><%=i%></td>
                <td><%=cat.getNombre()%></td>
                <td><%=cat.getDescripcion()%></td>
                <td><%=cat.getEstado()%></td>
                <td><a href="">Editar</a></td>
                <td><a href="">Borrar</a></td>
            </tr>
            <%}%>
        </table>
    </div>

</body>
</html>
          
  
</div>

</body>
</html>
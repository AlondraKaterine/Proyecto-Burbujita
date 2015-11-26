<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Multiservicios El Burbujita</title>
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="estilos/miestilo.css">
</head>
<body>
<header>
	<header class="menu">
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
            
            <li><a href="#" class="glyphicon glyphicon-usd">Ventas</a></li>
            <li><a href="#" class="glyphicon glyphicon-shopping-cart">Compra</a></li>
             <li class="dropdown">
              <a href="#"  class="glyphicon glyphicon-calendar" class="dropdown-toggle" data-toggle="dropdown" role="button">
                Reportes <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="#">Reporte de Ventas</a></li>
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


            <li><a href="contacto.jsp" class="glyphicon glyphicon-phone-alt">Contactos</a></li>
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
	<p><font face="Lucida Calligraphy">Otros Productos</font></p>

	</h2>

	
	<script tipe= "text/javascript" src="jquery/jquery-2.1.4.min.js"></script> 
	<script tipe= "text/javascript" src="bootstrap/js/bootstrap.min.js"></script> 

	<div class="container">
  <h2></h2>
  <p></p>            
  <table class="table">
    <thead>
      <tr>
        <th>Nombre</th>
        <th>Precio</th>
        <th>Presentacion</th>
      </tr>
    </thead>
    <tbody>
      <tr class="success">
        <td>Obras Literarias</td>
        <td>S/. 0.50</td>
        <td>A4</td>
      </tr>
      <tr class="danger">
        <td>Mary</td>
        <td>Middle</td>
        <td>mary@example.com</td>
      </tr>
      <tr class="info">
        <td>July</td>
        <td>Dooley</td>
        <td>july@example.com</td>
      </tr>
    </tbody>
  </table>
</div>
</body>
</html>
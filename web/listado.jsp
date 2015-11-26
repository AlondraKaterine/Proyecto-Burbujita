<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Multiservicios El Burbujita</title>
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
            <li class="active"><a href="#" class="glyphicon glyphicon-home">Inicio</a></li>
           
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
            <li><a href="configuracion.jsp" class="glyphicon glyphicon-cog">Configuracion </a></li>
             <li class="dropdown">
              <a href="#"  class="glyphicon glyphicon-list" class="dropdown-toggle" data-toggle="dropdown" role="button">Acerca de <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" role="menu">
              <li><a href="historia.jsp"> Nosotros</a></li>
              </ul>
            </li>


            <li><a href="listado.jsp" class="glyphicon glyphicon-phone-alt">Contacto</a></li>
          </ul>
          <li><a href="login.jsp" class="glyphicon glyphicon-off">Cerrar Sesión</a></li>

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
  <h2><font face="Lucida Calligraphy">Mis Contactos</font></h2>
              
  <table class="table table-bordered class-hover">
    
      <tr>
        <th>Nombres</th>
        <th>Apellidos</th>
        <th>Email</th>
      </tr>
      <tr>
        <td>Lady</td>
        <td>Ordoñez</td>
        <td>ladyess.26@gmail.com</td>
      </tr>
      <tr>
        <td>Alondra</td>
        <td>Pariacuri</td>
        <td>kps_alondra@gmail.com</td>
      </tr>
      <tr>
        <td>Kathy</td>
        <td>Saenz</td>
        <td>july@example.com</td>
      </tr>
    </table>
</div>

</body>
</html>
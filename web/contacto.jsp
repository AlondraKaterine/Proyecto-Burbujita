<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Multiservicios El Burbujita</title>
  <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="estilos/miestilo.css">
  <link rel="stylesheet" type="text/css" href="estilos/historia.css">
  <link rel="stylesheet" type="text/css" href="estilos/contacto.css">
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

            <li><a href="ventas.jsp" class="glyphicon glyphicon-usd">Ventas</a></li>
            <li><a href="compras.jsp" class="glyphicon glyphicon-shopping-cart">Compra</a></li>
             <li class="dropdown">
              <a href="#"  class="glyphicon glyphicon-calendar" class="dropdown-toggle" data-toggle="dropdown" role="button">
                Reportes <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="reporte_ventas.jsp">Reporte de Ventas</a></li>
                <li><a href="reporte_compras.jsp">Reporte de Compras</a></li>
              </ul>
            </li>
             <li><a href="catalogo.jsp" class="glyphicon glyphicon-picture">Catalogo</a></li>
            <li><a href="configuracion.jsp" class="glyphicon glyphicon-cog">Configuracion </a></li>
            <li class="dropdown">
              <a href="#"  class="glyphicon glyphicon-list" class="dropdown-toggle" data-toggle="dropdown" role="button">Acerca de <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" role="menu">
              <li><a href="historia.jsp"> Nosotros</a></li>
              </ul>
            </li>
            <li><a href="contacto.jsp" class="glyphicon glyphicon-phone-alt">Contactos</a></li>
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
           <form  class= "form-inline" > 
  <div  class= "form-group" > 
    <label  for= "exampleInputName2"> Nombre</label> 
    <input  type= "text"  class= "form-control"  id= "exampleInputName2"  placeholder= "Nombre" > 
  </div> 
  <div  class= "form-group" > 
    <label  for= "exampleInputEmail2" > Email    </label> 
    <input  type= "email"  class= "form-control"  id= "exampleInputEmail2"  placeholder= "Email" > 
  </div> 
  <button  type= "submit"  class= "btn btn-default "> Enviar invitación </button> 
  <div class="contactos"></div>

<p> <h6>925 230 836 / 925 230 656 / 961 006 255</p>
<p> Horario de Atención telefónica : Lunes a Viernes de 8:30 a 17.00 </h6></p>
</header>
</form>
<div class="pie">&copy;Multiservicios El Burbujita</div>
<div class="emoticos"></div>
  <script tipe= "text/javascript" src="jquery/jquery-2.1.4.min.js"></script> 
  <script tipe= "text/javascript" src="bootstrap/js/bootstrap.min.js"></script> 
<div class="contactos"></div>

</body>
</html>
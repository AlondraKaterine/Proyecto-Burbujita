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
                <li><a href="reporte_ventas.jsp">Reporte de Ventas</a></li>
                <li><a href="reporte_compras.jsp">Reporte de Compras</a></li>
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
  <h2>Mis ventas</h2>
              
  <table class="table table-bordered class-hover">
    
      <tr>
        <th>Nombre-producto</th>
        <th>Precio</th>
        <th>Cantidad</th>
        <th>Descuento</th>
        <th>Fecha-registro</th>
        <th>Total-pagar</th>
      </tr>
      <tr>
        <td>lapicero pilot</td>
        <td>$2.50</td>
        <td>10u</td>
        <td>10%</td>
        <td>07/09/2015</td>
        <td>$25</td>
      </tr>
      <tr>
        <td>mouse</td>
        <td>$25</td>
        <td>5u</td>
        <td>10%</td>
        <td>07/09/2015</td>
        <td>$125</td>
      </tr>
      <tr>
        <td>parlante</td>
        <td>$30</td>
        <td>2u</td>
        <td>15%</td>
        <td>05/08/2015</d>
        <td>$60</td>
      </tr>
      <tr>
        <td>fotocopias colores</td>
        <td>$0.30</td>
        <td>40u</td>
        <td>10%</td>
        <td>04/08/2015</td>
        <td>$12</td>
      </tr>
      <tr>
        <td>anillado 100hj</td>
        <td>$3.00</td>
        <td>5</td>
        <td>10%</td>
        <td>07/09/2015</td>
        <td>$15</td>
      </tr>
    </table>
</div>

</body>
</html>
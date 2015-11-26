<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Multiservicios El Burbujita</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="estilos/Home.css">
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>

    </head>
    <body>
        <header>
            <div class="cabecera"><font face="Lucida Calligraphy" size="3">Multiservicios El Burbujita</font> </div>		
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
                            <a href="#" class="navbar-brand  text-left" ></a>
                        </div>
                        <!-- Inicia Menu -->
                        <div class="collapse navbar-collapse" id="navegacion-fm">
                            <ul class="nav navbar-nav">
                                <li class="active"><a href="" class="glyphicon glyphicon-home">Inicio</a></li>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <li><a href="ventas.jsp" class="glyphicon glyphicon-gift">Ventas</a></li>
                                <li><a href="compras.jsp" class="glyphicon glyphicon-shopping-cart">Compra</a></li>
                                <li class="dropdown">
                                    <a href="#"  class="glyphicon glyphicon-calendar" class="dropdown-toggle" data-toggle="dropdown" role="button">Reportes <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="reporte_ventas.jsp">Reporte de Ventas</a></li>
                                        <li><a href="reporte_compras.jsp">Reporte de Compras</a></li>
                                    </ul>
                                </li>

                                <li class="dropdown">
                                    <a href="#"  class="glyphicon glyphicon-picture" class="dropdown-toggle" data-toggle="dropdown" role="button"> Catálogo <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="categoria.jsp">Categorías</a></li>
                                        <li><a href="producto.jsp">Productos</a></li>
                                        <li><a href="unidad_medida.jsp">Unidades de medida</a></li>
                                        <li><a href="reporte_compras.jsp">Precios</a></li>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a href="#"  class="glyphicon glyphicon-picture" class="dropdown-toggle" data-toggle="dropdown" role="button"> Configuraciones <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="categoria.jsp">Categorías</a></li>
                                        <li><a href="producto.jsp">Productos</a></li>
                                        <li><a href="reporte_compras.jsp">Unidades de medida</a></li>
                                        <li><a href="reporte_compras.jsp">Precios</a></li>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a href="#"  class="glyphicon glyphicon-list" class="dropdown-toggle" data-toggle="dropdown" role="button"> Perfil <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="login.jsp" class="glyphicon glyphicon-off">Cerrar Sesión</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </header>
        </header>
        <section>
        </section>
        <script tipe= "text/javascript" src="jquery/jquery-2.1.4.min.js"></script> 
        <script tipe= "text/javascript" src="bootstrap/js/bootstrap.min.js"></script> 

    </body>
</html>
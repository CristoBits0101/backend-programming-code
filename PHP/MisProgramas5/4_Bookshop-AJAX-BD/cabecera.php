<header>
    Usuario: <?php echo $_SESSION['usuario']; ?>
    <br>
    <br> Menú: 
    <a href="" onclick="return cargarGeneros();">Listado de Generos</a> / 
    <a href="" onclick="return cargarLibros();">Listado de Libros</a> / 
    <a href="" onclick="return cargarCarrito();">Ver carrito</a> /
    <a href="" onclick="return logout();">Cerrar sesión</a>
</header>
<hr>
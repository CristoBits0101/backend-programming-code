<!DOCTYPE html>

<html>

<head>

    <title>Administracion de Usuarios</title>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <script type="text/javascript" src="js/cargarDatos.js"></script>		
    <script type="text/javascript" src="js/sesion.js"></script>		

</head>	

<body>

    <section id = "login">

        <form onsubmit="return login()" method="POST">

            Usuario	<input id="usuario" type="text">			
              Clave <input id="clave" type="password">	

            <input type="submit">
            
        </form>

    </section>

    <section id = "principal" style="display:none">

        <header>
            <?php require 'cabecera_json.php' ?>
        </header>

        <h2 id="titulo"></h2>

        <section id="contenido"></section>		

    </section>

    <section id = "insertar" style="display:none">

        <h2 id = "titulo">Añadir Nuevo Usuario</h2>

        <form onsubmit="return insertarNuevoUsuario()" method = "POST">

            Nombre    <input id = "nombreUsu" type = "text">
            Apellidos <input id = "apellidosUsu" type = "text">	
            Usuario	  <input id = "usuarioUsu" type = "text">			
            Clave	  <input id = "claveUsu" type = "password">	

                    <input type = "submit">

        </form>		

    </section>

</body>

</html>
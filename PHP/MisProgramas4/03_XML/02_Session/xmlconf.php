<?php

    function comprobar_usuario($usuario, $password) 
    {
        $datos       = simplexml_load_file("acceso.xml");
        $usuarioConf = $datos->xpath("//usuario");
        $claveConf   = $datos->xpath("//clave");
        $confUsu     = [];
        $confUsu[]   = $usuarioConf[0];
        $confUsu[]   = $claveConf[0];

        return ($usuario == $confUsu[0] && $password == $confUsu[1]);
    }

    // Buscando al usuario en el archivo datos.xml
    function obtener_datos_usuario($aliasUsuario) 
    {
        $datos = simplexml_load_file("datos.xml");
        $usuarios = $datos->xpath("//usuario");

        foreach ($usuarios as $usuario) 
        {
            if ($usuario->alias == $aliasUsuario) 
            {
                return $usuario;
            }
        }

        return null;
    }

    function obtener_datos_usuarios_alias() 
    {
        $datos = simplexml_load_file("datos.xml");
        $alias = $datos->xpath("//alias");

        return $alias;
    }

    function crear_opciones($valores, $seleccionado) 
    {
        foreach ($valores as $valor) 
        {
            if ($valor == $seleccionado)
                echo "<option selected='selected'>" . $valor . "</option>";
            else
                echo "<option>" . $valor . "</option>";
        }
    }

?>
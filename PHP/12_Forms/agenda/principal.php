<?php

    /**
     *  Main
     */
    if 
    (
        // 1. Ejecutamos el código si podemos capturar el name formulario en la máquina.
        isset($_REQUEST['formulario'])
    )
    {

        try 
        {
            // 2. Validamos los datos introducidos en los inputs.
            name_validation();
        } 

        catch (Exception $e) 
        {
            echo '<p style="color:red">Excepción: ' . $e->getMessage() . "</p><br>";
        }
    }

    /**
     *  Validation
     */
    function name_validation()
    {
        if 
        (
            // 1. Comprueba si el nombre está vacío y si hay un dato de contacto mínimo.
            empty($_REQUEST['nombre']) ||
            empty($_REQUEST['telefono']) && empty($_REQUEST['email'])
        ) 
        {
            throw new Exception("¡ERROR! (el nombre no puede estar vacío y debe introducir al menos un dato de contacto).");
        }

        echo '¡El nombre no viene vacío y al menos se ha enviado un dato de contacto! ✅<br/><br/>';

        // 2. Comprobar si el nombre existe en la agenda si no esta vacío.
        read_file();

        // 3. Si el usuario no existe && el teléfono no viene vacío && el email no viene vacío, sustituimos los datos de contacto.
        if 
        (
            read_file() === false && 
            !empty($_REQUEST['telefono']) && 
            !empty($_REQUEST['email'])) 
        {
            $_newUser = new Agenda($_REQUEST['nombre'], $_REQUEST['telefono'], $_REQUEST['email']);
            write_file($_newUser);
        }
    }

    /**
     *  File
     */
    function read_file() 
    {
        // 1. Cargamos el fichero en modo lectura.
        $_file = fopen("./datos.txt", "r");

        // 2. Leemos el fichero.
        /**
         *  - feof         : Se ejecuta el bucle mientras no haya termine con el fichero.
         *  - fgets        : Cada vuelta del bucle me da una fila del fichero y se almacena en $_file.
         *  - srt_contains : Se le pasa la cadena en la que buscar y después el texto a buscar.
         */
        while(!feof($_file))
        {
            $_line = fgets($_file);

            $_boolean = str_contains($_line, $_REQUEST['nombre']);

            // 3. Si $_boolean es true return true, else return false y cerramos el archivo.
            if ($_boolean) {
                echo '¡El usuario está registrado! ✅<br/><br/>';

                fclose($_file);

                return true;
            }
            
            else if (feof($_file) === true && $_boolean === false) 
            {
                echo '¡El usuario no está registrado! ✅<br/><br/>';

                fclose($_file);
    
                return false;
            }
        }
    }

    function write_file($_newUser) 
    {
        // 1. Cargamos el fichero en modo escritura.
        $_file = fopen("./datos.txt", "w");

        // 2. Añadimos contenido al fichero.
        /**
         * - Parámetro 1 fichero a escribir.
         * - Parámetro 2 variables a escribir.
         */
        fwrite($_file, 'Nombre: '. $_newUser->getNombre() . ', Teléfono: ' . $_newUser->getTelefono() . ', Email: ' . $_newUser->getCorreo() . '\n');

        // 3. Cerramos el fichero después de escribir en él.
        fclose($_file);

        // 4. Confirmamos operación.
        echo '¡Se ha escrito correctamente en el fichero! ✅<br/><br/>';
    }

    function modify_file()
    {
        try 
        {
            // 1. Cargamos el fichero en modo escritura.
            $_file = fopen("../../files/datos.txt", "w");

            // 2. Añadimos contenido al fichero.
            /**
             * - Parámetro 1 fichero a escribir.
             * - Parámetro 2 textos a escribir.
             */
            fputs($_file, $_REQUEST['name'] . ' ' . $_REQUEST['telefono'] . ' ' . $_REQUEST['email'] . '\n');

            // 3. Cerramos el fichero después de escribir en él.
            fclose($_file);

            // 4. Confirmamos operación.
            echo '¡Se ha modificado los datos correctamente en el fichero! ✅<br/><br/>';
        } 

        catch (Exception $e3) 
        {
            throw new Exception("¡ERROR! (no se ha podido escribir en él fichero).");
            echo '<p style="color:red">Excepción: ' . $e3->getMessage() . "</p><br>";
        }
    }

    /**
     *  Class
     */
    class Agenda
    {
        // ATRIBUTOS
        private $Nombre;
        private $Telefono;
        private $Correo;

        // CONSTRUCTOR
        function __construct($Nombre, $Telefono, $Correo) {
            $this->Nombre = $Nombre;
            $this->Telefono = $Telefono;
            $this->Correo = $Correo;
        }

        /**
         * Get the value of Nombre
         */ 
        public function getNombre()
        {
                return $this->Nombre;
        }

        /**
         * Set the value of Nombre
         *
         * @return  self
         */ 
        public function setNombre($Nombre)
        {
                $this->Nombre = $Nombre;

                return $this;
        }

        /**
         * Get the value of Telefono
         */ 
        public function getTelefono()
        {
                return $this->Telefono;
        }

        /**
         * Set the value of Telefono
         *
         * @return  self
         */ 
        public function setTelefono($Telefono)
        {
                $this->Telefono = $Telefono;

                return $this;
        }

        /**
         * Get the value of Correo
         */ 
        public function getCorreo()
        {
                return $this->Correo;
        }

        /**
         * Set the value of Correo
         *
         * @return  self
         */ 
        public function setCorreo($Correo)
        {
                $this->Correo = $Correo;

                return $this;
        }
    }

    class Contacto
    {
        // ATRIBUTOS
        private $Contactos = Array();

        // CONSTRUCTOR
        function __construct($Contactos) {
            $this->$Contactos = $Contactos;
        }
    }

    /**
     *  Show
     */
    function accion()
    {
        $_file = fopen("./datos.txt", "r");

        while(!feof($_file))
        {
            $_line = fgets($_file);

            echo $_line;
        }
    }

?>

<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>3_agenda</title>

    <link rel="stylesheet" href="./styles.css">

</head>

<body>

    <!-- CARGAR DATOS -->
    <div id="zonaDeDatos"></div>

    <br/>
    <div class="container">

        <!-- Enviamos el formulario dentro de la misma máquina. -->
        <form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">

            <br/>
            <!-- NOMBRE -->
            <div>
                <label for="nombre">
                    Nombre:
                </label>
                <br/>
                <input type="text" name="nombre" minlength="1" maxlength="20">
            </div>
            <br/>

            <!-- TELÉFONO -->
            <div>
                <label for="telefono">
                    Teléfono:
                </label>
                <br/>
                <input type="tel" name="telefono" size="9">
            </div>
            <br/>

            <!-- CORREO ELECTRÓNICO -->
            <div>
                <label for="email">
                    Correo electrónico:
                </label>
                <br/>
                <input type="email" name="email" minlength="1" maxlength="20">
            </div>
            <br/>

            <!-- BOTONES -->
            <div id="botones">
                <button type="submit" style="width: 130px;">Guardar datos</button>
                <br/><br/>
                <input
                    type="submit"
                    value="Cargar datos"
                    onclick="funcion();"
                    style="width: 130px; padding: 0.5rem;font-family: Arial, Helvetica, sans-serif; font-size: 1rem;padding: 0.5rem;"
                >
            </div>
            <br/>

            <!-- ENVIADO -->
            <input type="hidden" name="formulario">

        </form>

    </div>

    <script>

        function funcion()
        {
            // 1. Llamamos a la función alert de JavaScript.
            // 2. Esta función alerta en un recuadro superior de la pantalla lo que esté dentro de los corchetes.
            // 3. Lo que se va a alerta es un código php que imprime una función que contiene instrucciones.
            alert('Contacto 1: <?php echo accion(); ?>');

            /**
             * document.getElementById('zonaDeDatos').innerHTML = document.write('<?php echo accion(); ?>');
             */
        }

    </script>

</body>

</html>
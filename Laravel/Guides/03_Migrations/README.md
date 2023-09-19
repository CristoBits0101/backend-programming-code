# PASOS PARA MANIPULAR LA ESTRUCTURA DE LA BASE DE DATOS DESDE EL CONTROLADOR

# PASO 1) CREAR LA BASE DE DATOS Y EL ADMINISTRADOR DE LA BASE DE DATOS

1.2. Creamos la base de datos con la que vamos a estar trabajando a través del gestor que en mi caso es phpMyAdmin que viene con XAMPP:
        a. Accedemos a la siguiente URL en el navegador: http://localhost/phpmyadmin/
        b. En el panel de la izquierda hacemos click en nueva y le damos un nombre a la bd en mi caso pruebas.
        c. Le damos a crear y listo.

2.2. Creamos un usuario en la sección de usuarios:
        a. Accedemos a la pestaña superior de privilegios.
        b. Añadimos un nuevo usuario.

# PASO 2) CONFIGURAR EL ACCESO A LA BASE DE DATOS MEDIANTE LAS VARIABLES DEL ENTORNO DEL .ENV

2.1. Establecer la base de datos que vamos a usar:
        DB_CONNECTION=mysql

2.2. Añadir la dirreción URL o la dirrección IP de la máquina:
        DB_HOST=127.0.0.1

2.3. Añadir el puerto de acceso a la dirrección de la base de datos:
        DB_PORT=3306

2.4. Indicar la base de datos con la que se va a trabajar:
        DB_DATABASE=pruebas

2.5. Indicar el administrador de la base de datos y la contraseña si tiene:
        DB_USERNAME=root
        DB_PASSWORD="1234"

# PASO 3) CREAR LA ESTRUCTURA DE LAS TABLAS QUE NECESITA NUESTRO PROYECTO EN LA BASE DE DATOS

3.1. Creamos el archivo que va a contener la estructura de la tabla respetando la conveción de nombres de minúsculas y en plural:
        php artisan make:migration create_notes_table
        Laravel\03_Migrations\database\migrations\2023_09_15_065742_create_notes_table.php

3.2. Añadir la estructura de la tabla al archivo de migración:
        $table->tipedata('name_column');

3.3. Migrar las estructuras a la base de datos:
        php artisan migrate

3.4. En caso de hacer un rollback y si hay relaciones, hacer una tabla update y migrar la actualización:
        php artisan migrate:rollback
        php artisan make:migration update_table-name_table
        php artisan migrate
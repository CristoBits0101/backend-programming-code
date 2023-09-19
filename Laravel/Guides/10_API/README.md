# PASOS PARA CREAR UNA API EN LARAVEL

# PASO 1) CREAR LOS MODELOS Y LAS MIGRACIONES

# PASO 2) CREAR LOS CONTROLADORES CON --RESOURCE

2.1. Añadir las funciones que hacén las consultas a la bd.

2.2. Retornar en la función en el JSON con los datos de la consulta.

# PASO 3) CREAR LAS REQUEST PARA QUE VALIDEN LOS DATOS

# PASO 4) CREAR LOS RESOURCES PARA ESTABLECER UN FORMATO DE DEVOLUCIÓN DE JSON

# PASO 5) CREAR LAS RUTAS EN EL ARCHIVO

5.1. Entramos en el archivo de rutas para las API: 
        Laravel\Practices\10_api-auth\routes\api.php

5.2. Añadimos las ruta que crea el CRUD completo:
        Route::resource('/note', NoteController::class)

# PASO 6) CONFIGURAR PETICONES A LA API

6.1. Configurar la cabecera para indicar que tipo de contenido vamos a enviar.

6.2. Configurar el body con los datos que tenemos que enviar.
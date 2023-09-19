# PASOS PARA CREAR UNA LANDING PAGE

# PASO 1) CREAR LA RUTA DE ACCESO RAÍZ A LA PÁGINA

1.1. Abre el archivo de rutas:
        Laravel/01_landing-page/routes/web.php

1.2. Añade la ruta estática:
        Route::view('/', 'welcome');

1.3. Añade un nombre a la ruta:
        Route::view('/', 'welcome')->name('welcome');

# PASO 2) INICIAR EL SERVIDOR PHP PARA PROBAR LA RUTA DE ACCESO A LA PÁGINA

2.1. Escribe en la terminal el comando para iniciar el servidor PHP:
        php artisan serve

2.2. Escribe en el navegador web la ruta de acceso a la página raíz:
        http://localhost:8000

# PASO 3) CREAR UNA VISTA DE ACCESO RAÍZ PERSONALIZADA

3.1. Abre el archivo de rutas:                                       
        Laravel/01_landing-page/routes/web.php

3.2. Modifica la ruta raíz:                                          
        Route::view('/', 'index')->name('index');

3.3. Crea la plantilla index:                                        
        Laravel/01_landing-page/resources/views/landing/home.blade.php

3.4. Reinicia el servidor PHP:                                       
        Primero: ctrl+c
        Segundo: php artisan serve

3.5. Escribe en el navegador web la ruta de acceso a la página raíz:
        http://localhost:8000

# PASO 4) CREAR RUTAS PERSONALIZADAS

4.1. Abre el archivo de rutas:                                             
        Laravel/01_landing-page/routes/web.php

4.2. Añade las rutas estáticas de las páginas nuevas:                       
        Route::view('/about', 'landing.about')->name('about'); 
        Route::view('/projects', 'landing.projects')->name(projects);

4.3. Crea las plantillas de las páginas nuevas:                         
        Laravel\01_landing-page\resources\views\landing\about.blade.php
        Laravel\01_landing-page\resources\views\landing\projects.blade.php

4.4. Reinicia el servidor PHP:                                             
        Primero: ctrl+c
        Segundo: php artisan serve

4.5 Acceder a las páginas mediante las rutas:                        
        http://localhost:8000/about
        http://localhost:8000/projects
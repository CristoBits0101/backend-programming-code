# PASOS PARA LA CREACIÓN DE VISTAS A TRAVÉS DEL SISTEMA DE PLANTILLAS DE BLADE

# PASO 1) CREAR UNA PLANTILLA PARA EL CÓDIGO ESTÁNDAR DE LAS PÁGINAS

1.1. Creamos la plantilla HTML en el directorio de plantillas: 
        Laravel\02_Blade\resources\views\layouts\landing.blade.php

1.2. Indicamos que partes de la plantilla son editables con la siguiente directiva de blade:
        @yield('nombre_identificador_zona')

# PASO 2) CREAR LAS PÁGINAS DE LA WEB

2.1. Creamos las páginas que van a conformar la web en el directorio de páginas:
        Laravel\02_Blade\resources\views\index.blade.php
        Laravel\02_Blade\resources\views\about.blade.php
        Laravel\02_Blade\resources\views\projects.blade.php
        Laravel\02_Blade\resources\views\contact.blade.php

2.2. Extendemos la plantilla HTML a las páginas de la web con la siguiente directiva de blade:
        @extends('layouts.landing') = layouts\landing.blade.php

2.3. Modificamos las partes editables de la plantilla que queramos con la siguiente directiva:
        @section('title', 'Home page')

        @section('content')
                <main>
                    <section>
                        <article></article>
                    </section>
                </main>
                <aside>
                </aside>
                <footer>
                </footer>
        @endsection

# PASO 3) CREAR EL CÓDIGO PARCIAL QUE SE REPITE EN LA MAYORÍA DE LAS PÁGINAS

3.1. Creamos el directorio del código parcial:
        Laravel\02_Blade\resources\views\layouts\_partials

3.2. Creamos el código parcial de nuestras páginas que se va a repetir como el header:
        Laravel\02_Blade\resources\views\layouts\_partials\header.blade.php
        <header>
            <nav>
                <ul>
                    <li><a href="">Home</a></li>
                </ul>
            </nav>
        </header>

        a. Utilizamos las dobles llaves para añadir código php 
        b. Usamos el método route para redireccionar desde el menú de navegación.
        c. Usamos el nombre de la ruta por si modifican la ruta de acceso no se rompa el enlace.
        <li><a href="{{route('home')}}">Home</a></li>

3.3. Incluimos el código parcial que se va a repetir en las páginas web dentro de la plantilla base para que nuestro código sea más modular:
        <body>
            <div class="content">
                @include('layouts._partials.header') = Laravel\02_Blade\resources\views\layouts\_partials\header.blade.php
                @yield('content')
                @include('layouts._partials.aside')  = Laravel\02_Blade\resources\views\layouts\_partials\aside.blade.php
                @include('layouts._partials.footer') = Laravel\02_Blade\resources\views\layouts\_partials\footer.blade.php
            </div>
        </body>

# PASO 4) CREAR LAS RUTAS DE ACCESO A LAS PÁGINAS

4.1. Editamos el archivo de las rutas web:
        Laravel\02_Blade\routes\web.php

4.2. Añadimos las rutas de acceso a las páginas web:
        Route::view('/', 'index')->name('home');
        Route::view('/about', 'about')->name('about');
        Route::view('/projects', 'projects')->name('projects');
        Route::view('/contact', 'contact')->name('contact');

# PASO 5) CREAR LOS COMPONENTES QUE SE VAN A REPETIR PARA EVITAR REPETIR CÓDIGO

5.1. Crear el directorio de componentes:
        Laravel\02_Blade\resources\views\layouts\_components

5.2. Crear el componente que se va a repetir:
        Laravel\02_Blade\resources\views\layouts\_components\card.blade.php

5.3. Añadir el código estático y el código dinámico que se puede editar a través de variables de PHP:
        <div>
                <h3 style="color: red">{{ $title }}</h3>
                <p>{{ $description }}</p>
        <div>

5.4. Añadir el componente que se va a repetir varias veces dentro de la página que se va a usar para no crear múltiples etiquetas y solo rellenar:
        a. Importar el componente dentro del código mediante la directiva component.
        b. Editar el component mediante la directiva slot que referencia a la variable de la etiqueta.
        @section('content')
            <main>
                <section>
                    <article><h2>Welcome to the projects page!</h2></article>
                        @component('layouts._components.card')
                                @slot('title', 'Título del componente')
                                @slot('description', description)
                        @endcomponent
                        @component('layouts._components.card')
                                @slot('title', 'Título del componente')
                                @slot('description', description)
                        @endcomponent
                </section>
            </main>
        @endsection

# PASO 6) AÑADIR MULTIMEDIA EN PLANTILLAS WEB

6.1. Añadir las carpetas que van a almacenar las imágenes y vídeos:
        Laravel\02_Blade\public\assets\img
        Laravel\02_Blade\public\assets\video

6.2. Añadimos una imagen dentro del componente card por ejemplo, usamos el método asset para que las rutas de elementos estáticos no den error en Laravel:
        <div>
                <h3 style="color: red">{{ $title }}</h3>
                <img src="{{ asset('assets/img/meta-full-stack-engineer-certificate.png') }}" alt="Imagen de ejemplo"/>
                <p>{{ $description }}</p>
        <div>

# PASO 7) IMPORTAR ESTILOS PUBLICOS EN PLANTILLAS BLADE

7.1. Añadir la carpeta css al directorio public:
        Laravel\02_Blade\public\css

7.2. Añadir un archivo css personalizado:
        Laravel\02_Blade\public\css\style.css

7.3. Importamos en la plantilla en la cual queremos que se apliquen los estilos, como es un recurso estático se hace a través del metódo asset:
        <link rel="stylesheet" href="{{ asset('assets/css/style.css') }}">
        
# PASO 8) AÑADIR ESTILOS Y SCRIPTS CUAN SE CARGUE UN COMPONENTE

8.1. Añadimos 2 directivas en la plantilla base que permita introducir URL cuando se cargue una página:
        <head>
                @yield('styles')
        </head>
        <body>
                @yield('scripts')
        </body>

8.2. Indicamos que styles y scripts queremos cargar desde la página.
        @section('styles')
                <link rel="stylesheet" href="{{ asset('assets/css/style.css') }}">
        @endsection
        @section('styles')
                <script src="{{ asset('assets/css/style.css') }}"/>
        @endsection
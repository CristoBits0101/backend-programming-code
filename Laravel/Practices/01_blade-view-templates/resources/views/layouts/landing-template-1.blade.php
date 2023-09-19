<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>
        @yield('title')
    </title>

    <!-- CSS -->
    @yield('css')
    <link rel="stylesheet" href="{{ asset('assets/css/style.css') }}" />
</head>
<body>
    <!-- Directiva include('_partialsURL'): Se utiliza para indicar de que plantilla HTML queremos extender -->
    @include('layouts._partials.nav')

    <!-- Directiva yield('identificador'): Se puede modificar el contenido de la etiqueta haciendo referencia al identificador de la directiva -->
    @yield('content')

    <!-- JS -->
    @yield('scripts')
</body>
</html>

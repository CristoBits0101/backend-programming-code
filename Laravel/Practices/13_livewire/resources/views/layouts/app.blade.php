<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>@yield('title')</title>
    <!-- Añadimos todos los estilos que hacen funcionar livewire -->
    @livewireStyles
</head>
<body>
    @yield('content')
    <!-- Añadimos todos los scripts que hacen funcionar livewire -->
    @livewireScripts
</body>
</html>
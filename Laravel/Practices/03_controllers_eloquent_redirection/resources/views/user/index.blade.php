<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hello World!</title>
</head>
<body>
    <h1>User list:</h1>

    <!-- isEmpty() comprueba si la colección no tiene elementos, pertece a Laravel                  -->
    <!-- empty()   comprueba si no esta definida, null o vacía ''                                   -->
    <!-- isset()   comprueba si la variable está definida y tiene un valor asignado que no sea null -->
    @if($users->isEmpty())
        <h2>No hay usuarios registrados.</h2>
    @else
        <ul>
            @foreach($users as $user)
                @if(!empty($user->name))
                    <li>{{$user->name}}</li>
                @endif
            @endforeach
        </ul>
    @endif

    <!-- Alternativa al código superior -->
    @forelse($users as $user)
        <li>{{$user->name}}</li>
    @empty
        <li>List empty.</li>
    @endforelse

    <!-- Ejemplo con un switch -->
    @foreach($users as $user)
        @switch($user->age)
            @case(18)
                <h2>{{$user->name}}: Tiene 18 años.</h2>
                @break
            @default
                <h2>{{$user->name}}: No tiene 18 años.</h2>
        @endswitch
    @endforeach
</body>
</html>

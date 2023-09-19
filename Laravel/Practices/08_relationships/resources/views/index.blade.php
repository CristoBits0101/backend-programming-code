<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>index</title>
</head>
<body>

    {{-- <h1>{{$user->name }} phones:</h1>
    @foreach($user->phones as $phone)
        <ol>
            <li>
                Prefix: {{ $phone->country_prefix }}
                <br>
                Number: {{ $phone->phone_number }}
            </li>
        </ol>
    @endforeach --}}

    {{-- <h1>{{$user->name }} Roles:</h1>
    @foreach($user->roles as $role)
        <ol>
            <li>
                Role: {{ $role->name }}
                <br>
                Added_by: {{ $role->pivot->added_by }}
            </li>
        </ol>
    @endforeach --}}

    <!-- Sin relación directa no podemos usar el nombre de la tabla si no el de la función -->
    {{-- <h3>{{ $user->phoneSim->Sim }}</h3> --}}

    <h1>{{ $user->image->url }}</h1>
</body>
</html>

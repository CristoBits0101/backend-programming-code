@extends('layouts.app')

@section('content')
    <!-- Las variables $errors, $error and $message son reservadas de Laravel para blade -->
    <!-- Recorremos todos los errores y los serializamos -->
    @if($errors->any())
        <ul>
            @foreach($errors->all() as $error)
                <li>{{ $error }}</li>
            @endforeach
        </ul>
    @endif
    <a href="{{ route('note.index') }}">Back</a>
    <form method="POST" action="{{ route('note.store') }}">
        <!-- csrf: Token para identificar el formulario -->
        <!-- El token hace que para enviar datos a la URL tenga que ser a través del formulario -->
        <!-- Esto evita ataques masivos de denegación de servicio -->
        <!-- La protección viene por defecto, pero hay que indicarla o tira error el programa -->
        @csrf
        <div>
            <label for="title">Title</label>
            <!-- Si ocurre un error el input obtiene la clase danger mientras tanto la clase no tiene valor -->
            <input type="text" id="title" name="title" class="@error('title') danger @enderror"/>
            <br/>
            <!-- Esta directiva indica que debe suceder si ocurre un error -->
            @error('title')
                <p style="color:red">{{ $message }}</p>
            @enderror
        </div>
        <div>
            <label for="description">Description</label>
            <input type="text" id="description" name="description">
            <!-- Esta directiva indica que debe suceder si ocurre un error -->
            @error('title')
                <p style="color:red">{{ $message }}</p>
            @enderror
        </div>
        <button id="submit" name="submit" type="submit" value="create">Create</button>
    </form>
@endsection
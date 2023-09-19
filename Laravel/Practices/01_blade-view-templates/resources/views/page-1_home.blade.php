<!-- Directiva extends('layouts.landing-template-1'): Se utiliza para indicar de qué plantilla HTML queremos extender -->
@extends('layouts.landing-template-1')

<!-- Directiva section('title', 'home'): Se utiliza para introducir contenido en la vista padre mediante el identificador de un yield -->
@section('title', 'home')

<!-- Directiva section('content', 'home'): Se utiliza para introducir contenido en la vista padre mediante el identificador de un yield -->
@section('content')

    <h1>CRISTO RUBÉN PÉREZ SUÁREZ</h1>

    <!-- Import del componente a usar -->
    @component('_components.card')
        <!-- El slot title va a contener al contenido Service 1 -->
        @slot('title', 'Service 1')
        @slot('content', 'Lorem ipsum')
    @endcomponent

    @component('_components.card')
        <!-- El slot title va a contener al contenido Service 1 -->
        @slot('title', 'Service 2')
        @slot('content', 'Lorem ipsum')
    @endcomponent

@endsection

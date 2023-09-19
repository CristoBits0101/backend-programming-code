@extends('layouts.app')

@section('content')
    <a href="{{ route('note.index') }}">Back</a>
    <form method="POST" action="{{ route('note.update', $note->id) }}">
        <!-- HTML solo permite enviar mediante GET y POST, se necesita una directiva para convertirla a PUT -->
        @method('PUT')
        @csrf
        <div>
            <label for="title">Title:</label>
            <input type="text" id="title" name="title" value="{{ $note->title }}">
        </div>
        <div>
            <label for="description">Description:</label>
            <input type="text" id="description" name="description" value="{{ $note->description }}">
        </div>
        <input type="submit" value="Update"/>
    </form>
@endsection
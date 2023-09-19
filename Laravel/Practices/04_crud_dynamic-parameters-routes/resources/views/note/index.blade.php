@extends('layouts.app')

@section('content')
    <ul>
        @forelse($notes as $note)
            <li><a href="#">{{ $note.tittle }}</a></li>
        @empty
            <p>No hay datos</p>
        @endforelse
    </ul>
@endsection
@extends('layouts.app')

@section('content')
    <form>
        <div>
            <label for="title">Title</label>
            <input type="text" id="title">
        </div>
        <div>
            <label for="description">Description</label>
            <input type="text" id="description">
        </div>
        <submit id="submit" name="submit" type="submit" value="Create"/>
    </form>
@endsection
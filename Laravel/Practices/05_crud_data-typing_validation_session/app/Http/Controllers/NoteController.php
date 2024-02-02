<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use App\Models\Note;
use App\Http\Requests\NoteRequest;                                  // Importamos el archivo que se encarga de las validaciones para no sobrecargar el controlador.
use Illuminate\Http\RedirectResponse;
use Illuminate\Http\Request;
use Illuminate\View\View;

class NoteController extends Controller
{
    // CREATE
    public function create():View                                   // Tipamos indicando que el tipo de retorno es una vista [Iluminate\view]
    {
        return view('note.create');
    }

    // public function store(Request $request):RedirectResponse     // Tipamos indicando que el tipo de retorno es una redirección [Iluminate\Http]
    public function store(NoteRequest $request):RedirectResponse    // Indicamos que estamos esperando una NoteRequest
    {
        // Se valida antes de guardar y actualizar.
        // Se comprueba si se cumple ciertas reglas y si no disparamos un error.
        // $request->validate([
        //     'title' => 'required | max:255 | min:3',
        //     'description' => 'required | max:255 | min:3'
        // ]);

        // Forma larga.
        // $note = new Note();
        // $note->title = $request->tittle;
        // $note->description = $request->description;
        // $note->save();

        // Forma abreviada.
        // Como los campos de modelo Note coinciden con el name del formulario, Laravel los asocia directamente.
        Note::create($request->all());         

        return redirect()->route('note.index')->with('success','Note created');
    }

    // READ
    public function index():View 
    {
        $notes = Note::all();

        return view('note.index', compact('notes'));
    }

    public function show(Note $note):View 
    {
        return view('note.show', compact('note'));
    }

    // UPDATE
    // Atajo de Laravel, añadimos el objeto Note como parámetro de la función e intenta buscar la nota por el id.
    public function edit(Note $note):View
    {
        // Forma larga.
        // $myNote = Note::find($note);
        // return view();

        // Forma corta.
        // Retornamos a la vista note.edit y le pasamos la nota para que el usuario sepa los datos que contiene.
        return view('note.edit', compact('note'))->with('success','Note updated');
    }

    public function update(Request $request, Note $note):RedirectResponse
    {
        // Se valida antes de guardar y actualizar.
        // Se comprueba si se cumple ciertas reglas y si no disparamos un error.
        // $request->validate([
        //     'title' => 'required | max:255 | min:3',
        //     'description' => 'required | max:255 | min:3'
        // ]);

        // La $nota recibida ahora hay que actualizarla con los valores de la petición.
        // La actualización se basa en todos los parámetros que recibe de la request.
        // Formato corto usando el ORM.
        $note->update($request->all());
        return redirect()->route('note.index');

        // Al pasar el objeto Note como parámetro de la función, busca el atributo coincidente con la variable y consulta en la BD.
        // Por lo cual la siguiente acción ya no es necesaria.
        // Formato largo 1 sin el ORM.
        // $note = Note::find($note);
        // $note->title = $request->title;
        // $note->description = $request->description;
        // $note->save();

        // Formato largo 2 sin el ORM.
        // $note->update([
        //     'title' => $request->title,
        //     'description' => $request->description
        // ]);
    }

    // DELETE
    // Como los datos se reciben desde la URL y no desde los input name del formulario quitamos el Request $request.
    // public function destroy(Request $request, Note $note)
    public function delete(Note $note):RedirectResponse
    {
        $note->delete();
        return redirect()->route('note.index')->with('danger','Note deleted');
    }

}

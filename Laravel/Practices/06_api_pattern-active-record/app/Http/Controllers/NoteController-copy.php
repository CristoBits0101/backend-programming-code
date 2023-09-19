<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Note;
use App\Http\Requests\NoteRequest;
use Illuminate\Http\JsonResponse;

class NoteController extends Controller
{
    /**
     * Display a listing of the resource.
     * Es un Read de todas las notas.
     */                                                 
    public function index(): JsonResponse                       // Se utiliza para generar pasar los datos de la vista base de entrada a la web.
    { 
        return response()->json(Note::all(), 200);              // Retornamos al frontend una respuesta en formato json y el status.
    }

    /**
     * Show the form for creating a new resource.
     */
    // public function create(NoteRequest $request)             // Esta función no es necesaria porque el formulario de creación está en el frontend.    
    // {
    //     //
    // }

    /**
     * Store a newly created resource in storage.
     * Es un Create de nota.
     */
    public function store(NoteRequest $request):JsonResponse    // Al hacer un NoteRequest se valida antes de pasarlo a la variable.
    {
        //
        $note = Note::create($request->all());
        return response()->json([
            'success' => true,                                  // Devolvemos un texto y un valor booleano que indica el estado.
            'data' => $note                                     // Por conveción se suele devolver el recurso creado.
        ], 201);                                                // Indica que la creación del recurso se ha realizado correctamente.
    }

    /**
     * Display the specified resource.
     * Es un Read específico de notas.
     */
    public function show(string $id):JsonResponse
    {
        //
        $note = Note::find($id);
        return response()->json($note, 200);
    }

    /**
     * Show the form for editing the specified resource.
     * Se usa para mostrar las notas y indicar cual se quiere editar, eso es trabajo de formulario de frontend.
     */
    // public function edit(string $id)                    
    // {
        // 
    // }

    /**
     * Update the specified resource in storage.
     * Es un Update específico de nota.
     */
    public function update(NoteRequest $request, string $id):JsonResponse
    {
        // Buscamos la no, pero no para devolverla sino editarla.
        $note = Note::find($id);

        // Actualizamos los atributos de la nota.
        $note->title = $request->title;
        $note->content = $request->content;

        // Sobrescribimos la nota mediante su id.
        $note->save();

        // Devolvemos una respuesta de la acción de la petición.
        return response()->json([
            'success' => true,
            'data' => $note ,                                   // Por convención devolvemos el recurso actualizado, para que el frontend no tenga que hacer una solicitud.
        ], 200);
    }

    /**
     * Remove the specified resource from storage.
     * Es un Delete específico de nota.
     */
    public function destroy(string $id):JsonResponse
    {
        // Busca la nota y la elimina
        Note::find($id)->delete();

        return response()->json([
            'success' => true
        ], 200);
    }
}

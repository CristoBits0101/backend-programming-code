<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Note;                                    // Añadimos el modelo de consultas.
use App\Http\Requests\NoteRequest;                      // Añadimos el archivo de validación de las respuestas.
use Illuminate\Http\JsonResponse;                       // Añadimos las dependencias de JSON para poder devolver respuestas en JSON.
use App\Http\Resources\NoteResource;                    // Añadimos el archivo de recurso de la petición.
use Illuminate\Http\Resources\Json\JsonResource;

class NoteController extends Controller
{                                               
    public function index(): JsonResource // JsonResponse                   
    { 
        // return response()->json(Note::all(), 200);    
        return NoteResource::collection(Note::all());   // Ahora en vez de devolver una respuesta JSON devolvemos una colleción de datos.
    }

    public function store(NoteRequest $request):JsonResponse    
    {
        //
        $note = Note::create($request->all());
        return response()->json([
            'success' => true,                                  
            // 'data' => $note       
            'data' => new NoteResource($note)                            
        ], 201);                                                
    }

    public function show(string $id): JsonResource // JsonResponse
    {
        //
        $note = Note::find($id);
        // return response()->json($note, 200);
        return new NoteResource($note);
    }

    public function update(NoteRequest $request, string $id):JsonResponse
    {
        $note = Note::find($id);

        $note->title = $request->title;
        $note->content = $request->content;

        $note->save();

        return response()->json([
            'success' => true,
            // 'data' => $note       
            'data' => new NoteResource($note)                                     
        ], 200);
    }

    public function destroy(string $id):JsonResponse
    {
        Note::find($id)->delete();

        return response()->json([
            'success' => true
        ], 200);
    }
}

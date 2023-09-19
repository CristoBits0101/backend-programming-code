<?php

namespace App\Http\Resources;

use Illuminate\Http\Request;
use Illuminate\Http\Resources\Json\JsonResource;

class NoteResource extends JsonResource
{
    /**
     * Transform the resource into an array.
     * 
     * Modifica el formato del JSON estandar que se devuelve al frontend al hacer una solicitud.
     *
     * @return array<string, mixed>
     */
    public function toArray(Request $request): array
    {
        // return parent::toArray($request);
        return [
            'id' => $this->id,                          // Permitimos que el id se devuelva de manera estandar.
            'title' => 'Title:' . $this->title,         // Modificamos el formato del título con la T en mayúsculas y con doble punto.     
            'example' => 'campo de ejemplo'             // Podemos añadir un nuevo campo.
        ];
    }
}

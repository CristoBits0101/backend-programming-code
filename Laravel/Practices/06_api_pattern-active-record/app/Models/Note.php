<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Note extends Model
{
    use HasFactory;
    
    // Si el array de la palabra reservada guarded está vacío, todos los campos son obligatorios de cumplimentar.
    protected $guarded = [];
    
    // El password se oculta automáticamente.
    // protected $hidden = "password";

    // Los oculta en el JSON para que devuelve al frontend.
    protected $hidden = ["created_at", "updated_at"]; 
}

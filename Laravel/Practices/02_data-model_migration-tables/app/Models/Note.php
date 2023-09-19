<?php

//

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Note extends Model
{
    use HasFactory;

    protected $table = "notes";                 // Vincula a un sistema de persistencia, cuando no se respeta la convención de Laravel, sino la de empresa.
    protected $fillable = ["title","etc"];      // Establece qué campos de la tabla se pueden rellenar, si rellenas fillable no hace falta rellenar guarded.
    protected $guarded = ["id","etc"];          // Establece qué campos de la tabla no se pueden rellenar, si rellenas guarded no hace falta rellenar fillable.
    protected $cast = ["title" => "integer"];   // Cambia el tipo de dato que se va a guardar en un campo de la tabla en circunstancias especiales.
    protected $hidden = "password";             // Oculta datos cuando serializamos, como por ejemplo la contraseña guardada en la base de datos.
}

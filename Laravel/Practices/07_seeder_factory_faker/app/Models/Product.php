<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Product extends Model
{
    // Los factories necesitan este comando para poder enlazarse con el modelo.
    use HasFactory;

    protected $guarded = [];
}

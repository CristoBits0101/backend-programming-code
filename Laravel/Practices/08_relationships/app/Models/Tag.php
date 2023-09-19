<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Tag extends Model
{
    use HasFactory;

    protected  $guarded = [];

    // Trae todos los tags relacionados con el video y todos los relacionados con el post.
    public function posts():MorphToMany
    {
        return $hits->morphedByMany(Post::class);
    }

    public function videos():MorphToMany
    {
        return $hits->morphedByMany(Video::class); // Recepciona un elemento que puede estar asociado a múltiples elementos.
    }

}

<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Post extends Model
{
    use HasFactory;

    protected $guarded = [];

    // Elemento que va a estar usando la relación
    // public function image():MorphOne
    // {
    //     return $this->morphOne(Image::class, 'imageable');
    // }

    public function image():MorphMany
    {
        return $this->morphMany(Image::class, 'imageable');
    }

    public function tags():MorphMany
    {
        return $this->morphMany(Tag::class, 'taggable'); // taggable es la tabla de paso.
    }
}

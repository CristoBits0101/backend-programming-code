<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Image extends Model
{
    use HasFactory;

    protected $guarded = [];

    // Es la clase que va a estar morfeandose.
    public function imageable():MorphTo
    {
        return $this->morphTo();
    }
}

<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Relations\BelongsToMany;
use Illuminate\Database\Eloquent\Model;

class Role extends Model
{
    use HasFactory;

    protected  $guarded = [];

    // Ahora usuarios también pertenece a roles y necesitamos una función para consumir los registros de la tabla.
    // User no tiene la clave foráde de Phone por eso no puede consumir User solo al revés.
    public function users(): BelongToMany
    {
        // Pivot es para que aparte de la información de la relación traiga la información extra que hay.
        return $this->BelongsToMany(User::class)->withPivot('added_by');
    }
}

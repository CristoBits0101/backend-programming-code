<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Relations\BelongsTo;

class Phone extends Model
{
    use HasFactory;

    // A la variable reservada $guarded para indicarle que se puede manipular todos los campos de la tabla.
    protected $guarded = [];

    // BelongsTo, indica que esta función establecerá una relación de pertenencia con otro modelo.
    /**
     *  - Sirve para en 1 to 1 y el 1 to *
     *  - En este caso el teléfono pertenece al usuario.
     *  - El usuario no tiene clave foránea de teléfono y teléfono si tiene la de usuario.
     *  - Esto significa que el usuario tiene y el teléfono pertenece.
     */
    public function user(): BelongsTo
    {
        return $this->belongsTo(User::class);
    }

    // public function sim(): HasOne
    // {
    //     return $this->hasOne(User::class);
    // }

    public function sim(): HasMany
    {
        return $this->hasMany(User::class);
    }

}

<?php

namespace App\Models;

// use Illuminate\Contracts\Auth\MustVerifyEmail;
use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Relations\HasMany;
use Illuminate\Database\Eloquent\Relations\HasOne;
use Illuminate\Foundation\Auth\User as Authenticatable;
use Illuminate\Notifications\Notifiable;
use Laravel\Sanctum\HasApiTokens;
use Illuminate\Database\Eloquent\Relations\BelongsToMany;

class User extends Authenticatable
{
    use HasApiTokens, HasFactory, Notifiable;

    /**
     * The attributes that are mass assignable.
     *
     * @var array<int, string>
     */
    protected $fillable = [
        'name',
        'email',
        'password',
    ];

    /**
     * The attributes that should be hidden for serialization.
     *
     * @var array<int, string>
     */
    protected $hidden = [
        'password',
        'remember_token',
    ];

    /**
     * The attributes that should be cast.
     *
     * @var array<string, string>
     */
    protected $casts = [
        'email_verified_at' => 'datetime',
        'password' => 'hashed',
    ];

    // Ahora la función va en plural porque es 1 to * "un usuario puede tener muchos teléfonos".
    // Ahora Laravel buscara todos los teléfonos con la id del usuario dentro de la tabla.
    public function phones(): HasMany
    {
        return $this->hasMany(Phone::class);
    }

    // El usuario está relacionado con Phone, pero también con Role.
    // Pivot es para que aparte de la información de la relación traiga la información extra que hay.
    public function roles(): BelongsToMany
    {
        return $this->belongsToMany(Role::class)->withPivot('added_by');
    }

    // Método para acceder a la Sim sin tener relación directa mediante clave.
    // public function phoneSim():HasOneThrough
    // {
    //     // La relación final es a la Sim class a través de la Phone class.
    //     return $this->hasOneThrough(Sim::class, Phone::class);
    // }
    public function phoneSim():HasManyThrough
    {
        // La relación final es a la Sim class a través de la Phone class.
        return $this->hasManyThrough(Sim::class, Phone::class);
    }

    // Elemento que va a estar usando la relación
    // public function image():MorphOne
    // {
    //     return $this->morphOne(Image::class, 'imageable');
    // }

    // 1 to *
    public function image():MorphMany
    {
        return $this->morphMany(Image::class, 'imageable');
    }
}

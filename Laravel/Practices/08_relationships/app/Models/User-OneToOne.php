<?php

namespace App\Models;

// use Illuminate\Contracts\Auth\MustVerifyEmail;
use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Relations\HasOne;
use Illuminate\Foundation\Auth\User as Authenticatable;
use Illuminate\Notifications\Notifiable;
use Laravel\Sanctum\HasApiTokens;

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

                                                // Por convención, si la relación es 1 a 1 se pone el nombre de la función en singular.
    public function phone(): HasOne             // Devolvemos un HasOne, que se permite en las relaciones entre modelos.
    {
        return $this->hasOne(Phone::class);     // Retornamos un HasOne del modelo Phone, "Retorna los teléfonos relacionados con el id del usuario".
        
        // Si el sistema no tuviera la clave foránea, habría que indicarla.
        // El elemento Phone contiene un user_id con mí id.
        // return $this->hasOne(Phone::class, 'user_id', 'id');  
    }
}

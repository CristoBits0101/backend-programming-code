<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\NoteController;

// Laravel protege las rutas a traves de los middleware.
// auth:sanctum es un middleware de autenticación.
// Indica que el usuario solo puede acceder a la ruta si se ha autentificado previamente.
// Se utiliza en APIs publicas.
// Route::middleware('auth:sanctum')->get('/user', function (Request $request) {
//     return $request->user();
// });

// La ruta no tiene nombre porque no va a devolver ninguna vista.
Route::resource('/note', NoteController::class);

// Se le puede añadir prefijos a la URL.
// La buena práctica es poner el nombre de la versión.
// Siver tanto para rutas de apis como webs.
// Route::prefix('/v1')->resource('/note', NoteController::class);

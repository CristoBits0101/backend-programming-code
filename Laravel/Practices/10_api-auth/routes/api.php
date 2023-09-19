<?php

use App\Http\Controllers\AuthController;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "api" middleware group. Make something great!
|
*/

// Sanctum es una librería de Laravel diseñada para la gestionar la autenticación de usuarios.
// El middleware comprueba que el usuario tiene un token de autenticación valido.
// Route::middleware('auth:sanctum')->get('/user', function (Request $request) {
//     return $request->user();
// });

Route::post('/create', [AuthController::class, 'createUser']);
Route::post('/login', [AuthController::class, 'loginUser']);
Route::middleware('auth:sanctum')->get('/user', function (Request $request) {
    return $request->user();
});

// AL HACER LAS PETICIONES RECUENDA QUE PARA LOGIN CONFIGURA EL HEADER / AUTHORIZATION CON EL TOKEN QUE TIENES EN LA SESIÓN.
// Authorization  Bearer 1|Fy7EnPSLOlLFBGEuzAkvsr5Go8h6sBIHYz9EUIRg
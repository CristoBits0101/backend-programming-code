<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;
use App\Http\Controller\ExampleController;

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

Route::middleware('auth:sanctum')->get('/user', function (Request $request) {
    return $request->user();
});

// Pasamos el nombre clave con el que se regístro el middleware con el que vamos a estar protegiendo la ruta.
// Route::middleware('example')->get('/', [ExampleController::class, 'index']);
// Route::get('/access-denied', [ExampleController::class, 'accessDenied'])->name('access-denied');


// GRUPOS
// Route::middleware(['example', 'auth', 'admin'])->group(function (){
//     Route::get('/', [ExampleController::class, 'index']);
    // EL middleware de admin no afecta a está línea.
//     Route::get('/auth', [ExampleController::class, 'auth'])->withoutMiddleware('admin');
//     Route::get('/admin', [ExampleController::class, 'admin']);
// });

// En este caso el middleware se está declarando desde el controlador através del constructor.
Route::get('/', [ExampleController::class, 'index']);
Route::get('/access-denied', [ExampleController::class, 'accessDenied'])->name('access-denied');

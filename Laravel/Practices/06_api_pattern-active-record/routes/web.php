<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/


// Estas son rutas monolito porque generan tanto la devolución de las vistas, como el control de la aplicación y de la persistencia.
Route::get('/', function () {
    return view('welcome');
});

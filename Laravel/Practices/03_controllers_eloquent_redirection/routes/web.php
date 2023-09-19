<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\UserController;

Route::get('/', [UserController::class, 'index'])->name('user.index');

// Cuando se acuda a la ruta create, se ejecutará la función créate de la clase UserController, que el nombre de link es user. Create.
Route::get('/Create', [UserController::class, 'create'])->name('user.create');

<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\NoteController;
use App\Http\Controllers\PostController;

// Devuelve una vista estática.
Route::view('/', 'welcome');

// CREATE
Route::get('/note/create', [NoteController::class, 'create'])->name('note.create');
Route::post('/note/store', [NoteController::class, 'store'])->name('note.store');

// READ
Route::get('/note', [NoteController::class, 'index'])->name('note.index');
Route::get('/note/show/{note}', [NoteController::class, 'show'])->name('note.show');

// UPDATE
Route::get('/note/edit/{note}', [NoteController::class, 'edit'])->name('note.edit');
Route::put('/note/update/{note}', [NoteController::class, 'update'])->name('note.update');

// DELETE
Route::delete('/note/destroy/{note}', [NoteController::class, 'delete'])->name('note.delete');

// Ejemplo con un bloc de notas.
// Representa un conjunto de rutas POST que va a controllar.
// Facilita los CRUD.
Route::resource('/post', PostController::class);

// Route::patch('/tareas/{id}', 'TareaController@update')->name('tareas.update');

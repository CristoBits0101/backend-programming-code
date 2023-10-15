# PASO 01) CREAR LAS MIGRACIONES

# PASO 02) CREAR LOS MODELOS

# PASO 03) CREAR LAS RELACIONES

# PASO 04) CREAR LAS RUTAS

// STATIC
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

// CRUD
Route::resource('/post', PostController::class);

// PATCH
Route::patch('/tareas/{id}', 'TareaController@update')->name('tareas.update');

# PASO 05) CREAR LOS MIDDLEWARE

# PASO 06) CREAR LOS CONTROLADORES

NoteController.php

# PASO 07) CREAR LAS FUNCIONES

# PASO 08) CREAR LAS CONSULTAS

# PASO 09) CREAR LOS RETORNOS

# PASO 10) CREAR LAS REFIRECCIONES

# PASO 11) CREAR LAS REQUEST

# PASO 12) CREAR LOS RESOURCES

# PASO 13) CREAR LAS VISTAS

# PASO 14) AÑADE LAS DIRECTIVA @csrf

# PASO 15) AÑADE LAS DIRECTIVA method('PUT')
# PASO 01) CREAR LAS MIGRACIONES

/database/migrations/2023_08_08_114949_create_notes_table.php

# PASO 02) CREAR LOS MODELOS

# PASO 03) CREAR LAS RELACIONES

# PASO 04) CREAR LAS RUTAS

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

# PASO 05) CREAR LOS MIDDLEWARE

# PASO 06) CREAR LOS CONTROLADORES

/app/Http/Controllers/NoteController.php

# PASO 07) CREAR LAS FUNCIONES

# PASO 08) CREAR LAS CONSULTAS

# PASO 09) CREAR LAS REFIRECCIONES

# PASO 10) CREAR LAS REQUEST

# PASO 11) CREAR LOS RESOURCES

# PASO 12) CREAR LAS VISTAS

# PASO 13) AÑADE LAS DIRECTIVA @csrf

# PASO 14) AÑADE LAS DIRECTIVA method('PUT')
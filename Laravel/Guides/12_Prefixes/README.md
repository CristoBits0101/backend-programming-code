# LAS RUTAS PERMITEN AÑADIRLE UN PREFIJO EN LA URL

Route::prefix('/v1')->resource('/note', NoteController::class);
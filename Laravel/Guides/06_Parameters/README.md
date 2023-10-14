# COMO ENVIAR Y RECOGER PARÁMETROS EN UNA URL

# PASO 1) PERMITIR QUE LA URL PUEDE RECEPCIONAR PARÁMETROS

1.1. Creamos la ruta web añadiendo en la sintaxis el simbolo {name_parameter} para que pueda recepcionar parámetros:
        Route::get(/note/{id}, [NoteController::class, 'note'])->name('note')

1.2. Creamos la función note con una variable $id que almacena el id de la URL por convesión de asociación de nombres:
        public function note($id){
                Note::find($id);
        }

1.3. Paso de parámetros mediante enlaces:
        <form method="POST" action="{{ route('note.update', $note->id) }}">
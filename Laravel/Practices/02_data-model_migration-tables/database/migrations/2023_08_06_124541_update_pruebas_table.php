<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        // Table es un método de la clase Schema para actualizar tablas.
        Schema::table('notes', function (Blueprint $table){

            $table->string('author');                     // Añadimos una nueva columna.
            $table->dropColumn(['example1', 'example2']); // Elimina las columnas que se especifiquen dentro del parámetro array.

        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        // Los rollbacks de las actualizaciones es deshacer los cambios, no las migraciones.
        Schema::dropColumn(['author']);
    }
};

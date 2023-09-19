<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

// Clase de nombre anónimo que extiende de Migration.
return new class extends Migration
{
    /**
     * Run the migrations.
     * Contiene la info para crear la tabla.
     */
    public function up(): void
    {
        // Class::method
        // Crear tabla.
        Schema::create('notes', function(Blueprint $table){
            $table->id();
            $table->string('title', 255);           // Tipo de dato + nombre de columna + longitud máxima.
            $table->string('token', 64)->unique();  // Debe ser único para poder ser almacenado en la BD.
            $table->text('abilities')->nullable();  // Textos largos, el valor del campo puede ser nulo.
            $table->boolean('done');                // Nombre de la tabla booleana 'done'.
            $table->integer('example1');            // Admite números enteros positivos y negativos.
            $table->unsignedInteger('example2');    // Admite números enteros que no puede ser negativo.
            $table->unsignedBigInteger('example3'); // Admite grandes números enteros que no puede ser negativo.
            $table->bigInteger('example4');         // Admite números enteros de larga longitud.
            $table->float('example5')->default(2);  // Admite decimales cortos, valor por defecto 2.
            $table->double('example6');             // Admite decimales largos.
            $table->enum('state', ['A','B','2']);   // Admite enumerados, en el array se especifican.
            $table->date('deadline');               // La fecha se añade cuando se modifique el campo.
            $table->timestamps();                   // Agrega 2 columnas de registros created_at y updated_at.
        });
    }

    /**
     * Reverse the migrations.
     * Contiene la info para revertir la tabla.
     */
    public function down(): void
    {
        // Class::method
        // Revertir acciones en una tabla.
        Schema::dropIfExists('notes');
    }
};

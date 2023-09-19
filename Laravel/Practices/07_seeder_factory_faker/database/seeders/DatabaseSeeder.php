<?php

// Es el encargado de generar los seeders.
namespace Database\Seeders;

// use Illuminate\Database\Console\Seeds\WithoutModelEvents;

use App\Models\Product;
use Illuminate\Database\Seeder;

class DatabaseSeeder extends Seeder
{
    /**
     * Seed the application's database.
     */
    public function run(): void
    {
        // El seeder y el modelo estan vinculados de manera interna, a través de useFactory y Product::factory().
        
        // Crear un factory "un regístro aleatorio", se puede copiar 3 veces y genera 3 o usar bucles.
        // Product::factory()->create();

        // Crear varios factory mediante count. 
        Product::factory()->count(150)->create();
    }
}

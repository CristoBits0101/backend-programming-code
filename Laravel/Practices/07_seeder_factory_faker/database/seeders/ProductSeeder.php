<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
// Hay que importar el modelo para poder interactuar con la base de datos.
use App\models\Product;  

class ProductSeeder extends Seeder
{
    /**
     * Run the database seeds.
     * Se ejecuta al ejecutar los seeders en la base de datos.
     */
    public function run(): void 
    {
        // 
        Product::create([
            'Name' => 'Agua 1',
            'info' => 'Agua Vitalia',
            'description' => 'Agua de gran calidad y sabor',
            'Price' => 0.55
        ]);

        // 
        Product::create([
            'Name' => 'Agua 2',
            'info' => 'Agua Font Bella',
            'description' => 'Agua de gran calidad y sabor',
            'Price' => 0.55
        ]);
    }
}

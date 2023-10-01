<?php

// Es el encargado de generar los seeders.
namespace Database\Seeders;

// use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;

class DatabaseSeeder extends Seeder
{
    /**
     * Seed the application's database.
     */
    public function run(): void
    {
        // Hay que indicar que seeders queremos ejecutar.
        $this->call([
            ProductSeeder::class
        ]);
    }
}

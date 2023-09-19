<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;
use Illuminate\Support\Str;

class ProductFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array 
    {
        // Indicamos a Laravel como falsear datos.
        // Genera cadenas y flotantes aleatorios.
        // return [
        //     'name' => Str::random(25),
        //     'info' => Str::random(35),
        //     'description' => Str::random(25),
        //     'price' => $this->faker->randomFloat(2, 1.0, 125.0),
        // ];

        // Mediante fake.
        // Fake tiene sus propios metodos que hacen random con estructuras conocidas (name, url, email...).
        return [
            'name' => fake()->name(),                   // Nombre aleatorio.
            'info' => fake()->sentence(),               // Frase aleatoria.
            'description' => fake()->paragraph(3),      // Párrafo aleatoria.
            'price' => fake()->numberBetween(1,125),    // Precio aleatorio.
        ];
    }
}

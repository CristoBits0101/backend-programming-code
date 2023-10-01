# DATOS DE PRUEBA DINÁMICOS FALSIFICADOS

# PASO 1) CREAR EL FACTORY

1.1. php artisan make:factory ProductFactory

1.2. Rellenar el factory:
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
                return 
                [
                    'name' => fake()->name(),                   // Nombre aleatorio.
                    'info' => fake()->sentence(),               // Frase aleatoria.
                    'description' => fake()->paragraph(3),      // Párrafo aleatoria.
                    'price' => fake()->numberBetween(1,125),    // Precio aleatorio.
                ];
            }
        }

# PASO 2) INDICAR AL SEEDER QUE AHORA VA A GENERAR LOS DATOS MEDIANTE UN FACTORY

2.1.    class ProductSeeder extends Seeder
        {
            public function run(): void
            {
                // El seeder y el modelo estan vinculados de manera interna, a través de useFactory y Product::factory().
                
                // Crear un factory "un regístro aleatorio", se puede copiar 3 veces y genera 3 o usar bucles.
                // Product::factory()->create();

                // Crear varios factory mediante count. 
                Product::factory()->count(150)->create();
            }
        }

# PASO 3) AÑADIR EL SEEDER AL DATABASESEEDER INDICANDO CUANTOS DATOS ALEATORIOS DEBE GENERAR

3.1.    class DatabaseSeeder extends Seeder
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


# PASO 3) EJECUTAR EL SEEDER PARA AÑADIR DATOS A LA BD

3.1. Ejecutamos los seeder:
        php artisan db:seed
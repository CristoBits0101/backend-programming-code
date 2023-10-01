# DATOS DE PRUEBAS ESTÁTICOS

# PASO 1) CREAR EL SEEDER

1.1. php artisan make:seeder ProductSeeder

1.2. Rellenar el seeder con datos de prueba:
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

# PASO 2) AÑADIR EL SEEDER AL DATABASESEEDER

2.1.    class DatabaseSeeder extends Seeder
        {
            public function run(): void
            {
                // Hay que indicar que seeders queremos ejecutar.
                $this->call([
                    ProductSeeder::class
                ]);
            }
        }

# PASO 3) EJECUTAR EL SEEDER PARA AÑADIR DATOS A LA BD

3.1. php artisan db:seed
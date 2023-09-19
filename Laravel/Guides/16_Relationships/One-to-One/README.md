# TABLA USER  "TIENE UN"  TELÉFONO
# TABLA PHONE "PERTENECE" A USER

# PASO 1)

1.1. Crear las 2 migraciones y modelos:
        a. php artisan make:model User --migration
        b. php artisan make:model Phone --migration

1.2. Añadir los campos de la tablas.

1.3. Añadir una clave primaria como foránea:
        $table->unsignedBigInteger('phone_number');
        $table->unsignedBigInteger('user_id');

1.4. Migrar las estructuras a la base de datos:
        php artisan migrate

# PASO 2)

2.1. Añadir la relación a la tabla user:
        public function phone(): HasOne
        {
            return $this->hasOne(Phone::class);
        }

2.2. Añadir la relación a la tabla phone:
        public function user(): BelongsTo
        {
            return $this->belongsTo(User::class);
        }

# PASO 3) 

3.1. Crear los seeder:
        a. php artisan make:seeder UserSeeder
        b. php artisan make:seeder PhoneSeeder

3.2. Añadir los datos de prueba para la tabla user:
        public function run(): void
        {
            user::create([
                'name' => 'example',
                'email' => 'example@example.com',
                'password' => Hash::make('12345678'),
            ]);
        }

3.3. Añadir los datos de prueba para la tabla phone:
        public function run(): void
        {
            Phone::create([
                'country_prefix' => 34,
                'phone_number' => 758758,
                'user_id' => 1
            ]);
        }

3.4. Añadir los seeder al archivo DatabaseSeeder.php
        $this->call([
            UserSeeder::class,
            PhoneSeeder::class
        ]);

3.5. Ejecutar los seeders:
        php artisan db:seed

# PASO 4) 

4.1. Crear el UserController:
        php artisan make:controller UserController

4.2. Crear la función de retorno de vista o JSON:
        class UserController extends Controller
        {
            public function index()
            {
                $user = User::find(1);
                return view('index', compact('user'));
            }
        }

# PASO 5)

5.1. Crear la vista Blade.

# PASO 6)

6.1. Crear la ruta web o API.

# PASO 7)

7.1. Crear las validaciones.

7.2. Crear los response si devolvemos un JSON.
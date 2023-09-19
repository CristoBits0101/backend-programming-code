# PASOS PARA CREAR UN CONTROLADOR QUE GESTIONE LAS PETICIONES A LAS RUTAS

# PASO 1) CREAR UN CONTROLADOR POR RECURSO

1.1. Creamos el controlador a través del comando de consola, respetando la convención de CamelCase:
        php artisan make:controller UserController
        Laravel\Practices\03_controllers_eloquent_redirection\app\Http\Controllers\UserController.php

1.2. Añadir la función que va a realizar la gestión procesos:
        public function index() {
            dd("Hello, World!");
        }

# PASO 2) CREAR LA RUTA QUE VA A ESTAR GESTIONADA POR EL CONTROLADOR

2.1. Importamos el controllador en el archivo de rutas web:
        use App\Http\Controllers\UserController;

2.2. Creamos la ruta que usan verbos por defecto, se asocian a un controlador, que contiene funciones que invocan vistas después de pasarles los datos.
        Route::get('/', [UserController::class, 'index'])->name('user.index')

# PASO 3) CREAR LA VISTA QUE VA A ESTAR INVOCANDO EL CONTROLADOR

3.1. "Crear la vista index, el método es como vimos en la guía 2 de Blade".

3.2. Indicar al controlador que tiene que retornar la vista index.
        public function index() {
            return view('index'); 
        }

# PASO 4) AÑADIR EL MODELO AL CONTROLADOR PARA PODER TENER ACCESO A LA BASE DE DATOS Y REALIZAR CONSULTAS

4.1. Importamos el modelo en el controlador:
        use App\Models\User

4.2. Realizar la consulta a la BD de los datos que queremos en esté caso mediante Eloquent que usa el patrón de diseño active record.
        Buscamos los datos de todos los usuarios de la BD: 
            $users = User::all();

4.3. Pasamos los datos a la vista Blade para que pueda serializarlos:
        La vista puede acceder a los datos de la variable users que equivale a la clave users:
            return view('index', compact('users'));

# PASO 5) SERIALIZAR LOS DATOS QUE LE PASAMOS A LA VISTA

5.1. Recorrer users dentro de la vista con el @foreach y añadimos las etiquetas necesarias antes y después del foreach.

# PASO 6) CREAR UN NUEVO USUARIO

6.1. Creamos la función create dentro del controlador.

6.2. Creamos un nuevo usuario del modelo y encriptar la clave con Hash::make:
        // Creando un nuevo User de la clase model User.
        $user = new User;
        $user->name = "Cristo";
        $user->password = Hash::make('123456');

        // Eloquent.
        User::create([
            "name" = "Cristo";
            "password" = Hash::make('123456');
        ])

6.3. Añadir al final la función save() para que confirme la creación del usuario y lo añada a la base de datos:
        $user->save();

# PASO 7) REDIRECCIONAR DESPUÉS DE CREAR EL USUARIO

7.1. Como es una query a la bd no devuelve ninguna vista y hay que redireccionar hacia alguna vista con la que el usuario interactúe.
        return redirect()->route('index');
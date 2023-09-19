# PASOS PARA VALIDAR LOS DATOS DESPUÉS DE CREAR EL CÓDIGO

# PASO 1) VALIDAR DESDE UN FICHERO EXTERNO PARA NO SOBRECARGAR EL CONTROLADOR

1.1. Crear la clase de tipo request que va a validar los datos:
        php artisan make:request NoteRequest

1.2. Configurar la autorización en el fichero con la estructura permitida en los campos:
        public function authorize(): bool
        {
            return true;                  
        }

        public function rules(): array
        {
            return [
                'title' => 'required | max:255 | min:3',
                'description' => 'required | max:255 | min:3'
            ];
        }

# PASO 2) TRANSMITIR LAS VALIDACIONES A LAS FUNCIONES DEL CONTROLADOR

2.1. Importar la request en el controlador:
        use App\Http\Requests\NoteRequest;

2.2. Añadir a las funciones que se quieren validar:
        public function store(NoteRequest $request):RedirectResponse

# PASO 3) EN BLADE PODEMOS USAR LAS DIRECTIVAS PARA PASAR LOS ERRORES DE VALIDACIÓN

3.1. Añadir la directiva de error con el nombre del campo del cual se quiere mostrar el error que pueda tener y el método $mensaje como en PHP:
        <input type="text" id="title" name="title"/>
        @error('title')
            <p style="color:red;">
                {{ $message }}
            </p>
        @enderror

        <input type="text" id="description" name="description"/>
        @error('description')
            <p style="color:red;">
                {{ $message }}
            </p>
        @enderror
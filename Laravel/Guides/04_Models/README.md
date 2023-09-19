# PASOS PARA CREAR UN MODELO QUE INTERACTÚE CON LOS REGISTROS DE LAS TABLAS A TRAVÉS DE LA MIGRACIÓN

# PASO 1) GENERAR EL MODELO Y SUS CONFIGURACIONES ESTÁNDAR DE SEGURIDAD

1.1. Generamos un modelo que interactúe con la base de datos respetando la conveción de nombres para la modelos:
        php artisan make:model Note

1.2. Indicar que campos de la tabla se pueden editar o cuales no se puede editar y ocultar los datos sensibles:
        protected $fillable = [
            "title", 
            "description"
        ];

        protected $hidden = ['password'];
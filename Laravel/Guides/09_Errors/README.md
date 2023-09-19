# PASOS PARA SERIALIZAR ERRORES EN EL CÓDIGO DE LAS VALIDACIONES DE FORMULARIOS O TROWN

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
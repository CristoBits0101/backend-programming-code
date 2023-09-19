<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;

class ExampleController extends Controller
{
    // Esto protegería todas las peticiones al controlador ExampleController con el middleware example.
    // Bloquearía el acceso a todas las rutas del controlador o las dejaría pasar depende de la configuración en el middleware.
    // El constructor ejecuta los middleware antés de las funciones de las rutas.
    // Esto puede generar un error circular cuando el middleware hace un redirection.
    // Se suele usar en los paneles de autentificación.
    public function __construct()
    {
        $this->middleware('example');
    }

    public function index()
    {
        return response()->json("Hello, World!", 200);
    }

    public function accessDenied()
    {
        return response()->json("Access denied", 403);
    }
}

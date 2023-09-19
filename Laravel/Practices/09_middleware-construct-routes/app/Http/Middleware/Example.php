<?php

namespace App\Http\Middleware;

use Closure;
use Illuminate\Http\Request;
use Symfony\Component\HttpFoundation\Response;

class Example
{
    /**
     * Handle an incoming request.
     *
     * @param  \Closure(\Illuminate\Http\Request): (\Symfony\Component\HttpFoundation\Response)  $next
     */
    public function handle(Request $request, Closure $next): Response
    {
        // Este middleware protege la ruta para que nadie tenga acceso.
        // Si se intenta acceder a la ruta raíz te redirecciona a no acceso.
        return redirect()->route('access-denied');
        return $next($request);
    }
}

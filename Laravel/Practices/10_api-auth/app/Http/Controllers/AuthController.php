<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use App\Http\Requests\CreateUserRequest;
use App\Http\Requests\LoginRequest;
use App\Models\User;
use Illuminate\Support\Facades\Hash;
use Illuminate\Support\Facades\Auth;

class AuthController extends Controller
{
    // Ruta POST
    public function createUser(CreateUserRequest $request)
    {
        $user = User::create([
            'name' => $request->name,
            'email' => $request->email,
            'password' => Hash::make($request->password),   // Encriptamos la clave con la clase Hash y el método make.
        ]);

        return response()->json([
            'status' => true,
            'message' => 'User created successfully',
            // Cada vez que el usuario nos pida algo nos tiene que entregar el token que le estamos dando para identificarlo.
            // Pertece al paquete de sanctum para la gestión de tokens, que nos permite crear tokens de usuario.
            // plainText es un formato de generación de tokens.
            'token' => $user->createToken("API TOKEN")->plainTextToken,                
        ], 200);
    }

    // Ruta POST
    public function loginUser(LoginRequest $request)
    {
        // La clase auth permite acceder a los datos de los usuarios registrados.
        // Podriamos acceder a sus datos Auth::user()->name(), Auth::user()->email();;
        // Auth::user()->email();

        // Intentar autentificar un usuario.
        if (!Auth::attempt($request->only(['email', 'password']))) {
            return response()->json([
                'status' => false,
                'message' => 'Email and password is not correct',
            ], 401);
        }

        // Aunque se confirmo que el usuario está autentificado internamente con Auth::attempt, hay que darle un token de autentificación por eso se vuelve a buscar.
        $user = User::where('email', $request->email)->first();

        return response()->json([
            'status' => true,
            'message' => 'User login is successfully',
            'token' => $user->createToken("API TOKEN")->plainTextToken, 
        ], 200);

        // $email = $request->input('email');
        // $password = $request->input('password');

        // if (Auth::attempt(['email' => $email, 'password' => $password])) {
        //     // El usuario ha sido autenticado con éxito
        //     return redirect()->intended('/dashboard'); // Puedes redirigir a la página que desees
        // } else {
        //     // La autenticación falló
        //     return back()->withErrors(['email' => 'Credenciales incorrectas']);
        // }
    }
}

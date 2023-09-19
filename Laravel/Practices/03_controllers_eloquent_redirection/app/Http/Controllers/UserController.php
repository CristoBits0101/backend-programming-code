<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Hash;                    // Importamos la dependencia de la clase Hash.

class UserController extends Controller
{
    //
    public function index()
    {
        $users = User::all();                           // variable = model::query(); "Eloquent code".
        return view('user.index', ["users" => $users]); // method('template', ["clave" => $value]);
        // return view('user.index', compact('users')); // El valor lo iguala a la clave, forma resumida.
    }

    //
    public function create()
    {
                                                        // Creación de un nuevo usuario a través de Eloquent usando el modelo user.
        $user = new User();
        $user->name = "Cristo Rubén";
        $user->email = "pepe.chano@gmail.com";
        $user->password = Hash::make("password");       // La clase Hash con su metodo make encripta la contraseña de manera estática.
        $user->age = 18;
        $user->address = "C/ Paseo montaña de inagua";
        $user->zip_code = 35210;
        $user->save();                                  // Guarda los cambios en la base de datos.

        User::create([                                  // Crea y guarda un usuario a través de la clase User y el método create.
            "name" => "Cristo",
            "email" => "pepe.rubén@gmail.com",
            "password" => Hash::make("password"),
            "age" => 18,
            "address" => "C/ Paseo montaña de inagua",
            "zip_code" => 35210
        ]);

        return redirect()->route('user.index');
    }
}

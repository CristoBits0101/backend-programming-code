<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;

class UserController extends Controller
{
    //
    public function index()
    {
        // Indicamos que vamos a hacer un select.
        // raw permite que se interprete la consulta en la base de datos.
        $users = DB::select(DB::raw('select * from users where age = 30'));
        return view('user.index', compact('users'));
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

        return redirect()->route('user.index');
    }
}

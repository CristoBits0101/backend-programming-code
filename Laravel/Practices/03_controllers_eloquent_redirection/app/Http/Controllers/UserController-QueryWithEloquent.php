<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Hash;

class UserController extends Controller
{
    //
    public function index()
    {
        // $users = User::find(23);                         // Con find buscamos por el id.
        // $users = User::findOrFail(23);                   // findOrFail lanza un error si no lo encuentra.

        // $users = User::where('age', 18)->first();        // Sustituyendo get() por first solo traemos el primer registro.

        // $users = User::where('age', 18)->get();          // El parámetro get() es necesario para que traiga los datos de las condiciones.
        // $users = User::where('age', '>=' 18)->get();
        // $users = User::where('age', '!=' 18)->get();
        // $users = User::where('age', 'LIKE' 18)->get();
        // $users = User::where('age', '>=' 18)->where('zip_code', 29000)->where('name', Cristo Rubén)->get();
        // $users = User::where('age', '>=' 18)->orWhere('zip_code', 29000)->orWhere('name', Cristo Rubén)->get();

        // $users = User::where('age', '>=' 18)->orderBy('age', 'ascend')->get();
        // $users = User::where('age', '>=' 18)->orderBy('age', 'descend')->get();
        // $users = User::where('age', '>=' 18)->orderBy('age', 'descend')->limit(5)->get(); // Con el limit podemos limitar la cantidad de registros que traemos de la base de datos.

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

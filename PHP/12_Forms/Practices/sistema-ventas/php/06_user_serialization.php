<?php

    // Importamos la clase insertar usuario que se va a usar para pintar el usuario.
    include_once "./02_insert-user.php";

    function user_serialization($listRegisteredUsers)
    {
        // Añadimos la cabecera de la tabla.
        $table = '
        <table 
            style="
                width: 1000px; 
                background-color: #F8F9F9; 
                border: 2px solid black;
                text-align: center;
                margin-left: auto;
                margin-right: auto;
            "
            cellpadding="1px" 
            cellspacing="1px"
            border="1px"
            >
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Apellidos</th>
                    <th>Tipo de usuario</th>
                    <th>Contraseña</th>
                    <th>Teléfono</th>
                    <th>Email</th>
                    <th>Foto</th>
                </tr>
            </thead>
        ';

        // Añadimos el cuerpo de la tabla de forma dinámica.
        $userNumber = 1;

        foreach ($listRegisteredUsers as $user) 
        {
            $table .= '
                <tbody>
                    <tr>
                        <td>' . $user->getNombre()     . '</td>
                        <td>' . $user->getApellidos()  . '</td>
                        <td>' . $user->getRole()       . '</th>
                        <td>' . $user->getContrasena() . '</td>
                        <td>' . $user->getTelefono()   . '</td>
                        <td>' . $user->getEmail()      . '</td>
                        <td><img width="100px" height="125px"
                        src='.$user->getFoto(). '></td>
                    </tr>
                </tbody>
                <tfoot>
                    <tr>
                        <td colspan="7">Número de usuario: ' . $userNumber++ . ' </td>
                    </tr>
                </tfoot>
            </table>
        ';
        }

        print_user($table);
    }
    
?>
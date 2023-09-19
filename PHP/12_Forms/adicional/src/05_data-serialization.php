<?php

    require "../src/04_user-class.php"; 

    // Load.
    $loadUserRegistration = file_get_contents('../files/txt/data.txt', FILE_USE_INCLUDE_PATH);
    $singleUser = explode(':', $loadUserRegistration);

    // Save.
    $loadUser = new UserData
    (
        $singleUser[0],
        $singleUser[1],
        $singleUser[2],
        $singleUser[3],
        $singleUser[4],
        $singleUser[5],
        $singleUser[6],
        $singleUser[7],
        $singleUser[8],
        $singleUser[9],
        $singleUser[10],
    );

    // Table.
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
                <th>Telefono</th>
                <th>Correo</th>
                <th>Contrasena1</th>
                <th>Idioma</th>
                <th>Visibilidad</th>
                <th>Tematica</th>
                <th>Fichero1</th>
                <th>Fichero2</th>
                <th>Foto</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>' . $loadUser->getNombre()      . '</td>
                <td>' . $loadUser->getApellidos()   . '</td>
                <td>' . $loadUser->getTelefono()    . '</th>
                <td>' . $loadUser->getCorreo()      . '</td>
                <td>' . $loadUser->getContrasena1() . '</td>
                <td>' . $loadUser->getIdioma()      . '</td>
                <td>' . $loadUser->getVisibilidad() . '</td>
                <td>' . $loadUser->getTematica()    . '</th>
                <td>' . $loadUser->getFichero1()    . '</td>
                <td>' . $loadUser->getFichero2()    . '</td>
                <td>
                    <img 
                        width="100px" 
                        height="125px"
                        src=' . $loadUser->getFoto() . '
                    >
                </td>
            </tr>
        </tbody>
        <tfoot>
            <tr>
                <td colspan="11">Fin de Tabla</td>
            </tr>
        </tfoot>
    </table>
    ';

    echo $table;

?>
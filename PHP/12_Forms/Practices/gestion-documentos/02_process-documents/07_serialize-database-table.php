<?php

    function serialize_data($associativeDataArray)
    {
        // Paso 7.1) Añadimos la cabecera de la tabla.
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
        ';

        // Añadimos campos con contenido a las filas.
        foreach ($associativeDataArray as $clave => $valor) 
        {
            $table .= '<th>' . $clave . '</th>';
        }

        // Cerramos la cabecera de la tabla.
        $table .= '
                </tr>
            </thead>
        ';
    
        // Paso 7.2) Añadimos el cuerpo de la tabla de forma dinámica.
        $table .= '
            <tbody>
                <tr>
        ';

        foreach ($associativeDataArray as $clave => $valor) 
        {
            // Si la clave es extensión de archivo, su valor es un array y hay que recorrerlo para obtener sus valores.
            if ($clave === 'EXTENSIÓN DE ARCHIVO') 
            {
                foreach ($valor as $key) 
                {
                    if (isset($key) && !empty($key)) 
                    {
                        $table .= '<td>' .  $key . '</td><br/>';
                    }
                }
            }

            // Si la clave es temática, su valor es un array y hay que recorrerlo para obtener sus valores.
            else if ($clave === 'TEMÁTICA') 
            {
                foreach ($valor as $key) 
                {
                    if (isset($key) && !empty($key)) 
                    {
                        $table .= '<td>' .  $key . '</td><br/>';
                    }
                }
            }

            // Si la clave no es un array rellena el campo.
            else 
            {
                $table .= '<td>' .  $valor . '</td>';
            }

        }

        $table .= '
                    </tr>
                </tbody>
                <tfoot>
                    <tr>
                        <td colspan="9"> Cristo Rubén Pérez Suárez </td>
                    </tr>
                    <tr>
                        <td colspan="9"> 2º DAW-DSW </td>
                    </tr>
                </tfoot>
            </table>
        ';

        // Paso 7.3) Imprimimos la tabla.
        echo $table;
    }

?>
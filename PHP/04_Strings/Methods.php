<ol>
    <!-- Devuelve el número de caracteres de una cadena -->
    <li>
        strlen($cadena)
    </li>
    <!-- Devuelve una subcadena de una cadena, desde la posición $inicio y con la longitud $largo si está presente (si no, hasta el final) -->
    <li>
        substr($cadena, $inicio[, $largo])
    </li>
    <!-- Devuelve la posición de $subcadena dentro de $cadena (a partir de $inicio, si está presente). FALSE ó 0 si no se encuentra. -->
    <li>
        strpos($cadena, $subcadena[, $inicio])
    </li>
    <!-- Devuelve la cadena en mayúsculas -->
    <li>
        strtoupper($cadena)
    </li>
    <!-- Devuelve la cadena en minúsculas -->
    <li>
        strtolower($cadena)
    </li>
    <!-- Devuelve la misma cadena pero eliminando los espacios del principio y el final -->
    <li>
        trim($cadena)
    </li>
    <!-- Elimina los espacios del principio del String. Se le puede pasar una lista de caracteres y también los eliminará. -->
    <li>
        ltrim($cadena[,$caracteres])
    </li>
    <!-- Cambia las ocurrencias de $txtBuscar en $cadena por $txtRemplazar (si se indica $numero, guarda el número de reemplazos realizados) -->
    <li>
        str_replace($txtBuscar, $txtRemplazar, $cadena[, $numero])
    </li>
    <!-- Devuelve la cadena invertida. -->
    <li>
        strrev($cadena)
    </li>
    <!--  -->
    <li>
        str_contains(string $haystack, string $needle)
    </li>
</ol>
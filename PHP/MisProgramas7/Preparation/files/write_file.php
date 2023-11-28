<?php

    function write_file($destinationData, $data)
    {
        file_put_contents($destinationData, $data, FILE_APPEND); // Almacenamiento de datos.
    }

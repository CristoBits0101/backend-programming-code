<?php

    function save_file($temporalName, $fileName)
    {
        move_uploaded_file($temporalName, $fileName); // Almacenamiento de ficheros.
    }

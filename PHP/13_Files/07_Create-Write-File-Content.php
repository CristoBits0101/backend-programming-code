<?php

    // 
    $file = fopen($filePath, $w);

    fputs($filePath, "texto");          
    fwrite($filePath, $variableName);

    fclose($file);

?>
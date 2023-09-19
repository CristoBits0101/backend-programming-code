<?php
// Lo intente aplicando espacios y sin ellos.
$contador = 1;
    for ($i=0; $i < $_REQUEST['base']; $i +=2) { 
      for ($e=$i; $e < $_REQUEST['base']; $e++) {
        echo $_REQUEST['simbolo']; 
      }
      for ($o=0; $o < $contador ; $o++) { 
        echo "&nbsp";
      }
      $contador +=1;
      echo "<br>";
    }
?>

<?php
$m = $_REQUEST['m'];
$d = $_REQUEST['d'];
    switch($m){
        case("Enero"):      if($d<=21){echo"Capricornio";} else{echo"Acuario";}     break;
        case("Febrero"):    if($d<=20){echo"Acuario";}     else{echo"Piscis";}      break;
        case("Marzo"):      if($d<=21){echo"Piscis";}      else{echo"Aries";}       break;
        case("Abril"):      if($d<=21){echo"Aries";}       else{echo"Tauro";}       break;
        case("Mayo"):       if($d<=22){echo"Tauro";}       else{echo"Géminis";}     break;
        case("Junio"):      if($d<=22){echo"Géminis";}     else{echo"Cáncer";}      break;
        case("Julio"):      if($d<=23){echo"Cáncer";}      else{echo"Leo";}         break;
        case("Agosto"):     if($d<=23){echo"Leo";}         else{echo"Virgo";}       break;
        case("Septiembre"): if($d<=23){echo"Virgo";}       else{echo"Libra";}       break;
        case("Octubre"):    if($d<=23){echo"Libra";}       else{echo"Escorpio";}    break;
        case("Noviembre"):  if($d<=23){echo"Escorpio";}    else{echo"Sagitario";}   break;
        case("Dicembre"):   if($d<=22){echo"Sagitario";}   else{echo"Capricornio";} break;
    }
?>
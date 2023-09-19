<?php
$num = $_POST['num'];
if (($num % 2)==0){
    echo "<br>Es par";
} 
else {
        echo "<br>Es impar";
}
if (($num % 5)==0){
    echo "<br>Es divisible entre 5";
} 
else {
    echo "<br>No es divisible entre 5";
}
?>
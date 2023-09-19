<?php
    print "La nota media es: " . 
    round(($_REQUEST['N1'] + $_REQUEST['N2'] + $_REQUEST['N3']) / 3 , $decimal = 2);
?>

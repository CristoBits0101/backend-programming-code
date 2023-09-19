<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Programa03</title>
</head>
<body>
    <?php
        $ANSI_BLACK_BACKGROUND = "\u001B[40m";
        print "Dies palabras en inglés:<br>";
        for ($i=1; $i < 11; $i++) { 
            switch ($i) {
                case '1':
                    echo "<table><tbody><tr><td>of</td><td>de</td></tr></tbody><br><table>";
                    break;
                case '2':
                    echo "<table><tbody><tr><td>and</td><td>y</td></tr></tbody><br><table>";
                    break;
                case '3':
                    echo "<table><tbody><tr><td>for</td><td>para</td></tr></tbody><br><table>";
                    break;
                case '4':
                    echo "<table><tbody><tr><td>with</td><td>con</td></tr></tbody><br><table>";
                    break;
                case '5':
                    echo "<table><tbody><tr><td>he</td><td>el</td></tr></tbody><br><table>";
                    break;
                case '6':
                    echo "<table><tbody><tr><td>as</td><td>como</td></tr></tbody><br><table>";
                    break;
                case '7':
                    echo "<table><tbody><tr><td>do</td><td>hacer</td></tr></tbody><br><table>";
                    break;
                case '8':
                    echo "<table><tbody><tr><td>but</td><td>pero</td></tr></tbody><br><table>";
                    break;
                case '9':
                    echo "<table><tbody><tr><td>by</td><td>por</td></tr></tbody><br><table>";
                    break;
                case '10':
                    echo "<table><tbody><tr><td>say</td><td>decir</td></tr></tbody><br><table>";
                    break;
                    
                default:
                    # code...
                    break;
            }
        }
    ?>
</body>
</html>

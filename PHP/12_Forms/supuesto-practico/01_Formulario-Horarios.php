<!-- D O C T Y P E -->
<!DOCTYPE html>

<!-- L A N G U A G E -->
<html lang="es">

<!-- H I D D E N -->
<head>

    <!-- M E T A D A T A -->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- C S S -->
    <link 
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
        rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" 
        crossorigin="anonymous"
    >

    <!-- T I T L E -->
    <title>Horario Docente</title>

</head>

<!-- P H P -->
<?php
    require_once './03_Controlador-Horario.php';
    require_once './02_Enum-Campos.php';
?>

<!-- V I S I B L E -->
<body>

    <!-- C O N T A I N E R -->
    <div class="container">

        <!-- H 1 -->
        <h1 class="text-center">Horario de Clases</h1>

        <!-- C L A S S -> F U N C T I O N -->
        <div class="container col-md-8">
            <?php
                $gestorHorario = new GestorHorario();
                echo $gestorHorario->mostrarHorario();
            ?>
        </div>

        <br/><br/>

        <!-- H 2 -->
        <h2>Operaciones Horario:</h2>

        <!-- F O R M -->
        <form action="horario.php" method="POST" enctype="multipart/form-data">
            
            <!-- A -->
            <div class="col-md-12 row g-3">
                
                <!-- C U R S O -->
                <div class="col-4">
                    <label>Curso:</label>
                    <select class="form-select" id="curso" name="curso">
                        <!-- La primera opción es vacía -->
                        <option value=''></option>
                        <!-- La demás opciones son dinámicas -->
                        <?php
                            foreach (Curso::cases() as $enumerado) {
                                echo "<option value='$enumerado->value'>$enumerado->name</option>";
                            }
                        ?>
                    </select>
                </div>

                <!-- D Í A -->
                <div class="col-4">
                    <label>Día:</label>
                    <select class="form-select" id="dia" name="dia">
                        <option value=''></option>
                        <?php
                            foreach (Semana::cases() as $enumerado) {
                                echo "<option value='$enumerado->value'>$enumerado->name</option>";
                            }
                        ?>
                    </select>
                </div>
                
                <!-- H O R A -->
                <div class="col-4">
                    <label>Hora:</label>
                    <select class="form-select" id="hora" name="hora">
                        <option value=''></option>
                        <?php
                            foreach (Hora::cases() as $hora) {
                                echo "<option value='" . $hora->codigoHora() . "'>$hora->name</option>";
                            }
                        ?>
                    </select>
                </div>

            </div>

            <!-- B -->
            <div class="col-md-12 row g-3">

                <!-- M A T E R I A -->
                <div class="col-4">
                    <label>Materia:</label>
                    <select class="form-select" id="materia" name="materia">
                        <option value=''></option>
                        <?php
                            foreach (Materia::cases() as $enumerado) 
                            {
                                echo "<option value='$enumerado->value'>$enumerado->name</option>";
                            }
                        ?>
                    </select>
                </div>

                <!-- C L A S E -->
                <div class="col-4">
                    <label>Clase:</label>
                    <select class="form-select" id="clase" name="clase">
                        <option value=''></option>
                        <?php
                            foreach (Clase::cases() as $enumerado) {
                                echo "<option value='$enumerado->value'>$enumerado->name</option>";
                            }
                        ?>
                    </select><br>
                </div>

                <!-- C O L O R -->
                <div class="col-4">
                    <label>Color:</label>
                    <select class="form-select" id="color" name="color">
                        <option value=''></option>
                        <?php
                            foreach (Color::cases() as $enumerado) {
                                echo "<option style='background-color:$enumerado->value' 
                                                value='$enumerado->value'>$enumerado->name</option>";
                            }
                        ?>
                    </select>
                </div>

            </div>

            <br/><br/>

            <!-- C -->
            <div class="col-md-12 row g-3">

                <!-- I N S E R T --> 
                <!-- D E L E T E --> 
                <div class="col-4">
                    <input type="submit" class="btn btn-primary" name="insertar" value="Insertar Hora">
                    <input type="submit" class="btn btn-danger" name="eliminar" value="Eliminar Hora">
                </div>
                
                <!-- L O A D -->
                <div class="col-6">
                    <input type="file" name="fhorario" id="fhorario">
                    <input type="submit" class="btn btn-info" name="cargar" value="Cargar Horario">
                </div>

            </div>

        </form>

    </div>

</body>

</html>
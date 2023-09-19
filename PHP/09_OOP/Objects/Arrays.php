<?php

    require "clases/alumno.php";

    function generarGruposAlumnos() 
    {
        $alumnos = [[]];
        $alumno1 = new Alumno("111sA", "Jose", "Pérez", 18, "DAW", 1, "A", ["BAE", "FOL", "PRO", "SSF"]);
        $alumno2 = new Alumno("111sA", "Juan", "Santana", 20, "DAW", 2, "A", ["DOR", "DEW", "PRW", "DSW"]);
        $alumno3 = new Alumno("131sD", "Maria", "González", 19, "ASIR", 1, "B", ["FUW", "GTB", "PNI"]);
        $alumno4 = new Alumno("151sC", "Yeray", "Pérez", 18, "DAM", 1, "B", ["BAE", "FOL", "PRO"]);
        $alumno5 = new Alumno("231aA", "Raquel", "García", 16, "SMR", 1, "C", ["MJE", "AIF", "SSV"]);

        $alumnos["DAW"][]  = $alumno1;
        $alumnos["DAW"][]  = $alumno2;
        $alumnos["ASIR"][] = $alumno3;
        $alumnos["DAM"][]  = $alumno4;
        $alumnos["SMR"][]  = $alumno5;

        return $alumnos;
    }

    function visualizarAlumnos($gruposAlumnos) 
    {
        //print_r($gruposAlumnos);

        foreach ($gruposAlumnos as $especialidadClave => $alumnos) 
        {
            $numeroAlumnosEspecialidad = count($alumnos);

            if ($numeroAlumnosEspecialidad > 0) 
            {
                echo "Especialidad " . $especialidadClave                         . ": <br>";
                echo "Numero de Alumnos del grupo: " . $numeroAlumnosEspecialidad . "  <br>";
                echo "---------------------------------------------                    <br>";
                echo "                                                                 <br>";

                for ($i = 0; $i < $numeroAlumnosEspecialidad; $i++) 
                {
                    echo "DNI del Alumno: "         . $gruposAlumnos[$especialidadClave][$i]->getDNI()      . "<br>";
                    echo "Nombre de Alumno: "       . $gruposAlumnos[$especialidadClave][$i]->getNombre()   . "<br>";
                    echo "Apellidos de Apellidos: " . $gruposAlumnos[$especialidadClave][$i]->getApellido() . "<br>";
                    echo "Edad del Alumno: "        . $gruposAlumnos[$especialidadClave][$i]->getEdad()     . "<br>";
                    echo "Curso: "                  . $gruposAlumnos[$especialidadClave][$i]->getCurso()    . "<br>";
                    echo "Grupo: "                  . $gruposAlumnos[$especialidadClave][$i]->getGrupo()    . "<br>";
                    echo "Modulos Matriculados: <br>";
    
                    foreach($gruposAlumnos[$especialidadClave][$i]->getModulos() as $modulo)
                    {
                        echo "--->Modulo: " . $modulo . " <br>";
                    }

                    echo "<br>";
                }
            }

            echo "<hr>";
        }
    }

    $grupoAlumnos = generarGruposAlumnos();
    
    visualizarAlumnos($grupoAlumnos);

?>
<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <script>

        var subjectObject =                                                             // Objeto = {}
        {
            "Front-end":                                                                // Atributo 1:
            {
                      "HTML": ["Links", "Images", "Tables", "Lists"               ],    // Atributo 1.1: Array[].
                       "CSS": ["Borders", "Margins", "Backgrounds", "Float"       ],    // Atributo 1.2: Array[].
                "JavaScript": ["Variables", "Operators", "Functions", "Conditions"],    // Atributo 1.3: Array[].
            },

            "Back-end":                                                                 // Atributo 2:
            {
                "PHP": ["Variables", "Strings", "Arrays"],                              // Atributo 2.1: Array[].
                "SQL": ["SELECT", "UPDATE", "DELETE"    ]                               // Atributo 2.2: Array[].
            }
        }

        window.onload = function() 
        {
            var subjectSel = document.getElementById("subject");
            var topicSel   = document.getElementById("topic");
            var chapterSel = document.getElementById("chapter");

            for (var x in subjectObject) 
            {
                subjectSel.options[subjectSel.options.length] = new Option(x, x);
            }

            subjectSel.onchange = function() 
            {
                // Menús desplegables de capítulos y temas vacíos.
                chapterSel.length = 1;
                topicSel.length   = 1;

                // Mostrar valores correctos.
                for (var y in subjectObject[this.value]) 
                {
                    topicSel.options[topicSel.options.length] = new Option(y, y);
                }
            }

            topicSel.onchange = function() 
            {
                // Desplegable de capítulos vacíos.
                chapterSel.length = 1;
            
                // Mostrar valores correctos.
                var z = subjectObject[subjectSel.value][this.value];

                for (var i = 0; i < z.length; i++) 
                {
                    chapterSel.options[chapterSel.options.length] = new Option(z[i], z[i]);
                }
            }
        }

    </script>

</head>

<body>
  
    <h1>Ejemplo de menú desplegable en cascada</h1>

    Subjects:
    <select name="subject" id="subject">
        <option value="" selected="selected">Select subject</option>
    </select>

    <br><br>

    Topics:
    <select name="topic" id="topic">
        <option value="" selected="selected">Please select subject first</option>
    </select>

    <br><br>

    Chapters:
    <select name="chapter" id="chapter">
        <option value="" selected="selected">Please select topic first</option>
    </select>
  
    <br><br>

</body>

</html>
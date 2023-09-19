<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Eventos de JS Mouse - Demostración de botones</title>

</head>

<body>

    <!-- Detecta el botón en el que se hace clic -->
    <button id="btn">Haz clic en mí con cualquier botón del mouse: izquierdo, derecho, medio, ...</button>

    <!-- Zona en la que se imprime el mensaje -->
    <p id="message"></p>

    <script>

        // Coge el id del botón.
        let btn = document.querySelector('#btn');

        // Deshabilite el menú contextual cuando haga clic con el botón derecho del mouse.
        btn.addEventListener('contextmenu', (e) => 
        {
            e.preventDefault();
        });

        /** 
         *  - Los eventos MouseDown y MouseUp le permiten distinguir entre los botones del mouse derecho, izquierdo y central.
         *  - Muestra el mensaje de evento del ratón.  
         */
        btn.addEventListener('mouseup', (e) => 
        {
            // Coge el id del div donde se va a imprimir el mensaje.
            let msg = document.querySelector('#message');

            // Dependiendo del botón clic se ejecuta un mensaje.
            switch (e.button) 
            {
                case 0:
                    msg.textContent = 'Left mouse button clicked.';
                    break;

                case 1:
                    msg.textContent = 'Middle mouse button clicked.';
                    break;

                case 2:
                    msg.textContent = 'Right mouse button clicked.';
                    break;

                default:
                    msg.textContent = `Unknown mouse button code: ${event.button}`;
            }
        });

    </script>
    
</body>

</html>
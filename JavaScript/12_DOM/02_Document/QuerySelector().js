// Paso 1) Selecciona el elemento de botón en el documento HTML.
const button = document.querySelector('button');

// Paso 2) Agrega un evento de escucha para el evento de clic en el botón.
button.addEventListener('click', function () {

    // Paso 3) Obtiene el atributo 'data-id' del botón.
    const id = button.getAttribute('data-id');

    // Paso 4) Verifica si el botón tiene la clase 'liked'.
    if (button.classList.contains('liked')) {

        // Paso 5) Si el botón tiene la clase 'liked', la elimina.
        button.classList.remove('liked');

        // Paso 6) Actualiza el contenido del botón a 'Me gusta'.
        button.innerHTML = 'Me gusta';

    } else {

        // Paso 7) Si el botón no tiene la clase 'liked'.
        button.classList.remove('liked');

        // Paso 8) Agrega la clase 'liked' al botón.
        button.innerHTML = 'Quitar me gusta';

    }

});
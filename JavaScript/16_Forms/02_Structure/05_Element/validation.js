// Acceder al formulario usando su id.
var form = document.getElementById('miFormulario');

// Acceder al campo de texto usando su name.
var campoTexto = form.elements.nombre;

// Verificar si el campo de texto está vacío.
if (!campoTexto.checkValidity()) 
{
  // Mostrar un mensaje de error
  alert('El campo de texto está vacío!');
}

// Establecer un patrón para el campo de texto.
campoTexto.pattern = '[a-zA-Z0-9]+';

// Verificar si el campo de texto cumple con el patrón establecido.
if (!campoTexto.checkValidity()) 
{
  // Establecer un mensaje de error personalizado.
  campoTexto.setCustomValidity('El campo de texto solo puede contener letras y números');
}
function validateForm() 
{
    // Obtener los valores de los campos del formulario.
    var x = document.forms["myForm"]["nombre"].value;
    var y = document.forms["myForm"]["correo"].value;
  
    // Validar que los campos no estén vacíos.
    if (x == "" || y == "") 
    {
      alert("Los campos no pueden estar vacíos");

      return false;
    }
  
    // Validar que el campo "correo" tenga un formato válido.
    var emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    
    if (!emailRegex.test(y)) 
    {
      alert("Por favor ingrese un correo electrónico válido");

      return false;
    }
}
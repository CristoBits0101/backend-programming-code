$.ajax({ // Utilizar el método $.ajax de jQuery
    url: 'https://api.example.com/data', // Especificar la URL
    method: 'GET', // Especificar el método HTTP
    success: function(response) { // Manejar los datos de la respuesta exitosa
      console.log(response);
    },
    error: function(jqXHR, textStatus, errorThrown) { // Manejar errores
      console.log('Error: ', textStatus, errorThrown);
    }
  });
  
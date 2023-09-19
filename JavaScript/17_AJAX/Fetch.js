// 1. Obtener datos con una solicitud GET
fetch('http://ejemplo.com/api/posts', {
  method: 'GET' // Método GET para obtener datos
})
.then(response => response.json()) // Convertir la respuesta en formato JSON
.then(data => {
  // Manejar los datos obtenidos.
});

// 2. Enviar datos de actualización con una solicitud PUT
fetch('http://ejemplo.com/api/posts/1', {
  method: 'PUT', // Método PUT para enviar datos de actualización
  headers: {
    'Content-Type': 'application/json' // Cabecera para indicar el tipo de contenido (JSON)
  },
  body: JSON.stringify({ // Cuerpo de la solicitud con los datos de actualización
    title: 'Nuevo título',
    body: 'Nuevo cuerpo'
  })
})
.then(response => response.json()) // Convertir la respuesta en formato JSON
.then(data => {
  // Manejar la respuesta del servidor.
});

// 3. Enviar datos de creación con una solicitud POST
fetch('http://ejemplo.com/api/posts', {
  method: 'POST', // Método POST para enviar datos de creación
  headers: {
    'Content-Type': 'application/json' // Cabecera para indicar el tipo de contenido (JSON)
  },
  body: JSON.stringify({ // Cuerpo de la solicitud con los datos de creación
    title: 'Nuevo título',
    body: 'Nuevo cuerpo'
  })
})
.then(response => response.json()) // Convertir la respuesta en formato JSON
.then(data => {
  // Manejar la respuesta del servidor.
});

// 4. Eliminar datos con una solicitud DELETE
fetch('http://ejemplo.com/api/posts/1', {
  method: 'DELETE' // Método DELETE para eliminar datos
})
.then(response => response.json()) // Convertir la respuesta en formato JSON
.then(data => {
  // Manejar la respuesta del servidor.
});
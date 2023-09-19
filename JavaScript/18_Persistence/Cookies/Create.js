// Crear.
document.cookie = "cookieName=cookieCristo";
console.log(document.cookie);

// Agregar caducidad de cookies.
document.cookie = "expirationName=Name; expires=" + new Date(2023, 1, 9).toISOString()

console.log(document.cookie);
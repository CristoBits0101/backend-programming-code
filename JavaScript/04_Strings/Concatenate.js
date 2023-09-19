// Declaración.
const saludo = 'Hola';
const nombre = 'Cristo';

// Concatenar datos mediante el método concat.
console.log(saludo.concat(nombre) + "\n");

// Concatenar datos Separando los valores por una coma.
console.log(saludo.concat(" ", nombre) + "\n");

// Concatenar datos separando los valores por un más.
console.log(saludo + " " + nombre + "\n");

// Concatenar datos mediante variables dentro de comillas invertidas.
console.log(`${saludo} ${nombre} \n`);

// id="${'valor' + index}"

// id="${valor = 'valor' + index}"

// id="valor ${+ index}"

// id="valor ${index}"

// id="valor"+${index}

// id="'valor${index}'"

// id="'+valor${index}+'"
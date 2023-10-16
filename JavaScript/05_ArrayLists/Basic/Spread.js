// El operador spread se utiliza para expandir un array en elementos individuales.
// Permite copiar los elementos de un arreglo en uno nuevo.
const myName = ["Sofela", "is", "my"];
const aboutMe = ["Oluwatobi", ...myName, "name."];

console.log(aboutMe); // output: ["Oluwatobi", "Sofela", "is", "my", "name."]

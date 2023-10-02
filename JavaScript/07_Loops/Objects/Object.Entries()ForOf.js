// Objeto.
const obj = {
    name: 'John',
    age: 30,
    profession: 'Developer'
};

// Array asosiativo.
for (const [key, value] of Object.entries(obj)) {
    console.log(`${key}: ${value}`);
}
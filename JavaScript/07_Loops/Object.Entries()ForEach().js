// Objeto.
const obj = {
    name: 'John',
    age: 30,
    profession: 'Developer'
};

// Array asosiativo.
Object.entries(obj).forEach(([key, value]) => {
    console.log(`${key}: ${value}`);
});
  
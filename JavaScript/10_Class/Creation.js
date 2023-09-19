// Opción 1.
const persona1 = 
{
    name: Cristo,
    age: 18,
    saludar: saludo()
}

// Opción 2.
class persona2 
{
    name;
    age;
    isDeveloper;
    
    constructor (name, age, isDeveloper)
    {
        this.name = name;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }

    saludar(){console.log(`My name is ${this.name} and my age is ${this.age}`);}
}

// Opción 3.
let newPerson = new persona2(Rubén, 33, true);

newPerson.saludar();
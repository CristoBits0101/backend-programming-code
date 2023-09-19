class Person 
{
    #firstName;
    #lastName;
    
    constructor(firstName, lastName) 
    {
        this.#firstName = Person.#validate(firstName);
        this.#lastName  = Person.#validate(lastName);
    }

    getFullName(format = true) 
    {
        return format ? this.#firstLast() : this.#lastFirst();
    }
    
    static #validate(name) 
    {
        if (typeof name === 'string') 
        {
            let str = name.trim();
        
            if (str.length === 3) 
            {
                return str;
            }
        }

      throw 'El nombre debe tener 3 characters';
    }
  
    #firstLast() 
    {
      return `${this.#firstName} ${this.#lastName}`;
    }

    #lastFirst() 
    {
      return `${this.#lastName}, ${this.#firstName}`;
    }
}

function getPersona()
{
    let person = new Person('John', 'Doe');

    alert(person.getFullName());
}

function getPersona2()
{
    let person = new Person('Ana', 'Doe');
  
    alert(person.getFullName());
}

function getPersona3()
{
    let person = new Person('Ana', 'Doe');
    
    alert(person.firstName);
}

function getPersona4()
{
    let person = new Person('Ana', 'Doe');
    
    alert(person.lastFirst());
}

function getPersona5()
{
    Person.validate('Anaaaaaa');
}
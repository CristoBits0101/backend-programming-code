function sayHi(user)
{
    alert(`Hello, ${user}!`);
}

function sayBye(user) 
{
    alert(`Bye, ${user}!`);
}

function saludar()
{
    sayHi('John');
    sayBye('John');
}

export {sayHi, sayBye , saludar };
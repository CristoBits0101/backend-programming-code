/**
 *  1. Clase animal.
 */
class Animal 
{
    constructor(name) 
    {
        this.speed = 0;
        this.name  = name;
    }

    run(speed) 
    {
        this.speed = speed;

        alert(`${this.name} corre a una velocidad de ${this.speed}.`);
    }

    stop() 
    {
        this.speed = 0;
    
        alert(`${this.name} se queda quieto.`);
    }
}

// 2. Extends.
class Rabbit extends Animal 
{
    hide() 
    {
        alert(`¡${this.name} se esconde!`);
    }

    stop() 
    {
        super.stop(); 
    
        this.hide();  
    }
}

// 3. Function.
function herencia()
{
    let rabbit = new Rabbit("Conejo Blanco");

    rabbit.run(5);
    rabbit.stop();
}
 
/**
 *  1. Clase forma.
 */
class Forma
{
    type  = "geométrica";
    color = "naranja";

    constructor()
    {
      console.log("Constructor padre finalizado.");
    }

    show()
    {
      console.log(`Soy una forma ${this.type} de color ${this.color}`);
    }

    setColor(color)
    {
      this.color = color;
    }
}

// 2. Extends.
class Cuadrado extends Forma 
{
    type = "cuadrada";

    constructor()
    {
        super();

        console.log("Constructor hijo finalizado.");
    }
}

// 3. Function.
function geo()
{
    const c1 = new Cuadrado();

    c1.show();
  
    const c2 = new Cuadrado();

    c2.setColor("amarillo");
    c2.show();
}
// 1. 
function persona1()
{
    let objeto1 = new Object();

    objeto1.nombre    = "Jesús";
    objeto1.apellidos = "Fernández Toledo";
    objeto1.edad      = 39;

    document.write(objeto1.nombre);
    document.write(" ");

    document.write(objeto1.apellidos);
    document.write(" ");

    document.write(objeto1.edad);
};

// 2. 
function persona2()
{
    let objeto2={nombre:"Pedro", apellidos:"Acosta Santana", edad:21};
    
    document.write(objeto2.nombre);
    document.write(" ");

    document.write(objeto2.apellidos);
    document.write(" ");

    document.write(objeto2.edad);
    document.write(".</hr>");
};

// 3. 
function persona3()
{
    let objeto2 = {nombre:"Luis", apellidos:"Santana Santana", fechanacimiento: new Date(2000, 11, 24)};
    let objeto3 = {nombre:"ana", apellidos:"pedrin Santana", fechanacimiento: new Date(2000, 11, 24)};
    
    document.write(objeto2.nombre);
    document.write(" ");
    
    document.write(objeto2.apellidos);
    document.write(" ");
    
    document.write(objeto2.fechanacimiento.toDateString());

    document.write("Edad" +  getAge(objeto2));
    document.write("Edad" +  getAge(objeto3));
};

// 4. 
function getAge(x)
{
    let fechanacimiento = x.fechanacimiento;

	var currentDate = new Date();
    var currentYear = currentDate.getFullYear();

    age = currentYear - fechanacimiento.getFullYear();

    return age;
};

// 5. 
function salarios()
{
    let sueldo = 
    {
        John: 100,
        Ann: 160,
        Pete: 130
    };
    
    let sum = 0;

    for (let key in sueldo) 
    {
        sum += sueldo[key];
    }

    document.write("Suma salarios" +  sum);
};

// 6. 
function gastos()
{
    let objGasto1 = 
    {
        concepto: "Agua", 
        cuantia: 100
    };
        
    let objGasto2 = {concepto:"Luz", cuantia:150};
    let objGasto3 = {concepto:"Comunidad", cuantia:50};

    let sum = 0;

    sum = objGasto1.cuantia + objGasto2.cuantia +objGasto3.cuantia;

    document.write("Suma gastos" +  sum);
};


// 7. 
class persona 
{
    constructor(nombre, apellido1, edad, colorOjos) 
    {
        this.nombre    = nombre;
        this.apellido1 = apellido1;
        this.edad      = edad;
        this.colorOjos = colorOjos;
    }
}

// 8. 
function familia()
{
    var miPadre = new persona("José", "Acosta", 50, "azul");
    var miMadre = new persona("Victoria", "Santana", 48, "verde");

    document.write("Mi padre se llama " +  miPadre.nombre); // modo 1 acceder a una propiedad
    document.write("Mi madre se llama " +  miMadre["nombre"] ); // modo 2 acceder a una propiedad
}

// 9. 
function MostarPropiedades(persona)
{
    let txt = "";

    for (x in persona) 
    {
        txt += persona[x];
    }

    document.write("las propiedades de la  persona son  " +  txt ); 
};

// 10. 
function muestraFamilia()
{
    var miPadre = new persona("José", "Acosta", 50, "azul");
    
    MostarPropiedades(miPadre);
};

// 11. 
function DimeNombrefull(obje) 
{
    return obje.nombre + " " + obje.apellidos;
}

// 12. 
function vecinos()
{
    let vecino = new Object();

    vecino.nombre    = "Jesús";
    vecino.apellidos = "Fernández Toledo";
    vecino.edad      = 39;
    
    vecino.NombreCompleto = function() 
    {
        return this.nombre + " " + this.apellidos;
    }
 
    document.write("Mi vecino  se llama " +  vecino.NombreCompleto());
    document.write("Mi vecino  se llama " +  DimeNombrefull(vecino));
}

// 13. 
function alimentos()
{
    let producto = 
    { 
        nombre:    'manzana',
        categoria: 'frutas',
        precio:    1.99,
        
        nutrientes : 
        {
            carbs:    0.95,
            grasas:   0.3,
            proteina: 0.2
        }
    }

    document.write("La " +  producto.nombre + "tiene una cantidad de grasas" + producto.nutrientes.grasas);
};
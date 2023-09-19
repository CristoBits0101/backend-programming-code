// only s type
let taskList1: string[] = ['Run', 'Dance'];

// allows various types
let values: (string | number | boolean)[] = [true, 3, 'text'];

// show a list of objects
// state of the tarea
enum states2 
{
    "Completada","Incompleta","Pendiente"
}

// tarea attributes
type Tarea = 
{
    nombre: string,
    estado: states2.Pendiente,
}

// list of objects
let taskList2: Tarea[] = [
    {
        nombre: "Mario",
        estado: states2.Pendiente
    },
    {
        nombre: "Cristo",
        estado: states2.Pendiente
    },
];

// function forEach with a anonymous function
// the function anonymous only have
// for in is for objects and forEach is for lists
taskList2.forEach(
    // we pass the task and the index of the task
    (tarea: Tarea, index: number) => 
    {
        console.log(
            `${index} - ${tarea.nombre}`
        );
    }
);

// with a clasic for
for (let index = 0; index < taskList2.length; index++) {
    const tarea = taskList2[index];
    console.log (
        `${index} - ${tarea.nombre}
    `);
}
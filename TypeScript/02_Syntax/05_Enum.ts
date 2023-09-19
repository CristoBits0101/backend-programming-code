// Enum establece los valores que puede obtener un tipo de datos.
// Enum normaliza los estados que puede tener una variable, por ejemplo, el día solo puede ser lunes...
enum DiaSemana {Monday,Tuesday,Wednesday,thursday,Friday,Saturday,Sunday,}

interface CitaMedica {dia: DiaSemana}

// Dia semana es el tipo y Monday el estado.
let cita = {dia: DiaSemana.Monday}

// Ejemplo de enumeración con estados de tarea.
enum Estados1 {"Completada","Incompleta","Pendiente"}

// Escriba una variable con un objeto.
// Escriba Estados: = valor Estado 1.Pendiente;
let taskState: Estados1 = Estados1.Pendiente;

// Cambiar la posición de los elementos.
enum Estados2 {"Completada" = 6, "Incompleta" = 3,"Pendiente" = 0}

// Agrega un valor extra al estado de la tarea.
enum Estados3 {"Completada" = 'C',"Incompleta" = 'I',"Pendiente" = 'P'}

// Inferir el valor al estado de la tarea.
enum PuestoCarrera {"Primero" = 1,"Segundo"}
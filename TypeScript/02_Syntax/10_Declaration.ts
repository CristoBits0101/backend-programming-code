let tareita = 
{
    title   : 'tareita'  ,
    estados : 'terminada',
    urgencia: 1
}

// 1 a 1.
let miTitle   = tareita.title   ;
let miEstado  = tareita.estados ;
let miUrgente = tareita.urgencia;

// Spread factor.
let {title, estados, urgencia} = tareita;


// In lists
let listaCompraLunes    : string[] = ["Leche", "Patatas"                       ];
let listaCompraMartes   : string[] = [...listaCompraLunes, "Leche", "Patatas"  ];
let listaCompraMiercoles: string[] = ["Carne", "Pescado"                       ];
let listaCompraSemana   : string[] = [...listaCompraLunes,...listaCompraMartes,];

// in objects
let appState = 
{
    usuario : "admin",
    session : 3,
    jwt     : "Bearer1283612783"
}

// change a value by propagation
let nuevoEstado = 
{
    ...appState,
    session : 4
}
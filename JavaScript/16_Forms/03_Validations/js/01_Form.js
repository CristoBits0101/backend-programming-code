/**
 *  DESACTIVAR ELEMENTOS MEDIANTE TRUE OR FALSE
 */
function getElement()
{
    /**
     *  1. Se captura el id del input.
     *  2. Después de enviar, se desactiva el input.
     *  3. Se ejecuta la alerta con el valor almacenado en el input.
     */
    var txtNombre = document.getElementById("txtNombre");
    txtNombre.disabled = true;
    alert(txtNombre.value);
  
    /**
     *  1. Se captura el name del input.
     *  2. Se alerta la posición 0 almacenada en el array del name.
     */
    var txtApellido1 = document.getElementsByName("txtApellido1")[0].value
    alert(txtApellido1);  
    
    /**
     *  1. Se captura el id del botón.
     *  2. Después de enviar, se desactiva el botón.
     */
    var btnEnviar = document.getElementById("btnEnviar");
    btnEnviar.disabled = true;
}

/**
 *  VALIDAR ELEMENTOS MEDIANTE EL ID
 */
function getElementChecks2()
{ 
    // 1. Obtener el id de los elementos.
    var chkUK  = document.getElementById('chkUK');
    var chkUsa = document.getElementById('chkUsa');
    var chkIL  = document.getElementById('chkIL');
    var chkMA  = document.getElementById('chkMA');
    var chkUT  = document.getElementById('chkUT');
    var chkES  = document.getElementById('chkES');

    // 2. Crear un array para posteriormente almacenar las id de los elementos chequeados.
    let resultado = new Array();
    
    // 3. Comprobar mediante checked que elementos están cliqueados.
    if(chkUK.checked == true)
    {
        // 4. Añadir al array el valor de los elementos que están cliqueados.
        resultado.push(chkUK.value)
    } 

    if (chkUsa.checked == true)
    {
        resultado.push(chkUsa.value)
    }

    // 5. Solo si se fuera a pintar los valores obtenidos.
    serializaElementChecks(resultado);
}

/**
 *  VALIDAR ELEMENTOS MEDIANTE EL NAME
 */
function getElementChecks3()
{
    // 1. Obtener el name de los elementos.
    var chks = document.getElementsByName('eurpaChcek');

    // 2. Crear un array para almacenar las id de los elementos.
    let resultado = new Array();

    // 3. Recorrer el array de name para ver cuales están cliqueados. 
    for(var i = 0; i < chks.length; i++)
    {
        // 4. Añadimos al array valores de los checkbox cliqueados.
        chks[i].checked ? resultado.push(chks[i].value):"";
    }

    // 5. Solo si se fuera a pintar los valores obtenidos.
    serializaElementChecks(resultado);
}

/**
 *  SOLO SIRVE PARA ALERTA LOS VALORES ESCRITOS EN LOS INPUTS
 */
function serializaElementChecks(seleccionados)
{
    for(var i = 0; i < seleccionados.length; i++)
    {
        alert(seleccionados[i]);
    }
}

/**
 *  MARCA TODOS LOS INPUTS COMO CLIQUEADOS
 */ 
function chekAllType()
{
   /**
    * - The querySelector()    Encuentra el primer elemento que coincide.
    * - The querySelectorAll() Encuentra todos los elementos que coinciden.
    */
    var inputs = document.querySelectorAll('input[type="checkbox"]');
    
    for (var i = 0; i < inputs.length; i++)
    {
        inputs[i].checked = true; 
    }
}

/**
 *  MARCA TODOS LOS INPUTS COMO CLIQUEADOS MEDIANTE LA CLASE 1
 */
function chekAllClass()
{
    var inputs = document.querySelectorAll('.chk');
    
    for (var i = 0; i < inputs.length; i++)
    {
        inputs[i].checked = true;
    }
}

/**
 *  MARCA TODOS LOS INPUTS COMO CLIQUEADOS MEDIANTE LA CLASE 2
 */
function chekAllClass2()
{
    var inputs = document.getElementsByClassName('chk');

    for (var i = 0; i < inputs.length; i++)
    {
        inputs[i].checked = true;
    }
}
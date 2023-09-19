/**
 *  OBTENER ELEMENTOS MEDIANTE LA ETIQUETA
 */
function getAllParaElems()
{
    // 1. Obtenemos los párrafos.
    var allParas = document.getElementsByTagName("p");

    // 2. Almacena el contenido de todos los elementos p en la variable num como string.
    var num = allParas.length;

    // 3. Alerta el contenido de la varible que almacena el contenido de los párrafos.
    alert("Hay " + num + " <p> elementos en este documento");
}

/**
 *  OBTENER SUB ELEMENTOS MEDIANTE ETIQUETAS 1
 */
function div1ParaElems()
{
    // 1. Obtenemos la id de un div.
    var div1      = document.getElementById("div1")

    // 2. Obtenemos los párrafos dentro del div.
    var div1Paras = div1.getElementsByTagName("p");

    // 3. Almacena el contenido de todos los elementos p en la variable num como string.
    var num       = div1Paras.length;

    // 4. Alerta el contenido de la varible que almacena el contenido de los párrafos.
    alert("Hay " + num + " <p> elementos en el elemento div1");
}

/**
 *  OBTENER SUB ELEMENTOS MEDIANTE ETIQUETAS 2
 */
function div2ParaElems()
{
    // 1. Obtenemos la id de un div.
    var div2      = document.getElementById("div2")

    // 2. Obtenemos los párrafos dentro del div.
    var div2Paras = div2.getElementsByTagName("p");

    // 3. Almacena el contenido de todos los elementos p en la variable num como string.
    var num       = div2Paras.length;

    // 4. Alerta el contenido de la varible que almacena el contenido de los párrafos.
    alert("Hay " + num + " <p> elementos en el elemento div2");
}

/**
 *  SERIALIZA TODAS LAS P DEL DOCUMENTO HTML
 */
function pinto()
{
    const collection = document.getElementsByTagName("P");

    for (let i = 0; i < collection.length; i++) 
    {
        collection[i].style.backgroundColor = "red";
    }
}
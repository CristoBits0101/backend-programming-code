/**
 *  OBTIENE VALORES DE LOS ELEMENTOS DENTRO DE OTRO ELEMENTO
 */
function getAllParaElems()
{
  // 1. Obtiene el id de la clase menu.
  let menu  = document.getElementById('menu');

  // 2. Almacena el valor de las clases almacenadas dentro del id menu.
  let items = menu.getElementsByClassName('item');
 
  /**
   *  3. Map recorre el array items y devuelve lo que hay en cada posición.
   *  4. Call te retorna los parámetros en cada posición y los añade a data.
   */
  let data = [].map.call(items, item => item.textContent);
  
  // 5. Muestra todo lo que hay dentro del array items.
  var num = items.length;

  // 6. Aletar los valores.
  alert("Hay " + num + " <class item> elementos en el elemento");
}
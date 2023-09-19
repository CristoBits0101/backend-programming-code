let xhttp = new XMLHttpRequest()

xhttp.open("GET", "generos_json.php", true)

xhttp.onreadystatechange = function ()
{
    if (this.readyState == 4 && this.status == 200)
    {
        /**
         *  - Array <- JSON.
         *  - let listadoGeneros = JSON.parse(JSON.parse(this.response))  
         */
        let listadoGeneros = JSON.parse(JSON.stringify(this.response))

        console.log(listadoGeneros);

        // ul
        let lista = document.createElement("ul")

        // for(Array[i]).
        for (let i = 0; i < listadoGeneros.length; i++) 
        {
            // li
            let elemementoLista = document.createElement("li")

            // li <- genero
            elemementoLista.innerHTML = listadoGeneros[i]["Array"]

            // ul <- li
            lista.appendChild(elemementoLista)
        }

        // sectionId
        let zonaInyeccion = document.getElementById("contenido")

        // section <- ""
        zonaInyeccion.innerHTML = ""

        // section <- ul, li
        zonaInyeccion.appendChild(lista)
    }
}
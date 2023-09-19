// Static permite instaciar sin crear un objeto.
class probarStatic 
{
    #nombre

    /**
     * @param {String} nombre
     */
    static set nombreNuevo(nombre){this.nombre = nombre}

}

function sss(params) 
{
    probarStatic.nombre = params.nombre
}
// Override 1.
function over()
{
    var alert = function(message) 
    {  
        document.write(message);  
    }  
    
    alert("Learn ");  
    alert("JavaScript");  
}

// Override 2.
class MensajePadre
{
    msg()
    {
        document.write("This is MensajePadre class msg.<br>");
    }
}

class MensajeHijo extends MensajePadre 
{
    msg() 
    {
        document.write("Desde el hijo. <br>");

        super.msg() ;

		document.write("This is MensajeHijo class msg.");
    }
}

function over()
{
    let p = new MensajePadre();
    let c = new MensajeHijo();

    p.msg();
    c.msg();
}
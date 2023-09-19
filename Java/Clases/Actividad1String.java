public class Actividad1String {
    public static void main(String[] args) {       
 
        String frase1 = new String ("Invertir: ola k ase");
        String frase2 = new String ("Nombre: Pepa Pig");
        String frase3 = new String ("Escribir: esta frase la vamos a escribir en esta sección con esta máquina");

        System.out.println ();
        System.out.println ("En primer lugar, usamos prim() para escribir las frases sin espacios en blanco al principio y al final.");
        System.out.println ("Primera frase --> "+frase1.trim());
        System.out.println ("Segunda frase --> "+frase2.trim());
        System.out.println ("Tercera frase --> "+frase3.trim());

        System.out.println ();
        System.out.println ("Buscamos ahora si en el texto aparece ':' mediante el método indexOf(':')");
        if (frase1.indexOf(':') != -1)
            System.out.println ("El valor ': aparece en la posición "+frase1.indexOf (':')+" de la frase 1.");   
        else
            System.out. println ("El valor ':' no aparece en la frase 1.");
        
        if (frase2.indexOf(':') != -1)
                System.out.println ("El valor ':' aparece en la posición "+frase2.indexOf (':')+" de la frase 2.");
        else
            System.out. println ("El valor ':' no aparece en la frase 2.");
        
        if (frase3.indexOf(':') != -1)
                System.out.println ("El valor ':' aparece en la posición "+frase3.indexOf (':')+" de la frase 3.");
        else
            System.out. println ("El valor ':' no aparece en la frase 3.");
    
        System.out.println ();
        System.out.println ("Vamos a hacer lo que nos indica cada frase.");
       
        String comando1 = new String (frase1.substring(0,frase1.indexOf(':')));
        StringBuffer valor1=new StringBuffer (frase1.substring (frase1.indexOf(':')+1,frase1.trim().length()));
        String comando2 = new String (frase2.substring(0,frase2.indexOf(':')));
        String valor2=new String (frase2.substring (frase2.indexOf(':')+1,frase2.trim().length()));
        String comando3 = new String (frase3.substring(0,frase3.indexOf(':')));
        String valor3=new String (frase3.substring (frase3.indexOf(':')+1,frase3.trim().length()));

        if (comando1.equals ("Invertir") )
            System.out.println ("La frase invertida es: "+ valor1.reverse());
        if (comando2.equals ("Nombre")) {
            String saludo = new String ("Hola");
            System.out.println ("El nombre es: "+ saludo.concat (valor2));
        }
        if (comando3.equals ("Escribir")) 
            System.out.print ("Si sustituimos en la frase la palabra 'esta' por 'una': "+valor3.replace ("esta", "una"));
         
    }
   
}
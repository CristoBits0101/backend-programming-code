public class EjemplosMetodosString {   
    public static void main(String[] args) {       
 
        // declara la cadena como un objeto S    
        String S = new String ("Hola mundo");
        
        // El método length () de String devuelve la longitud de una cadena S
        int longitud = S.length();        
        System.out.println("1. Longitud de una cadena es: " + longitud);
        
        // El método startsWith devuelve true si es cierto
        System.out.println ("2. Hola comienza por Ho: " + S.startsWith("Ho"));

        // El método endsWith devuelve true si es cierto
        System.out.println ("3. Mundo termina en do: " + S.endsWith("do"));

        // El método indexOf devuelve el número que corresponde con la posición (empieza en 0)
        // Si no encuentra el valor, devuelve -1
        System.out.println ("4. La posición de la primera 'o': " + S.indexOf('o'));

        // El método equals nos devuelve true si la condición es cierta
        // El método equals DIFERENCIA mayúsculas de minúsculas, si queremos que no lo haga, emplearemos
        // equalsIgnoreKey ()
        if (S.equals("Hola mundo")) {
            System.out.println ("5. S es igual a Hola mundo.");
            if (S.equalsIgnoreCase ("HOLA MUNDO"))
                System.out.println ("6. S es igual a HOLA MUNDO, solo se diferencia en las mayúsculas.");
        }
        else 
            System.out.println ("S no es Hola mundo.");

        // El método CompareTo devuelve un número negativo si alfabéticamente, "a" está antes de "Hola mundo"
        // Devuelve 0 si ambas cadenas coinciden
        // Devuelve un número positivo si "Hola mundo" va antes de "a"
        if (S.compareTo ("a")<0)
            System.out.println ("7. a va antes (alfabéticamente) que Hola mundo");
        if (S.compareTo ("Hola Javier")>0)
            System.out.println ("8. Hola Javier va antes (alfabéticamente) que Hola mundo.");
        if (S.compareTo ("Hola mundo")==0)
            System.out.println ("9. Ambas cadenas son iguales");
        
        // El método subString coge el texto de la string a partir del lugar/posición señalada,
        // o bien, desde un inicio hasta un fin.
        System.out.println ("10. Quiero escribir solo la segunda palabra: "+S.substring (5));
        System.out.println ("11. Quiero imprimir las 6 primeras letras del string: "+S.substring (0,6));

        // El método String.valueOf (S) devuelve el valor de S (la cadena de caracteres)
        System.out.println ("12. El valor de mi string es: "+ String.valueOf (S));
        
    }
}
package data.methods;

public class Comparison {
    
    // Ejemplo 1: Comparar igualdad de contenido usando equals
    String str1 = "Hola";
    String str2 = "Hola";

    if(str1.equals(str2)) {
        System.out.println("Ejemplo 1: Las cadenas son iguales.");
    } else {
        System.out.println("Ejemplo 1: Las cadenas son diferentes.");
    }

    // Ejemplo 2: Comparar igualdad de contenido ignorando mayúsculas y minúsculas
    // usando equalsIgnoreCase
    String str3 = "Hola";
    String str4 = "hola";

    if(str3.equalsIgnoreCase(str4)) {
        System.out.println("Ejemplo 2: Las cadenas son iguales (ignorando mayúsculas y minúsculas).");
    } else {
        System.out.println("Ejemplo 2: Las cadenas son diferentes.");
    }

    // Ejemplo 3: Comparar cadenas lexicográficamente usando compareTo
    String str5 = "Hola";
    String str6 = "Adiós";

    int result1 = str5.compareTo(str6);

    if(result1 < 0) {
        System.out.println("Ejemplo 3: La cadena '" + str5 + "' es menor que '" + str6 + "'.");
    } else if(result1 == 0) {
        System.out.println("Ejemplo 3: Las cadenas son iguales.");
    } else {
        System.out.println("Ejemplo 3: La cadena '" + str5 + "' es mayor que '" + str6 + "'.");
    }

    // Ejemplo 4: Comparar cadenas lexicográficamente ignorando mayúsculas y
    // minúsculas usando compareToIgnoreCase
    String str7 = "Hola";
    String str8 = "hola";

    int result2 = str7.compareToIgnoreCase(str8);

    if(result2 < 0) {
        System.out.println("Ejemplo 4: La cadena '" + str7 + "' es menor que '" + str8 + "' (ignorando mayúsculas y minúsculas).");
    } else if(result2 == 0) {
        System.out.println("Ejemplo 4: Las cadenas son iguales (ignorando mayúsculas y minúsculas).");
    } else {
        System.out.println("Ejemplo 4: La cadena '" + str7 + "' es mayor que '" + str8 + "' (ignorando mayúsculas y minúsculas).");
    }
}

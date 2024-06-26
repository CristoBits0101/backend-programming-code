package basic.data.types;

import java.math.BigDecimal;

public class Class
{
    // Declaration and initialization
    String var17 = "Hello, World!";
    java.math.BigInteger var18 = new java.math.BigInteger("12345678901234567890");
    java.math.BigDecimal var19 = new java.math.BigDecimal("3.141592653589793238");

    // Operations
    java.math.BigDecimal a = new java.math.BigDecimal("3.141592653589793238");
    java.math.BigDecimal b = new java.math.BigDecimal(4);
    
    /**
     * No se puede operar directamente
     * Hay que hacerlo a través de la clase BigDecimal
     */

    // Multiplicar
    BigDecimal resultado = a.multiply(b); 

    // Sumar
    resultado = a.add(b);
}

public class PrimitiveAndWrapperExamples {

  public static void main(String[] args) {
    // Tipos primitivos
    byte byteValue = 127; // Tipo primitivo byte
    short shortValue = 32767; // Tipo primitivo short
    int intValue = 2147483647; // Tipo primitivo int
    long longValue = 9223372036854775807L; // Tipo primitivo long
    float floatValue = 3.14f; // Tipo primitivo float
    double doubleValue = 3.141592653589793; // Tipo primitivo double
    char charValue = 'A'; // Tipo primitivo char
    boolean booleanValue = true; // Tipo primitivo boolean

    // Clases envolventes
    Byte wrappedByte = Byte.valueOf(byteValue); // Clase envolvente Byte
    Short wrappedShort = Short.valueOf(shortValue); // Clase envolvente Short
    Integer wrappedInt = Integer.valueOf(intValue); // Clase envolvente Integer
    Long wrappedLong = Long.valueOf(longValue); // Clase envolvente Long
    Float wrappedFloat = Float.valueOf(floatValue); // Clase envolvente Float
    Double wrappedDouble = Double.valueOf(doubleValue); // Clase envolvente Double
    Character wrappedChar = Character.valueOf(charValue); // Clase envolvente Character
    Boolean wrappedBoolean = Boolean.valueOf(booleanValue); // Clase envolvente Boolean

    // Clases de la biblioteca estándar
    String stringValue = "Hello, World!"; // Clase String
    java.math.BigInteger bigIntegerValue = new java.math.BigInteger(
      "12345678901234567890"
    ); // Clase BigInteger
    java.math.BigDecimal bigDecimalValue = new java.math.BigDecimal(
      "3.141592653589793238"
    ); // Clase BigDecimal
  }
}

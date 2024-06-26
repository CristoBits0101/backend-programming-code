package data.structures.handling;

public class Concatenate {

    // +
    int num1 = 5;
    int num2 = 10;
    String concatenado1 = num1 + "" + num2;
    System.out.println("Concatenado usando operador +: " + concatenado1);    

    // String
    String concatenado2 = String.valueOf(num1) + String.valueOf(num2);
    System.out.println("Concatenado usando String.valueOf: " + concatenado2);

    // StringBuilder
    StringBuilder sb = new StringBuilder();
    sb.append(num1);
    sb.append(num2);
    String concatenado3 = sb.toString();
    System.out.println("Concatenado usando StringBuilder: " + concatenado3); 

    // String.format
    String concatenado4 = String.format("%d%d", num1, num2);
    System.out.println("Concatenado usando String.format: " + concatenado4); 
    
}
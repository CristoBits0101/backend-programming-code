/**
 *   1.   Crear el archivo de configuración : src/main/resources/beans.xml
 * 
 *   2.                bean id="calculator" : Cuando instancias un objeto de la clase Calculator hay que hacerlo mediante el identificador.
 *   3. bean class="com.example.Calculator" : Aquí va el path de la clase.
 * 
 *   4.                       Crea la clase : Calculator.java
 * 
 *   5.   Importar la dependencia 1 en Main : import org.springframework.context.ApplicationContext;
 *   6.   Importar la dependencia 2 en Main : import org.springframework.context.support.ClassPathXmlApplicationContext;
 * 
 *   7.               Importar el beans.xml : ApplicationContext context = ClassPathXmlApplicationContext("beans.xml");
 *   8.  Instanciar un objeto mediante bean : Calculator calculadora = (Calculator) context.getBean("Calculator");
 * 
 *   9.                      Usar el código : int result = calculadora.suma(2, 3); 
 *  10.                  Imprimir el código : System.out.println(result);
 */
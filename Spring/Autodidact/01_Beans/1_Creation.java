/**
 *   1.   Crear el archivo de configuración : src/main/resources/beans.xml
 * 
 *   2.                bean id="calculator" : Cuando instancias un objeto de la clase Calculator hay que hacerlo mediante el identificador.
 *   3.      class="com.example.Calculator" : Aquí va el path de la clase.
 *   4.                   scope="singleton" : Crea un solo objeto para cada tipo de bean, modificar un atributo se modifica en todas las clases.
 *   5.                   scope="prototype" : Crea nuevos objeto con sus propios atributos, modificar un atributo no afecta al resto de clases.
 * 
 *   6. Cuando el objeto recibe otro objeto :
 * 
 *      <bean id="gestorFacturas" class="GestorFacturas">
 * 
 *          -- name es el nombre del atributo de la clase que recibe el objeto.
 *          -- ref es para indicar el identificador de la otra clase.
 *          <constructor-arg name="calculadora" ref="calculadora"/>
 * 
 *          -- En este caso nombre es un atributo que recibe una String y no un objeto.
 *          <constructor-arg name="nombre" value="Facturator 3000"/>
 * 
 *      </bean>
 */
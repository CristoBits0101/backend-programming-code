
//package db;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

// @author Cristo Rubén Pérez Suárez

public class MiBD {
    // Scanner global
    public static Scanner sc = new Scanner(System.in);

    // Procedimiento para tomar los datos que se van a introducir a la base de datos
    public static void takeData(Connection conexion) throws SQLException {
        String dni, nombre, apellidos;
        sc.nextLine();

        // Pedimos los datos de los usuarios
        System.out.println("Introduzca el DNI: ");
        dni = sc.nextLine();
        System.out.println("Introduzca el Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Introduzca sus Apellidos: ");
        apellidos = sc.nextLine();

        // Llamamos al procedimiento y le pasamos los datos para insertar.
        insertQUERY(conexion, dni, nombre, apellidos);
    }

    // Procedimiento que nos hace la query de insert
    public static void selectQUERY(Connection conexion) throws SQLException {
        // Se prepara una consulta
        Statement sentencia = conexion.createStatement();
        // Enviamos la consulta
        ResultSet resul = sentencia.executeQuery("SELECT DNI,NOMBRE,APELLIDOS FROM Usuarios");
        int i = 0;
        // Bucle para mostrar cada fila de datos de la tabla
        while (resul.next()) {
            i++;
            System.out.println();
            System.out.println("-------------USUARIO----------");
            System.out.println("--> NIF: " + resul.getString(1) + "\n--> Nombre: " + resul.getString(2)
                    + "\n--> Apellido: " + resul.getString(3));
            System.out.println();
        }
        // Cerramos la sentencia
        resul.close();
        sentencia.close();
    }

    public static void insertQUERY(Connection conexion, String dni, String nombre, String apellidos)
            throws SQLException {
        // Se prepara la conexion para enviar la sentencia
        Statement sentencia = conexion.createStatement();

        // Creamos la QUERY y mandamos los datos
        sentencia.executeUpdate("INSERT INTO usuarios (dni, nombre, apellidos) VALUES ('" + dni + "','" + nombre + "','"
                + apellidos + "' )");

        // Cerramos
        sentencia.close();
    }

    public static void main(String[] args) {
        int opt = 0;

        try {
            // Conexion con la base de datos
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/libreria", "root", "1234"); 	// Cambiar
                                                                                                            		// datos
                                                                                                            		// aqui

            System.out.println("Conexion a MySQL");
            System.out.println();

            // Do While para repetir el men� tantas veces como el usuario decida
            do {
                // Mostramos el men� con las opciones
                System.out.println("�Que desea hacer?");
                System.out.println("1. Insertar Usuario");
                System.out.println("2. Listar Usuarios");
                System.out.println("3. Salir del programa");
                opt = sc.nextInt();

                // Ramificamos cada opcion con un switch
                switch (opt) {
                    case 1:
                        // Llamamos al procedimieto que toma los datos al usuario
                        // y ademas nos llama a la query para insertar los datos.
                        takeData(conexion);
                        System.out.println("Datos insertados");
                        System.out.println();
                        break;

                    case 2:
                        // Llamamos al procedimiento que nos realiza el listado
                        selectQUERY(conexion);
                        break;

                    case 3:
                        ;
                        // Cerramos la conexion con la base de datos
                        conexion.close();
                        System.exit(0);
                        break;
                }
                // Valores comprendidos en el switch
            } while (opt > 0 && opt < 4);

        } catch (ClassNotFoundException | SQLException ec) {
            ec.printStackTrace();
        }
    }
}
import clase.Libro;
import clase.Revista;
import clase.Usuario;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;
import java.util.*;

public class prueba{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		/*String titulo, autor, genero, nombre, editorial;
		int num_copias, num_prestados, issn;
		
		Libro libro = new Libro();
		Revista revista = new Revista();
		
		//Pedir datos de libro
		System.out.print("Introduzca el titulo: ");
		libro.set_titulo(teclado.nextLine());
		System.out.print("Introduzca el autor: ");
		libro.set_autor(teclado.nextLine());
		System.out.print("Introduzca el genero: ");
		libro.set_genero(teclado.nextLine());
		System.out.print("Introduzca el numero de copias: ");
		libro.set_num_copias(teclado.nextInt());
		System.out.print("Introduzca el numero de copias prestadas: ");
		libro.set_num_prestados(teclado.nextInt());
		teclado.nextLine();
		
		//Pedir datos de revista
		System.out.print("Introduzca el nombre: ");
		revista.set_nombre(teclado.nextLine());
		System.out.print("Introduzca la editorial: ");
		revista.set_editorial(teclado.nextLine());
		System.out.print("Introduzca el ISSN: ");
		revista.set_issn(teclado.nextInt());
		System.out.print("Introduzca el numero de copias: ");
		revista.set_num_copias(teclado.nextInt());
		System.out.print("Introduzca el numero de copias prestadas: ");
		revista.set_num_prestados(teclado.nextInt());
		
		System.out.print(libro.get_titulo() + " ");
		System.out.print(libro.get_autor() + " ");
		System.out.print(libro.get_genero() + " ");
		System.out.print(libro.get_num_copias() + " ");
		System.out.print(libro.get_num_prestados() + " ");
		
		System.out.println();
		
		System.out.print(revista.get_nombre() + " ");
		System.out.print(revista.get_editorial() + " ");
		System.out.print(revista.get_issn() + " ");
		System.out.print(revista.get_num_copias() + " ");
		System.out.print(revista.get_num_prestados() + " ");
		
		System.out.println();
		System.out.print(libro.prestamo() + " ");
		System.out.println("numero de copias prestadas: "+libro.get_num_prestados());
		
		System.out.print(revista.prestamo() + " ");
		System.out.println("numero de revitas prestadas: "+revista.get_num_prestados());
		
		System.out.print(libro.devolucion() + " ");
		System.out.println("numero de copias prestadas: "+libro.get_num_prestados());
		
		System.out.print(revista.devolucion() + " ");
		System.out.println("numero de revitas prestadas: "+revista.get_num_prestados());
		
		System.out.println("Prestamos de libros: ");
		for(int i = 0; i < libro.get_num_copias(); i++){
			if(libro.prestamo())
			System.out.println(libro.get_num_prestados());
		}
		
		System.out.println("Prestamos de de revista: ");
		for(int i = 0; i < revista.get_num_copias(); i++){
			if(revista.prestamo())
			System.out.println(revista.get_num_prestados());
		}
		
		System.out.println("Devoluciones de libro: ");
		for(int i = 0; i < libro.get_num_copias(); i++){
			if(libro.devolucion())
			System.out.println(libro.get_num_prestados());
		}
		
		System.out.println("Devoluciones de revista: ")
		for(int i = 0; i < revista.get_num_copias(); i++){
			if(revista.devolucion())
			System.out.println(revista.get_num_prestados());
		}*/
		
		Usuario usuario = new Usuario("Javier", "434142B", "Uno");
		usuario.set_lista("Dos");
		usuario.set_lista("Tres");
		
		System.out.println(usuario.get_nombre());
		System.out.println(usuario.get_dni());
		System.out.println(usuario.get_lista());
		
		usuario.quitar_libro("Dos");
		System.out.println(usuario.get_lista());
		
		List<Libro> libros = new ArrayList<>();
		
		Libro libro1 = new Libro("titulo1", "autor1", "genero1", 5, 0);
		libros.add(libro1);
		Libro libro2 = new Libro("titulo3", "autor2", "genero2", 5, 0);
		libros.add(libro2);
		Libro libro3 = new Libro("titulo2", "autor3", "genero3", 5, 0);
		libros.add(libro3);
		System.out.println(libros);
		
		Collections.sort(libros, Libro.LibroComparator);
		
		for(Libro i : libros){
			System.out.print(i + " ");
		}
			
	}
}
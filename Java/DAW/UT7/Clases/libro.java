package clase;

import java.util.Comparator;

public class Libro{
	private String titulo;
	private String autor;
	private String genero;
	private int num_copias;
	private int num_prestados;
	
	public Libro(){
	}
	
	public Libro(String titulo, String autor, String genero, int num_copias, int num_prestados){
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.num_copias = num_copias;
		this.num_prestados = num_prestados;
	}
	
	public void set_titulo(String titulo){
		this.titulo = titulo;
	}
	
	public void set_autor(String autor){
		this.autor = autor;
	}
	
	public void set_genero(String genero){
		this.genero = genero;
	}
	
	public void set_num_copias(int num_copias){
		this.num_copias = num_copias;
	}
	
	public void set_num_prestados(int num_prestados){
		this.num_prestados = num_prestados;
	}
	
	public String get_titulo(){
		return titulo;
	}
	
	public String get_autor(){
		return autor;
	}
	
	public String get_genero(){
		return genero;
	}
	
	public int get_num_copias(){
		return num_copias;
	}
	
	public int get_num_prestados(){
		return num_prestados;
	}
	
	public boolean prestamo(){
		boolean prestado = true;
		if(num_copias > num_prestados){
			num_prestados++;
		}else{
			prestado = false;
		}
		
		return prestado;
	}
	
	public boolean devolucion(){
		boolean devuelto = true;
		if(num_prestados == 0){
			devuelto = false;
		}else{
			num_prestados--;
		}
		
		return devuelto;
	}
	
	public static Comparator<Libro> LibroComparator = new Comparator<Libro>(){
		public int compare(Libro s1, Libro s2){
			String titulo1 = s1.get_titulo().toUpperCase();
			String titulo2 = s2.get_titulo().toUpperCase();
			
			//Orden de menor a mayor
			return titulo1.compareTo(titulo2);
			
			//Orden de mayor a menor
			//return titulo2.compareTo(titulo1);
		}
	};
	
	@Override//Con O mayúscula
	public String toString(){
		return "\ntitulo: " + titulo + "\nautor: " + autor + "\ngenero: " + genero
		+ "\nnumero de copias: " + num_copias + "\nnumero de ejemplares prestados: " +
		num_prestados;
	}
}
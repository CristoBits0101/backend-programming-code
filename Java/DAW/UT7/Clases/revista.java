package clase;

public class Revista{
	private String nombre;
	private String editorial;
	private int issn;
	private int num_copias;
	private int num_prestados;
	
	public Revista(){
		
	}
	
	public Revista(String nombre, String editorial, int issn, int num_copias, int num_prestados){
		this.nombre = nombre;
		this.editorial = editorial;
		this.issn = issn;
		this.num_copias = num_copias;
		this.num_prestados = num_prestados;
	}
	
	public void set_nombre(String nombre){
		this.nombre = nombre;
	}
	
	public void set_editorial(String editorial){
		this.editorial = editorial;
	}
	
	public void set_issn(int issn){
		this.issn = issn;
	}
	
	public void set_num_copias(int num_copias){
		this.num_copias = num_copias;
	}
	
	public void set_num_prestados(int num_prestados){
		this.num_prestados = num_prestados;
	}
	
	public String get_nombre(){
		return nombre;
	}
	
	public String get_editorial(){
		return editorial;
	}
	
	public int get_issn(){
		return issn;
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
}
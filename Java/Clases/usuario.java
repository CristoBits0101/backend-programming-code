package clase;

import java.util.*;

public class Usuario{
	private String nombre;
	private String dni;
	private List<String> lista;
	
	public Usuario(){}
	
	public Usuario(String nombre, String dni, String titulo){
		this.nombre = nombre;
		this.dni = dni;
		this.lista = new ArrayList<>();
		lista.add(titulo);
	}
	
	public void set_nombre(String nombre){
		this.nombre = nombre;
	}
	
	public void set_dni(String dni){
		this.dni = dni;
	}
	
	public void set_lista(String titulo){
		this.lista.add(titulo);
	}
	
	public String get_nombre(){
		return nombre;
	}
	
	public String get_dni(){
		return dni;
	}
	
	public List<String> get_lista(){
		return lista;
	}
	
	public void quitar_libro(String titulo){
		if(lista.indexOf(titulo) != -1){
			lista.remove(titulo);
		}
	}
	
	
}
package supuestopractico_ut6.cliente;


/**
 *
 * @author Jorge lap
 */
public class Cliente {
    
    private String dni, nombre, apellidos, numCuenta, saldo;
    
    public Cliente(){
        //Constructor vacio
    }
    
    public Cliente(String dni, String nombre, String apellidos, String numCuenta, String saldo){
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.numCuenta=numCuenta;
        this.saldo=saldo;
    }
    
    //Setters and Getters
    
    public String getDNI(){return dni;}
    public void setDNI(String dni){this.dni=dni;}   
    
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}      
    
    public String getApellidos(){return apellidos;}
    public void setApellidos(String apellidos){this.apellidos=apellidos;}     
    
    public String getCuenta(){return numCuenta;}
    public void setCuenta(String numCuenta){this.numCuenta=numCuenta;}  

    public String getSaldo(){return saldo;}
    public void setSaldo(String saldo){this.saldo=saldo;}
    
    @Override
    public String toString(){  
         return  dni + nombre + apellidos + numCuenta + saldo;
    }

    
}

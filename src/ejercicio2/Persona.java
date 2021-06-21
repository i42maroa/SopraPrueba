package ejercicio2;

/**
 * Clase persona que muestra solamente la edad y el sexo 
 * 
 * @author Antonio Marín Rodríguez
 * @version 1.0
 */

public class Persona {

	private int edad_;
	private String sexo_;
	
	
	//CONSTRUCTOR
	public Persona(int edad, String sexo) {
		this.edad_=edad;
		this.sexo_=sexo;
	}
	
	//SETTERS
	public void setEdad_(int edad) {
		this.edad_ = edad;
	}
	
	public void setSexo_(String sexo) {
		this.sexo_ = sexo;
	}
	
	//GETTERS
	public int getEdad() {
		return edad_;
	}
	
	public String getSexo() {
		return sexo_;
	}
	
	//MUESTRA INFORMACIÓN
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.edad_ + " - " + this.sexo_;
	}
}

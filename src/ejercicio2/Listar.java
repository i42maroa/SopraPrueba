package ejercicio2;
import java.util.ArrayList;
import ejercicio2.Persona;


/**
 * Ejercicio2 de la prueba
 * 
 * @author Antonio Marín Rodríguez
 * @version 1.0
 */

public class Listar {
	public static void main(String[] args){	
		 
		 ArrayList<Persona> list_personas = new ArrayList<>();
		 
		 //Genera el listado aleatorio de personas
		 for(int i=0;i<50;i++) {
			 list_personas.add(generatePersona());
		 }
		 
		 listar(list_personas);	
	 }	
	
	/**
	  * Escriba un algoritmo que visualice una clasificación de 50 personas según edad y sexo. Deberá mostrar los siguientes resultados:
	  * a. Cantidad de personas mayores de edad (18 años o más).
	  * b. Cantidad de personas menores de edad.
	  * c. Cantidad de personas masculinas mayores de edad.
	  * d. Cantidad de personas femeninas menores de edad.
	  * e. Porcentaje que representan las personas mayores de edad respecto al total de personas.
	  * f. Porcentaje que representan las mujeres respecto al total de personas.
	  * 
	  * @param persona Lista de Personas hechas anteriormente
	  * 
	  */
	 public static void listar(ArrayList<Persona> persona) {
		 int personasMayores = 0;
		 int masculinasMayores = 0;
		 int femeninasMenores = 0;
		 
		 for(int i=0;i<persona.size();i++) {
			 if(persona.get(i).getEdad()>=18) {
				 personasMayores++;
				 if(persona.get(i).getSexo().equals("Masculino")) { 
					 masculinasMayores++;
				 }
			 }					
		 	else {
				 if(persona.get(i).getSexo().equals("Femenino")) {	
						 femeninasMenores++;
				 }
			 }
		 }
		 
		 System.out.println("Listado de personas: " + persona);
		 System.out.println("Personas mayores de edad: " + personasMayores);
		 System.out.println("Personas menores de edad: " + (persona.size() - personasMayores));
		 System.out.println("Porcentaje personas mayores: " + (personasMayores*100 / persona.size()*100 )/100 + "%"); //Lo multipico por 100 ya que int no maneja datos por debajo del 0. y me ahorro así transformarlos a double
		 System.out.println("Hombres mayores de edad: " + masculinasMayores);
		 System.out.println("Mujeres menores de edad: " + femeninasMenores);
		 System.out.println("Mujeres totales: " + ((personasMayores-masculinasMayores + femeninasMenores)*100 / persona.size()*100 )/100 + "%");
	 }
	 
	 /**
	  * Método que genera de forma aleatoria la edad y el sexo de una persona.
	  * 
	  *  @return Persona generada aleatoriamente
	  */
	 public static Persona generatePersona() {
		int edad = (int)(Math.random()*100+1);
		int sexo = (int)(Math.random()*2);
		
		return new Persona(edad,(sexo==0)?"Masculino":"Femenino");
	 }
}

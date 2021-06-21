package ejercicio1;


/**
 * Ejercicio1
 * 
 * @param Hay que introducir cómo argumento un número entero 
 * @author Antonio Marín Rodríguez
 * @version 1.0
 */

public class Leer {
	
	public static String errorEntrada = "Debe introducir un número entero como argumento";
	
	 public static void main(String[] args)
	    {	
		 if(args.length != 1) {
		    	System.out.println(errorEntrada);
		    }
		    else  {      	
		    	try {
		    		int numero = Integer.parseInt(args[0]);
		    		if(numero > 0) {
		    			System.out.println("Número introducido: " + numero);
			    		leer(numero); 
		    		}
		    		else {
		    			System.out.println(errorEntrada);
		    		}	
				} catch (Exception e) {
					System.out.println(errorEntrada);
				}		    		   
		    }		   
	    }
	 
	 /**
	  * Método que lea un número entero y determine sí es par o impar. Si es par, que escriba todos los 
	  * pares de manera descendiente desde sí mismo y hasta el cero. Si es impar, que escriba todos los 
	  * impares de manera descendiente desde sí mismo hasta el uno.
	  * 
	  * @param numero Número entero
	  * 
	  */
	 public static void leer(int numero) { 
		 if(numero%2 == 0) {
	    	System.out.println("Es par");
		 }
		 else {
			 System.out.println("Es inpar"); 
		 }
			 
		for (int i=numero; i>= 1; i=i-2) {
			System.out.print(i + " -> ");
		}
	 }
}

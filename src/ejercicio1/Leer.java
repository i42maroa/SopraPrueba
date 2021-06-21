package ejercicio1;


/**
 * Ejercicio1
 * 
 * @param Hay que introducir c�mo argumento un n�mero entero 
 * @author Antonio Mar�n Rodr�guez
 * @version 1.0
 */

public class Leer {
	
	public static String errorEntrada = "Debe introducir un n�mero entero como argumento";
	
	 public static void main(String[] args)
	    {	
		 if(args.length != 1) {
		    	System.out.println(errorEntrada);
		    }
		    else  {      	
		    	try {
		    		int numero = Integer.parseInt(args[0]);
		    		if(numero > 0) {
		    			System.out.println("N�mero introducido: " + numero);
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
	  * M�todo que lea un n�mero entero y determine s� es par o impar. Si es par, que escriba todos los 
	  * pares de manera descendiente desde s� mismo y hasta el cero. Si es impar, que escriba todos los 
	  * impares de manera descendiente desde s� mismo hasta el uno.
	  * 
	  * @param numero N�mero entero
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

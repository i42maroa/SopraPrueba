package ejercicio3;

/**
 * Ejercicio3
 * 
 * @param Hay que introducir cómo primer argumento las horas trabajadas y y como segundo argumento la tarifa que se aplicará
 * @author Antonio Marín Rodríguez
 * @version 1.0
 * 
 */

public class Leer {
	
	public static String errorEntrada="Debe introducir como primer argumento las horas trabajadas y como segundo argumento la tarifa que se aplicará";
	public static String errorTipoEntrada="Tanto las horas cómo la tarifa tienen que ser números enteros positivos";

	public static void main(String[] args){	
		  if(args.length != 2) {
		    	System.out.println(errorEntrada);
		    }
		    else  {      	
		    	try {
		    		int horas = Integer.parseInt(args[0]);
		    		int tarifa = Integer.parseInt(args[1]);
		    		
		    		if(horas > 0 && tarifa > 0) {
		    			calcularSueldo(horas, tarifa);
		    		}
		    		else {
		    			System.out.println(errorTipoEntrada);
		    		}
		    		
				} catch (Exception e) {
					System.out.println(errorTipoEntrada);
				}		    		   
		    }	 
	 }  
	 
	
	/**
	  * Algoritmo para el cálculo del salario de un trabajador. El importe liquidado (sueldo) depende 
	  * la una tarifa o precio por hora establecida y de un condicionante sobre las horas trabajadas: 
	  * - Sí la cantidad de horas trabajadas es mayor a 40 horas, la tarifa se incrementa en un 50% para las horas extras
	  * 
	  * @param horas Horas que ha trabajado el empleado
	  * @param tarifa Tarifa que se aplicará a las horas trabajadas
	  * 
	  */
	 public static void calcularSueldo(int horas, int tarifa) {
		 int horasExtras= 0;
		 int sueldo = 0;
		 
		 if(horas > 40 ) {
			 horasExtras = horas - 40;
			 sueldo= (tarifa * 40) + (horasExtras * (tarifa+tarifa*50/100)); 
		 }
		 else {
			 sueldo = tarifa * horas;
		 }
		 
		 System.out.println("Horas trabajadas: " + horas + ", horas extra: " + horasExtras);
		 System.out.println("Tarifa base: " + tarifa + ", tarifa horas extra: " + (tarifa+tarifa*50/100));
		 System.out.println("El sueldo total será: " + sueldo + "€");
	 }
}

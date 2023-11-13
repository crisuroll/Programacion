package enum_;

import java.util.Scanner;

/**
 * Clase Ej03. Define un enum llamado Mes que represente los meses del año. Luego, crea un 
 * programa que solicite al usuario ingresar un mes (1 para enero, 2 para febrero, etc.) y
 * muestre cuantos dıas tiene ese mes.
 * @author crisuroll
 */

public class Ej03 {
	
	/**
	 * Metodo main
	 * @param args
	 */
	
	public enum Mes {
		ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, 
		JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
	}

	public static void main(String[] args) {

		Mes mes [] = Mes.values();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un mes (1-12): ");
		int m = sc.nextInt();
		
		if (m >= 1 && m <= mes.length) {
			if (mes[m-1] == Mes.ENERO || mes[m-1] == Mes.MARZO || mes[m-1] == Mes.MAYO  
					|| mes[m-1] == Mes.JULIO  || mes[m-1] == Mes.AGOSTO  || mes[m-1] == Mes.OCTUBRE
					 || mes[m-1] == Mes.DICIEMBRE) {
				System.out.println("El mes " + mes[m-1] + " tiene 31 días.");
			} else if (mes[m-1] == Mes.ABRIL || mes[m-1] == Mes.JUNIO || mes[m-1] == Mes.SEPTIEMBRE  
					|| mes[m-1] == Mes.NOVIEMBRE) {
				System.out.println("El mes " + mes[m-1] + " tiene 30 días.");
			} else {
				System.out.println("El mes " + mes[m-1] + " tiene 28 días, 29 en año bisiesto.");
			}
		} else {
			System.out.println("Mes introducido no válido.");
		}
		sc.close();
		
	}

}

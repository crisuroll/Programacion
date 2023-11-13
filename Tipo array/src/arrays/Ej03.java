package arrays;

import java.util.Arrays;

/**
 * Clase Ej03. Crea un programa que genere un array de numeros enteros aleatorios (puedes buscar 
 * en Internet como hacer esto), luego encuentre y muestre el numero mas grande en el array.
 * @author crisuroll
 */

public class Ej03 {
	
	/**
	 * Método main
	 * @param args
	 */

	public static void main(String[] args) {
		
		int[] arrayMax = new int[5];
		
		System.out.print("Elementos en el array: ");
		
		for (int i = 0; i < arrayMax.length; i++) {
			arrayMax[i] = (int) (Math.random() * 50);
			System.out.print(arrayMax[i] + " ");
		}

		Arrays.sort(arrayMax);
		
		System.out.println("\nEl número más grande del array es " + arrayMax[4]);

	}

}

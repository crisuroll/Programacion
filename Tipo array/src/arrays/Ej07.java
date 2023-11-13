package arrays;

import java.util.Arrays;


/**
 * Clase Ej07. Desarrolla un programa que tome un array de numeros y elimine los elementos 
 * duplicados, dejando solo una instancia de cada numero. Date cuenta de que serıa difıcil 
 * eliminar elementos duplicados si el array no esta ordenado. Por esta razon, la idea es crear 
 * un array a mano, ordenarlo utilizando el metodo sort() de los arrays, y entonces empezar 
 * a comprobar si hay elementos duplicados.
 * @author crisuroll
 */

public class Ej07 {
	
	/**
	 * Método main
	 * @param args
	 */

	public static void main(String[] args) {

		int[] arrayDup = {4, 4, 3, 4, 2};	
		Arrays.sort(arrayDup);
		
		int[] arrayNew = new int[arrayDup.length];
		int acu = 0;
		
		for (int i = 0; i < arrayDup.length - 1; i++) {
			if (arrayDup[i] != arrayDup[i + 1]) {
				arrayNew[acu++] = arrayDup[i];
			}
		}
		
		System.out.println(arrayDup[0] + " " + arrayDup[1] + " " + arrayDup[2] + " " + arrayDup[3] + " " + arrayDup[4]);
		arrayNew[acu++] = arrayDup[arrayDup.length - 1];
        
		for (int i = 0; i < acu; i++) {
            System.out.print(arrayNew[i] + " ");
        }

	}

}



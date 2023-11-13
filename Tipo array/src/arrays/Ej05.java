package arrays;

import java.util.Scanner;

/**
 * Clase Ej05. Escribe un programa que elimine un elemento especıfico del array (que sera 
 * indicado por su ́ındice dentro del array). Todos los elementos se moveran a la izquierda hasta 
 * cubrir el elemento que se ha eliminado, por lo que el ́ultimo elemento del array quedara 
 * duplicado.
 * @author crisuroll
 */

public class Ej05 {
	
	/**
	 * Método main
	 * @param args
	 */

	public static void main(String[] args) {

		int[] arrayRm = {5, 4, 3, 2, 1};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Qué elemento del array deseas eliminar? [1-5]: ");
		int num = sc.nextInt();
		sc.close();
		
		if ((num < 1) || (num > 5)) {
			System.out.println("Debes introducir un número del 1 al 5.");
		} else {
			num = num - 1;
			System.out.print("Nuevos elementos en el array: ");
			for (int i = num; i < arrayRm.length -1; i++) {
				arrayRm[i] = arrayRm[i+1];
				//System.out.print(arrayRm[i] + " ");
			}
		}
		
		System.out.print(arrayRm[0] + " " + arrayRm[1] + " " + arrayRm[2] + " " + arrayRm[3] + " " + arrayRm[4]);
		
	}

}

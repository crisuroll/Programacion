package arrays;

import java.util.Scanner;

/**
 * Clase Ej06. Escribe un programa que inserte un elemento en un ́ındice determinado. Tanto el 
 * elemento como el ́ındice se le deben pedir al usuario. El array desplazara todos los elementos 
 * hacia la derecha para poder insertar el nuevo elemento, por lo que se eliminara el 
 * ultimo elemento del array.
 * @author crisuroll
 */

public class Ej06 {
	
	/**
	 * Método main
	 * @param args
	 */

	public static void main(String[] args) {
		
		int[] arrayRm = {1, 2, 3, 4, 5};

		Scanner sc = new Scanner(System.in);
		System.out.print("Dime el elemento a introducir: ");
		int el = sc.nextInt();
		System.out.print("Dime el índice donde insertar el elemento: ");
		int in = sc.nextInt();
		sc.close();
		
		if ((in < 0) || (in > 4)) {
			System.out.println("Debes introducir un número del 0 al 4.");
		} else {
			//arrayRm[in] = el;
			System.out.print("Nuevos elementos en el array: ");

			for (int i = arrayRm.length - 1; i > in; i--) {
				arrayRm[i] = arrayRm[i-1];
			}
			arrayRm[in] = el;
		}
		
		System.out.print(arrayRm[0] + " " + arrayRm[1] + " " + arrayRm[2] + " " + arrayRm[3] + " " + arrayRm[4]);

	}

}

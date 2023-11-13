package arrays;

import java.util.Scanner;

/**
 * Clase Ej04. Crea un programa que busque un numero especıfico en un array de numeros enteros. 
 * Si el numero se encuentra en el array, muestra su posicion; de lo contrario, muestra un 
 * mensaje indicando que el numero no se encontro.
 * @author crisuroll
 */

public class Ej04 {
	
	/**
	 * Método main
	 * @param args
	 */

	public static void main(String[] args) {

		int[] arrayFind = new int[5];
		
		for (int i = 0; i < arrayFind.length; i++) {
			arrayFind[i] = (int) (Math.random() * 50);
			System.out.print(arrayFind[i] + " ");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Qué número quieres buscar?: ");
		int num = sc.nextInt();
		boolean found = false;
		sc.close();
		
		if ((num < 0) || (num > 50)) {
			System.out.println("Debes introducir un número entre 0 y 50.");
		} else {
			for (int i = 0; i < arrayFind.length; i++) {
				if (arrayFind[i] == num) {
					System.out.println("El número " + num + " se encuentra en la posición " + i);
					found = true;
				}
			}
			
		}
		
		if (found == false) {
			System.out.println("No se encontró el número " + num + " en el array.");
		}
		
	}

}

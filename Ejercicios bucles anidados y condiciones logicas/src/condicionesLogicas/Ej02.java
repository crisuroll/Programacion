package condicionesLogicas;

import java.util.Scanner;

/**
 * Clase Ej02. Escribe un programa para encontrar el maximo entre tres numeros (introducidos 
 * por teclado) con el menor numero de comprobaciones posible.
 * @author crisuroll
 */

public class Ej02 {
	
	/**
	 * Metodo main
	 * @param args
	 */

	public static void main(String[] args) {

		int num1, num2, num3 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		num1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		num2 = sc.nextInt();
		System.out.print("Introduce el tercer número: ");
		num3 = sc.nextInt();
		
		if ((num1 > num2) && (num1 > num3)) {
			System.out.println("El máximo es " + num1 + ".");
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println("El máximo es " + num2 + ".");
		} else {
			System.out.println("El máximo es " + num3 + ".");
		}
		sc.close();
	}

}

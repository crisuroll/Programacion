package condicionesLogicas;

import java.util.Scanner;

/**
 * Escribe un programa que coja tres numeros del usuario y compruebe si los numeros estan en 
 * orden creciente o decreciente con el menor numero posible de comprobaciones. Si estan en 
 * orden creciente se mostrara el mensaje Estan en orden creciente. Si estan en orden decreciente 
 * se mostrara el mensaje Estan en orden decreciente. Si los tres numeros no estan en orden 
 * creciente o decreciente (por ejemplo, los numeros 42, 21, 74. O los numeros 62, 78, 66, etc.), 
 * entonces se mostrara el mensaje No estan en orden creciente ni decreciente.
 * @author crisuroll
 */

public class Ej03 {
	
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
		
		if ((num1 < num2) && (num2 < num3)) {
			System.out.println("Los números están en orden creciente.");
		} else if ((num3 < num2) && (num2 < num1)) {
			System.out.println("Los números están en orden decreciente.");
		} else {
			System.out.println("No están en orden creciente ni decreciente.");
		}
		sc.close();
	}

}

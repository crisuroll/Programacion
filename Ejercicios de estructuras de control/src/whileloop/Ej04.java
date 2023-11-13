package whileloop;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {

		/*Genera un numero aleatorio entre 1 y 100. Luego, pide al usuario que adivine el numero y 
		  proporciona pistas (mayor o menor) hasta que lo adivine. Utiliza un bucle while para controlar el 
		  juego y la condicion if-else para dar las pistas.*/
		
		int num = (int) (Math.random() * 100) + 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número del 1 al 100: ");
		int numUser = sc.nextInt();
		
		while (num != numUser) {
			if (numUser < 1 || numUser > 100) {
				System.out.println("Debe ser un número entre 1 y 100.");
				System.out.print("Introduce un número del 1 al 100: ");
				numUser = sc.nextInt();
			} else if (numUser < num) {
				System.out.println("El número a adivinar es mayor que " + numUser);
				System.out.print("Introduce un número del 1 al 100: ");
				numUser = sc.nextInt();
			} else if (numUser > num) {
				System.out.println("El número a adivinar es menor que " + numUser);
				System.out.print("Introduce un número del 1 al 100: ");
				numUser = sc.nextInt();
			}
		}
		System.out.println("¡Adivinaste el número!");
		sc.close();
	}

}

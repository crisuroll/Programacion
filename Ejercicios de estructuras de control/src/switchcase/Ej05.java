package switchcase;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {

		/*Solicita al usuario que ingrese una calificacion numerica del 1 al 5 y muestra la calificacion 
		  en palabras (por ejemplo, Aprobado, Notable, Sobresaliente) utilizando un switch.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa una calificación del 1 al 5: ");
		int cal = sc.nextInt();
		
		switch (cal) {
			case 1:
				System.out.println("Insuficiente.");
			break;
			case 2:
				System.out.println("Insuficiente.");	
			break;
			case 3:
				System.out.println("Suficiente.");
			break;
			case 4:
				System.out.println("Notable.");
			break;
			case 5:
				System.out.println("Sobresaliente.");
			break;
			default:
				System.out.println("Calificación no válida.");
			break;
		}
		sc.close();
		
	}

}

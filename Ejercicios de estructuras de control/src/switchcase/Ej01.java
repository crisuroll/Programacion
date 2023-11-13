package switchcase;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {

		/*Pide al usuario que ingrese un numero del 1 al 7 y muestra el dıa de la semana correspondiente 
		  utilizando un switch.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número del 1 al 7: ");
		int num = sc.nextInt();
		
		switch (num) {
			case 1:
				System.out.println("Lunes");
			break;
			case 2:
				System.out.println("Martes");
			break;
			case 3:
				System.out.println("Miércoles");
			break;
			case 4:
				System.out.println("Jueves");
			break;
			case 5:
				System.out.println("Viernes");
			break;
			case 6:
				System.out.println("Sábado");
			break;
			case 7:
				System.out.println("Domingo");
			break;
			default:
				System.out.println("Entrada no válida. Solo se aceptan números del 1 al 7.");
			break;
		}
		
		sc.close();

	}

}

package switchcase;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {

		/*Crea un pequeño menu con tres opciones (por ejemplo, Mostrar informacion, Editar perfil y Salir). 
		  Pide al usuario que seleccione una opcion y muestra un mensaje correspondiente utilizando un switch.*/

		Scanner sc = new Scanner(System.in);
		System.out.println("1. Mostrar información");
		System.out.println("2. Editar perfil");
		System.out.println("3. Salir\n");
		System.out.print("ELIJA UNA OPCIÓN: ");
		int op = sc.nextInt();
		
		switch (op) {
			case 1:
				System.out.println("Aquí tiene la información de su perfil.");
			break;
			case 2:
				System.out.println("Aquí puede editar su perfil.");	
			break;
			case 3:
				System.out.println("Saliendo... Tenga un buen día.");
			break;
			default:
				System.out.println("Opción no válida.");
			break;
		}
		sc.close();
	}

}

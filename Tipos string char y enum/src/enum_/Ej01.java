package enum_;

import java.util.Scanner;

/**
 * Clase Ej01. Crea un enum llamado DiaSemana que represente los dıas de la semana 
 * (Lunes, Martes, Miercoles, etc.). Luego, el programa solicita al usuario un numero y muestra 
 * el dıa correspondiente.
 * @author crisuroll
 */

public class Ej01 {
	
	/**
	 * Metodo main
	 * @param args
	 */
	
	public enum DiaSemana {
		LUNES,
		MARTES,
		MIERCOLES,
		JUEVES,
		VIERNES,
		SABADO,
		DOMINGO;
	}

	public static void main(String[] args) {
		
		int num = 0;
		DiaSemana dias [] = DiaSemana.values();
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		num = sc.nextInt();
		
		if (num >= 1 && num <= dias.length) {
			System.out.println("Hoy es " + dias[num-1]);
		} else {
			System.out.println("Sólo puedes ingresar un número del 1 al 7.");
		}
		
		/*
		switch (dia) {
			case LUNES:
				System.out.println("Hoy es Lunes");
			break;
			case MARTES:
				System.out.println("Hoy es Martes");
			break;
			case MIERCOLES:
				System.out.println("Hoy es Miércoles");
			break;
			case JUEVES:
				System.out.println("Hoy es Jueves");
			break;
			case VIERNES:
				System.out.println("Hoy es Viernes");
			break;
			case SABADO:
				System.out.println("Hoy es Sabado");
			break;
			case DOMINGO:
				System.out.println("Hoy es Domingo");
			break;
			default:
				System.out.println("Número no válido. Ingrese uno del 1 al 7.");
			break;
		}
		*/
		sc.close();
	}

}

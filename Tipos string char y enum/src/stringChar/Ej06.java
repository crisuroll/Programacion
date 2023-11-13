package stringChar;

import java.util.Scanner;

/**
 * Clase Ej06. Crea un programa que solicite al usuario ingresar una cadena y luego permita 
 * reemplazar todas las apariciones de un caracter en concreto por otro caracter. El usuario 
 * debe proporcionar el caracter a buscar, ası como el caracter con el que desea reemplazarlo. 
 * @author crisuroll
 */

public class Ej06 {
	
	/**
	 * Metodo main
	 * @param args
	 */

	public static void main(String[] args) {

		String st = "";
		char b, r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa una cadena: ");
		st = sc.nextLine();
		System.out.print("Ingresa el caracter a buscar: ");
		b = sc.next().charAt(0);
		System.out.print("Ingresa el caracter con el que reemplazarlo: ");
		r = sc.next().charAt(0);
		
		System.out.println("Cadena original: " + st);
		System.out.println("Cadena reemplazada: " + st.replace(b, r));
		sc.close();
	}

}

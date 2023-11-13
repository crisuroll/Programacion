package stringChar;

import java.util.Scanner;

/**
 * Clase Ej01. Escribe un programa que solicite al usuario ingresar una cadena de texto y luego 
 * cuente cuantas veces aparece la letra a en la cadena (tanto mayuscula como minuscula).
 * @author crisuroll
 */

public class Ej01 {
	
	/**
	 * Metodo main
	 * @param args
	 */

	public static void main(String[] args) {
		
		String st = "";
		int i = 0;
		int a = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa una cadena de texto: ");
		st = sc.nextLine();	
		sc.close();
		for (i = 0; i < st.length(); i++) {
			if ((st.charAt(i) == 'a') || (st.charAt(i) == 'A')) {
				a++;
			}
		}
		
		System.out.println("La cadena introducida tiene " + a + " 'a'.");

	}

}

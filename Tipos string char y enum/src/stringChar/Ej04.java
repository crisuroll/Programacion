package stringChar;

import java.util.Scanner;

/**
 * Clase Ej04. Crea un programa que permita al usuario ingresar una palabra y luego muestre 
 * la palabra invertida. Por ejemplo, si el usuario ingresa Hola, el programa debe mostrar aloH.
 * @author crisuroll
 */

public class Ej04 {
	
	/**
	 * Metodo main
	 * @param args
	 */

	public static void main(String[] args) {

		int i = 0;
		String rst = "";
		String st = "";
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		st = sc.nextLine();
		sc.close();
		
		for (i = 0; i < st.length(); i++) {
			ch = st.charAt(i);
			rst = ch + rst;
		}
		
		System.out.println(rst);

	}

}

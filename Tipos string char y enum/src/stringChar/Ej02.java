package stringChar;

import java.util.Scanner;

/**
 * Clase Ej02. Crea un programa que permita al usuario ingresar una frase y luego reemplace 
 * todas las letras e por x en la cadena. Para hacerlo mas facil, puedes hacer uso del metodo 
 * replace() que tiene el tipo String. Busca mas informacion acerca de este metodo en Internet.
 * @author crisuroll
 */

public class Ej02 {
	
	/**
	 * Metodo main
	 * @param args
	 */

	public static void main(String[] args) {

		String st = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		st = sc.nextLine();
		
		System.out.println(st.replace('e', 'x'));
		sc.close();
	}

}

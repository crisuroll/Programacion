package stringChar;

import java.util.Scanner;

/**
 * Clase Ej05. Escribe un programa que determine si una palabra o frase ingresada por el usuario 
 * es un palındromo. Un palındromo es una palabra, frase o secuencia que se lee igual de izquierda 
 * a derecha que de derecha a izquierda. El programa mostrara Es palındromo si sı lo es, 
 * o mostrara No es palındromo en caso contrario. Ten en cuenta que puedes eliminar los espacios 
 * en blanco con el metodo replace(). Tambien podrıas utilizar el metodo toLowerCase() para 
 * transformar todas las letras a minuscula y realizar la comparacion de manera correcta.
 * @author crisuroll
 */

public class Ej05 {
	
	/**
	 * Metodo main
	 * @param args
	 */

	public static void main(String[] args) {
		
		int i = 0;
		String st = "";
		String rst = "";
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una cadena de texto: ");
		st = sc.nextLine();
		st = st.toLowerCase().replaceAll("\\s+", "");
		sc.close();
		for (i = 0; i < st.length(); i++) {
			ch = st.charAt(i);
			rst = ch + rst;
		}
		
		if (rst.equals(st)) {
			System.out.println("Es un palindromo.");
		} else {
			System.out.println("No es un palindromo");
		}

	}

}

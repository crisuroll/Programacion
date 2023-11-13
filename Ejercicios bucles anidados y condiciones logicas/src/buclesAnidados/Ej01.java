package buclesAnidados;

import java.util.Scanner;

/**
 * Clase Ej01. Pide al usuario que ingrese un numero N. Muestra un triangulo como el que
 * aparece a continuacion, donde en este caso N = 7.
 * @author crisuroll
 */

public class Ej01 {
	
	/**
	 * Metodo main.
	 * @param args
	 */

	public static void main(String[] args) {

		int n, i, j = 0;
		String ast = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		n = sc.nextInt();
		ast = "*";
		
		for (i = 1; i <= n;) {
			for (j = 1; j <= n; j++) {
				System.out.println(ast);
				ast = ast + "*";
				i++;
			}
		}
		sc.close();
	}
}

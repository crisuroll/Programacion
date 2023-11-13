package buclesAnidados;

import java.util.Scanner;

/**
 * Clase Ej02. Pide al usuario que ingrese un numero N. Muestra un triangulo como el que aparece
 * a continuacion, donde en este caso N = 7.
 * @author crisuroll
 */

public class Ej02 {
	
	/**
	 * Metodo main
	 * @param args
	 */

	public static void main(String[] args) {
		
		int n, i, j = 0;
		String num;

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		n = sc.nextInt();
		num = "";
		
		for (i = 1; i <= n;) {
			for (j = 1; j <= n; j++) {
				num += j;
				System.out.println(num);
				i++;
			}
		}	
		sc.close();
	}

}

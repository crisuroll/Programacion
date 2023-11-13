package condicionesLogicas;

import java.util.Scanner;

/**
 * Clase Ej01. Escribe un programa para comprobar si un triangulo es equilatero, isosceles 
 * o escaleno. Pista: tienes que realizar comparaciones con el tamaño de los lados.
 * @author crisuroll
 */

public class Ej01 {
	
	/**
	 * Metodo main
	 * @param args
	 */

	public static void main(String[] args) {
		
		int a, b, c = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Medida del primer lado: ");
		a = sc.nextInt();
		System.out.print("Medida del segundo lado: ");
		b = sc.nextInt();
		System.out.print("Medida del tercer lado: ");
		c = sc.nextInt();
		
		if ((a == b) && (a == c)) {
			System.out.println("Este triángulo es equilátero.");
		} else if ((a == b) || (b == c) || (a == c)) {
			System.out.println("Este triángulo es isósceles.");		
		} else {
			System.out.println("Este triángulo es escaleno.");
		}
		sc.close();
	}

}

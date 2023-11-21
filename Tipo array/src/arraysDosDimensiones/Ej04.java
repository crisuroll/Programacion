package arraysDosDimensiones;

import java.util.Scanner;

/**
 * Clase Ej04. Crea un programa que declare una matriz. Despues, pedira tres veces al usuario 
 * que indique una posicion de la matriz (proporcionando fila y columna), y el programa debe 
 * sumar los numeros que hay en esas posiciones y mostrar el resultado. Debes asegurarte de que 
 * las posiciones que indica el usuario sean validas, y si no es ası, seguiras pidiendo que 
 * ingrese una nueva posicion hasta que tengas tres posiciones validas de la matriz.
 * @author crisuroll
 */

public class Ej04 {
	
	/**
	 * Método main
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] matriz = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		System.out.println("Matriz original:");
		imprimirMatriz(matriz);
		int suma = 0;
		boolean valida;
		
		for (int i = 0; i < 3; i++) {
			valida = false;
			while(!valida) {
				System.out.println("Ingresa la posición (fila y columna) para sumar. Ejemplo: <fila> <columna>");
				int fila = sc.nextInt();
				int columna = sc.nextInt();
				
				if (fila >= 0 && fila < matriz.length && columna >= 0 && columna < matriz[0].length) {
					System.out.println("Posición correcta!");
					suma += matriz[fila][columna];
					valida = true;
				} else {
					System.out.println("Posicion fuera de los limites de la matriz. No se sumará.");
				}
			}
		}
		System.out.println("La suma de las posiciones seleccionadas es: " + suma);
		sc.close();

	}
	
	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz [0]. length ; j ++) {
				System . out . print ( matriz [ i ][ j ] + "\t") ;
			}
			System.out.println();
		}
	}

}

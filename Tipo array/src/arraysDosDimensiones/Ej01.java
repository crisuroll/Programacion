package arraysDosDimensiones;

import java.util.Arrays;

/**
 * Clase Ej01. Escribe un programa que sume dos matrices de numeros enteros de dimensiones 
 * iguales y muestre el resultado.
 * @author crisuroll
 */

public class Ej01 {
	
	/**
	 * Método main
	 * @param args
	 */

	public static void main(String[] args) {
		
		int num1, num2, i, j;
		
		int[][] array1 =
			{
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
			};

		int[][] array2 =
			{
				{9, 8, 7},
				{6, 5, 4},
				{3, 2, 1}
			};
		
		int[][] arraySuma = new int[array1.length][array2.length];
		
		for (i = 0; i < array1.length; i++) {
			for (j = 0; j < array2.length; j++) {
				num1 = array1[i][j];
				num2 = array2[i][j];
				arraySuma[i][j] = num1 + num2;
			}
		}
		
		//Imprimir los array
		
		System.out.println("Array 1");
		for (i = 0; i < array1.length; i++) {
			for (j = 0; j < array1.length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("\n");

		System.out.println("Array 2");
		for (i = 0; i < array2.length; i++) {
			for (j = 0; j < array2.length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("\n");

		System.out.println("Suma de los arrays");
		for (i = 0; i < arraySuma.length; i++) {
			for (j = 0; j < arraySuma.length; j++) {
				System.out.print(arraySuma[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}

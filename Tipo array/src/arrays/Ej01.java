package arrays;

/**
 * Clase Ej01. Escribe un programa que cree un array de numeros enteros, calcule la suma de 
 * todos los elementos en el array y muestre el resultado.
 * @author crisuroll
 */

public class Ej01 {
	
	/**
	 * Método main
	 * @param args
	 */

	public static void main(String[] args) {
		
		int[] arraySuma = new int[5];
		int suma = 0;
		
		for (int i = 0; i < arraySuma.length; i++) {
			arraySuma[i] = (int) (Math.random() * 50);
			// System.out.println(arraySuma[i]); syso utilizado para comprobar si funciona
			// la inicialización del array con random
			suma = (suma + arraySuma[i]);
		}
		
		System.out.println("La suma de los elementos del array es: " + suma);
 
	}

}

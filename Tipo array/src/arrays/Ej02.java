package arrays;

/**
 * Clase Ej02. Desarrolla un programa que cree un array de numeros enteros, cuente cuantos de 
 * ellos son numeros pares y cuantos son numeros impares. Muestra el resultado.
 * @author crisuroll
 */

public class Ej02 {
	
	/**
	 * Método main
	 * @param args
	 */

	public static void main(String[] args) {
		
		int[] arrayNum = new int[5];
		int par = 0;
		int impar = 0;
		
		for (int i = 0; i < arrayNum.length; i++) {
			arrayNum[i] = (int) (Math.random() * 50);
			System.out.println(arrayNum[i]);
			if ((arrayNum[i] % 2) == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("En el array hay " + par + " numeros pares y " + impar + " numeros impares.");

	}

}

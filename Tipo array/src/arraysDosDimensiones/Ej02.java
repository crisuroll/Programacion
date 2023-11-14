package arraysDosDimensiones;

/**
 * Clase Ej02. Desarrolla un programa que calcule la traspuesta de una matriz, es decir, 
 * intercambie filas por columnas, y muestre la matriz resultante. Debe valer para matrices de 
 * cualquier tamaño.
 * @author crisuroll
 */

public class Ej02 {
	
	/**
	 * Método main
	 * @param args
	 */

	public static void main(String[] args) {
		
		int i, j;
		
		int[][] array1 = 
			{
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
			};
		
		int[][] arrayTrasp = new int[array1.length][array1.length];
		
		for(i = 0; i < array1.length; i++) {
			for(j = 0; j < array1.length; j++) {
				arrayTrasp[i][j] = array1[j][i];
			}
		}
		
		System.out.println("Array original");
		for (i = 0; i < array1.length; i++) {
			for (j = 0; j < array1.length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("\n");
		
		System.out.println("Array traspuesto");
		for (i = 0; i < arrayTrasp.length; i++) {
			for (j = 0; j < arrayTrasp.length; j++) {
				System.out.print(arrayTrasp[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("\n");

	}

}

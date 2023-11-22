package arraysDosDimensiones;
/**
 * Clase Ej03. Escribe un programa que calcule el promedio de cada fila y de cada columna en una 
 * matriz de numeros enteros y muestre los resultados.
 * @author crisuroll
 */
public class Ej03 {
	/**
	 * Método main
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] matriz = {
			{5, 10, 15},
			{20, 25, 30},
			{35, 40, 45}
		};
		
		System.out.println("Matriz original: ");
		imprimirMatriz(matriz);
		
		calcularPromedioFilas(matriz);
		calcularPromedioColumnas(matriz);
	}
	
	public static void calcularPromedioFilas(int[][] matriz) {
		
		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		System.out.println("Promedio de cada fila:");
		for (int i = 0; i < filas; i++) {
			int sumaFila = 0;
			for (int j = 0; j < columnas; j++) {
				sumaFila += matriz[i][j];
			}
			double promedioFila = (double) sumaFila / columnas;
			System.out.println("Fila " + (i + 1) + ": " + promedioFila);
		}
		
	}
	
	public static void calcularPromedioColumnas(int[][]matriz) {
		
		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		System.out.println("Promedio de cada columna:");
		for (int j = 0; j < columnas; j++) {
			int sumaColumna = 0;
			for (int i = 0; i < filas; i++) {
				sumaColumna += matriz[i][j];
			}
			double promedioColumna = (double) sumaColumna / filas;
			System.out.println("Columna " + (j + 1) + ": " + promedioColumna);
		}
		
	}
	
	public static void imprimirMatriz(int[][] matriz) {
		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

}

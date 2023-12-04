/**
 * Algoritmo de la burbuja. Práctica con métodos.
 * @author crisuroll
 */
public class Main {
	
	/**
	 * Clase main. 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array[] = new int[5];
		random(array);
		
		System.out.println("Array sin ordenar:");
		imprimir(array);
		System.out.println("\n\nProceso de ordenación: ");
		burbuja(array);
		System.out.println();
		System.out.println("\nArray ordenado: ");
		imprimir(array);
		
	}
	
	/**
	 * Clase burbuja. Ordena el array recibido de menor a mayor, usando el algoritmo de la burbuja.
	 * @param array
	 */
	public static void burbuja(int[] array) {
		int acu = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i -1; j++) {
				if (array[j] > array[j + 1]) {
					acu = array[j + 1];
					array[j + 1] = array[j];
					array[j] = acu;
				}
				
			}
			System.out.println();
			 
			for (int k = 0; k < array.length; k++) {
				System.out.print(array[k] + " ");
			}
		}
	}
	
	/**
	 * Clase imprimir. Imprime el array recibido.
	 * @param array
	 */
	public static void imprimir(int[] array) {
		for  (int h = 0; h < array.length; h++) {
			System.out.print(array[h] + " ");
		}
	}
	
	/**
	 * Clase random. Genera números aleatorios para rellenar un array definido.
	 * @param array
	 */
	public static void random(int[] array) {
        int alt ;
        for (int i = 0 ; i < array.length ; i ++){
            alt = (int)(Math.random()*100+1);
            array[i] = alt;
        }

    }

}

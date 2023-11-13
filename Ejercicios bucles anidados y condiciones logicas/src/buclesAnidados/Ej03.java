package buclesAnidados;

/**
 * Clase Ej03. Pide al usuario que genere una matriz que muestra la tabla de multiplicar del
 * 1 al 10 con un formato similar al que se muestra a continuacion.
 * @author crisuroll
 */

public class Ej03 {
	
	/**
	 * Metodo main
	 * @param args
	 */

	public static void main(String[] args) {
		
		int i, j;
        
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 10; j++) {
				System.out.print((i * j) + " ");	
			}
			System.out.println();
		}

	}

}

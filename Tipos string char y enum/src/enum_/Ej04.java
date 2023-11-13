package enum_;

/**
 * Clase Ej04. Crea un enum llamado ColorArcoiris que contenga los colores del arcoıris 
 * (por ejemplo: rojo, naranja, amarillo, verde, azul, violeta). Escribe un programa que 
 * recorra todos los colores del enum y los imprima uno por uno. Este ejercicio dejalo para 
 * cuando sepamos que es un array.
 * @author crisuroll
 */

public class Ej04 {
	
	/**
	 * Metodo main
	 * @param args
	 */
	
	public enum ColorArcoiris {
		ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
	}

	public static void main(String[] args) {

		ColorArcoiris colores [] = ColorArcoiris.values();

		for (int i = 0; i <= colores.length - 1; i++) {
			System.out.println(colores[i]);
		}
	}

}

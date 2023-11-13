package enum_;

import java.util.Scanner;

/**
 * Clase Ej02. Crea un enum llamado TipoVehiculo que incluya varios tipos de vehıculos, como 
 * Coche, Moto, Bicicleta, etc. Luego, escribe un programa que permita al usuario seleccionar 
 * un tipo de vehıculo e imprima un mensaje relacionado con ese tipo (inventate el mensaje 
 * para cada caso).
 * @author crisuroll
 */

public class Ej02 {
	
	/**
	 * Metodo main
	 * @param args
	 */
	
	public enum TipoVehiculo {
		COCHE,
		MOTO,
		BICICLETA,
		AUTOBUS,
		CAMION,
		AVION
	}

	public static void main(String[] args) {

		int v = 0;
		TipoVehiculo tipos [] = TipoVehiculo.values();
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Coche\n2. Moto\n3. Bicicleta\n4. Autobus\n5. Camion\n6. Avion\nSELECCIONA UN VEHICULO: ");
		v = sc.nextInt();
		
		if (v >= 1 && v <= tipos.length) {
			switch (tipos[v - 1]) {
			case COCHE:
				System.out.println("Volvo inventó los cinturones.");
			break;
			case MOTO:
				System.out.println("Las motos tienen dos ruedas.");
			break;
			case BICICLETA:
				System.out.println("La bicicleta es el medio de transporte más utilizado en el mundo.");
			break;
			case AUTOBUS:
				System.out.println("El 430 es el peor autobús del mundo.");
			break;
			case CAMION:
				System.out.println("Como molan los camiones. xd");
			break;
			case AVION:
				System.out.println("Aparentemente, los aviones son vehículos.");
			break;
			}
		} else {
			System.out.println("Opción no válida.");
		}
		sc.close();
	}

}

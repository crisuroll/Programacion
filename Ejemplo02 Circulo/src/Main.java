import java.util.Scanner;

/**
 * Clase Main.
 * @author crisuroll
 */

public class Main {
	
	/**
	 * Método main.
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el radio: ");
		Circulo c1 = new Circulo(sc.nextDouble());
		int op;
		
		do {
			System.out.println(" 0. Finalizar programa\n 1. Calcular área\n 2. Calcular perímetro\nELIGE UNA OPCIÓN: ");
			op = sc.nextInt();
			switch(op) {
			case 0:
				System.out.println("Saliendo del programa...");
			break;
			case 1:
				System.out.println("El área del círculo es " + c1.getArea());
				// System.out.println("El área del círculo es " + c1.setArea());
			break;
			case 2:
				System.out.println("El perímetro del círculo es " + c1.getPerimetro());
				// System.out.println("El perímetro del círculo es " + c1.setPerimetro());
			break;
			default:
				System.out.println("Opción no válida.");
			break;
			}
		} while (op != 0);

	}

}

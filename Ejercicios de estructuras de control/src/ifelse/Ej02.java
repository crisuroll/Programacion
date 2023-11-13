package ifelse;
import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		
		/*Solicita al usuario que introduzca un numero y muestra un mensaje que indique si el numero es positivo,
		  negativo o cero.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("Cero.");
		} else if (num > 0) {
			System.out.println("Positivo.");
		} else {
			System.out.println("Negativo.");
		}

		sc.close();	
	}

}

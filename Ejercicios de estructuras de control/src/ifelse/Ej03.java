package ifelse;
import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		
		/*Pide al usuario que ingrese un numero y muestra un mensaje que indique si el numero es par o impar.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		
		if ((num%2) == 0) {
			System.out.println("Es un número par.");
		} else {
			System.out.println("Es un número impar.");
		}

		sc.close();	
	}

}

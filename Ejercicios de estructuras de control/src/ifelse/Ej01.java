package ifelse;
import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {
		
		/*Pide al usuario que ingrese su calificacion en un examen (un numero entre 0 y 100) y muestra un mensaje que
		  indique si aprobaron o suspendieron. En concreto, si la calificacion es igual o mayor a 60, muestra Aprobado,
		  de lo contrario, muestra Suspenso.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica la nota de tu examen (0-100): ");
		int nota = sc.nextInt();
		
		if (nota < 0 || nota > 100) {
			System.out.println("La nota debe ser entre 0 y 100, ambos inclusives.");
		} else if (nota >= 60) {
			System.out.println("Aprobado.");
		} else {
			System.out.println("Suspenso.");
		}

		sc.close();	
	}

}

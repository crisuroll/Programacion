package ifelse;
import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		/*Pide al usuario que ingrese un numero y verifica si esta dentro de un rango especıfico, por ejemplo, entre 1 y 100. 
		  Muestra un mensaje indicando si el numero esta dentro o fuera del rango.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		int p = 1;
		int f = 100;
		
		if (num > p && num <  f) {
			System.out.println("Está dentro del rango " + p + "-" + f + ".");
		} else {
			System.out.println("Está fuera del rango " + p + "-" + f + ".");
		}

		sc.close();	
	}

}

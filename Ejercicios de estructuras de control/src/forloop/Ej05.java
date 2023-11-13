package forloop;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		/*Pide al usuario que ingrese un numero N y muestra todos los numeros desde N hasta 1 en 
		  orden descendente utilizando un bucle for.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int n = sc.nextInt();
		int i;
		
		sc.close();
		
		for (i=n;i>0;i--) {
			System.out.println(i);
		}

	}

}

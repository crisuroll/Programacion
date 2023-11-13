package whileloop;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {

		/*Solicita al usuario que ingrese un numero entero y cuenta la cantidad de dıgitos que tiene 
		  utilizando un bucle while (una pista es que puedes dividir entre 10...).*/
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		int n=num;
		int i=0;
		
		while (n!=0) {
			n=n/10;
			i++;
		}
		
		System.out.println("El número " + num + " tiene " + i + " dígitos.");

	}

}

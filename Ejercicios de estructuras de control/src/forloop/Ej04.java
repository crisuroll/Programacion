package forloop;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		/*Solicita al usuario que ingrese un numero entero positivo (puedes usar un if-else para esto) 
		  y luego calcula su factorial utilizando un bucle for.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int num = sc.nextInt();
		int i;
		int p = 1;
		
		sc.close();
		
		if (num < 0) {
			System.out.println("Solo se aceptan números enteros positivos.");
		} else {
			for (i=1; i<=num;i++) {
				p = p*i;
			}
			System.out.println(num + "! = " + p);
		}

	}

}

package forloop;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		
		/*Pide al usuario que ingrese un numero y muestra la tabla de multiplicar correspondiente, 
		  desde 1 hasta 10, utilizando un bucle for.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		int i;
		
		sc.close();
		
		System.out.println("Tabla de multiplicar de " + num + ":");
		for (i=1; i <= 10; i++) {
			System.out.println(num + "*" + i + " = " + (num*i));
		}
	}

}

package dowhile;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {

		/*Pide al usuario que ingrese un numero y muestra su tabla de multiplicar del 1 al 10 
		  utilizando un bucle do-while.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		int n = 1;
		
		do {
			int res = n*num;
			System.out.println(num+"*"+n+"="+res);
			n++;
		} while (n<=10);
		sc.close();

	}

}

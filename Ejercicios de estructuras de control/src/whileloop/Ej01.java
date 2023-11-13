package whileloop;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {
		
		/*Pide al usuario que ingrese un numero N y luego muestra todos los numeros desde 1 hasta N 
		  utilizando un bucle while.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int n = sc.nextInt();
		int num=1;
		
		while (num <= n) {
			System.out.println(num);
			num++;
		}
		sc.close();
		
	}

}

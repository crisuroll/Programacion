package forloop;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {

		/*Pide al usuario que ingrese un numero N y luego muestra todos los numeros desde 1 hasta N utilizando 
		  un bucle for.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int n = sc.nextInt();
		int num;
		
		sc.close();
		
		for (num=1; num <=n; num++) {
			System.out.println(num);
		}
		
	}

}

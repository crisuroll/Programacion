package forloop;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		/*Solicita al usuario que ingrese un numero N y calcula la suma de todos los numeros pares desde 1 
		  hasta N utilizando un bucle for.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int n = sc.nextInt();
		int num;
		int suma = 0;
		
		sc.close();
		
		for (num=1; num <= n; num++) {
			if (num%2==0) {
				suma = suma + num;
				//i = i + 2 es lo mismo que i+ = 2 (sirve para cualquier operador)
			}
		}
		
		System.out.println("La suma de los números pares desde 1 hasta " + n + " es " + suma + ".");
		
	}

}

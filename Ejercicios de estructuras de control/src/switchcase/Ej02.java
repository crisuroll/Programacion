package switchcase;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {

		/*Solicita al usuario que ingrese dos numeros y un operador (+, -, *, /). Luego, realiza la operacion
		  seleccionada y muestra el resultado utilizando un switch. Lo que debes hacer es recoger  ́unicamente 
		  el primer char (+, -, * o /), lo cual puedes hacer con la siguiente 
		  instruccion: scanner.next().charAt(0);.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer número: ");
		int num1 = sc.nextInt();
		System.out.println("Ingresa el segundo número: ");
		int num2 = sc.nextInt();
		System.out.println("Ingresa un operador (+, -, *, /): ");
		String op = sc.next();
		int res;

		switch (op) {
			case "+":
				res = (num1+num2);
				System.out.println("La suma de " + num1 + " y " + num2 + " es " + res + ".");
			break;
			case "-":
				res = (num1-num2);
				System.out.println("La resta de " + num1 + " y " + num2 + " es " + res + ".");
			break;
			case "*":
				res = (num1*num2);
				System.out.println("El producto de " + num1 + " y " + num2 + " es " + res + ".");
			break;
			case "/":
				res = (num1/num2);
				System.out.println("La división de " + num1 + " y " + num2 + " es " + res + ".");
			break;
			default:
				System.out.println("Operador no válido. Solo se permite +, -, *, /.");
			break;
		}	
		sc.close();

	}

}

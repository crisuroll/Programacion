package switchcase;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {

		/*Pide al usuario que ingrese una cantidad de dinero en dolares o euros y solicita que elija si desea 
		  convertirlos a la otra moneda. Utiliza un switch para realizar la conversion y mostrar el resultado. 
		  Lo que debes hacer es recoger  ́unicamente el primer char (D o E si son Dolares o Euros), lo cual 
		  puedes hacer con la siguiente instruccion: scanner.next().charAt(0);.*/
		
		double dolar = 1.06d;
		double euro = 0.94d;
		String resp;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa una cantidad de dinero: ");
		double din = sc.nextDouble();
		System.out.print("¿Es en dólares o en euros?: ");
		char mon = sc.next().charAt(0);
		
		switch (mon) {
			case 'D':
			case 'd':
				System.out.print("¿Desea convertirlo a otra cantidad? S/N:");
				resp = sc.next();
				if (resp.equals("S") || resp.equals("s")) {
					double econ = din*euro;
					System.out.println("Tienes " + din + "$ que equivalen a " + String.format("%.2f", econ) + "€.");
				} else {
					System.out.println("Tienes " + din + "$.");
				}
			break;
			case 'E':
			case 'e':
				System.out.print("¿Desea convertirlo a otra cantidad? S/N:");
				resp = sc.next();
				if (resp.equals("S") || resp.equals("s")) {
					double dcon = din*dolar;
					System.out.println("Tienes " + din + "€ que equivalen a " + String.format("%.2f", dcon) + "$.");
				} else {
					System.out.println("Tienes " + din + "€.");
				}
			break;
			default:
				System.out.println("No se permite esa moneda.");
			break;
		}
		sc.close();

	}

}

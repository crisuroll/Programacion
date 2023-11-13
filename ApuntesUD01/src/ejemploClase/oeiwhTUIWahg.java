package ejemploClase;

import java.util.Scanner;

public class oeiwhTUIWahg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Valor de la base: ");
		int a = sc.nextInt();
		System.out.println("Valor del exponente: ");
		int b = sc.nextInt();
		int res = a*a;
		
		 for (int i = 1; i <= b + 1 ; i++) {

	            res = res * a;
	        }
	        System.out.println(res);
		
	}

}

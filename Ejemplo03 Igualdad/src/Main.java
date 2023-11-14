/**
 * Igualdad entre objetos, ejemplo 1. Clase Main.
 * @author crisuroll
 */

/*
public class Main {
	
	public static void main (String[] args) {
		A a1 = new A(2,2);
		A a2 = new A(2,2);
		
		if (a1.equals(a2))
			System.out.println("Cierto");
		else
			System.out.println("Falso");
	}
}
*/


public class Main {
	public static void main (String[] args) {
		A a1 = new A(2,2);
		A a2 = a1;
		
		if (a1.equals(a2))
			System.out.println("Cierto");
		else
			System.out.println("Falso");
	}
}
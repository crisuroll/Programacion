import java.util.Scanner;

/**
 * Clase Main. Construye un diagrama de ﬂujo que permita averiguar cuándo un año es bisiesto. 
 * En segundo lugar, obtén el pseudocódigo de dicho diagrama. Por último, haz un programa en Java 
 * que realice esa tarea.
 * @author crisuroll
 */
public class Main {
	/**
	 * Método main.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un año: ");
		int a = sc.nextInt();
		
		if (a % 4 == 0) {
			System.out.println("El año " + a + " es bisiesto.");
		} else if ((a % 100 == 0) && (a % 400 == 0)) {
			System.out.println("El año " + a + " es bisiesto.");
		} else {
			System.out.println("El año " + a + " no es bisiesto.");
		}
		
	}

}

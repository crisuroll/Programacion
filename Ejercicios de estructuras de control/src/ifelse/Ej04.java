package ifelse;
import java.util.Calendar;
import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		
		/*Solicita al usuario que ingrese su año de nacimiento y muestra su edad actual. Asegurate de manejar el caso en
		  que el usuario ingrese un año futuro y muestre un mensaje apropiado. Para este ejercicio tendras que buscar
		  como puedes obtener el año actual en Java (pues necesitas hacer una resta con ese valor).*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu año de nacimiento: ");
		int a = sc.nextInt();
		int edad;
		Calendar cal= Calendar.getInstance();
		int year= cal.get(Calendar.YEAR);
		
		if (a > year) {
			System.out.println("No puedes ingresar un año mayor que " + a + ".");
		} else {
			edad = (year - a);
			System.out.println("Tienes " + edad + " años.");
		}

		sc.close();	
	}

}


public class Main {

	public static void main(String[] args) {

		// Creo una instancia de la subclase Alumno
		Alumno a = new Alumno();
		// Uso un método de su super clase Persona
		a.setNombre("Pedro Gómez");
		// Uso un método de su super clase Persona
		a.setDNI("123456J");
		// Uso un método de su propia clase
		a.setCreditosAP(9);

	}

}
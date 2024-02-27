import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final String nomFich = "datos.txt";
		Scanner in = null;
		try {
			// Abre el fichero
			in = new Scanner(new FileReader(nomFich));
			// Lee el fichero palabra a palabra
			while (in.hasNext()) {
				// Lee primera palabra
				String palabra = in.next();
				System.out.println("Palabra:" + palabra);
				// Lee números
				while (in.hasNextDouble()) {
					// Lee un double
					double d = in.nextDouble();
					System.out.println("Número: " + d);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error abriendo el fichero " + nomFich);
		} finally {
			if (in != null)
				in.close();
		}
	}
}

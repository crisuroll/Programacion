
public class Main {

	public static void main(String[] args) throws ExceptionDivisionByZero, ExceptionNegativeNumber {
		// Ejemplo 1
		Arithmetic a = new Arithmetic(2, 0);
		int z = a.division(); // Lanza excepción “División entre 0”
		System.out.println(z);
		
		// Ejemplo 2
		try { 
			Arithmetic a = new Arithmetic(-2,3);
			int z = a.division();
			System.out.println(z);
			}
			catch (ExceptionDivisionByZero e){
			System.out.println(e.getMessage());
			}
			catch (ExceptionNegativeNumber e){
			System.out.println(e.getMessage());
			}
			System.out.println("La ejecución sigue a partir de aquí");
		// Ejemplo 3
			try { Arithmetic a = new Arithmetic(-2,3);
			int z = a.division();
			System.out.println(z);
			}
			catch (ExceptionDivisionByZero e){
			System.out.println(e.getMessage());
			}
			System.out.println("La ejecución sigue a partir de aquí");
			
		// Ejemplo 4
			Arithmetic a = new Arithmetic(-2,3);
			try { 
			int z = a.division();
			System.out.println(z);
			}
			catch (ExceptionDivisionByZero e){
			System.out.println(e.getMessage());
			}
			catch (ExceptionNegativeNumber e){
			System.out.println(e.getMessage());
			}
			finally {
			System.out.println("En último lugar entro aquí");
			}
			System.out.println("La ejecución sigue a partir de aquí");
	}

}

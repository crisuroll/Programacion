
public class Main {

	public static void main(String[] args) throws ExceptionDivisionByZero, ExceptionNegativeNumber {
		Arithmetic a = new Arithmetic(2, 0);
		int z = a.division(); // Lanza excepción “División entre 0”
		System.out.println(z);
	}

}

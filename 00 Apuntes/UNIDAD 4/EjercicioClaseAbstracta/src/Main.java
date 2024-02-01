
public class Main {

	public static void main(String[] args) {
		
		Telefono A = new Telefono("iPhone", 900f, "15");
		Laptop B = new Laptop("HP", 500f, "255G");
		
		System.out.println(A.mostrarInformacion());
		System.out.println(B.mostrarInformacion());
	}

}

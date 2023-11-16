/**
 * Clase A2.
 * @author crisuroll
 */
public class A2 {
	// Atributos
	private char miChar;
	private A3 a;
	// Constructora
	public A2 (char miChar, A3 a) {
		this.miChar = miChar;
		this.a = a;
	}
	// Método equals
	public boolean equals (A2 a) {
		return (
			this.miChar == a.miChar &&
			this.a == a.a
		);
	}
	
	public A2 clone() {
		return new A2 (
			this.miChar,
			this.a
		);
	}

}

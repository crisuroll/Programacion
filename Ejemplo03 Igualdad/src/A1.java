/**
 * Igualdad entre objetos, ejemplo 2. Clase A1.
 * @author crisuroll
 */

public class A1 {
	private int x;
	private B b;
	
	public A1 (int x, B b) {
		this.x = x;
		this.b = b;
	}
	
	public boolean equals (A1 a) {
		return (
				this.x == a.x &&
				this.b == a.b
		);
	}
	
	/*
	public boolean equals (A1 a) {
		return (
				this.x == a.x &&
				this.b.equals(a.b)
		);
	}
	*/
}

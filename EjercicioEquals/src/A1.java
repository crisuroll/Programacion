/**
 * Clase A1.
 * @author crisuroll
 */
public class A1 {
	// Atributos
	private int num;
	private A2 obj1;
	private A3 obj2;
	// Constructora
	public A1 (int num, A2 obj1, A3 obj2) {
		this.num = num;
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	// Método equals
	public boolean equals (A1 a) {
		return (
			this.num == a.num &&
			this.obj1 == a.obj1 &&
			this.obj2 == a.obj2
		);
	}
	
	public A1 clone() {
		return new A1 (
			this.num,
			this.obj1,
			this.obj2
		);
	}

}

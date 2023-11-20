/**
 * Clase A.
 * @author crisuroll
 */
public class A {
	
	private static int x = 5;
	private int y;
	
	public A (int y) {
		this.y = y;
	}
	
	static public void incrementa() {
		A.x++;
		A a = new A(3);
		a.y++;
	}
	
	public String toString() {
		return "x = " + A.x +
				"y = " + this.y;
	}
	
}

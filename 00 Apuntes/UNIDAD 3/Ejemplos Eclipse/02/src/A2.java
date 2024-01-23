
public class A2 extends A1 {
	public A2() {
		System.out.println("A2: Por defecto");
	}

	public A2(int pp) {
		super(pp); // ¿Y si se quita?
		System.out.println("A2: Un argumento");
	}
}

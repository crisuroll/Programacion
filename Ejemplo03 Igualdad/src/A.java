/**
 * Igualdad entre objetos, ejemplo 1. Clase A.
 * @author crisuroll
 */


public class A {
	// Atributos
	private int x;
	private int y;
	
	// Constructura, recibe dos parámetros y sus atributos los iguala al valor que reciba
	public A (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Redefinimos el método equals. Recibe un objeto de clase A (que tiene dos atributos)
	public boolean equals (A a) {
		return (
				this.x == a.x &&
				this.y == a.y
		); // Va a ser TRUE si el valor X de la propia clase es igual al valor X del objeto
		// metido por parámetros Y ADEMÁS el valor Y de la propia clase es igual al valor Y
		// del objeto metido por parámetro
	}
}
/**
 * Clase Circulo.
 * @author crisuroll
 */

public class Circulo {

	private double r;
	// private double area;
	// private double perimetro;
	final private double pi = 3.14d;
	
	/**
	 * Constructora, recibe el radio
	 * @param r
	 */
	public Circulo(double r) {
		this.r = r;
		// this.area = 0;
		// this.perimetro = 0;
	}
	
	/**
	 * Método getter, calcula el área del círculo
	 * @return
	 */
	public double getArea() {
		return this.pi*(Math.pow(this.r, 2));
	}
	
	/**
	 * Método getter, calcula el perímetro del círculo
	 * @return
	 */
	public double getPerimetro() {
		return 2*this.pi*this.r;
	}
	
	/*
	 * Otra forma de hacerlo para practicar getters y setters:
	 * 
	 * public double getArea() {
	 *		return this.area;
	 * }
	 * 
	 * public double getPerimetro() {
	 * 		return this.perimetro;
	 * }
	 * 
	 * public void setArea() {
	 * 		this.area = this.pi*(Math.pow(this.r, 2));
	 * }
	 * 
	 * public void setPerimetro() {
	 * 		this.perimetro = 2*this.pi*this.r;
	 * }
 	 */
	
}

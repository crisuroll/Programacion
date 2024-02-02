
public class Libro {
	// Un atributo solo va a ser privado si tenemos la certeza de que no va a
	// ser usado en otra clase
	private String titulo;
	private String autor;
	private boolean disponible;
	
	public Libro (String _titulo, String _autor, boolean _disponible) {
		this.titulo = _titulo;
		this.autor = _autor;
		this.disponible = _disponible;
	}
	
	public void prestar() {
		if (this.disponible == true) {
			System.out.println("Libro prestado: '" + this.titulo + "'.");
			this.disponible = false;
		} else {
			System.out.println("Libro no disponible: '" + this.titulo + "'.");
		}
	}
	
	public void devolver() {
		if (this.disponible == false) {
			System.out.println("Libro devuelto: '" + this.titulo + "'.");
			this.disponible = true;
		} else {
			System.out.println("El libro ya estaba disponible: '" + this.titulo + "'.");
		}
	}
	
	public String nombreLibro () {
		return this.titulo;
	}
	
	public boolean disponibilidadLibro () {
		return this.disponible;
	}
	
}

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private ArrayList<Libro> librosSolicitados;
	
	public Usuario (String _nombre) {
		this.nombre = _nombre;
		this.librosSolicitados = new ArrayList<Libro>();
	}
	
	public String nombreUsuario() {
		return this.nombre;
	}
	
	public void solicitarLibro(Libro _libro) {
		if (_libro.disponibilidadLibro() == true) {
			this.librosSolicitados.add(_libro);
			_libro.prestar();
		} else {
			System.out.println("El libro '" + _libro.nombreLibro() + "' no esta disponible para prestamo.");
		}
	}
	
	public void devolverLibro(Libro _libro) {
		this.librosSolicitados.remove(_libro);
		System.out.println("Libro '" + _libro.nombreLibro() + "' eliminado de los libros solicitados por " + nombreUsuario() + ".");
	}
	
	public void mostrarLibrosSolicitados() {
		System.out.println("Los libros solicitados por " + nombreUsuario() + " son: ");
	    for (int i = 0; i < this.librosSolicitados.size(); i++) {
	        System.out.println(this.librosSolicitados.get(i).nombreLibro());
	    }
	}
}

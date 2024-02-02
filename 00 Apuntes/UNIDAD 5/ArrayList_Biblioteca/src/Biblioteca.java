import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> inventario = new ArrayList<Libro>();
	
	public Biblioteca () {
		//this.inventario = null;
	}
	
	public void getInventario() {
	    for (int i = 0; i < inventario.size(); i++) {
	        System.out.println(inventario.get(i).nombreLibro());
	    }
	}
	
	public void agregarLibro(Libro _libro) {
		this.inventario.add(_libro);
		System.out.println("Libro '" + _libro.nombreLibro() + "' agregado al inventario.");
	}
	
	public void eliminarLibro(Libro _libro) {
		this.inventario.remove(_libro);
		System.out.println("Libro '" + _libro.nombreLibro() + "' eliminado de la biblioteca.");
	}
	
	public String buscarLibroPorTitulo(String _titulo) {
		if (this.inventario.contains(_titulo) == true) {
			return _titulo;
		} else {
			return null;
		}
	}
}

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> inventario;
	
	public Biblioteca () {
		this.inventario = new ArrayList<Libro>();
	}
	
	public void getInventario() {
	    for (int i = 0; i < this.inventario.size(); i++) {
	        System.out.println(this.inventario.get(i).nombreLibro());
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
	
	public Libro buscarLibroPorTitulo(String _titulo) {
		boolean encontrado = false;
		int j = 0;
		Libro a = null;
		while (encontrado == false && j < this.inventario.size()) {
			if (this.inventario.get(j).nombreLibro().equals(_titulo)) { 
				a = this.inventario.get(j);
				System.out.println("Se ha encontrado el libro '" + a.nombreLibro() + "'." );
				encontrado = true;
			}
			j++;
		}
		
		if(encontrado == false) {
			System.out.println("No se ha encontrado el libro '" + _titulo + "'.");
		}
		
		return a;
		
	}
}

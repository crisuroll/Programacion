
public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
		Libro libro1 = new Libro("Java for Beginners", "John Doe", true);
		Libro libro2 = new Libro("Clean Code", "Robert C. Martin", true);
		
		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro2);
		
		Usuario usuario = new Usuario("Alice");
		
		usuario.solicitarLibro(libro1);
		biblioteca.eliminarLibro(libro1);
		usuario.solicitarLibro(libro2);
		biblioteca.eliminarLibro(libro2);
		usuario.mostrarLibrosSolicitados();
		
		libro1.devolver();
		usuario.devolverLibro(libro1);
		biblioteca.agregarLibro(libro1);
		usuario.mostrarLibrosSolicitados();
		
		
		System.out.println("\nEstado actual de la biblioteca:");
	    biblioteca.getInventario();
		
	    /*  Cuando hayas terminado todos los puntos anteriores, fíjate en que tenemos métodos para
			añadir libros (en librosSolicitados e inventario de las clases Usuario y Biblioteca
			respectivamente), pero no tenemos métodos para eliminar libros de la lista. Crea dos
			métodos (uno en cada clase) que permitan, dado un título, eliminar libros del ArrayList.
			
			//TE QUEDA HACER ESTO
			Adicionalmente, crea otros dos métodos que permitan eliminar libros pero esta vez
			utilizando el índice que ocupa un libro en el ArrayList.
	     */
	    
	}

}

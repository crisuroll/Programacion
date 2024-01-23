
public class Persona {
	protected long dni;
	protected String nombre;

	public Persona() {
		dni = -1;
		nombre = "";
	}

	public Persona(long dni, String n) {
		this.dni = dni;
		this.nombre = n;
	}

	public void setDNI(String string) {
		this.dni = string;
	}

	public void setNombre(String n) {
		this.nombre = n;
	}
}
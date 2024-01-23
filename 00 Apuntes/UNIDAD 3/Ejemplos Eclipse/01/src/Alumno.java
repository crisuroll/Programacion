
public class Alumno extends Persona {
	private long idMatricula;
	private int creditosAprobados;

	public Alumno() {
		this.idMatricula = -1;
		this.creditosAprobados = 0;
	}

	public void setIdMatritula(long id) {
		this.idMatricula = id;
	}

	public void setCreditosAP(int ca) {
		this.creditosAprobados = ca;
	}
}

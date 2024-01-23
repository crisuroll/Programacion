
class Hija extends Padre {
	protected int c;

	public Hija() {
		super();
		this.c = 12;
	}

	public int suma() {
		return this.c + super.c;
	}
}

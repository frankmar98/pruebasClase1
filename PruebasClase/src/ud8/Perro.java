package ud8;

public class Perro extends Mascota {

	private String raza;
	private boolean tienePulgas;

	public Perro(String nombre, String fechaNacimiento, String raza, boolean tienePulgas) {
		super(nombre, fechaNacimiento);
		this.raza = raza;
		this.tienePulgas = tienePulgas;
		// TODO Auto-generated constructor stub
	}

	public String emiteSonido() {
		return "Guauu guauu!!";
	}

	@Override
	public String toString() {
		String s = "";
		s += super.toString();
		s += "La raza del perro es: " + this.raza + "\n";
		s += "¿El perro tiene pulgas?: " + this.tienePulgas + "\n";
		return s;
	}

	/**
	 * @return the tienePulgas
	 */
	public boolean isTienePulgas() {
		return tienePulgas;
	}

	/**
	 * @param tienePulgas the tienePulgas to set
	 */
	public void setTienePulgas(boolean tienePulgas) {
		this.tienePulgas = tienePulgas;
	}

	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}

}

package ud8;

public class Loro extends Mascota {

	private String origen;
	private boolean habla;

	public Loro(String nombre, String fechaNacimiento, String origen, boolean habla) {
		super(nombre, fechaNacimiento);
		this.origen = origen;
		this.habla = habla;
		// TODO Auto-generated constructor stub
	}

	public String emiteSonido() {
		return "aaa aaa!!";
	}

	public String vuela() {
		return "fuuu fuuu...";
	}

	public String saluda() {
		String s;
		if (this.habla) {
			s = "Hola hola Capitan, " + this.getNombre() + " te saluda";
		} else {
			s = this.emiteSonido();
		}
		return s;
	}

	@Override
	public String toString() {
		String s = "";
		s += super.toString();
		s += "El origen del loro es: " + this.origen + "\n";
		s += "¿El loro habla?: " + this.habla + "\n";
		return s;
	}

	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return the habla
	 */
	public boolean isHabla() {
		return habla;
	}

	/**
	 * @param habla the habla to set
	 */
	public void setHabla(boolean habla) {
		this.habla = habla;
	}

}

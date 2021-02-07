package ud8;

public class Mascota {
	private String nombre;
	private String fechaNacimiento;

	/**
	 * @param nombre
	 * @param fechaNacimiento
	 */
	public Mascota(String nombre, String fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		String s = "";
		s += "El nombre de la mascota es: " + this.nombre + "\n";
		s += "La fecha de nacimiento de la mascota es: " + this.fechaNacimiento + "\n";
		return s;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

}

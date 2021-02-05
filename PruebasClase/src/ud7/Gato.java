package ud7;

public class Gato {
	private int edad;
	private String nombre;
	private Exception eEdadNegativa = new Exception("La edad no puede ser negativa");
	private Exception eNombreInvalido = new Exception("El nombre no puede tener menos de 3 caracteres");
	/**
	 * @param edad
	 * @param nombre
	 */
	public Gato(int edad, String nombre) throws Exception {
		super();
		if (edad < 0) {
			throw eEdadNegativa;
		} else {
			this.edad = edad;
		}
		if (nombre.length() < 3) {
			throw eNombreInvalido;
		} else {
			this.nombre = nombre;
		}
		
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 * @throws Exception 
	 */
	public void setEdad(int edad) throws Exception {
		if (edad < 0) {
			throw eEdadNegativa;
		} else {
			this.edad = edad;
		}
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 * @throws Exception 
	 */
	public void setNombre(String nombre) throws Exception {
		if (nombre.length() < 3) {
			throw eNombreInvalido;
		} else {
			this.nombre = nombre;
		}
	}
	
	
}

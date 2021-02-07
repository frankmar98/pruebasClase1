package ud8;

public class Gato extends Mascota {

	private boolean tienePeloLargo;
	private String color;

	public Gato(String nombre, String fechaNacimiento, String color, boolean tienePeloLargo) {
		super(nombre, fechaNacimiento);
		this.color = color;
		this.tienePeloLargo = tienePeloLargo;
		// TODO Auto-generated constructor stub
	}

	public String emiteSonido() {
		return "Miauu miauu!!";
	}

	@Override
	public String toString() {
		String s = "";
		s += super.toString();
		s += "El color del pelo del gato es: " + this.color + "\n";
		s += "¿El gato tiene pelo largo?: " + this.tienePeloLargo + "\n";
		return s;
	}

	/**
	 * @return the tienePeloLargo
	 */
	public boolean isTienePeloLargo() {
		return tienePeloLargo;
	}

	/**
	 * @param tienePeloLargo the tienePeloLargo to set
	 */
	public void setTienePeloLargo(boolean tienePeloLargo) {
		this.tienePeloLargo = tienePeloLargo;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

}

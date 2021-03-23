package ud9;

public class Producto {
	private String nombre;
	private int cantidad;

	/**
	 * @param nombre
	 * @param cantidad
	 */
	public Producto(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		String s = "";
		s += "Nombre del producto: " + this.nombre + ". Cantidad: " + this.cantidad;
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = false;
		if (obj != null && obj instanceof Producto) {
			esIgual = (this.nombre.equals(((Producto) obj).getNombre()))
					&& (this.cantidad == ((Producto) obj).getCantidad());
		}
		return esIgual;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}

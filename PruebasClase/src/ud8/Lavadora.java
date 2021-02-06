package ud8;

public class Lavadora extends Electrodomestico {
	public final int CARGA_DEFECTO_LAVADORA = 5;
	private int carga;
	private Exception eCargaNoValida = new Exception("La carga no es valida, debe de ser de 1kg o mayor");

	public Lavadora() {
		// TODO Auto-generated constructor stub
		this.carga = CARGA_DEFECTO_LAVADORA;
	}

	public Lavadora(double precioBase, int peso) throws Exception {
		super(precioBase, peso);
		this.carga = CARGA_DEFECTO_LAVADORA;
		// TODO Auto-generated constructor stub
	}

	public Lavadora(double precioBase, Color color, Consumo consumo, int peso, int carga) throws Exception {
		super(precioBase, color, consumo, peso);
		if (carga < 1) {
			throw eCargaNoValida;
		} else {
			this.carga = carga;
		}
	}

	/**
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}
	
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		if (carga > 30) {
			precioFinal += 50;
		}
		return precioFinal;
	}

}

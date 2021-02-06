package ud8;

public class Television extends Electrodomestico {
	
	private int pulgadas;
	private boolean tieneTDT;
	
	private Exception ePulgadasInvalidas = new Exception("Pulgadas invalidas, se establecera en 20 por defecto, el televisor debe de tener al menos 3 pulgadas");
	
	public final int PULGADAS_POR_DEFECTO = 20;
	public final boolean TIENE_TDT_DEFECTO = false;

	public Television() {
		// TODO Auto-generated constructor stub
		this.pulgadas = PULGADAS_POR_DEFECTO;
		this.tieneTDT = TIENE_TDT_DEFECTO;
	}

	public Television(double precioBase, int peso) throws Exception {
		super(precioBase, peso);
		this.pulgadas = PULGADAS_POR_DEFECTO;
		this.tieneTDT = TIENE_TDT_DEFECTO;
	}

	public Television(double precioBase, Color color, Consumo consumo, int peso, int pulgadas) throws Exception {
		super(precioBase, color, consumo, peso);
		if (pulgadas < 3) {
			this.pulgadas = PULGADAS_POR_DEFECTO;
			throw ePulgadasInvalidas;
		} else {
			this.pulgadas = pulgadas;
		}
	}

	/**
	 * @return the pulgadas
	 */
	public int getPulgadas() {
		return pulgadas;
	}

	/**
	 * @return the tieneTDT
	 */
	public boolean isTieneTDT() {
		return tieneTDT;
	}

	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		if (pulgadas > 40) {
			precioFinal *= 1.3; //aumento 30% en este punto
		}
		if (this.tieneTDT) {
			precioFinal += 50.0;
		}
		return precioFinal;
	}
}

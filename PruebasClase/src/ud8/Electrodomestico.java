package ud8;

enum Color {
	BLANCO, NEGRO, ROJO, AZUL, GRIS;
};

enum Consumo {
	A, B, C, D, E, F;
};

public class Electrodomestico {

	private double precioBase; // en euros
	private Color color;
	private Consumo consumo;
	private int peso; // en kg

	public final double PRECIO_BASE_DEFECTO = 100.0;
	public final Color COLOR_DEFECTO = Color.BLANCO;
	public final Consumo CONSUMO_DEFECTO = Consumo.F;
	public final int PESO_DEFECTO = 5;

	private Exception ePesoNegativo = new Exception("El peso es negativo, se usara el de por defecto");

	public Electrodomestico() {
		super();
		this.precioBase = PRECIO_BASE_DEFECTO;
		this.color = COLOR_DEFECTO;
		this.consumo = CONSUMO_DEFECTO;
		this.precioBase = PRECIO_BASE_DEFECTO;

	}

	public Electrodomestico(double precioBase, int peso) throws Exception {
		super();
		if (peso < 0) {
			this.peso = PESO_DEFECTO;
			throw ePesoNegativo;
		} else {
			this.peso = peso;
		}
		this.precioBase = precioBase;
		this.color = COLOR_DEFECTO;
		this.consumo = CONSUMO_DEFECTO;
	}

	public Electrodomestico(double precioBase, Color color, Consumo consumo, int peso) throws Exception {
		super();
		if (peso < 0) {
			this.peso = PESO_DEFECTO;
			throw ePesoNegativo;
		} else {
			this.peso = peso;
		}
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
	}

	public double precioFinal() {
		double precioFinal = this.precioBase;
		switch (consumo) {
		case A:
			precioFinal += 100.0;
			break;
		case B:
			precioFinal += 80.0;
			break;
		case C:
			precioFinal += 60.0;
			break;
		case D:
			precioFinal += 50.0;
			break;
		case E:
			precioFinal += 30.0;
			break;
		case F:
			precioFinal += 10.0;
			break;
		default:
			precioFinal += 10.0;
		}

		if (peso > 0 && peso < 20) {
			precioFinal += 10.0;
		} else if (peso >= 20 && peso < 50) {
			precioFinal += 50.0;
		} else if (peso >= 50 && peso < 80) {
			precioFinal += 80.0;
		} else {
			precioFinal += 100.0;
		}
		return precioFinal;
	}

	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @return the consumo
	 */
	public Consumo getConsumo() {
		return consumo;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
}

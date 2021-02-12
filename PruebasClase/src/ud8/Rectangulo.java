package ud8;

public class Rectangulo {
	private Punto p1;
	private Punto p2;

	/**
	 * @param p1
	 * @param p2
	 */
	public Rectangulo(Punto p1, Punto p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	/**
	 * @param x1
	 * @param x2
	 * @param y1
	 * @param y2
	 */
	public Rectangulo(int x1, int x2, int y1, int y2) {
		super();
		this.p1 = new Punto(x1, y1);
		this.p2 = new Punto(x2, y2);
	}

	public int getArea() {
		int base, altura, area;
		base = Math.abs(p1.getX() - p2.getX());
		altura = Math.abs(p1.getY() - p2.getY());
		area = base * altura;
		return area;
	}

	public int getPerimetro() {
		int base, altura, perimetro;
		base = Math.abs(p1.getX() - p2.getX());
		altura = Math.abs(p1.getY() - p2.getY());
		perimetro = 2 * base + 2 * altura;
		return perimetro;
	}
	
	@Override
	public String toString() {
		String s="";
		s += "x1 = " + p1.getX() + "\n";
		s += "x2 = " + p2.getX()+ "\n";
		s += "y1 = " + p1.getY() + "\n";
		s += "y2 = " + p2.getY() + "\n";
		s += "Area = " + this.getArea() + "\n";
		s += "Perimetro = " + this.getPerimetro() + "\n";
		return s;
	}

	/**
	 * @return the p1
	 */
	public Punto getP1() {
		return p1;
	}

	/**
	 * @param p1 the p1 to set
	 */
	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	/**
	 * @return the p2
	 */
	public Punto getP2() {
		return p2;
	}

	/**
	 * @param p2 the p2 to set
	 */
	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	
	

}

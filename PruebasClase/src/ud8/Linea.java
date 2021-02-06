package ud8;

public class Linea {

	private Punto p1;
	private Punto p2;
	private int x1, x2, y1, y2;
	/**
	 * @param p1
	 * @param p2
	 */
	public Linea(Punto p1, Punto p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.x1 = p1.getX();
		this.x2 = p2.getX();
		this.y1 = p1.getY();
		this.y2 = p2.getY();
	}
	/**
	 * @param x1
	 * @param x2
	 * @param y1
	 * @param y2
	 */
	public Linea(int x1, int x2, int y1, int y2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.p1 = new Punto(x1,y1);
		this.p2 = new Punto(x2,y2);
	}
	
	public double getLongitud() {
		double deltaX, deltaY, longitud;
		deltaX=Math.abs(this.x1-this.x2);
		deltaY=Math.abs(this.y1-this.y2);
		longitud = Math.sqrt(deltaX*deltaX+deltaY*deltaY);
		return longitud;
	}
	
	@Override
	public String toString() {
		String s="";
		s += "x1 = " + this.x1 + "\n";
		s += "x2 = " + this.x2 + "\n";
		s += "y1 = " + this.y1 + "\n";
		s += "y2 = " + this.y2 + "\n";
		s += "Longitud = " + this.getLongitud() + "\n";
		return s;
	}
	public Punto getP1() {
		return p1;
	}

	/**
	 * @param p1 the p1 to set
	 */
	public void setP1(Punto p1) {
		this.p1 = p1;
		this.setX1(p1.getX());
		this.setY1(p1.getY());
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
		this.setX2(p2.getX());
		this.setY2(p2.getY());
	}

	/**
	 * @return the x1
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * @param x1 the x1 to set
	 */
	public void setX1(int x1) {
		this.x1 = x1;
		p1.setX(x1);
	}

	/**
	 * @return the x2
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * @param x2 the x2 to set
	 */
	public void setX2(int x2) {
		this.x2 = x2;
		p2.setX(x2);
	}

	/**
	 * @return the y1
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * @param y1 the y1 to set
	 */
	public void setY1(int y1) {
		this.y1 = y1;
		p1.setY(y1);
	}

	/**
	 * @return the y2
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * @param y2 the y2 to set
	 */
	public void setY2(int y2) {
		this.y2 = y2;
		p2.setY(y2);
	}
	
	

}

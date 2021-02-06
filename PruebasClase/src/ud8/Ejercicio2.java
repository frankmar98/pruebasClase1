package ud8;

public class Ejercicio2 {

	public static void main(String[] args) {
		Punto p1 = new Punto(4,6);
		Punto p2 = new Punto(-1,0);
		Rectangulo rectangulo1 = new Rectangulo(-2,200,0,64);
		Rectangulo rectangulo2 = new Rectangulo(p1,p2);
		System.out.println(rectangulo1);
		System.out.println(rectangulo2);
	}

}

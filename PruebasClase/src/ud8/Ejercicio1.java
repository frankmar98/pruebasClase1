package ud8;

public class Ejercicio1 {

	public static void main(String[] args) {
		Punto p1 = new Punto(-1,-1);
		Punto p2 = new Punto(-258,-258);
		Linea l1 = new Linea(1,10,1,10);
		Linea l2 = new Linea(p1,p2);
		System.out.println(l1);
		System.out.println(l2);

	}

}

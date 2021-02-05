package ud7;

public class Prueba1 {

	public static void main(String[] args) {
		int a=20, b=0;
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

}

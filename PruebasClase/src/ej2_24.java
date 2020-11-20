import java.util.Scanner;

public class ej2_24 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		if (numero >0) {
			System.out.println(numero + " es positivo");
		} else if (numero < 0 ) {
			System.out.println(numero + " es negativo");
		} else {
			System.out.println(numero + " es cero");
		}
	}

}

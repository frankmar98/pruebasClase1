import java.util.Scanner;

public class ej2_26 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		if (numero % 2==0) {
			System.out.println(numero + " es par");
		}
		if (numero % 5 == 0) {
			System.out.println(numero + " es divisible entre 5");
		}

	}

}

import java.util.Scanner;

public class Ej2_32 {

	public static void main(String[] args) {
		int numero1, numero2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los dos numeros a realizar la resta positiva");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		if (numero1 == numero2) {
			System.out.println("no se realiza la resta porque los dos numeros son iguales");
		} else if (numero1 < numero2) {
			System.out.println("La resta positiva es = " + (numero2-numero1));
		}
		else  {
			System.out.println("La resta positiva es = " + (numero1-numero2));
		}
	}

}

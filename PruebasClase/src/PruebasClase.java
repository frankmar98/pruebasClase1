import java.util.Scanner;

public class PruebasClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2;
		Scanner sc = new Scanner(System.in);
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		if (numero1 == numero2) {
			System.out.println("no se realiza la resta porque los dos numeros son iguales");
		} else {
			System.out.println("La resta positiva es = " + Math.abs(numero1-numero2));
		}
		
	}

}

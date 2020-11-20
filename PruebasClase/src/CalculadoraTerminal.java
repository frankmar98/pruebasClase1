import java.util.Scanner;

public class CalculadoraTerminal {

	public static void main(String[] args) {
		int opcion;
		double n1, n2;
		Scanner sc= new Scanner(System.in);
		opcion = sc.nextInt();
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		switch (opcion) {
		case 1:
			System.out.println(n1+n2);
		case 2:
			System.out.println(n1-n2);
		case 3:
			System.out.println(n1*n2);
		case 4:
			System.out.println(n1/n2);
		}
	}

}

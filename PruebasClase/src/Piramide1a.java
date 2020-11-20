import java.util.Scanner;

public class Piramide1a {

	public static void main(String[] args) {
		int i, j, columnas;
		char caracter;
		String cadena;
		Scanner sc = new Scanner(System.in);
		cadena=sc.nextLine();
		caracter=cadena.charAt(0);
		columnas=sc.nextInt();
		for (i=1;i<=columnas;i++) {
			System.out.print("\t\t\t\t");
			for (j=2;j<=2*columnas-i;j++) {
				System.out.print(" ");
			}
			for (j=2;j<=2*i;j++) {
				System.out.print((char)caracter);
			}
			System.out.print("\n");
		}
	}

}

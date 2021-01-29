package ud6;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1, cadena2;
		boolean igualCaseSensitive, igualNotCaseSensitive;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca las dos cadenas a comparar: ");
		cadena1 = sc.nextLine();
		cadena2 = sc.nextLine();
		igualCaseSensitive = cadena1.equals(cadena2);
		igualNotCaseSensitive = cadena1.toLowerCase().equals(cadena2.toLowerCase());
		// igual que equalsIngoreCase
		System.out.println("Es igual: " + igualCaseSensitive);
		System.out.println("Es igual sin tener en cuenta mayusculas: " + igualNotCaseSensitive);
	}

}

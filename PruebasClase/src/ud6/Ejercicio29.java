package ud6;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		String texto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca texto a invertir: ");
		texto = sc.nextLine();
		System.out.println("Texto invertido: ");
		for (int i = 0; i < texto.length(); i++) { // recorrer a la inversa
			System.out.print(texto.charAt(texto.length() - i - 1));
		}
	}

}

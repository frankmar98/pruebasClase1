package ud6;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		String texto, vocales = "aeiou";
		int nVocales = 0, nConsonantes = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la frase a evaluar: ");
		texto = sc.nextLine();
		texto = texto.replaceAll(" ", "");
		texto = texto.toLowerCase(); // todo en minuscula, mejor para comprobar
		for (int i = 0; i < texto.length(); i++) {
			for (int j = 0; j < vocales.length(); j++) {
				if (texto.charAt(i) == vocales.charAt(j)) {
					nVocales++;
				}
			}
		}
		nConsonantes = texto.length() - nVocales;
		System.out.println("La frase tiene " + nVocales + " vocales");
		System.out.println("La frase tiene " + nConsonantes + " consonantes");
	}

}

package ud6;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		String texto, vocales = "aeiou";
		int nVoc[] = new int[vocales.length()]; // numero de apariciones de cada vocal
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la frase a evaluar: ");
		texto = sc.nextLine();
		texto = texto.replaceAll(" ", "");
		texto = texto.toLowerCase(); // todo en minuscula, mejor para comprobar
		for (int i = 0; i < texto.length(); i++) {
			for (int j = 0; j < vocales.length(); j++) {
				if (texto.charAt(i) == vocales.charAt(j)) {
					nVoc[j]++;
				}
			}
		}
		for (int i = 0; i < vocales.length(); i++) {
			System.out.println("No de " + ("" + vocales.charAt(i)).toUpperCase() + "'s: " + nVoc[i]);
		}
	}

}

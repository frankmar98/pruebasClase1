package ud6;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		String cadena, caracter;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la cadena a evaluar: ");
		cadena = sc.nextLine();
		System.out.println("Introduzca el caracter a mostrar sus repeticiones: ");
		caracter = sc.nextLine();
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter.charAt(0)) {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " " + caracter.charAt(0) + "'s en la cadena");
	}

}

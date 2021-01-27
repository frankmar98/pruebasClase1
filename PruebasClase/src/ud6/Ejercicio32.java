package ud6;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra;
		int n, n2;
		boolean esPalindromo = true, es[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca frase a evaluar si es palindromo: ");
		palabra = sc.nextLine();
		palabra = palabra.replaceAll(" ", ""); // quitar espacios
		n = palabra.length();
		n2 = (int) (palabra.length() / 2) + 1;
		es = new boolean[n2];
		for (int i = 0; i < n2; i++) {
			es[i] = palabra.charAt(i) == palabra.charAt(n-i-1);
			if (!es[i]) {
				esPalindromo= false;
				break;
			}
		}
		System.out.println("Es palindromo: " + esPalindromo);
	}

}

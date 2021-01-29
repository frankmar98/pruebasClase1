package ud6;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String frase;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la frase: ");
		frase = sc.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			System.out.print("" + frase.charAt(i));
			if (frase.charAt(i) == ' ') {
				System.out.println("");
			}
		}
	}

}

package ud7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int a=1, b=1, c=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los dos numeros a dividir");
		try {
			a = sc.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
			sc.nextLine();
		}
		try {
			b = sc.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
			sc.nextLine();
		}
		try {
			c=a/b;
		} catch (ArithmeticException e2) {
			e2.printStackTrace();
		}
	}

}

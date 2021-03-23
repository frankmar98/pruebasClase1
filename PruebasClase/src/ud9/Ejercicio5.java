package ud9;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int valor;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca todos los valores enteros que quiera: ");
		do {
			valor = sc.nextInt();
			if (valor != -1) {
				arr.add(valor);
			}
		} while (valor != -1);
		
		System.out.println("Contenido del ArrayList");
		for (Integer i : arr) {
			System.out.println(i);
		}
	}

}

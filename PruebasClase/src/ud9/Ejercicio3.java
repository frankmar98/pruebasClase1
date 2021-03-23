package ud9;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		char opcion;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Menu ----");
			System.out.println("a) Mostrar valores");
			System.out.println("b) Introducir valor al final");
			System.out.println("c) Introducir valor en posicion determinada");
			System.out.println("d) Salir.");
			opcion = sc.nextLine().charAt(0);
			switch (opcion) {
			case 'a':
				mostrarValores(arr);
				break;
			case 'b':
				introducirAlFinal(arr);
				break;
			case 'c':
				introducirEnPosicion(arr);
				break;
			case 'd':
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opcion no valida.");
			}
		} while (opcion != 'd');
		sc.close();
	}

	public static void mostrarValores(ArrayList<Integer> arr) {
		System.out.println("Valores del ArrayList: --");
		for (Integer i : arr) {
			System.out.println(i);
		}
	}

	public static void introducirAlFinal(ArrayList<Integer> arr) {
		Scanner sc = new Scanner(System.in);
		int v;
		System.out.println("Introduzca valor a annadir al final: ");
		v = sc.nextInt();
		arr.add(v);
	}

	public static void introducirEnPosicion(ArrayList<Integer> arr) {
		Scanner sc = new Scanner(System.in);
		int p, v;
		boolean exito = true;
		System.out.println("Introduzca posicion en la que annadir el valor: ");
		p = sc.nextInt();
		System.out.println("Introduzca valor: ");
		v = sc.nextInt();
		try {
			arr.add(p, v);
			exito = true;
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			exito = false;
		}
		if (!exito) {
			System.out.println("No existe esa posicion. Vuelva a introducir los valores.");
			introducirEnPosicion(arr);
		}

	}

}

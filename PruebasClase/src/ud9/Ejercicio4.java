package ud9;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int opcion;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Menu---");
			System.out.println("1. Crear secuencia aritmetica. ");
			System.out.println("2. Mostrar secuencia. ");
			System.out.println("3. Salir. ");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				creacion(arr);
				break;
			case 2:
				mostrar(arr);
				break;
			case 3:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opcion incorrecta.");
			}
		} while (opcion != 3);
	}

	public static void creacion(ArrayList<Integer> arr) {
		int v, ini, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Creacion de secuencia aritmetica: ");
		System.out.println("Introduzca V, valor inicial: ");
		v = sc.nextInt();
		System.out.println("Introduzca I, incremento: ");
		ini = sc.nextInt();
		System.out.println("Introduzca N, numero de valores: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			arr.add(ini + v * i);
		}
	}

	public static void mostrar(ArrayList<Integer> arr) {
		System.out.println("Contenido del ArrayList");
		for (Integer i : arr) {
			System.out.println(i);
		}
	}

}

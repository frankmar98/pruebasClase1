package ud9;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int opcion = 8;
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> arr = new ArrayList<Double>();

		do {
			System.out.println("Programa de numeros reales - Menu: ");
			System.out.println("1. Mostrar todo");
			System.out.println("2. Agregar numero");
			System.out.println("3. Buscar numero");
			System.out.println("4. Modificar numero");
			System.out.println("5. Eliminar numero");
			System.out.println("6. Insertar numero");
			System.out.println("7. Salir");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				mostrarTodo(arr);
				break;
			case 2:
				agregarNumero(arr);
				break;
			case 3:
				buscarNumero(arr);
				break;
			case 4:
				modificarNumero(arr);
				break;
			case 5:
				eliminarNumero(arr);
				break;
			case 6:
				insertarNumero(arr);
				break;
			case 7:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opcion no valida");

			}
		} while (opcion != 7);
	}

	public static void mostrarTodo(ArrayList<Double> arr) {
		for (Double i : arr) {
			System.out.println(i);
		}
	}

	public static void agregarNumero(ArrayList<Double> arr) {
		double numero = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero: ");
		numero = sc.nextDouble();
		arr.add(numero);

	}

	public static void buscarNumero(ArrayList<Double> arr) {
		double numero = 0.0;
		int posicion = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero: ");
		numero = sc.nextDouble();
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == numero) {
				posicion = i;
				break;
			}
		}
		if (posicion == -1) {
			System.out.println("No se ha encontrado el numero");
		} else {
			System.out.println("El numero esta en la posicion: " + posicion);
		}
	}

	public static void modificarNumero(ArrayList<Double> arr) {
		int posicion = -1;
		double numero = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la posicion a modificar: ");
		posicion = sc.nextInt();
		System.out.println("Introduce el numero: ");
		numero = sc.nextDouble();
		try {
			arr.set(posicion, numero);
		} catch (Exception e) {
			System.out.println("No se ha podido");
			e.printStackTrace();
		}

	}

	public static void eliminarNumero(ArrayList<Double> arr) {
		double numero = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero a eliminar: ");
		numero = sc.nextDouble();
		try {
			arr.remove(numero);
		} catch (Exception e) {
			System.out.println("No se ha podido");
			e.printStackTrace();
		}
	}

	public static void insertarNumero(ArrayList<Double> arr) {
		int posicion = -1;
		double numero = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la posicion en la que insertar: ");
		posicion = sc.nextInt();
		System.out.println("Introduce el numero: ");
		numero = sc.nextDouble();
		try {
			arr.add(posicion, numero);
		} catch (Exception e) {
			System.out.println("No se ha podido");
			e.printStackTrace();
		}

	}

}

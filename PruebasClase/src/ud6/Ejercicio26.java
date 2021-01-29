package ud6;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		String nombre, apellido1, apellido2, codigo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre: ");
		nombre = sc.nextLine();
		System.out.println("Introduzca el primer apellido: ");
		apellido1 = sc.nextLine();
		System.out.println("Introduzca el segundo apellido: ");
		apellido2 = sc.nextLine();
		codigo = (nombre.substring(0, 3) + apellido1.substring(0, 3) + apellido2.substring(0, 3)).toUpperCase();
		System.out.println("El codigo es: " + codigo);
	}

}

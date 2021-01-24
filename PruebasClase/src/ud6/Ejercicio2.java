package ud6;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int n;
		double alturas[], minima, maxima, media, suma = 0, encima = 0, debajo = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca numero de alturas a computar: ");
		n = sc.nextInt();
		alturas = new double[n];
		System.out.println("introduzca las alturas");
		for (int i = 0; i < n; i++) { // rellenar
			alturas[i] = sc.nextDouble();
		}
		minima = alturas[0]; // guess
		maxima = alturas[0];
		for (int i = 0; i < n; i++) { // operaciones
			suma += alturas[i];
			if (alturas[i] < minima) { // minimo
				minima = alturas[i];
			}
			if (alturas[i] > maxima) { // maximo
				maxima = alturas[i];
			}
		}
		media = suma / n;
		for (int i = 0; i < n; i++) { // operaciones
			if (alturas[i] < media) {
				debajo++;
			}
			if (alturas[i] > media) {
				encima++;
			}
		}
		System.out.println("La media es:" + (suma / n));
		System.out.println("La maxima es:" + maxima);
		System.out.println("La minima es:" + minima);
		System.out.println("Hay " + debajo + " alturas debajo de la media");
		System.out.println("Hay " + encima + " alturas encima de la media");
	}

}

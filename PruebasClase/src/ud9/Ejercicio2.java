package ud9;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> alturaPersonas = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		Integer altura = 1;
		int personasPorEncima = 0, personasPorDebajo = 0, min, max;
		double suma = 0.0, media;
		do { // obtener alturas
			try {
				System.out.println("Introduzca altura persona no " + (alturaPersonas.size() + 1));
				altura = sc.nextInt();
				if (altura > 0) {
					alturaPersonas.add(altura);
				} else if (altura < 0) {
					throw new Exception("La altura no puede ser negativa vuelva a introducirla");
				} // no else porque si no 2 condiciones, altura = 0, salir
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (altura != 0);

		max = alturaPersonas.get(0); // guess inicial
		min = alturaPersonas.get(0);
		for (Integer i : alturaPersonas) { // calculos media maximo minimo
			suma += i; // suma y media
			if (i < min) { // minimo
				min = i;
			}
			if (i > max) { // maximo
				max = i;
			}
		}

		media = suma / alturaPersonas.size(); // guardar la media

		for (Integer i : alturaPersonas) { // personas por encima y debajo de la media
			if (i < media) {
				personasPorDebajo++;
			}
			if (i > media) {
				personasPorEncima++;
			}
		}

		// mostrar resultados
		System.out.println("Hay " + alturaPersonas.size() + " personas:");
		System.out.println("La altura media es " + media);
		System.out.println("La altura minima es " + min);
		System.out.println("La altura maxima es " + max);
		System.out.println("Hay " + personasPorDebajo + " personas con altura por debajo de la media.");
		System.out.println("Hay " + personasPorEncima + " personas con altura por encima de la media.");
		sc.close();

	}

}

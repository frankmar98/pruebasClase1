package ud9;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int nComparaciones = 5;
		String cadena;
		ArrayList<String> arr1 = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce " + nComparaciones*2 + " cadenas de texto: ");
		for (int i=0; i<nComparaciones; i++) {
			cadena = sc.nextLine();
			arr1.add(cadena);
		}
		for (int i=0; i<nComparaciones; i++) {
			cadena = sc.nextLine();
			arr2.add(cadena);
		}
		
		if(arr1.equals(arr2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintas");
		}
		sc.close();
	}

}

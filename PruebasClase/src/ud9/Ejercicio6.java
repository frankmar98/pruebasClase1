package ud9;

import java.util.ArrayList;

public class Ejercicio6 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=i; j++) {
				arr.add(i);
			}
		}
		
		System.out.println("Contenido del ArrayList: ");
		for (Integer i : arr) {
			System.out.println(i);
		}
	}

}

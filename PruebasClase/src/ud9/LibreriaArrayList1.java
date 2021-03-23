package ud9;

import java.util.ArrayList;

public class LibreriaArrayList1 {

	public static void imprimeArrayListInt(ArrayList<Integer> arrLst, int nElementosPorLinea) {
		int contador = 0;
		for (int i = 0; i < arrLst.size(); i++) {
			System.out.print(arrLst.get(i) + ", ");
			if (nElementosPorLinea == contador) {
				System.out.println("");
				contador = -1;
			}
			contador++;
		}
		System.out.println("");
	}

	public static ArrayList<Integer> generaArrayListInt(int n, int min, int max) {
		ArrayList<Integer> arrLst = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arrLst.add((int) (min + (Math.random()) * (max - min + 1)));
		}
		return arrLst;
	}

	public static int minimoArrayList(ArrayList<Integer> arrLst) {
		int min = arrLst.get(0);
		for (int i = 0; i < arrLst.size(); i++) {
			if (arrLst.get(i) < min) {
				min = arrLst.get(i);
			}
		}
		return min;
	}

	public static int maximoArrayList(ArrayList<Integer> arrLst) {
		int max = arrLst.get(0);
		for (int i = 0; i < arrLst.size(); i++) {
			if (arrLst.get(i) > max) {
				max = arrLst.get(i);
			}
		}
		return max;
	}

	public static double mediaArrayListInt(ArrayList<Integer> arrLst) {
		double suma = 0.0;
		for (int i = 0; i < arrLst.size(); i++) {
			suma += arrLst.get(i);
		}
		return suma / arrLst.size(); // media
	}

	public static boolean estaEnArrayListInt(ArrayList<Integer> arrLst, int num) {
		boolean esta = false;
		for (int i = 0; i < arrLst.size(); i++) {
			if (arrLst.get(i) == num) {
				esta = true;
			}
		}
		return esta;
	}

	public static int primeraPosicionEnArrayListInt(ArrayList<Integer> arrLst, int num) { // primera posicion
		int posicion = -1; // no esta
		for (int i = 0; i < arrLst.size(); i++) {
			if (arrLst.get(i) == num) {
				posicion = arrLst.get(i);
				break;
			}
		}
		return posicion;
	}

	public static int ultimaPosicionEnArrayListInt(ArrayList<Integer> arrLst, int num) { // ultima posicion
		int posicion = -1; // no esta
		for (int i = 0; i < arrLst.size(); i++) {
			if (arrLst.get(i) == num) {
				posicion = arrLst.get(i); // sin break, ultima, sobreescribe
			}
		}
		return posicion;
	}

	public static ArrayList<Integer> volteaArrayListInt(ArrayList<Integer> arrLst) {
		Integer aux;
		int n;
		n = (int) arrLst.size() / 2;
		for (int i = 0; i < n; i++) {
			aux = arrLst.get(i);
			arrLst.set(i, arrLst.get(2 * n - i - 1));
			arrLst.set(2 * n - i - 1, aux);
		}

		return arrLst;
	}

	public static double mediaArrayInt2(ArrayList<Integer> arr) {
		double suma = 0.0;
//		for (Integer contenido : arr) {
//			suma += contenido;
//		}

		for (int i = 0; i < arr.size(); i++) {
			suma += arr.get(i);
		}
		return (suma / arr.size()); // media
	}

	
	
	
	
	
	
	
	public static void voltea2 (ArrayList<Integer> arr) {
		int j=arr.size()-1;
		for (int i=0; i<(int)(arr.size()/2); i++) {
			int aux;
			aux = arr.get(j);
			arr.set(j, arr.get(i));
			arr.set(i, aux);
			j--;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

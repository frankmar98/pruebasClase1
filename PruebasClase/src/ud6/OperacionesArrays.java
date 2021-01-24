package ud6;

/**
 * Libreria de operaciones sobre arrays, dia 15-01-2021, Programacion 1AMT
 * @author fmm
 *
 */

public class OperacionesArrays {
	
	/**
	 * Genera array de numeros enteros aleatorios
	 * @param n
	 * @param min
	 * @param max
	 * @return
	 */

	public static int[] generaArrayInt(int n, int min, int max) {
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = (int) (min + (Math.abs(max - min + 1) * Math.random()));
		}
		return array;
	}
	
	/**
	 * Muestra array de numeros enteros por consola
	 * @param array
	 */

	public static void mostrarArrayInt(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posicion = " + i + "\t|\t valor = " +array[i]);
		}
	}
	
	/**
	 * Obtener el minimo de un array
	 * @param array
	 * @return
	 */

	public static int minimoArrayInt(int[] array) {
		int minimo;
		minimo = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minimo) {
				minimo = array[i];
			}
		}
		return minimo;
	}
	
	/**
	 * Obtener el maximo de una array
	 * @param array
	 * @return
	 */

	public static int maximoArrayInt(int[] array) {
		int maximo;
		maximo = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximo) {
				maximo = array[i];
			}
		}
		return maximo;
	}
	
	/**
	 * Obtener la media (decimal) de un array
	 * @param array
	 * @return
	 */

	public static double mediaArrayInt(int[] array) {
		double suma = 0.0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return (suma / array.length);
	}
	
	/**
	 * Busqueda secuencial en una array de enteros. Devuelve numero.
	 * @param numero
	 * @param array
	 * @return
	 */

	public static boolean estaEnArray(int numero, int[] array) {
		boolean esta = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero) {
				esta = true;
				break;
			}
		}
		return esta;
	}
	
	/**
	 * Busqueda secuencial en una array de enteros. Devuelve posicion.
	 * @param numero
	 * @param array
	 * @return
	 */

	public static int posicionEnArray(int numero, int[] array) {
		int posicion = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * Dar la vuelta (numeros <-> posiciones) a un array.
	 * @param array
	 * @return
	 */

	public static int[] volteaArrayInt(int[] array) {
		int n = array.length;
		for (int i = 0; i < (int) (n / 2); i++) {
			int aux;
			aux = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = aux;
		}
		return array;
	}

}

package ud6;

/**
 * Para ejecutar pruebas en la clase OperacionesArrays
 * @author fmm
 *
 */

public class Principal {

	public static void main(String[] args) { //funciones lambda
		int arr[] = new int[11];
		arr=OperacionesArrays.generaArrayInt(arr.length, 0, 20);
		OperacionesArrays.mostrarArrayInt(arr);
		
		pr("Minimo = " + OperacionesArrays.minimoArrayInt(arr));
		pr("Maximo = " + OperacionesArrays.maximoArrayInt(arr));
		pr("Media = " + OperacionesArrays.mediaArrayInt(arr));
		pr("Esta en array = " + OperacionesArrays.estaEnArray(5, arr));
		pr("Posicion en array = " + OperacionesArrays.posicionEnArray(5, arr));
		OperacionesArrays.mostrarArrayInt(OperacionesArrays.volteaArrayInt(arr));
	}
	
	private static void pr(String cadena) { //abreviatura sysout solo para Principal
		System.out.println(cadena);
	}

}

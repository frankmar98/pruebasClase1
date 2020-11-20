/**
 * Crear un programa, que indique el d�a de la semana seg�n su n�mero
 * @author fmartinezmoreno
 *
 */

import java.util.Scanner; 														// importar clase Scanner necesaria para entrada

public class Ej2_34 {															// declarar clase para este ejercicio

	public static void main(String[] args) {									// declarar m�todo main en el que ir� todo el c�digo
		int numero;
		Scanner sc = new Scanner(System.in);										// declarar variable para el d�a de la semana
		System.out.println("Introduce el numero del d�a de la semana: "); 		// Informar a usuario de la funcion del programa
		 									// declarar objeto scanner (necesario)
		numero = sc.nextInt(); 													// capturar entero de la consola en variable numero
		switch (numero) { 														// evaluar n�mero
		case 1: 																// numero del dia
			System.out.println("El d�a numero " + numero + " es lunes"); 		// informar al usuario del d�a en cadena de texto
			break; 																// salirse de la estructura de control
		case 2:
			System.out.println("El d�a numero " + numero + " es martes");
			break;
		case 3:
			System.out.println("El d�a numero " + numero + " es miercoles");
			break;
		case 4:
			System.out.println("El d�a numero " + numero + " es jueves");
			break;
		case 5:
			System.out.println("El d�a numero " + numero + " es viernes!");
			break;
		case 6:
			System.out.println("El d�a numero " + numero + " es sabado!! :)");
			break;
		case 7:
			System.out.println("El d�a numero " + numero + " es domingo");
			break;
		default:																// si numero se sale de dominio informar al usuario
			System.out.println("El d�a numero " + numero + " no corresponde a ningun d�a de la semana");
			break;
		}																		// fin estructura switch
	}																			// fin metodo main
}																				// fin clase

import java.util.Scanner;

public class Ej2_32_b {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);										// declarar variable para el d�a de la semana
		System.out.println("Introduce el numero del d�a de la semana: "); 		// Informar a usuario de la funcion del programa						// declarar objeto scanner (necesario)
		numero = sc.nextInt(); 													// capturar entero de la consola en variable numero
		if (numero == 1) 														// evaluar n�mero 																// numero del dia
			System.out.println("El d�a numero " + numero + " es lunes"); 		// informar al usuario del d�a en cadena de texto																// salirse de la estructura de control
		else if (numero == 2)
			System.out.println("El d�a numero " + numero + " es martes");
		else if (numero == 3)
			System.out.println("El d�a numero " + numero + " es miercoles");
		else if (numero == 4)
			System.out.println("El d�a numero " + numero + " es jueves");
		else if (numero == 5)
			System.out.println("El d�a numero " + numero + " es viernes!");
		else if (numero == 6)
			System.out.println("El d�a numero " + numero + " es sabado!! :)");
		else if (numero == 7) 
			System.out.println("El d�a numero " + numero + " es domingo");
		else																		// si numero se sale de dominio informar al usuario
			System.out.println("El d�a numero " + numero + " no corresponde a ningun d�a de la semana");
	}
}

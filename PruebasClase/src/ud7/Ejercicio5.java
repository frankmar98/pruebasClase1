package ud7;

public class Ejercicio5 {

	public static void main(String[] args) {
		try {
			imprimirPositivo(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			imprimirPositivo(-1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			imprimirNegativo(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			imprimirNegativo(-1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static void imprimirPositivo(int positivo) throws Exception { 
		if (positivo < 0) {
			throw new Exception("No se puede mostrar el numero porque es negativo");
		} else {
			System.out.println("El numero positivo es " + positivo);
		}
	}
	
	public static void imprimirNegativo(int negativo) throws Exception {
		if (negativo >= 0) {
			throw new Exception("No se puede mostrar el numero porque es positivo");
		} else {
			System.out.println("El numero negativo es " + negativo);
		}
	}

}

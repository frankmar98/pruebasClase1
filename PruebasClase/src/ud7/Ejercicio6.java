package ud7;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Gato gato1 = new Gato(-1,"Paco");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Gato gato2 = new Gato(3,"Paco");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Gato gato3 = new Gato(1,"Pa");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Gato gato4 = new Gato(-1,"Pa");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

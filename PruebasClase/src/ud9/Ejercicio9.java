package ud9;

import java.util.ArrayList;

public class Ejercicio9 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		//annadir personas, jugadores del Malaga CF 2020/2021 en este caso
		arr.add("Alberto Escassi");
		arr.add("Dani Barrio");
		arr.add("Mohammed Benkhemassa");
		arr.add("Stefan Scepovic");
		arr.add("Luis Munnoz");
		arr.add("Juande");
		
		for (String i : arr) { //imprimir contenido con un bucle sin usar indices
			System.out.println(i);
		}
	}

}

package ud9;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio8 {

	public static void main(String[] args) {
		//1.
		Producto prod1 = new Producto("iPod", 4);
		Producto prod2 = new Producto("Wii", 7);
		Producto prod3 = new Producto("iPod", 4);
		Producto prod4 = new Producto("Wii", 7);
		Producto prod5 = new Producto("iPod", 1);
		//2.
		ArrayList<Producto> arr = new ArrayList<Producto>();
		//3.
		arr.add(prod1);
		arr.add(prod2);
		arr.add(prod3);
		arr.add(prod4);
		arr.add(prod5);
		//4.
		Iterator<Producto> it = arr.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//prueba equals
		System.out.println("son iguales: " + arr.get(0).equals(arr.get(2)));
		System.out.println("NO son iguales: " + arr.get(0).equals(arr.get(4)));
				
		//5.
		arr.remove(prod2);
		arr.remove(prod4);
		//6.
		arr.add(2, new Producto("Wii",7));
		//7.
		for (Producto i : arr) {
			System.out.println(i);
		}
		//8.
		arr.removeAll(arr);
		System.out.println("Tamanno del ArrayList despues de borrar = " + arr.size());
		
		
	}

}

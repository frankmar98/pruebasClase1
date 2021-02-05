package ud7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int nums[], n=0;
		Scanner sc = new Scanner(System.in);
		nums = new int[(int) (Math.random()*100+1)];
		for (int i =0; i<nums.length;i++) {
			nums[i] = (int) (Math.random()*10+1);
		}
		do {
			System.out.println("Introduce posicion");
			try {
				n = sc.nextInt();
				System.out.println("El valor con posicion " + n + " es " + nums[n]);
			} catch (InputMismatchException e) {
				System.out.println("entrada erronea");
				sc.nextLine();
			}
			catch (IndexOutOfBoundsException e) {
				System.out.println("no existe esa posicion");
				sc.nextLine();
			}
		} while (n>=0);
		System.out.println("Salida del programa");
	}

}

package ud7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		double nums[] = new double[5];
		double num=0.0;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<nums.length;i++) {
			num=0.0;
			try {
					num = sc.nextDouble();
				}
			 catch (InputMismatchException e) {
				System.out.println("Entrada erronea");
				i--;
				sc.nextLine();
			} finally {
				nums[i]=num;
			}
		}


		for (double numero : nums) {
			System.out.println(numero);
		}
	}

}

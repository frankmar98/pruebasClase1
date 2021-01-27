package ud6;

import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		String frase, palabra[];
		int nChar[], max=0, posmax=0;
		Scanner sc = new Scanner(System.in);
		frase=sc.nextLine();
		palabra = frase.split(" ");
		nChar = new int[palabra.length];
		for (int i=0; i<palabra.length;i++) {
			nChar[i] = palabra[i].length();
		}
		
		for(int i=0;i<nChar.length;i++) {
			if (nChar[i]>max) {
				max=nChar[i];
				posmax=i;
			}
		}
		
		System.out.println("La palabra mas grande es: "  + palabra[posmax]);
		System.out.println("Su numero de caracteres es: " + nChar[posmax]);
		System.out.println("Su posicion es: " + (posmax +1));
	}

}

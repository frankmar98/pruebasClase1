import java.util.Scanner;

public class EjClaseMartes3Octubre {
	
	public static void main(String[] args) {
		int n=4;
		double[] preciosConIVA, preciosSinIVA;
		double totalConIVA=0, totalSinIVA=0;
		preciosConIVA= new double[n];
		preciosSinIVA= new double[n];
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<=n-1;i++) {
			System.out.println("Introduzca precio nº" + (i+1) + " al que calcular un IVA del 21%: ");
			preciosSinIVA[i]=sc.nextDouble();
			preciosConIVA[i]=precioConIVA (preciosSinIVA[i]);
		}
		System.out.println("\tPrecios sin IVA: \tPrecios con IVA: ");
		System.out.println("\t----------------\t----------------");
		for (int i=0;i<=n-1;i++) {
			System.out.println("\t"+preciosSinIVA[i]+"€\t\t\t"+preciosConIVA[i]+"€");
			totalSinIVA += preciosSinIVA[i];
			totalConIVA += preciosConIVA[i];
		}
		System.out.println("\t-----------------------------------------------");
		System.out.println("\tTotal sin IVA: " + totalSinIVA + "€" + "\tTotal con IVA: " + totalConIVA + "€");
		
	}
	
	public static double precioConIVA(double precio) {
		return (precio*1.21);
	}
}
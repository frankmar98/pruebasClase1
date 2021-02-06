package ud7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Gato gato1=null, gato2=null, gato3=null, gato4=null;
		Gato gatos[] = new Gato[4];
		// TODO Auto-generated method stub
		try {
			gato1 = new Gato(5,"Paco");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			gato2 = new Gato(3,"Paco");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			gato3 = new Gato(2,"Paco");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			gato4 = new Gato(1,"Paco");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		gatos[0]=gato1;
		gatos[1]=gato2;
		gatos[2]=gato3;
		gatos[3]=gato4;
		
		for (Gato gato : gatos) {
			System.out.println(gato);
		}
		
		for (int i=0;i<gatos.length;i++) {
			try {
				gatos[i].setEdad(2*i+1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				gatos[i].setNombre("Gato" + i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for (Gato gato : gatos) {
			System.out.println(gato);
		}
		
		gatos = rellenarPorConsola(gatos);
		
		for (Gato gato : gatos) {
			System.out.println(gato);
		}
	}
	
	public static Gato[] rellenarPorConsola (Gato[] gatos) {
		Scanner sci = new Scanner(System.in);
		Scanner scs = new Scanner(System.in);
		for (Gato gato : gatos) {
			System.out.println("Introduzca el nombre del gato: ");
			try {
				gato.setNombre(scs.nextLine());
			} catch (InputMismatchException e){
				e.printStackTrace();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Introduzca la edad del gato: ");
			try {
				gato.setEdad(sci.nextInt());
			} catch (InputMismatchException e){
				e.printStackTrace();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return gatos;
	}

}

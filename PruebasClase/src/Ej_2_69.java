import java.util.Scanner;

public class Ej_2_69
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[8];
        int sumaPositivos = 0, sumaNegativos = 0;

        System.out.println("Introduce 8 números enteros: \n");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = sc.nextInt();
        }

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > 0) {
                sumaPositivos += lista[i];
            } else {
                sumaNegativos += lista[i];
            }
        }
        System.out.println("La suma de los positivos es = " + sumaPositivos);
        System.out.println("La suma de los negativos es = " + sumaNegativos);

    }

}

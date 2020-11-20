import java.util.Scanner;

public class ListaClase2a
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String repetidor;
        String[] listaClase = {"aaa", "bbb", "ccc", "ddd", "eee"};
        int n = listaClase.length;
        boolean[] haSalido = new boolean[n];
        while (true) {
            System.out.println("Pulse enter para el siguiente turno: ");
            repetidor = sc.nextLine();

            haSalido = turno(n, haSalido, listaClase);
        }
    }

    public static boolean[] turno(int n, boolean[] haSalido, String[] listaClase)
    {
        int num, contador = 0;
        do {
            num = (int) (Math.random() * n);
        } while (haSalido[num]);
        haSalido[num] = true;
        System.out.println("El elejido es: " + listaClase[num]);
        for (int i = 0; i <= n - 1; i++) {
            if (haSalido[i]) {
                contador++;
            }
        }
        if (contador >= n) {
            for (int i = 0; i <= n - 1; i++) {
                haSalido[i] = false;
            }
            System.out.println("¡Enhorabuena!, ha salido toda la clase!! vuelta a empezar");
        }
        return haSalido;
    }

}

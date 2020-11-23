import java.util.Scanner;

public class EjClase_20_11_2020
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, suma = 0, i = 0;
        do {
            n = sc.nextInt();
            suma += n;
            i++;
        } while (suma <= 10000);
        System.out.println("contador: " + i);
        System.out.println("suma: " + suma);
        System.out.println("Media: " + (suma / i));
        sc.close();
    }

}

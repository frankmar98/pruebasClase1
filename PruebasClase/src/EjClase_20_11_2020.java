import java.util.Scanner;

public class EjClase_20_11_2020
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
        sc.close();
    }

}

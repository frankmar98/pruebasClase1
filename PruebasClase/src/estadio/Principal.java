package estadio;

import java.util.Scanner;

public class Principal
{

    public static void main(String[] args)
    {
        int n=4, zona, num;
        Scanner sc = new Scanner(System.in);
        int opcionMenu;
        Zona2 z1 = new Zona2(500,10.0,"Fondo Norte");
        Zona2 z2 = new Zona2(700,10.0,"Fondo Sur");
        Zona2 z3 = new Zona2(300,25.0,"Preferencia Alta");
        Zona2 z4 = new Zona2(250,40.0,"Preferencia Baja");
        Zona2[] arr = {z1,z2,z3,z4};
        System.out.println("Aplicacion iniciada... ");
        do {
            System.out.println("\n\nAplicacion de venta de entradas -- menu: seleccione una opcion");
            System.out.println("1. Mostrar numero de entradas libres hay en cada zona");
            System.out.println("2. Mostrar precio por entrada en cada zona");
            System.out.println("3. Vender entradas");
            System.out.println("4. Salir");
            opcionMenu = sc.nextInt();
            switch (opcionMenu) {
                case 1:
                    for (int i=0;i<n;i++) {
                        arr[i].opcion1();
                    }
                    break;
                case 2:
                    for (int i=0;i<n;i++) {
                        arr[i].opcion2();
                    }
                    break;
                case 3:
                    System.out.println("Introduzca la zona");
                    zona = sc.nextInt();
                    System.out.println("Introduzca el numero de entradas");
                    num = sc.nextInt();
                    switch (zona) {
                        case 1:
                            z1.opcion3(num);
                            break;
                        case 2:
                            z2.opcion3(num);
                            break;
                        case 3:
                            z3.opcion3(num);
                            break;
                        case 4:
                            z4.opcion3(num);
                            break;
                        default:
                            System.err.println("error, opcion no valida");
                    }
                    break;
                case 4:
                    System.out.println("Procediendo a salir de la aplicacion de venta de entradas...");
           // salir del programa
                    break;
                default:
                    System.err.println("Error: Introduzca una opcion entre 1 y 4");

            }
        } while (opcionMenu != 4);

    }

}

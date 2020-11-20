package estadio;

import java.util.Scanner;

public class Principal
{
    private static int n = 4;

    public static void main(String[] args)
    {
        int zona, num;
        Scanner sc = new Scanner(System.in);
        int opcionMenu;
        Zona2 z1 = new Zona2(500, 10.0, "Fondo Norte");
        Zona2 z2 = new Zona2(700, 10.0, "Fondo Sur");
        Zona2 z3 = new Zona2(300, 25.0, "Preferencia Alta");
        Zona2 z4 = new Zona2(250, 40.0, "Preferencia Baja");
        Zona2[] arr = {z1, z2, z3, z4};
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
                    imprimirZonas(false, true, arr);
                    break;
                case 2:
                    imprimirZonas(true, false, arr);
                    break;
                case 3:
                    imprimirZonas(false, false, arr);
                    System.out.println("Introduzca la zona");
                    zona = sc.nextInt();
                    System.out.println("Introduzca el numero de entradas");
                    num = sc.nextInt();
                    switch (zona) {
                        case 1:
                            z1.venderEntradas(num);
                            break;
                        case 2:
                            z2.venderEntradas(num);
                            break;
                        case 3:
                            z3.venderEntradas(num);
                            break;
                        case 4:
                            z4.venderEntradas(num);
                            break;
                        default:
                            System.err.println("error, opcion no valida");
                    }
                    break;
                case 4:
                    System.out.println("Procediendo a salir de la aplicacion de venta de entradas...");
                    break;
                default:
                    System.err.println("Error: Introduzca una opcion entre 1 y 4");
            }
        } while (opcionMenu != 4);

    }

    /**
     * Método para imprimir las zonas con o sin precio o numero
     * 
     * @param conPrecios
     * @param conNumeros
     * @param arr
     */

    static void imprimirZonas(boolean conPrecios, boolean conNumeros, Zona2[] arr)
    {
        if (!conPrecios || !conNumeros) {
            if (conPrecios) {
                System.out.println("El precio de la entrada es:  ");
                for (int i = 0; i < n; i++) {
                    System.out.print((i + 1) + " ");
                    arr[i].precios();
                }
            } else if (conNumeros) {
                System.out.println("Numero de entradas libres en cada zona:  ");
                for (int i = 0; i < n; i++) {
                    System.out.print((i + 1) + " ");
                    arr[i].numEntradas();
                }
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print((i + 1) + " ");
                    arr[i].outZonas();
                }
            }
        }
    }

}

package estadio;

import java.util.Scanner;

public class Zona
{
    private int nz; // numero de zonas del estadio

    private int[] numEntradas;

    private double[] precios;

    private String[] outZona;

    public Zona(int nz)
    {
        super();
        this.nz = nz;
        numEntradas = new int[nz];
        precios = new double[nz];
        outZona = new String[nz];
        this.numEntradas[0] = 500;
        this.numEntradas[1] = 700;
        this.numEntradas[2] = 300;
        this.numEntradas[3] = 250;
        this.precios[0] = 10.0;
        this.precios[1] = 10.0;
        this.precios[2] = 25.0;
        this.precios[3] = 40.0;
        this.outZona[0] = "Fondo Norte \t\t\t";
        this.outZona[1] = "Fondo Sur \t\t\t";
        this.outZona[2] = "Preferencia Alta \t\t";
        this.outZona[3] = "Preferencia Baja \t\t";

    }

    /**
     * @return the nz
     */
    public int getNz()
    {
        return nz;
    }

    /**
     * @param nz the nz to set
     */
    public void setNz(int nz)
    {
        this.nz = nz;
    }

    public void venderEntradas(int n, int tipo)
    {

        switch (tipo) {

            case 1:
                this.numEntradas[0] -= n;
                break;
            case 2:
                this.numEntradas[1] -= n;
                break;
            case 3:
                this.numEntradas[2] -= n;
                break;
            case 4:
                this.numEntradas[3] -= n;
                break;
            default:
                System.err.println("error");

        }

    }

    public int selecZona()
    {
        Scanner sc = new Scanner(System.in);
        int zona;
        System.out.println("Proceda a la eleccion de la zona: ");
        for (int i = 0; i < nz; i++) {
            System.out.println("" + this.outZona[i] + (i + 1));
        }
        zona = sc.nextInt();
        return zona;
    }

    public int selecNum()
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Proceda a la eleccion del numero de entradas: ");
        num = sc.nextInt();
        return num;
    }

    public void opcion1()
    {
        System.out.println("Numero de entradas libres en cada zona:");
        for (int i = 0; i < nz; i++) {
            System.out.println("" + this.outZona[i] + this.numEntradas[i]);
        }
    }

    public void opcion2()
    {
        System.out.println("El precio de la entrada es: ");
        for (int i = 0; i < nz; i++) {
            System.out.println("" + this.outZona[i] + this.precios[i]);
        }
    }

    public void opcion3()
    {
        int zona = selecZona();
        int num = selecNum();
        if (num <= numEntradas[zona - 1]) {
            if (num > 0 && zona >= 1 && zona <= 4) {
                venderEntradas(num, zona);
                System.out.println(
                    "La venta de sus " + num + " entradas de la zona " + zona + " ha sido procesada correctamente.");
                System.out.println("Desglose: ");
                System.out.println(
                    "x" + num + "\t" + this.outZona[zona - 1] + "-- " + (num * this.precios[zona - 1]) + "€\n\n");
            } else {
                System.err.println("\nError, opcion seleccionada no valida...\n");
            }
        } else {
            System.err.println("\nError, no quedan entradas disponible de esas caracteristicas...\n");
        }
    }

    public void opcion4()
    {
        System.out.println("Procediendo a salir de la aplicacion de venta de entradas...");
        System.exit(0); // salir del programa
    }
}

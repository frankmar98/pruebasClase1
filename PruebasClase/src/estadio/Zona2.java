package estadio;

public class Zona2
{

    private int numEntradas;

    /**
     * @return the numEntradas
     */
    public int getNumEntradas()
    {
        return numEntradas;
    }

    /**
     * @param numEntradas the numEntradas to set
     */
    public void setNumEntradas(int numEntradas)
    {
        this.numEntradas = numEntradas;
    }

    /**
     * @return the precios
     */
    public double getPrecios()
    {
        return precios;
    }

    /**
     * @param precios the precios to set
     */
    public void setPrecios(double precios)
    {
        this.precios = precios;
    }

    /**
     * @return the outZona
     */
    public String getOutZona()
    {
        return outZona;
    }

    /**
     * @param outZona the outZona to set
     */
    public void setOutZona(String outZona)
    {
        this.outZona = outZona;
    }

    private double precios;

    private String outZona;
    
    


    /**
     * @param numEntradas
     * @param precios
     * @param outZona
     */
    public Zona2(int numEntradas, double precios, String outZona)
    {
        super();
        this.numEntradas = numEntradas;
        this.precios = precios;
        this.outZona = outZona;
    }

    public void venderEntradas(int n)
    {
           this.numEntradas -= n;
    }


    public void opcion1()
    {
        System.out.println("Numero de entradas libres en cada zona:");
        System.out.println("" + this.outZona + this.numEntradas);
    }

    public void opcion2()
    {
        System.out.println("El precio de la entrada es: ");
        System.out.println("" + this.outZona + this.precios);
    }

    public void opcion3(int num)
    {
        if (num < numEntradas) {
            if (num > 0) {
                venderEntradas(num);
                System.out.println(
                    "La venta de sus " + num + " ha sido procesada correctamente.");
                System.out.println("Desglose: ");
                System.out.println(
                    "x" + num + "\t" + this.outZona + "-- " + (num * this.precios) + "€\n\n");
            } else {
                System.err.println("\nError, opcion seleccionada no valida...\n");
            }
        } else {
            System.err.println("\nError, no quedan entradas disponible de esas caracteristicas...\n");
        }
    }

}

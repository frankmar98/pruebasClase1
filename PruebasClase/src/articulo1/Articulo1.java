package articulo1;

public class Articulo1
{
    private String nombre;

    private double precio;

    private double iva = 1.21;

    private int cuantosQuedan;

    /**
     * @param nombre
     * @param precio
     * @param cuantosQuedan
     */
    public Articulo1(String nombre, double precio, int cuantosQuedan)
    {
        super();
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
        this.iva = 1.21;
    }

    public void imprimirTodo()
    {
        System.out.println("Nombre producto: " + this.nombre);
        System.out.println("Precio producto: " + this.precio + "€");
        System.out.println("Precio producto con IVA del 21%: " + obtenerPrecioConIVA(this.precio) + "€");
        System.out.println("Quedan " + this.cuantosQuedan + " unidades");

    }

    public double obtenerPrecioConIVA(double p)
    {
        return (p * this.iva);
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    /**
     * @return the cuantosQuedan
     */
    public int getCuantosQuedan()
    {
        return cuantosQuedan;
    }

    /**
     * @param cuantosQuedan the cuantosQuedan to set
     */
    public void setCuantosQuedan(int cuantosQuedan)
    {
        this.cuantosQuedan = cuantosQuedan;
    }

}

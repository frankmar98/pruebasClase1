package punto1;

public class Punto
{
    private int x; // posiciones

    private int y;

    /**
     * @param x
     * @param y
     */
    public Punto(int x, int y)
    {
        super();
        this.x = x;
        this.y = y;
    }

    public void mostrarCoordenadas()
    {
        System.out.println("x = " + this.x + "\t\t y = " + this.y);
    }
    
    public double distancia(Punto p2) {
        double d1=Math.abs(this.x-p2.x);
        double d2=Math.abs(this.y-p2.y);
        return Math.sqrt(d1*d1+d2*d2);
    }

    /**
     * @return the x
     */
    public int getX()
    {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x)
    {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY()
    {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y)
    {
        this.y = y;
    }

}

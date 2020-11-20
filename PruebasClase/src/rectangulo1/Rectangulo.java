package rectangulo1;

public class Rectangulo
{
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double x;
    private double y;
    /**
     * @param x1
     * @param x2
     * @param y1
     * @param y2
     */
    public Rectangulo(double x1, double x2, double y1, double y2)
    {
        super();
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public double calcX (double x1a, double x2a) {
        this.x=x2a-x1a;
        return this.x;
    }
    public double calcY (double y1a, double y2a) {
        this.y=y2a-y1a;
        return this.y;
    }
    
    public double calcArea(double x1a, double y1a, double x2a, double y2a) {
        double area = Math.abs((x2a-x1a)*(y1a-y2a));
        return area;
    }
    
    public void imprimirRectanguloTodo() {
        System.out.println("x1 = "+ this.x1);
        System.out.println("x2 = "+ this.x2);
        System.out.println("y1 = "+ this.y1);
        System.out.println("y2 = "+ this.y2);
        System.out.println("Dimension en x = " + calcX(this.x1,this.x2));
        System.out.println("Dimension en y = " + calcX(this.y1,this.y2));
        System.out.println("Area del rectangulo / unidades cuadradas = " + calcArea(this.x1,this.y1,this.x2,this.y2));
    }
    
    
    
    /**
     * @return the x1
     */
    public double getX1()
    {
        return x1;
    }
    /**
     * @param x1 the x1 to set
     */
    public void setX1(double x1)
    {
        this.x1 = x1;
    }
    /**
     * @return the x2
     */
    public double getX2()
    {
        return x2;
    }
    /**
     * @param x2 the x2 to set
     */
    public void setX2(double x2)
    {
        this.x2 = x2;
    }
    /**
     * @return the y1
     */
    public double getY1()
    {
        return y1;
    }
    /**
     * @param y1 the y1 to set
     */
    public void setY1(double y1)
    {
        this.y1 = y1;
    }
    /**
     * @return the y2
     */
    public double getY2()
    {
        return y2;
    }
    /**
     * @param y2 the y2 to set
     */
    public void setY2(double y2)
    {
        this.y2 = y2;
    }

    
}

package punto1;

public class Operaciones
{
    public static void mostrarTodos(Punto[] listaPuntos)
    {
        for (int i = 0; i < listaPuntos.length; i++) {
            System.out.println(
                "Punto " + (i + 1) + ": " + "x = " + listaPuntos[i].getX() + "\t\t y = " + listaPuntos[i].getY());
        }
    }
    
    public void imprime(Punto p) {
        System.out.println("x = " + p.getX() + "\t\t y = " + p.getY());
    }
    
    public void setXY(Punto p, int x, int y) {
        p.setX(x);
        p.setY(y);
    }
    
    public void desplaza(Punto p, int x, int y) {
        p.setX(p.getX()+x);
        p.setY(p.getY()+y);
    }
    
    
}

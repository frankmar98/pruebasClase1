package punto1;

public class Principal
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Punto p1 = new Punto(5, 0);
        Punto p2 = new Punto(10, 10);
        Punto p3 = new Punto(-3, 7);

        System.out.println("x = " + p1.getX() + "\t\t y = " + p1.getY());
        System.out.println("x = " + p2.getX() + "\t\t y = " + p2.getY());
        System.out.println("x = " + p3.getX() + "\t\t y = " + p3.getY());

        Punto[] arr = {p1, p2, p3};
        Operaciones.mostrarTodos(arr);
        
        System.out.println("La distancia es: " + p1.distancia(p2));
    }

}

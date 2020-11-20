package persona1;

import java.util.Scanner;

public class Principal
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String nombre,apellidos;
        int dni,edad;
        Persona p1;
        System.out.println("Introduzca el nombre: ");
        nombre=sc.nextLine();
        System.out.println("Introduzca el los apellidos: ");
        apellidos=sc.nextLine();
        System.out.println("Introduzca el numero del DNI: ");
        dni=sc.nextInt();
        System.out.println("Introduzca la edad: ");
        edad=sc.nextInt();
        p1 = new Persona(nombre, apellidos, dni, edad);
        p1.imprimirPersona();

    }

}

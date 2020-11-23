package companiaMovil1;

public class Ejecutador
{
    /**
     * Ejecucion secuencial de comandos de una compañia movil Opciones: Dar de alta clientes. Registrar sus llamadas.
     * Imprimir por consola resumen de su factura.
     * 
     * @param args
     */

    public static void main(String[] args)
    {
        Movil cliente1 = new Movil(681212121, Tarifas.Elefante); // dar de alta clientes
        Movil cliente2 = new Movil(681222222, Tarifas.Gato);
        cliente1.llamar(323); // registrar llamadas clientes distintas tarifas misma duracion
        cliente2.llamar(323);
        cliente1.resumenFactura(); // mostrar por consola resumen de la factura
        cliente2.resumenFactura();
        cliente2.reiniciarFactura(); // reiniciar factura de un cliente
        cliente2.resumenFactura(); // mostrar factura reiniciada
    }

}

package companiaMovil1;

public class Ejecutador
{

    public static void main(String[] args) //ejecucion secuencial
    {
        Movil cliente1 = new Movil(681212121, Tarifas.Elefante);
        Movil cliente2 = new Movil(681222222, Tarifas.Gato);
        cliente1.llamar(323);
        cliente2.llamar(323);
        cliente1.resumenFactura();
        cliente2.resumenFactura();
        cliente2.reiniciarFactura();
        cliente2.resumenFactura();
    }

}

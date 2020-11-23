package companiaMovil1;

/**
 * Clase Movil. Esta clase será instanciada para cada cliente. Esta clase a su vez instancia una Tarifa (que es un
 * enumerado) Esta clase contiene los atributos y metodos necesarios para la gestión de una linea movil.
 * 
 * @author FMM
 */

public class Movil
{
    private long numeroTelefono; // numero de telefono del cliente

    private Tarifas tipoTarifa; // instanciar una Tarifa en la clase Movil

    private double consumoActual = 0.0; // consumo actual en €. No en el constructor

    private double minutosConsumidos = 0.0; // consumo actual en minutos. No en el constructor

    /**
     * Constructor para dar de alta nuevo cliente
     * 
     * @param numeroTelefono
     * @param tipoTarifa
     */
    public Movil(long numeroTelefono, Tarifas tipoTarifa) // enumerado en el constructor para mayor simplicidad
    {
        super();
        this.numeroTelefono = numeroTelefono;
        this.tipoTarifa = tipoTarifa;
    }

    /**
     * Registrar en el sistema una llamada de un cliente. Se actualizará el consumo en € y en minutos.
     * 
     * @param segundosLlamada
     */

    public void llamar(int segundosLlamada)
    {
        consumoActual += tipoTarifa.getCosteMinuto() * (((double) segundosLlamada) / 60); // actualizar €
        minutosConsumidos += (((double) segundosLlamada) / 60); // actualizar min
    }

    /**
     * Reiniciar internamente la factura de un cliente
     */

    public void reiniciarFactura()
    {
        consumoActual = 0.0; // resetear €
        minutosConsumidos = 0.0; // resetear min
    }

    /**
     * Imprimir por consola el resumen de la factura de un cliente
     */

    public void resumenFactura()
    {
        System.out.println("Resumen de su factura mensual: ");
        System.out.println("Tipo de tarifa: " + tipoTarifa.getNombreTarifa());
        System.out.println("Numero de telefono: " + numeroTelefono);
        System.out.println("Minutos consumidos: " + minutosConsumidos);
        System.out.println("Consumo: " + consumoActual + "€\n");
    }

    /**
     * @return the consumoActual
     */
    public double getConsumoActual()
    {
        return consumoActual;
    }

    /**
     * @return the numeroTelefono
     */
    public long getNumeroTelefono()
    {
        return numeroTelefono;
    }

    /**
     * @param numeroTelefono the numeroTelefono to set
     */
    public void setNumeroTelefono(long numeroTelefono)
    {
        this.numeroTelefono = numeroTelefono;
    }

    /**
     * @return the tipoTarifa
     */
    public Tarifas getTipoTarifa()
    {
        return tipoTarifa;
    }

    /**
     * @param tipoTarifa the tipoTarifa to set
     */
    public void setTipoTarifa(Tarifas tipoTarifa)
    {
        this.tipoTarifa = tipoTarifa;
    }

    /**
     * @return the minutosConsumidos
     */
    public double getMinutosConsumidos()
    {
        return minutosConsumidos;
    }

}

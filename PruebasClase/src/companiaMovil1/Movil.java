package companiaMovil1;

public class Movil
{
    private long numeroTelefono;

    private Tarifas tipoTarifa; // instanciar una Tarifa en la clase Movil

    private double consumoActual = 0.0;

    private double minutosConsumidos = 0.0; // no en el constructor, interno de Movil, solo getter

    /**
     * @param numeroTelefono
     * @param tipoTarifa
     */
    public Movil(long numeroTelefono, Tarifas tipoTarifa) // enumerado en el constructor para mayor simplicidad
    {
        super();
        this.numeroTelefono = numeroTelefono;
        this.tipoTarifa = tipoTarifa;
    }

    public void llamar(int segundosLlamada)
    {
        consumoActual += tipoTarifa.getCosteMinuto() * (((double) segundosLlamada) / 60);
        minutosConsumidos += (((double) segundosLlamada) / 60);
    }

    public void reiniciarFactura()
    {
        consumoActual = 0.0;
        minutosConsumidos = 0.0;
    }

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

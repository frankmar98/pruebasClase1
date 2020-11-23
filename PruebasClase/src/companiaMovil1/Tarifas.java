package companiaMovil1;

/**
 * El enumerado Tarifas contiene la informacion sobre las tarifas de la compañia. Se instanciara una vez por cada linea
 * movil.
 * 
 * @author FMM
 */

public enum Tarifas
{
    Elefante(1, 0.30, "Elefante"),
    Tigre(2, 0.18, "Tigre"),
    Gato(3, 0.07, "Gato");

    private int tipoTarifa; // no usado por ahora, identificador entero de cada tarifa

    private double costeMinuto; // coste del minuto de voz para cada tarifa

    private String nombreTarifa; // nombre comercial de la tarifa

    /**
     * Constructor del enumerado Tarifa
     * 
     * @param tipoTarifa
     * @param costeMinuto
     * @param nombreTarifa
     */
    Tarifas(int tipoTarifa, double costeMinuto, String nombreTarifa)
    {
        this.tipoTarifa = tipoTarifa;
        this.costeMinuto = costeMinuto;
        this.nombreTarifa = nombreTarifa;
    }

    /**
     * @return the tipoTarifa
     */
    public int getTipoTarifa()
    {
        return tipoTarifa;
    }

    /**
     * @return the costeMinuto
     */
    public double getCosteMinuto()
    {
        return costeMinuto;
    }

    /**
     * @return the nombreTarifa
     */
    public String getNombreTarifa()
    {
        return nombreTarifa;
    }

}

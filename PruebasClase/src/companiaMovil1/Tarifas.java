package companiaMovil1;

public enum Tarifas
{
    Elefante(1, 0.30, "Elefante"),
    Tigre(2, 0.18, "Tigre"),
    Gato(3, 0.07, "Gato");

    private int tipoTarifa;

    private double costeMinuto;

    private String nombreTarifa;

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

package Servidor;

public class Servidor
{
    private String nombre;

    private String sistemaOperativo;

    private String version;

    private int nprocs;

    private int nusuarios;

    private float memoria;

    private boolean isUp;

    /**
     * @param sistemaOperativo
     * @param version
     * @param nprocs
     * @param nusuarios
     * @param memoria
     * @param isUp
     */
    public Servidor(String nombre, String sistemaOperativo, String version, int nprocs, int nusuarios, float memoria,
        boolean isUp)
    {
        super();
        this.setNombre(nombre);
        this.sistemaOperativo = sistemaOperativo;
        this.version = version;
        this.nprocs = nprocs;
        this.nusuarios = nusuarios;
        this.memoria = memoria;
        this.isUp = isUp;
    }

    public void mostrarInfo()
    {
        System.out.println("Información del servidor " + nombre);
        System.out.println("El sistema operativo es: " + sistemaOperativo);
        System.out.println("La versión del sistema operativo es: " + version);
        System.out.println("Cores: " + nprocs);
        System.out.println("Número de usuarios dados de alta: " + nusuarios);
        System.out.println("Memoria: " + memoria + "MB");
        System.out.println("Está en linea: " + isUp);
        System.out.println("\n");
    }

    /**
     * @return the sistemaOperativo
     */
    public String getSistemaOperativo()
    {
        return sistemaOperativo;
    }

    /**
     * @param sistemaOperativo the sistemaOperativo to set
     */
    public void setSistemaOperativo(String sistemaOperativo)
    {
        this.sistemaOperativo = sistemaOperativo;
    }

    /**
     * @return the version
     */
    public String getVersion()
    {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version)
    {
        this.version = version;
    }

    /**
     * @return the nprocs
     */
    public int getNprocs()
    {
        return nprocs;
    }

    /**
     * @param nprocs the nprocs to set
     */
    public void setNprocs(int nprocs)
    {
        this.nprocs = nprocs;
    }

    /**
     * @return the nusuarios
     */
    public int getNusuarios()
    {
        return nusuarios;
    }

    /**
     * @param nusuarios the nusuarios to set
     */
    public void setNusuarios(int nusuarios)
    {
        this.nusuarios = nusuarios;
    }

    /**
     * @return the memoria
     */
    public float getMemoria()
    {
        return memoria;
    }

    /**
     * @param memoria the memoria to set
     */
    public void setMemoria(float memoria)
    {
        this.memoria = memoria;
    }

    /**
     * @return the isUp
     */
    public boolean isUp()
    {
        return isUp;
    }

    /**
     * @param isUp the isUp to set
     */
    public void setUp(boolean isUp)
    {
        this.isUp = isUp;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

}

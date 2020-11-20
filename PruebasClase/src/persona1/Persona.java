package persona1;

public class Persona
{
    private String nombre;

    private String apellidos;

    private int numeroDNI;

    private String dniCompleto;

    private int edad;

    /**
     * @param nombre
     * @param apellidos
     * @param numeroDNI
     * @param edad
     */
    public Persona(String nombre, String apellidos, int numeroDNI, int edad)
    {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDNI = numeroDNI;
        this.edad = edad;
    }

    public char obtenerLetraDNI(int numDNI)
    {
        char[] listaMinisterio = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
            'V', 'H', 'L', 'C', 'K', 'E'};
        return listaMinisterio[numDNI % 23];
    }

    public String obtenerDNICompleto(int numDNI)
    {
        this.dniCompleto = ("" + numDNI + obtenerLetraDNI(numDNI));
        return this.dniCompleto;
    }

    public boolean esMayorDeEdad(int ed)
    {
        boolean es;
        if (ed >= 18 && !(ed < 0)) {
            es = true;
        } else {
            es = false;
        }
        return es;
    }
    
    public boolean esJubilado(int ed)
    {
        boolean es;
        if (ed >= 65 && !(ed < 0)) {
            es = true;
        } else {
            es = false;
        }
        return es;
    }
    
    public int diferenciaEdad(Persona p2) {
        return (Math.abs(this.edad-p2.edad));
    }

    public void imprimirPersona()
    {
        System.out.println("Informacion de la persona: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("DNI completo: " + obtenerDNICompleto(this.numeroDNI));
        System.out.println("Es mayor de edad: " + esMayorDeEdad(this.edad));
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

    /**
     * @return the apellidos
     */
    public String getApellidos()
    {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

    /**
     * @return the numeroDNI
     */
    public int getNumeroDNI()
    {
        return numeroDNI;
    }

    /**
     * @param numeroDNI the numeroDNI to set
     */
    public void setNumeroDNI(int numeroDNI)
    {
        this.numeroDNI = numeroDNI;
    }

    /**
     * @return the dniCompleto
     */
    public String getDniCompleto()
    {
        return dniCompleto;
    }

    /**
     * @param dniCompleto the dniCompleto to set
     */
    public void setDniCompleto(String dniCompleto)
    {
        this.dniCompleto = dniCompleto;
    }

    /**
     * @return the edad
     */
    public int getEdad()
    {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad)
    {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.err.println("Error: Edad " + edad + " no es posible");
        }
    }

}

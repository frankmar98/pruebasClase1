package Servidor;

public class EjecutarComandos
{

    public static void main(String[] args)
    {
        int nEnanitos = 7;
        Servidor serv1 = new Servidor("Docencia1", "Ubuntu", "18.04.5", 32, 86, 32 * 1024 * 2, true);
        Servidor serv2 = new Servidor("Investigacion1", "CentOS", "6", 144, 22, 144 * 1024, true);
        Servidor[] servEnanitos = new Servidor[nEnanitos];

        serv1.mostrarInfo();
        serv2.mostrarInfo();

        serv1.setUp(false); // actualizar sistema operativo
        serv1.mostrarInfo();
        serv1.setVersion("20.04.1");
        serv1.setUp(true);
        serv1.mostrarInfo();

        serv2.setUp(false); // actualizar memoria
        serv2.mostrarInfo();
        serv2.setMemoria(serv2.getNprocs() * 1024 * 4); // 4GB de RAM por core para cálculos
        serv2.setUp(true);
        serv2.mostrarInfo();

        for (int i = 0; i < nEnanitos; i++) {
            servEnanitos[i] =
                new Servidor("Servidor asignado al enanito nº" + i, "Ubuntu", "16.04.6", 8, 3, 32 * 1024, true);
            servEnanitos[i].mostrarInfo();
        }

    }

}

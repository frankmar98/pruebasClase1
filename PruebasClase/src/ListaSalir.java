import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ListaSalir {

	public static void main(String[] args) throws IOException {
		int i,j,n=0,m,aux,elegido;
		String linea;
		File f =new File("C:\\Users\\FMM\\Documents\\1DAM\\prog\\eclipse\\PruebasClase\\src\\lista.txt");
		FileWriter fw = new FileWriter(f);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
	    String[] nombres = new String[n];
	    int[] longitudes= new int[n];
	    int[] veces= new int[n];
	    i=0;
	    while ((linea=br.readLine())!=null) {
	    	nombres[i]=br.readLine();
	    	longitudes[i]=nombres[i].length();
	    	veces[i]=nombres[i].charAt(longitudes[i]);
	    	veces[i]=(int)veces[i];
	    	i++;
	    } 
	    n=i;
	    System.out.println(n);
	    i=0;
        for (i=0;i<n-1;i++) { 
            for (j=0;j<n-i-1;j++) {
                if (veces[j]>veces[j+1]) 
                { 
                    aux=veces[j]; 
                    veces[j]=veces[j+1]; 
                    veces[j+1]=aux; 
                } 
            }
        }
        i=0;
        while (veces[i]==veces[i+1]) {
        	i=i+1;
        }
        m=i;
        elegido = (int) Math.random()*m;
        System.out.println("El elegido es + " + nombres[elegido]);
        veces[elegido]++;
	    for (i=0;i<=n;i++) {
	    	veces[i]=nombres[i].charAt(longitudes[i]);
	    	fw.write(nombres[i]+veces[i]);
	    }
	}
	

}

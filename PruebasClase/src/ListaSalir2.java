import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class ListaSalir2 {

	public static void main(String[] args) throws IOException {
		int i,j,n=0,m,aux,elegido;
		String linea;
		FileWriter fw = new FileWriter("C:\\Users\\FMM\\Documents\\1DAM\\prog\\eclipse\\PruebasClase\\src\\lista.txt");
		FileReader fr = new FileReader("C:\\Users\\FMM\\Documents\\1DAM\\prog\\eclipse\\PruebasClase\\src\\lista.txt");
		LineNumberReader contar = new LineNumberReader(fr);
		BufferedReader br = new BufferedReader(fr);
		linea = contar.readLine();
		if (contar.ready()) {
			while(linea != null) {
		        n = contar.getLineNumber();
		        linea = contar.readLine();
		    }
		n++;
		}
	    n=4;
	    String[] nombres = new String[n];
	    int[] longitudes= new int[n];
	    int[] veces= new int[n];
	    for (i=0;i<=n-1;i++) {
	    	nombres[i]=br.readLine();
	    	longitudes[i]=nombres[i].length();
	    	veces[i]=nombres[i].charAt(longitudes[i]);
	    	veces[i]=(int)veces[i];
	    } 
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

package ud9;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList miArrLst = LibreriaArrayList1.generaArrayListInt(10, 1, 50);
		LibreriaArrayList1.imprimeArrayListInt(miArrLst, 10);
		//LibreriaArrayList1.imprimeArrayListInt(LibreriaArrayList1.volteaArrayListInt(miArrLst), 10);
		
		//System.out.println("La media es: " + LibreriaArrayList1.mediaArrayInt2(miArrLst));
		LibreriaArrayList1.voltea2(miArrLst);
		LibreriaArrayList1.imprimeArrayListInt(miArrLst, 10);
		
	}

}

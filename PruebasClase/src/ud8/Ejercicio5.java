package ud8;

public class Ejercicio5 {

	public static void main(String[] args) {
		Electrodomestico els[] = new Electrodomestico[10];
		double precioLavadoras=0, precioTeles=0, precioTotal=0;
		els[0]=new Television();
		els[1]=new Lavadora();
		try {
			els[2]=new Television(30,30);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			els[3] = new Lavadora(20,50);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			els[4] = new Television(230,Color.ROJO,Consumo.A,13,70);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			els[5] = new Lavadora(180,Color.GRIS,Consumo.B,120,50);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			els[6] = new Television(100,Color.AZUL,Consumo.E,13,42);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			els[7] = new Lavadora(170,Color.NEGRO,Consumo.D,40,7);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		els[8]=new Television();
		els[9]=new Lavadora();
		
		for (Electrodomestico el : els) {
			System.out.println("El precio final es: " + el.precioFinal() + "€");
		}
		
		for (Electrodomestico el : els) {
			precioTotal += el.precioFinal();
			if (el instanceof Lavadora) {
				precioLavadoras += el.precioFinal();
			} else if (el instanceof Television) {
				precioTeles += el.precioFinal();
			}
		}
		
		System.out.println("Precio total: " + precioTotal + "€");
		System.out.println("Precio de las televisiones: " + precioTeles + "€");
		System.out.println("Precio de las lavadoras: " + precioLavadoras + "€");
	}

}

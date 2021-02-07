package ud8;

public class Ejercicio3 {

	public static void main(String[] args) {
		Loro loro1 = new Loro("Ernesto", "2020/02/14", "Guinea", true);
		Loro loro2 = new Loro("Manuel", "2021/01/01", "Francia", false);
		Perro perro1 = new Perro("Toby", "2018/06/16", "mestizo", true);
		Gato gato1 = new Gato("Sergio", "2019/12/13", "negro", false);

		System.out.println(loro1);
		System.out.println(loro1.emiteSonido());
		System.out.println(loro1.saluda());
		System.out.println(loro1.vuela());

		System.out.println(loro2);
		System.out.println(loro2.saluda());

		System.out.println(perro1);
		perro1.setTienePulgas(false);
		System.out.println(perro1);
		System.out.println(perro1.emiteSonido());

		System.out.println(gato1);
		System.out.println(gato1.emiteSonido());

	}

}

package ud8;

public class Revista extends Publicacion {
	
	private int numRevista;

	/**
	 * @param codigo
	 * @param titulo
	 * @param annoPublicacion
	 * @param numPaginas
	 * @param numRevista
	 */
	public Revista(String codigo, String titulo, int annoPublicacion, int numPaginas, int numRevista) {
		super(codigo, titulo, annoPublicacion, numPaginas);
		this.numRevista = numRevista;
	}
	
	@Override
	public String toString() {
		String s="";
		s += super.toString();
		s += "Numero de la revista: " + this.numRevista + "\n";
		return s;
	}

	/**
	 * @return the numRevista
	 */
	public int getNumRevista() {
		return numRevista;
	}

	/**
	 * @param numRevista the numRevista to set
	 */
	public void setNumRevista(int numRevista) {
		this.numRevista = numRevista;
	}
	
	

}

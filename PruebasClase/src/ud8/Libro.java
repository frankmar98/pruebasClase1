package ud8;

public class Libro extends Publicacion {
	
	private String autorLibro;

	/**
	 * @param codigo
	 * @param titulo
	 * @param annoPublicacion
	 * @param numPaginas
	 * @param autorLibro
	 */
	public Libro(String codigo, String titulo, int annoPublicacion, int numPaginas, String autorLibro) {
		super(codigo, titulo, annoPublicacion, numPaginas);
		this.autorLibro = autorLibro;
	}
	
	@Override
	public String toString() {
		String s="";
		s += super.toString();
		s += "Autor del libro: " + this.autorLibro + "\n";
		return s;
	}

	/**
	 * @return the autorLibro
	 */
	public String getAutorLibro() {
		return autorLibro;
	}

	/**
	 * @param autorLibro the autorLibro to set
	 */
	public void setAutorLibro(String autorLibro) {
		this.autorLibro = autorLibro;
	}
	
	
}

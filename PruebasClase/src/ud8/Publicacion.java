package ud8;


//No se si se deberia de usar abstract 

public class Publicacion {
	private String codigo;
	private String titulo;
	private int annoPublicacion;
	private int numPaginas;
	/**
	 * @param codigo
	 * @param titulo
	 * @param annoPublicacion
	 * @param numPaginas
	 */
	public Publicacion(String codigo, String titulo, int annoPublicacion, int numPaginas) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.annoPublicacion = annoPublicacion;
		this.numPaginas = numPaginas;
	}
	@Override
	public String toString() {
		String s="";
		s += "Codigo: " + this.codigo + "\n";
		s += "Titulo: " + this.titulo + "\n";
		s += "Anno de publicacion: " + this.annoPublicacion + "\n";
		s += "Numero de paginas: "+ this.numPaginas + "\n"; 
		return s;
	}
	
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the annoPublicacion
	 */
	public int getAnnoPublicacion() {
		return annoPublicacion;
	}
	/**
	 * @param annoPublicacion the annoPublicacion to set
	 */
	public void setAnnoPublicacion(int annoPublicacion) {
		this.annoPublicacion = annoPublicacion;
	}
	/**
	 * @return the numPaginas
	 */
	public int getNumPaginas() {
		return numPaginas;
	}
	/**
	 * @param numPaginas the numPaginas to set
	 */
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	
	
	
	
}

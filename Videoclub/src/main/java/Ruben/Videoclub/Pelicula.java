package Ruben.Videoclub;

public class Pelicula {
	
	private String titulo;
	private String codigoPelicula;
	private int identificador = 1;
	private final String IDPREFIX = "Película_";
	
	public Pelicula (String titulo) {
		this.titulo = titulo;
		this.codigoPelicula = IDPREFIX + identificador++; 
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getCodigoPelicula() {
		return codigoPelicula;
	}
	
	

}

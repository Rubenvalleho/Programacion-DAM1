package Ruben.Videoclub.domain;

public class Cliente {

	private String numeroCarnet;
	private String nombre;
	private int contador = 1;
	private final String IDPREFIX = "Cliente_";
	private boolean morosidad = false;
	
	public Cliente (String nombre) {
		this.numeroCarnet = IDPREFIX + contador++;
		this.nombre = nombre;
	}
	
	public String getNumeroCarnet() {
		return numeroCarnet;
	}
	
	/*public void setNumeroCarnet(int numeroCarnet) {
		this.numeroCarnet = numeroCarnet;
	}*/
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean getMorosidad() {
		return morosidad;
	}
	
	public void setMorosidad(Boolean morosidad) {
		this.morosidad = morosidad;
	}
	
	public String toString () {
		return  "\nNombre de cliente: " + nombre +
				"\nNumero de carnet: " + numeroCarnet +
				"\nMorosidad del cliente: " + morosidad;
	}
}

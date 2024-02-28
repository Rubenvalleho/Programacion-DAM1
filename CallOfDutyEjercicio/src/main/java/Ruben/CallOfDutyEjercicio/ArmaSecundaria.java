package Ruben.CallOfDutyEjercicio;

public class ArmaSecundaria extends Arma{
	private String tipo;
		
	public ArmaSecundaria (int espaciosEnMochila, String nombre, int dañoPorSegundo, String tipo) {
		super(espaciosEnMochila, nombre, dañoPorSegundo);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		return  "\nID del arma secundaria: " + getId() +
				"\nNombre del arma: " + getNombre() + 
				"\nEspacios que ocupa: " + getEspaciosEnMochila() +
				"\nDaño por segundo: " + getDañoPorSegundo() + 
				"\nEl tipo de arma es: " + getTipo();
	}
}


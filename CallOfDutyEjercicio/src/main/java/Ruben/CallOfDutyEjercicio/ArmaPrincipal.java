package Ruben.CallOfDutyEjercicio;

public class ArmaPrincipal extends Arma{
	private String tipo;
	
	public ArmaPrincipal (int espaciosEnMochila, String nombre, int dañoPorSegundo, String tipo) {
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
		return  "\nID del arma principal: " + getId() +
				"\nNombre del arma: " + getNombre() + 
				"\nEspacios que ocupa: " + getEspaciosEnMochila() +
				"\nDaño por segundo: " + getDañoPorSegundo() + 
				"\nEl tipo de arma es: " + getTipo();
	}
	
}

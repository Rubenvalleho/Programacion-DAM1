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
	
}

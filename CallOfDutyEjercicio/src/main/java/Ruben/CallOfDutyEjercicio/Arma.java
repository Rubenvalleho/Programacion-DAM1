package Ruben.CallOfDutyEjercicio;

public class Arma extends Equipamiento{
	private String nombre;
	private int dañoPorSegundo;
	
	
	public Arma (int espaciosEnMochila, String nombre, int dañoPorSegundo) {
		super (espaciosEnMochila);
		this.nombre = nombre;
		this.dañoPorSegundo = dañoPorSegundo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDañoPorSegundo() {
		return dañoPorSegundo;
	}

	public void setDañoPorSegundo(int dañoPorSegundo) {
		this.dañoPorSegundo = dañoPorSegundo;
	}
	
	
}

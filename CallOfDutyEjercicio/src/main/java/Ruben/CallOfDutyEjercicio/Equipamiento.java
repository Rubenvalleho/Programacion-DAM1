package Ruben.CallOfDutyEjercicio;

public class Equipamiento {
	private int id;
	private static int contador = 1; 
	private int espaciosEnMochila;
	
	public Equipamiento (int espaciosEnMochila) {
		this.id = contador++;
		this.espaciosEnMochila = espaciosEnMochila;
	}
	
	public int getId() {
		return id;
	}
	
	private void setId(int id) {
		this.id = id;
	}

	public int getEspaciosEnMochila() {
		return espaciosEnMochila;
	}

	public void setEspaciosEnMochila(int espaciosEnMochila) {
		this.espaciosEnMochila = espaciosEnMochila;
	}
	
	
}

package Ruben.CallOfDutyEjercicio;

public class Accesorio extends Equipamiento{
	private String nombre;
	private String utilidad;
	
	public Accesorio (int espaciosEnMochila, String nombre, String utilidad) {
		super(espaciosEnMochila);
		this.nombre = nombre;
		this.utilidad = utilidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUtilidad() {
		return utilidad;
	}

	public void setUtilidad(String utilidad) {
		this.utilidad = utilidad;
	}
	
	
}

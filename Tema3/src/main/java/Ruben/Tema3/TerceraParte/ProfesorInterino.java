package Ruben.Tema3.TerceraParte;

public class ProfesorInterino extends Profesor{
	private String fechaInicio;
	
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public ProfesorInterino(String nombre, int edad, char sexo, double peso, double altura, String moduloN, String fechaInicio) {
		super(nombre, edad, sexo, peso, altura, moduloN);
		this.fechaInicio = fechaInicio;
	}
}

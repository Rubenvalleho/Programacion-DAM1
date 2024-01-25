package Ruben.Tema3.TerceraParte;

public class ProfesorTitular extends Profesor{
	private String fechaAprobado;
	
	public String getFechaAprobado () {
		return fechaAprobado;
	}
	public void setFechaAprobado(String fechaAprobado) {
		this.fechaAprobado = fechaAprobado;
	}
	
	public ProfesorTitular (String nombre, int edad, char sexo, double peso, double altura, String moduloN, String fechaAprobado) {
		super (nombre, edad, sexo, peso, altura, moduloN);
		this.fechaAprobado = fechaAprobado;
	}
}

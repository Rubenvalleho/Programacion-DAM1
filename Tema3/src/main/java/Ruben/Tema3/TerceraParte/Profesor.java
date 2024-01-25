package Ruben.Tema3.TerceraParte;

public class Profesor extends Persona {
	
	private String moduloN;
	
	public String getModuloN() {
		return moduloN;
	}
	public void setModulo(String moduloN) {
		this.moduloN = moduloN;
	}
	
	
	public Profesor (String nombre, int edad, char sexo, double peso, double altura, String moduloN) {
		super(nombre, edad, sexo, peso, altura);
		this.moduloN = moduloN;
	}
	
	@Override
	public String toString () {
		return "\nNombre: " + getNombre() + "\nDNI: " + getDni() + "\nEdad: " + getEdad() + "\nSexo: " + getSexo() + "\nPeso: " + getPeso() + "\nAltura: " + getAltura() + "\nModulo: " + moduloN;
	}
}

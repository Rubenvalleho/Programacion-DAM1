package Ruben.Tema5.PracticaExamen;

import java.time.LocalDate;

public class Persona {
	private static int contador = 1;
	private String codigo;
	private String PREFIX = "cod_";	
	private String nombre;
	private String apellidos;
	private LocalDate fecha;
	
	public Persona(String nombre, String apellidos) {
		this.codigo = PREFIX + contador++;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = LocalDate.now();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void aumentarFecha(Persona persona) {
		final int PLUS_DAYS = 7;
		
		persona.setFecha(LocalDate.now().plusDays(PLUS_DAYS));
	}

	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fecha=" + fecha
				+ "]";
	}
	
	
}

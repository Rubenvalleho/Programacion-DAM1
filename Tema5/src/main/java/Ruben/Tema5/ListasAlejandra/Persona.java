package Ruben.Tema5.ListasAlejandra;

import java.util.Objects;

public class Persona implements Comparable<Persona> {

	private String nombre;
	private int edad;
	private int popularidad;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(String nombre, int edad, int popularidad) {
		this.nombre = nombre;
		this.edad = edad;
		this.popularidad = popularidad;
	}

	/**
	 * Método que calcula qué persona es la de mayor edad
	 * 
	 * @param p1 Persona 1
	 * @param p2 Persona 2
	 * @return la persona mayor o null en caso de no recibir alguna de las personas
	 */
	public static Persona mayor(Persona p1, Persona p2) {
		if (p1 != null && p2 != null) {
			return p1.getEdad() > p2.getEdad() ? p1 : p2;
		}
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getPopularidad() {
		return popularidad;
	}

	public void setPopularidad(int popularidad) {
		this.popularidad = popularidad;
	}

	

	@Override
	public String toString() {
		return "nombre " + nombre + ", edad=" + edad;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre, popularidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre) && popularidad == other.popularidad;
	}

	@Override
	public int compareTo(Persona o) {
		// return this.nombre.compareTo(o.getNombre());
		if (this.edad < o.getEdad()) {
			return -1;
		} else if (this.edad == o.getEdad()) {
			return 0;
			//return this.nombre.compareTo(o.getNombre());
		} else {
			return 1;
		}
	}

}

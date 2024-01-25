package Ruben.Tema4;

import java.util.Random;

public class Alumno {
	
	private String nombre;
	private int edad;
	
	public Alumno (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
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
	
	public String toString() {
		return "Nombre: " + nombre + " Edad: " + edad;
	}
	
	public static String nombres[] = {"Alejandra", "Candela", "Vega", "Sergio"};
	
	public static void rellenarArray (Alumno[] datos) {
		Random random = new Random();
		
		for (int i = 0; i<datos.length; i++) {
			datos[i]=new Alumno (nombres[random.nextInt(nombres.length)], random.nextInt(6)+10);
		
		/*for (int i = 0; i<datos.length; i++) {
			datos[i]=new Alumno(nombres[(int)(Math.random()*4)], (int)(Math.random()*6+10));*/
		}
	}
	
	
		

}

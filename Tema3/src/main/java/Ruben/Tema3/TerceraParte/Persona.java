package Ruben.Tema3.TerceraParte;

import java.util.Random;

public class Persona {
	//Atributos
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	private boolean mayorEdad;
	
	//Constructores
	public Persona (String nombre) {
		this.nombre = nombre;
		this.dni = generaDni();
	}
	
	public Persona (String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = generaDni();
	}
	
	public Persona (String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.dni = generaDni();
	}
	
	//Metodos
	public String getNombre() {
		return nombre;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad (int edad) {
		this.edad = edad;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni (String dni) {
		this.dni = generaDni();
	}
	
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//Metodo toString para visualizar la informacion contenida en el objeto
	@Override
	public String toString() {
		if (edad==0) {
			return "\nNombre: " + nombre + "\nDNI: " + dni;
		}
		else if (peso==0) {
			return "\nNombre: " + nombre + "\nDNI: " + dni + "\nEdad: " + edad + "\nSexo: " + sexo;
		}
		else {
			return "\nNombre: " + nombre + "\nDNI: " + dni + "\nEdad: " + edad + "\nSexo: " + sexo + "\nPeso: " + peso + "\nAltura: " + altura;
		}
	}
	
	//Metodo para ver si una persona es mayor de edad
	public void esMayorDeEdad() {
		if (getEdad()>18) {
			mayorEdad = true;
		}
		else {
			mayorEdad = false;
		}
		if (mayorEdad==true) {
			System.out.println(getNombre() + " es mayor de edad");
		}
		else {
			System.out.println(getNombre() + " no es mayor de edad");
		}
	}
	
	//Metodo para calcular el IMC de la persona
	public int calcularImc() {
		/*final*/ double pesoIdeal = getPeso()/(getAltura()*getAltura());
		if (pesoIdeal<20) {
			return -1;
		}
		else if (pesoIdeal>=20 && pesoIdeal<=25) {
			return 0;
		}
		else /*if (pesoIdeal>25)*/ {
			return 1;
		}
	}
	
	//Metodo para comprobar el sexo de un objeto persona
	public void comprobarSexo() {
		if (getSexo()!= 'H' || getSexo()!= 'M') {
			setSexo('H');
		}
	}
	
	//Metodo para generar un DNI y ponerle una letra
	/*public void generaDni() {
		Random random = new Random();
		int numeroAleatorio = 10000000 + random.nextInt(99999999);
		
		int restoAleatorio = numeroAleatorio%23;
		
		switch (restoAleatorio) {
			case 0: setDni(numeroAleatorio+"T");
			case 1: setDni(numeroAleatorio+"R");
			case 2: setDni(numeroAleatorio+"W");
			case 3: setDni(numeroAleatorio+"A");
			case 4: setDni(numeroAleatorio+"G");
			case 5: setDni(numeroAleatorio+"M");
			case 6: setDni(numeroAleatorio+"Y");
			case 7: setDni(numeroAleatorio+"F");
			case 8: setDni(numeroAleatorio+"P");
			case 9: setDni(numeroAleatorio+"D");
			case 10: setDni(numeroAleatorio+"X");
			case 11: setDni(numeroAleatorio+"B");
			case 12: setDni(numeroAleatorio+"N");
			case 13: setDni(numeroAleatorio+"J");
			case 14: setDni(numeroAleatorio+"Z");
			case 15: setDni(numeroAleatorio+"S");
			case 16: setDni(numeroAleatorio+"Q");
			case 17: setDni(numeroAleatorio+"V");
			case 18: setDni(numeroAleatorio+"H");
			case 19: setDni(numeroAleatorio+"L");
			case 20: setDni(numeroAleatorio+"C");
			case 21: setDni(numeroAleatorio+"K");
			case 22: setDni(numeroAleatorio+"E");
		}
	}*/
	
	public String generaDni() {
		Random random = new Random();
		int numeroAleatorio = 10000000 + random.nextInt(99999999);
		
		int restoAleatorio = numeroAleatorio%23;
		
		switch (restoAleatorio) {
			case 0: return(numeroAleatorio+"T");
			case 1: return(numeroAleatorio+"R");
			case 2: return(numeroAleatorio+"W");
			case 3: return(numeroAleatorio+"A");
			case 4: return(numeroAleatorio+"G");
			case 5: return(numeroAleatorio+"M");
			case 6: return(numeroAleatorio+"Y");
			case 7: return(numeroAleatorio+"F");
			case 8: return(numeroAleatorio+"P");
			case 9: return(numeroAleatorio+"D");
			case 10: return(numeroAleatorio+"X");
			case 11: return(numeroAleatorio+"B");
			case 12: return(numeroAleatorio+"N");
			case 13: return(numeroAleatorio+"J");
			case 14: return(numeroAleatorio+"Z");
			case 15: return(numeroAleatorio+"S");
			case 16: return(numeroAleatorio+"Q");
			case 17: return(numeroAleatorio+"V");
			case 18: return(numeroAleatorio+"H");
			case 19: return(numeroAleatorio+"L");
			case 20: return(numeroAleatorio+"C");
			case 21: return(numeroAleatorio+"K");
			case 22: return(numeroAleatorio+"E");
			default: return("No se puede generar");
		}
	}
	
	//Metodo equals comprueba si dos objetos son iguales
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj==null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Persona other = (Persona) obj;
		
		return this.getNombre() == other.getNombre() && this.getDni() == other.getDni() && this.getSexo() == other.getSexo();
	}
	
}

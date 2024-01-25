package Ruben.Tema1;

import java.util.Scanner;

public class HolaMundo {
	//public es un modificador de acceso
	
	public static void main(String[] args) {
	
		System.out.println("¡Hola Mundo! ¿Como te llamas?");
		//System.console().readLine(); //Aqui se detiene y espera a que el usuario meta información con el teclado
		Scanner sc = new Scanner(System.in); //Ponemos una clase y le añadimos un objeto (sc)
		
		String lectura=sc.nextLine(); //Recoge el valor de entrada
		
		System.out.println("Hola "+ lectura);
		
		sc.close();
	
	}
	
}

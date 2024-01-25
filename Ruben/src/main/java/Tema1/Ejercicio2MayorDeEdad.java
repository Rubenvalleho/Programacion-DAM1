package Ruben.Alonso.DAM.Tema1;

import java.util.Scanner;

public class Ejercicio2MayorDeEdad {

	public static void main( String[] args ) {
		
		System.out.println("Escribe tu edad");
		
		Scanner sc = new Scanner(System.in); 	
		
		int edad=sc.nextInt();
		
		if (edad>18) {
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("Eres menor de edad");
		}
		//int resultado= {edad > 18 ? "Eres mayor de edad" : "Eres menor de edad"};
		//System.out.println(resultado);
		sc.close();
	}
	
}

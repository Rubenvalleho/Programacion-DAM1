package Ruben.Alonso.DAM.Tema1;

import java.util.Scanner;

public class PruebaScanner {

	public static void main(String[] args) {
		
		// System.console().readLine(); El programa se detiene y espera a que el usuario meta la informacion por el teclado
				System.out.println("Hola como te llamas? ");
				
				Scanner sc = new Scanner(System.in); 
				//sc es el Objeto de la clase Scanner	
				
				//Recoger valor de entrada
				String lectura=sc.nextLine();
				
				sc.close();
				
				System.out.println("Hola " + lectura);

	}

}

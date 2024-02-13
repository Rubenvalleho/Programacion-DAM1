package Ruben.PracticaExamenUT4;

import java.util.Scanner;

public class Ejercicio1UT4 { 
	
	public static void mostrarArray (int [] array) {
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + " | ");
		}
	}
	
	public static void comprobarNumero (int numero, int [] array) {
		int contador = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (numero == array[i]) {
				contador++;
			}
		}
		if (contador == 0) {
			System.out.println("\nTu numero no se repite");
		}
		else {
			System.out.println("\nTu numero se repite " + contador + " veces");
		}
	}

	public static void main(String[] args) {
		int [] array = new int [20];
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < array.length -1; i++) {
			array [i] = (int) (Math.random()*10+1);
		}
		
		System.out.println("Dime un numero del 1 al 10 para comprobar: ");
		int num = sc.nextInt();
		
		Ejercicio1UT4.mostrarArray (array);
		
		Ejercicio1UT4.comprobarNumero(num, array);
	}

}

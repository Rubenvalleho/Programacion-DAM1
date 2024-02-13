package Ruben.PracticaExamenUT4;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		int [] array = new int [10];
		int numero;
		int numeroMayor = -999999;
		int numeroMenor = 99999999;
		int posicionMayor = 0;
		int posicionMenor = 0;
		
		for (int i = 0; i < array.length - 1; i++) {
			System.out.println("Introduce un numero en la posicion " + i + ":");
			array [i] = sc.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > numeroMayor) {
				numeroMayor = array[i];
				posicionMayor = i;
			}
			if (array[i] <= numeroMenor) {
				numeroMenor = array[i];
				posicionMenor = i;
			}
		}
		
		System.out.println("El numero mayor es el " + numeroMayor + ". Y esta en la posición " + posicionMayor);
		
		
	}
}

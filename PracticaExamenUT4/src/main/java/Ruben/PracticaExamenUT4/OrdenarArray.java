package Ruben.PracticaExamenUT4;

import java.util.Random;

public class OrdenarArray {
	
	public static int [] generarArray() {
		Random random = new Random();
		int [] array = new int [10];
		
		for (int i = 0; i < array.length - 1; i++) {
			array [i] = random.nextInt(10)+1;
			System.out.print(array[i] + " | ");
		}
		System.out.println("");
		return array;
	}
	
	public static int [] copiarArray(int [] array) {
		int [] arrayCopia = new int [array.length-1];
		
		for (int i = 0; i < array.length - 1; i++) {
			arrayCopia[i] = array[i]; 
		}
		return arrayCopia;
	}
	
	public static int [] ordenarArray(int [] array) {
		int numeroAnterior;
		int numeroPosterior;
		
		for (int i = 0; i < array.length -1; i++) {
			for (int e = 0; e < array.length -i - 1; e++) {
				if (array[e] > array[e+1]) {
					numeroPosterior = array[e+1];
					array[e+1] = array[e];
					array[e] = numeroPosterior;
				}
			}
		}
		
		return array;
	}
	
	public static void mostrarArray(int [] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
		}
	}

	public static void main(String[] args) {
		
		mostrarArray(ordenarArray(generarArray()));

	}

}

package Ruben.PracticaExamenUT4;

import java.util.Random;

public class SumarArrays {
	
	public final static int [] [] generarMatriz () {
		Random random = new Random();
		int [] [] matriz = new int [4] [4];
		
		for (int i = 0; i < matriz.length - 1; i++) {
			for (int e = 0; e < matriz[i].length; e++) {
				matriz [i] [e] = random.nextInt(9)+1;
				System.out.print(matriz[i][e] + " | ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		return matriz;
	}
	
	public static int [] sumarFilas(int [] [] matriz) {
		int [] sumaFilas = new int [matriz.length];
		
		for (int i = 0; i < matriz.length - 1; i++) {
			for (int e = 0; e < matriz[0].length; e++) {
				sumaFilas[i] += matriz[i][e];
			}
		}
		
		return sumaFilas;
	}
	
	public static int [] sumarColumnas(int [] [] matriz) {
		int [] sumaColumnas = new int [matriz[0].length];
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int e = 0; e < matriz.length; e++) {
				sumaColumnas[i] += matriz[e][i];
			}
		}
		
		return sumaColumnas;
	}
	
	public static void mostrarArray(int [] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "|");
		}
		System.out.println(" ");
	}
	
	public static void mostrarMatriz(int [][] matriz) {
		for (int i = 0; i < matriz.length - 1; i++) {
			for (int e = 0; e < matriz[0].length; e++) {
				System.out.print(matriz[i][e] + " | ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		
		//mostrarMatriz(generarMatriz());
		
		mostrarArray(sumarColumnas(generarMatriz()));
		
		mostrarArray(sumarFilas(generarMatriz()));

	}

}

package Ruben.PracticaExamenUT4;

import java.util.Random;

public class Practica1 {
	
	public static int [][] rellenarArray() {
		int [] [] arrayPrueba = new int [(int)(Math.random()*10+1)][(int)(Math.random()*10+1)];
		for (int i = 0; i < arrayPrueba.length - 1; i++) {
			for (int e = 0; e < arrayPrueba[0].length; e++) {
				arrayPrueba[i][e] = (int)(Math.random()*9+1) /*random.nextInt(9)+1*/;
				System.out.print(arrayPrueba[i][e] + " | ");
			}
			System.out.println("");
		}
		return arrayPrueba;
	}

	public static void main(String[] args) {
		Random random = new Random();
		
		
		Practica1.rellenarArray();
		/*for (int i = 0; i < arrayPrueba.length - 1; i++) {
			for (int e = 0; e < arrayPrueba[0].length - 1; i++) {
				System.out.print(arrayPrueba[i][e] + " | ");
			}
			System.out.println("");
		}*/

	}

}

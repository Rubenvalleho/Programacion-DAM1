package Ruben.Tema4;

import java.util.Arrays;

public class PruebaMetodo {

	private static int[] generarArrayAleatorio(int cantidad, int min, int max) {
	       int[] array = new int[cantidad];
	       for (int i = 0; i < cantidad; i++) {
	           array[i] = (int) (Math.random() * (max - min + 1) + min);
	        }
	        return array;
	    }
	
	public static void main(String[] args) {
		
		int [] numerosAleatorios = generarArrayAleatorio(50, 1, 100);
		
		Arrays.sort(numerosAleatorios);
		for (int i = 0; i < numerosAleatorios.length; i++) {
			System.out.print(numerosAleatorios[i] + " | ");
		}
	}
}

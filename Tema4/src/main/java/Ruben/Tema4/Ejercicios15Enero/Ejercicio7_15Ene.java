package Ruben.Tema4.Ejercicios15Enero;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio7_15Ene {

	public static void main(String[] args) {
		
		final int TOTAL_ELEMENTOS = 50;
		int [] numeros = new int [TOTAL_ELEMENTOS];
		int [] todos = new int [100];
		int contador = 0;
		int [] distintos = new int [TOTAL_ELEMENTOS];
		Random random = new Random();
		
		//Le añade numeros aleatorios al array y lo imprime por pantalla
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(100)+1;
			System.out.print(numeros[i] + " | ");
		}
		Arrays.sort(numeros); //Ordena el array de menor a mayor
		
		
		//Crea un array con todos los numeros del 1 al 100
		System.out.println(" ");
		for (int i = 0; i < 100; i++) {
			contador++;
			todos[i] = contador;
		}
		for (int i = 0; i < todos.length; i++) {
			System.out.print(todos[i] + " | ");
		}
		
		
		for (int i = 0; i < todos.length; i++) {
			for (int j = 0; j < numeros.length; i++) {
				if (todos[i]!=numeros[j]) {
					distintos[j] = todos[i];
				}
			}
		}
		
		
		
		/*for (int i = 1; i < 100; i++) {
			contador++;
			for (int e = 1; e < 100; e++) {
				if (contador!=numeros[e]) {
					distintos[e] = contador;
				}
			}
		}*/
		System.out.println(" ");
		for (int i = 0; i < distintos.length - 1; i++) {
			if (distintos[i]!=0) {
				System.out.print(distintos[i] + " | ");
			}
		}
		
	}

}

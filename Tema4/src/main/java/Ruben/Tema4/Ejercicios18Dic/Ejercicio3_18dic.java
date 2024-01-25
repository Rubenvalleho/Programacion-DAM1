package Ruben.Tema4.Ejercicios18Dic;

import java.util.Scanner;

public class Ejercicio3_18dic {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int contador = 0;
		int i=0;
		int numeros[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.print("Los numeros almacenados en el array son: ");
		
		for (int prueba : numeros) {
			System.out.print(prueba + "| ");
		}
		
		System.out.println(" ");
		
		
		for (i = 0; i<numeros.length-1; i++) {
			if (numeros[i]<=numeros[i+1] /*&& numeros[i]>numeros[i-1]*/) {
				contador++;
			}
		}
		if (contador==numeros.length-1) {
			System.out.println("Está ordenado");
		}
		else {
			System.out.println("No está ordenado");
		}
	}

}

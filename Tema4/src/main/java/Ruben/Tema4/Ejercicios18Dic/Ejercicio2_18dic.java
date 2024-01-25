package Ruben.Tema4.Ejercicios18Dic;

import java.util.Scanner;

public class Ejercicio2_18dic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Forma simple
		/*int numeroMin = 999999;
		int numeroMax = 0;
		
		for (int i=0; i<=10-1; i++) {
			System.out.println("Dime un numero para guardarlo en el espacio de memoria numero " + i);
			int numero = sc.nextInt();
			int numeros[] = {numero};
			
			if (numero<=numeroMin) {
				numeroMin = numero;
			}
			if (numeroMax<=numero) {
				numeroMax = numero;
			}
		}
		System.out.println("El numero minimo almacenado en el array es "+numeroMin);
		System.out.println("El numero máximo almacenado en el array es "+numeroMax);*/
		
		//Forma compleja
		int[] numeros = new int [10];
		for (int i=0; i<=10-1; i++) {
			System.out.println("Dime un numero para guardarlo en el espacio de memoria numero " + i);
			numeros[i] = sc.nextInt();
		}
		
		int numeroMax = numeros[0];
		for (int e=0; e<numeros.length; e++) {
			if (numeros[e]>numeroMax) {
				numeroMax = numeros[e];
			}
		}
		
		int numeroMin = numeros[0];
		for (int a=0; a>numeros.length; a++) {
			if (numeros[a]<numeroMin) {
				numeroMin = numeros[a];
			}
		}
		
		System.out.println("El numero máximo dentro del array es " + numeroMax);
		System.out.println("El numero mínimo dentro del array es " + numeroMin);
	}

}

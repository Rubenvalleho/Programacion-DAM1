package Ruben.Tema2;

import java.util.Scanner;

public class Tema2Ejercicio3 {

	public static void main(String[] args) {
		
		System.out.println("Añade numeros hasta meter 5 ceros");
		int numero = 0;
		int contador = 0;
		int suma = 0;
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.print("Numero: ");
			numero = sc.nextInt();
			
			if (numero==0) {
				contador=contador+1;
				
			}
			else {
				suma=suma+numero;
			}
		}
		while (contador!=5);
		
		System.out.println("La suma de todos los numeros es " + suma);
		
		sc.close();
		
	}

}

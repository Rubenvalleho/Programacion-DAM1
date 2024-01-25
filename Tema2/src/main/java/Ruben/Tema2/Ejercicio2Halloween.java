package Ruben.Tema2;

import java.util.Scanner;

public class Ejercicio2Halloween {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int contador=0;
		int numero=0;
		int resultado=0;
		
		do {
			System.out.println("Dame un numero: ");
			numero=sc.nextInt();
			
			if (numero==0) {
				contador=contador+1;
			}
			else if (numero!=0) {
				resultado+=numero;
			}
		}
		while (contador!=5);
		
		System.out.println("La suma total es " + resultado);
		
		sc.close();
	}

}

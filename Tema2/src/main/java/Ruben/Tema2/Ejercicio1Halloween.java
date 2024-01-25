package Ruben.Tema2;

import java.util.Scanner;

public class Ejercicio1Halloween {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero;
		int igual=Integer.MIN_VALUE; //Truquillo
		int contador=1;
		
		do {
			System.out.println("Introduce un numero: ");
			numero=sc.nextInt();
			
			if (numero!=igual){
				igual=numero;
			}
			else if (numero==igual) {
				contador=contador+1;
			}
		}
		while (numero>0);
		
		if (contador>1) {
			System.out.println("Sí se repite y se repite " + contador + " veces");
		}
		else {
			System.out.println("No se repite");
		}
		sc.close();
	}

}
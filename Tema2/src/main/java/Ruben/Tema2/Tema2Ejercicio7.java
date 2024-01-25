package Ruben.Tema2;

import java.util.Scanner;

public class Tema2Ejercicio7 {

	public static void main(String[] args) {
		//Calcular la media de X notas
		
		Scanner sc=new Scanner (System.in);
		
		//Tenemos que dejar elegir al usuario la cantidad de notas que va a itroducir para saber con que tenemos que hacer la media
		System.out.println("Dime cuantas notas distintas vas a introducir ");
		
		double notas = sc.nextDouble();
		double notas2 = 0;
		double suma = 0;
		
		if (notas==0) {
			System.out.println("Eres bobo o que?");
		}
		else {
		for (int i=1; i<=notas; i++) {
			System.out.println("Escribe la nota numero " + i + ":");
			notas2 = sc.nextDouble();
			suma=notas2+=suma;
		}
		double media = suma/notas;
		System.out.println("Tu nota media es: " + media);
		//UwU
		sc.close();
		}
	}
}

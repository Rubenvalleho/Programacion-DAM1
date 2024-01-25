package Ruben.Tema4.Ejercicios18Dic;

import java.util.Scanner;

public class Ejercicio1_18dic {
	public static void main(String []args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime un numero ");
		int numero = sc.nextInt();
		int contador = 0;
		int[] numeros = new int [20];
		
		//Creamos un numero entero aleatorio entre el 1 y el 100
		for (int i=0; i<20; i++) {
			numeros[i] = (int) (Math.random()*100+1);
		}
			
		/*for (int i=0; i<numeros.length-1; i++) {
			System.out.print(numeros[i]+ ", ");
		}*/
		
		//Esto es un for each
		for (int digitos:numeros) {
			System.out.print(digitos+", ");
		}
		
		for (int i=0; i<numeros.length-1; i++) {
			if (numero==numeros[i]) {
				contador++;
			}
		}
		System.out.println("El numero " + numero + " se repite " + contador + " veces.");
		
		//Generar numero aleatorio por encima de 1
		/*int numeroAleatorio;
		numeroAleatorio=(int)(Math.random()*31+20);
		
		System.out.println(numeroAleatorio);*/
	}
}

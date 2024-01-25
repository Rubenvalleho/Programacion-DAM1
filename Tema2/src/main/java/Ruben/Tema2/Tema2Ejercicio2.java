package Ruben.Tema2;

import java.util.Scanner;

public class Tema2Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime una letra ");
		char letra1 = sc.next().charAt(0);
		//toLowerCase(); cambia una o varias letras de mayusculas a minusculas
		char letra=Character.toLowerCase(letra1);
		
		if ((letra=='a')||(letra=='e')||(letra=='i')||(letra=='o')||(letra=='u')) {
			System.out.println("La letra " + letra + " es una vocal.");
		}
		else {
			System.out.println("La letra "+ letra + " es una consonante.");
		}
		sc.close();
		//UwU
	}
}
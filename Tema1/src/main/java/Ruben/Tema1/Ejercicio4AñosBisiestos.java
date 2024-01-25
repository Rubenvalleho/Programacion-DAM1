package Ruben.Tema1;

import java.util.Scanner;

public class Ejercicio4AñosBisiestos {

	public static void main(String[] args) {
		
		System.out.println("Escribe un año para ver si es bisiesto o no: ");
		
		Scanner sc = new Scanner(System.in);
		int año= sc.nextInt();
		int año2 = año%100;
		
		if (año2==0) {
			System.out.println((año2%400==0) ? "El año " + año +" es bisiesto." : "No es bisiesto");
		}
		else {
			System.out.println((año%4==0) ? "Es bisiesto" : "No es bisiesto");
		}
		sc.close();
	}
}

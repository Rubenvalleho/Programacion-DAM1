package Ruben.Tema2;

import java.util.Scanner;

public class Ejercicio8Halloween {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una cantidad de horas ");
		int horas = sc.nextInt();
		
		System.out.println("Introduce una cantidad de minutos ");
		int minutos = sc.nextInt();
		
		System.out.println("Introduce una cantidad de segudos ");
		int segundos = sc.nextInt();
		
		segundos++;
		
		minutos+=segundos/60;
		
		segundos%=60;
		
		horas+=minutos/60;
		
		minutos=minutos%60;
		
		System.out.println(horas+"h " + minutos + "min " +segundos+ "seg ");
		
		sc.close();
	}

}

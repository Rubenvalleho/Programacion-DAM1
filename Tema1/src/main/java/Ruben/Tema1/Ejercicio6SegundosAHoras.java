package Ruben.Tema1;

import java.util.Scanner;

public class Ejercicio6SegundosAHoras {

	public static void main(String[] args) {
		
		System.out.println("Dime cuantos segundos quieres pasar a horas: ");
		
		Scanner sc = new Scanner (System.in);
		int segundos = sc.nextInt();
		int hora, min, seg = 0;
		
		hora=segundos/3600;
		min=(segundos-(3600*hora))/60;
		seg=segundos-((hora*3600)+(min*60));
		
		System.out.println(segundos + " segundos son: " + hora + "h" + min + "m" + seg + "s");
		
		sc.close();
		
	}

}

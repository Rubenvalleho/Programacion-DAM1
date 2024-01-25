package Ruben.Tema2;

import java.util.Scanner;

public class Tema2Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int dia;
		
		System.out.println("Dime un numero entre el 1 y el 7");
		
		dia = sc.nextInt();
		
		switch (dia) {
		case (1):
			System.out.println("Hoy es lunes");
			break;
		case (2):
			System.out.println("Hoy es martes");
			break;
		case (3):
			System.out.println("Hoy es miercoles");
			break;
		case (4):
			System.out.println("Hoy es jueves");
			break;
		case (5):
			System.out.println("Hoy es viernes");
			break;
		case (6):
			System.out.println("Hoy es sabado");
			break;
		case (7):
			System.out.println("Hoy es domingo");
			break;
		default:
			System.out.println("Entre el 1 y el 7 capullo");
		}
		//UwU
		sc.close();
	}

}

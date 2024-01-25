package Ruben.Tema2;

import java.util.Scanner;

public class Tema2Ejercicio1 {

	public static void main(String[] args) {
		
		//Usuario pone horas por pantalla y le decimos buenos dias, buenas tardes o buenas noches
		System.out.println("Dime la hora que es: ");
		
		Scanner sc = new Scanner (System.in);
		int hora = sc.nextInt();
		
		if (hora>=6 && hora<=12) {
			System.out.println("Buenos días");
		}
		if (hora>=13 && hora<=20) {
			System.out.println("Buenas tardes");
		}
		if (hora>23 || hora<0) {
			System.out.println("Entre 00 y 23 >.<");
		}
		else if (hora>=21 || hora<=5) {
			System.out.println("Buenas noches");
		}
		
	
		/*switch (hora) {
		case (6):
		case (7):
		case (8):
		case (9):
		case (10):
		case (11):
		case (12):
			System.out.println("Buenos días");
		break;
		
		case (13):
		case (14):
		case (15):
		case (16):
		case (17):
		case (18):
		case (19):
		case (20):
			System.out.println("Buenas tardes");
		break;
		
		case (21):
		case (22):
		case (23):
		case (00):
		case (1):
		case (2):
		case (3):
		case (4):
		case (5):
			System.out.println("Buenas noches");
		break;
		
		default:
			System.out.println("Hora no valida");
		break;
		}*/
		
		sc.close();
	}

}
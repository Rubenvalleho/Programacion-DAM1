package Ruben.Tema2;

import java.util.Scanner;

public class Tema2EjercicioNotas {
	public static void main(String[] args) {
		
		//Usuario pone una nota por pantalla y le dice a que equivale
		System.out.println("Dime la nota: ");
		
		Scanner sc = new Scanner (System.in);
		double nota = sc.nextDouble();
		
		if (nota>=5 && nota<6) {
			System.out.println("Suficiente");
		}
		else if (nota>=6 && nota<7) {
			System.out.println("Bien");
		}
		else if (nota>=7 && nota<9) {
			System.out.println("Notable");
		}
		else if (nota>=9 && nota<=10) {
			System.out.println("Sobresaliente");
		}
		else if (nota<5 && nota>=0) {
			System.out.println("Insuficiente");
		}
		if (nota>10 || nota<0) {
			System.out.println("Nota no valida");
		}
		sc.close();
	}
}

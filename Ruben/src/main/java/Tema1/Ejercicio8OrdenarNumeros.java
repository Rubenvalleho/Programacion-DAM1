package Ruben.Tema1;

import java.util.Scanner;

public class Ejercicio8OrdenarNumeros {
//Probar con if y else
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		//Prueba con for
		for (int i=1; i<=3; i++) {
			System.out.println("Dame el numero " + i + ": ");
			
			if (i==1) {
				num1 = sc.nextInt();
			}
			
			if (i==2) {
				num2 = sc.nextInt();
			}
			
			if (i==3) {
				num3 = sc.nextInt();
			}
			
			
		}
		/*if (num1<num2<num3) {
			System.out.println("Están ordenados.");
		}
		else {
			System.out.println("No estan ordenados.");
		}*/
		sc.close();
		System.out.println(num1 + "" + num2 + "" + num3);
	}
}

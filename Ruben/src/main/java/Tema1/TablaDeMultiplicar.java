package Ruben.Alonso.DAM.Tema1;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		
		System.out.println("Dame un numero");

		Scanner sc= new Scanner(System.in);

		int numero=sc.nextInt();

		sc.close();

		System.out.println("La tabla de " + numero + " es: ");

		for (int tabla=0 ; tabla<=10 ; tabla++) {

			System.out.println(numero*tabla);

		}
	sc.close();
	
	}
}

package Ruben.Alonso.DAM.Tema1;

import java.util.Scanner;

public class DoWhileEjemplo {

	public static void main(String[] args) {
		
		System.out.println("Pon un numero: ");
		Scanner sc = new Scanner (System.in);
		int numero=sc.nextInt();
		
		/*Ejemplo while
		int i=1;
		while (i<=10) {
			System.out.println(numero + " por " + i + " = " + numero*i);
			i++;
		}*/
		
		//Ejemplo do
		int i=1;
		do {
			System.out.println(numero + " por " + i + " = " + numero*i);
			i=i+1;
		}
		while (i<=1000000000);
	}
}
package Ruben.Tema2;

import java.util.Scanner;

public class Ejercicio6Halloween {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int numero=0;
		int num1=0;
		int vueltanum=0;
		int numero2=0;
		System.out.println("Dime un numero y te digo si es capicua: ");
		numero=sc.nextInt();
		numero2=numero;
		
		do {
			num1=numero2%10;
			vueltanum=vueltanum*10+num1;
			numero2=numero2/10;
		}
		while (numero2>0);
		
		if (vueltanum==numero) {
			System.out.println("El numero "+ numero + " es igual dado la vuelta " + vueltanum + ", es capicua.");
		}
		else {
			System.out.println("El numero " + numero + " es distinto dado la vuelta " + vueltanum + ", no es capicua.");
		}
		sc.close();

	}

}

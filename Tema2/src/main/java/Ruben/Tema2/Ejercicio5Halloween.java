package Ruben.Tema2;

import java.util.Scanner;

public class Ejercicio5Halloween {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int numero;
		int vueltanum=0;
		int num1;
		
		System.out.println("Dime un numero ");
		numero=sc.nextInt();
		
		do {
			num1=numero%10; //Con esto saco el ultimo numero, ya que es menor que 10
			vueltanum=vueltanum*10+num1; //Con esto añadimos un 0 detras del numero que nos sale para avanzarlo hacia los millares
			numero=numero/10;
		}
		while (numero>0);
		
		System.out.println(vueltanum);
		
		sc.close();
	}

}

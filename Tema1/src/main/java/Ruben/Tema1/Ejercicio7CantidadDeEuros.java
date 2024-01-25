package Ruben.Tema1;

import java.util.Scanner;

public class Ejercicio7CantidadDeEuros {

	public static void main(String[] args) {
		
		System.out.println("Introduce la cantidad de euros que vas a ingresar: ");
		
		Scanner sc = new Scanner (System.in);
		int euros = sc.nextInt();
		
		int billete500 = 500;
		int billete200 = 200;
		int billete100 = 100;
		int billete50 = 50;
		int billete20 = 20;
		int billete10 = 10;
		int billete5 = 5;
		
		final int division500 = euros/billete500;
		final int resto500 = euros%billete500;
		
		final int division200 = resto500/billete200;
		final int resto200 = resto500%billete200;
		
		final int division100 = resto200/billete100;
		final int resto100 = resto200%billete100;
		
		final int division50 = resto100/billete50;
		final int resto50 = resto100%billete50;
		
		final int division20 = resto50/billete20;
		final int resto20 = resto50%billete20;
		
		final int division10 = resto20/billete10;
		final int resto10 = resto20%billete10;
		
		final int division5 = resto10/billete5;
		final int resto5 = resto10%billete5;
		
		System.out.println(euros>=billete500 ? division500 + " Billetes de 500€" : "0 Billetes de 500€");
		System.out.println(resto500>=billete200 ? division200 + " Billetes de 200€" : "0 Billetes de 200€");
		System.out.println(resto200>=billete100 ? division100 + " Billetes de 100€" : "0 Billetes de 100€"); //A pa
		System.out.println(resto100>=billete50 ? division50 + " Billetes de 50€" : "0 Billetes de 50€");
		System.out.println(resto50>=billete20 ? division20 + " Billetes de 20€" : "0 Billetes de 20€");
		System.out.println(resto20>=billete10 ? division10 + " Billetes de 10€" : "0 Billetes de 10€");
		System.out.println(resto10>=billete5 ? division5 + " Billetes de 5€" : "0 Billetes de 5€");
		System.out.println(resto5+"€");
		//Uwu
		
		sc.close();
	}

}

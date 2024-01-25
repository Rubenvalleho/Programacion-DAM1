package Ruben.Tema3.Redondear;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero para redondear ");
		float numero = sc.nextFloat();
		
		Redondear redondeo = new Redondear(numero);
		
		//System.out.println(numero);
		redondeo.metodoRedondear(numero);
	}

}

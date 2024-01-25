package Ruben.Tema2;

import java.util.Scanner;

public class Tema2EjercicioPotencias {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double numero;
		double potencia;
		double division;
		
		System.out.println("Dame un numero para la base de la potencia: ");
		numero = sc.nextDouble();
		
		System.out.println("Dime el exponente de la potencia: ");
		potencia = sc.nextInt();
		
		double resultado=numero;
		
		if (potencia>0) {
			for (int i=1; i<potencia; i++) {
				//resultado=resultado*numero;
				resultado*=numero;
			}
		}
		else if (potencia<0) {
			for (int i=-1; i>potencia; i--) {
				resultado*=numero;
			}
			division=1/resultado;
			resultado=division;
		}
		else if (potencia==0) {
			resultado=1;
		}
		
		System.out.println(resultado);
		
		sc.close();
	}

}

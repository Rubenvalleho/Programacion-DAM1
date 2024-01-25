package Ruben.Alonso.DAM.Tema1;

import java.util.Scanner;

public class MultiploDeSiete {
	
	public static void main( String[] args ) {
		
		System.out.println("Escribe un numero para comprobar si es multiplo de 7 ");
		
		Scanner sc = new Scanner(System.in);
		int numero=sc.nextInt();
		
		if ((numero%7)!=0) {
			System.out.println("Este numero no es multiplo de 7.");
		}
		else {
			System.out.println("Este numero es multiplo de 7.");
		}
		
		//UwU
		//String resultado= ((numero%7) != 0? "Este numero no es multiplo de 7." : "Este numero es multiplo de 7.");
		//System.out.println(resultado);
		
		sc.close();
	}
	
}

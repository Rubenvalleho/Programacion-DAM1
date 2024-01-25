package Ruben.Tema3.Rectangulo;

import java.util.Scanner;

public class MainRectangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime la altura del rectangulo: ");
		int altura = sc.nextInt();
		System.out.println("Dime la longitud del rectangulo: ");
		int longitud = sc.nextInt();
		
		Rectangulo rectangulo1 = new Rectangulo(altura, longitud);
		
		Rectangulo.visualizarRectangulo(altura,longitud);
		
		System.out.println();
	}

}

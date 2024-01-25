package Ruben.Alonso.DAM.Tema1;

import java.util.Scanner;

public class AreaFigura {

	public static void main(String[] args) {
	//Hacer ejercicio con switch y case
		
		System.out.println("Elige una figura \n1: cuadrado \n2: rectangulo \n3: triangulo \n4: circulo");
		// cuadrado, rectangulo, triangulo, circulo
		
		Scanner sc = new Scanner(System.in);
		String figura=sc.nextLine();
		
		switch (figura) {
		case "1":
			System.out.println("Ya que has elegido el cuadrado me tienes que dar la longitud de uno de sus lados para calcular su tamaño: ");
			double cuadradol=sc.nextDouble();
			double cuadradoa=cuadradol*cuadradol;
			System.out.println("El area de tu cuadrado es: " + cuadradoa);
			break;
		
		case "2":
			System.out.println("Dame la longitud y la altura del rectangulo: ");
			double rectangulo1=sc.nextDouble();
			double rectangulo2=sc.nextDouble();
			double rectangulo3=rectangulo1*rectangulo2;
			System.out.println("El area de tu rectangulo es " + rectangulo3);
			break;
			
		case "3":
			System.out.println("Dame la longitud de la base y la de la altura del triangulo: ");
			double triangulob=sc.nextDouble();
			double trianguloa=sc.nextDouble();
			double triangulo=triangulob*trianguloa/2;
			System.out.println("El area de tu triangulo es " + triangulo);
			break;
		case "4":
			System.out.println("Dame el radio de la circunferencia: ");
			double circulor=sc.nextDouble();
			double circulo=3.14*(circulor*circulor);
			System.out.println("El area de tu circulo es: " + circulo);
			break;
		default:
			System.out.println("Aprende a poner numeros hombre");
			
		}
		sc.close();

	}

}

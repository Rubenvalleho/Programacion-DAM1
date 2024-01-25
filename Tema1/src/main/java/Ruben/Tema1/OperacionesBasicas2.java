package Ruben.Tema1;

import java.util.Scanner;

public class OperacionesBasicas2 {

	public static void main(String[] args) {
		
		System.out.println("Escribe el primer operando ");
		
		Scanner sc1 = new Scanner(System.in); 
		int operador1;
		operador1=sc1.nextInt();
		
		sc1.close();
		
		System.out.println("Escribe el segundo operando ");
		
		Scanner sc2 = new Scanner(System.in);
		int operador2;
		operador2=sc2.nextInt();
		
		sc2.close();
		
		int suma=operador1+operador2;
		
		System.out.println("El resultado de la suma es: " + suma);
		
		
		
		/*double operador1, operador2, suma, resta, multiplicacion, division, resto;
		operador1=0;
		operador2=0;
		suma=operador1+operador2;
		resta=operador1-operador2;	
		multiplicacion=operador1*operador2;
		division=operador1/operador2;
		resto=operador1%operador2;
		
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicacion es: " + multiplicacion);
		System.out.println("La division es: " + division + " con resto " + resto);
		*/
	}
}
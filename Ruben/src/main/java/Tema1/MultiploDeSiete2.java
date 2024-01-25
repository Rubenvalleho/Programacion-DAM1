package Ruben.Alonso.DAM.Tema1;

import java.util.Scanner;

public class MultiploDeSiete2 {

	public static void main( String[] args ) {
	
	Scanner scanner = new Scanner(System.in);
	//Indicar al usuario que ponga por pantalla
	System.out.println("Introduce un número: ");
	//Leer ese numero
	int num = scanner.nextInt();
	
	//   ?    {Se cumple}  :  {No se cumple}
	//System.out.println(num%7==0 ? "Es múltiplo de 7" : "No es multiplo de 7"); 
	
	//Otra manera
	boolean resultado;
	resultado=num%7==0;
	System.out.println(resultado ? "Es múltiplo de 7" : "No es multiplo de 7");
	
	scanner.close();
	}
}

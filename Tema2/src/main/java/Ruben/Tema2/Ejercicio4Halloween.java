package Ruben.Tema2;
import java.util.Scanner;

public class Ejercicio4Halloween {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int numero;
		
		System.out.println("Introduce un numero entero entre el 0 y el 9999 ");
		numero=sc.nextInt();
		
		if (numero<0 || numero>9999) {
			System.out.println("Numero invalido");
		}
		else if (numero>=1000) {
			System.out.println("Tiene 4 cifras");
		}
		else if (numero>=100) {
			System.out.println("Tiene 3 cifras");
		}
		else if (numero>=10) {
			System.out.println("Tiene 2 cifras");
		}
		else {
			System.out.println("Tiene una cifra");
		}

		sc.close();
		
		//UwU
	}

}

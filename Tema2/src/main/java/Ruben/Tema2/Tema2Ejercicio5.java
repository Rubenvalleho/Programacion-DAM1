package Ruben.Tema2;

import java.util.Scanner;

 public class Tema2Ejercicio5 {
	public static void main(String[] args) {

		System.out.println("Introduce los numero que quieras");

		int numero=0, mayor=0, cambio=0;

		Scanner sc=new Scanner(System.in);
		numero=sc.nextInt();
		
		do {
			System.out.print("Numero: ");
			
			if (numero>mayor) {
				mayor=numero;
				cambio=0; // reinicia el numero de repeticiones.
			}
			else if (mayor==numero) {

				cambio=cambio+1;
			}
		}
		while (numero!=0);

		System.out.println("El numero mas grande es: " + mayor);
		System.out.println("Se repite: " + cambio + " veces");
		sc.close();
	}
}
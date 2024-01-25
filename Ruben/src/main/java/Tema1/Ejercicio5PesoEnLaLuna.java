package Ruben.Alonso.DAM.Tema1;

import java.util.Scanner;

public class Ejercicio5PesoEnLaLuna {

	public static void main(String[] args) {
		
		System.out.println("Escribe tu peso en la tierra para decirte cuanto pesas en la luna: ");
		
		Scanner sc = new Scanner(System.in);
		double peso = sc.nextDouble();
		
		final double GravedadTierra=9.8;
		final double GravedadLuna=1.62;
		final double PesoEnLaLuna=(peso/GravedadTierra)*GravedadLuna;
		
		System.out.println("Tu peso en la luna es: " + PesoEnLaLuna);
		
		sc.close();

	}

}

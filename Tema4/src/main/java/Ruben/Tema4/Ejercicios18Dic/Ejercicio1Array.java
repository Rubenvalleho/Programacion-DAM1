package Ruben.Tema4.Ejercicios18Dic;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1Array {

	public static void main(String[] args) {
		
		System.out.println("Dime un numero entre el 0 y el 9");
		Scanner sc = new Scanner (System.in);
		
		int numPantalla = sc.nextInt();
		int contador=0;
		
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(3);
		listaNumeros.add(4);
		listaNumeros.add(5);
		listaNumeros.add(3);
		listaNumeros.add(6);
		listaNumeros.add(7);
		listaNumeros.add(3);
		listaNumeros.add(8);
		listaNumeros.add(9);
		listaNumeros.add(0);
		listaNumeros.add(3);
		listaNumeros.add(0);
		listaNumeros.add(2);
		listaNumeros.add(1);
		listaNumeros.add(1);
		listaNumeros.add(4);
		listaNumeros.add(5);
		listaNumeros.add(9);
		listaNumeros.add(9);
		listaNumeros.add(6);
		
		for (int numero : listaNumeros) {
			if (numPantalla==numero) {
				contador++;
			}
		}
		System.out.println("El numero " + numPantalla + " se repite " + contador + " veces");
		
		System.out.println(listaNumeros.size());
		System.out.println(listaNumeros);

	}

}

package Ruben.Tema5.Hashset;

import java.util.ArrayList;

import java.util.Iterator;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			numeros.add(i);
		}
		
		System.out.println("\nRecorrer el ArrayList.");
		System.out.println("\nCon un for each: ");
		
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
		
		
		Iterator<Integer> iterador = numeros.iterator();
		
		System.out.println("\nCon un Iterator: ");
		
		while(iterador.hasNext()) {
			Integer numero = iterador.next();
			System.out.println(numero);
		}
		
		
		Iterator iterador2 = numeros.iterator();
		
		System.out.println("\nCon un iterador sin indicar el tipo de objeto del iterador para borrar los números pares. ");
		while(iterador2.hasNext()) {
			int numero = (int) iterador2.next();
			
			if (numero%2 == 0) {
				iterador2.remove();
				System.out.println(numero);
			}
			
		}
		
		System.out.println("\nOtra vez con un for each");
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
		
	}

}

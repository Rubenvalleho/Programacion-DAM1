package Ruben.Tema5.Hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Ejercicio3 {

	public static void main(String[] args) {
		int [] arrayNumeros = new int [(int)(Math.random()*(15)+1)];
		HashSet<Integer> hashNumeros = new HashSet<>();
		TreeSet<Integer> treeNumeros = new TreeSet<>();
		LinkedHashSet<Integer> linkedNumeros = new LinkedHashSet<>();
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			arrayNumeros[i] = (int) (Math.random()*(10)+1);
			System.out.println(arrayNumeros[i]);
		}
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			hashNumeros.add(arrayNumeros[i]);
		}
		
		for 
	}

}
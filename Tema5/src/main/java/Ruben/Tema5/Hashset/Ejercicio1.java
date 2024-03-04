package Ruben.Tema5.Hashset;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Hola");
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		HashSet<Integer> numeros = new HashSet<>();
		Integer numero;
		Integer suma = 0;
		
		while(numeros.size() < 5) {
			numeros.add(random.nextInt(10)+1);
		}
		
		/*for(int i = 0; i < 5; i++) {
			System.out.println("Introduce un numero: ");
			numero = scanner.nextInt();
			numeros.add(numero);
		}*/
		
		for (Integer iterador : numeros) {
			System.out.println(iterador);
		}
		
		for (Integer iterador : numeros) {
			suma += iterador;
		}
		
		System.out.println("La suma de todos los numeros almacenados en el HashSet es: " + suma);

	}

}

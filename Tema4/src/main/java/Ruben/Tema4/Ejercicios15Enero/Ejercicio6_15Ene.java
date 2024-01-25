package Ruben.Tema4.Ejercicios15Enero;

public class Ejercicio6_15Ene {

	public static void main(String[] args) {
		
		int ordenar [] = {10, 8, 23, 42, 21, 20, 56, 15, 12, 78};
		int desordenado [] = ordenar;
		
		for (int e = 0; e < desordenado.length; e++) {
			System.out.print(desordenado[e] + " | ");
		}
		
		for (int i = 0; i < ordenar.length - 1; i++) {
			//System.out.println(i + " | ");
			for (int j = 0; j < ordenar.length -i - 1; j++) {
				//System.out.println(" prueba "+ j + " | ");
				if (ordenar[j] < ordenar[j + 1]) {
					int cambio = ordenar[j];
					ordenar[j] = ordenar[j+1];
					ordenar[j + 1] = cambio;
				}
			}
		}
		
		System.out.println(" ");
		
		for (int j = 0; j < ordenar.length; j++) {
			System.out.print(ordenar[j] + " | ");
		}
		
		/* System.out.println(" ");
		
		for (int p = 0; p<ordenar.length; p++) {
			System.out.print(p + " | ");
		} */

	}

}

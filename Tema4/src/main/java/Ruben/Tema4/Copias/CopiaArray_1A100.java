package Ruben.Tema4.Copias;

import java.util.Random;

// Dado un array de 50 números entre 1 y 100, aleatorios, escribir una lista ordenada con los valores que no aparecen en el array. 
public class CopiaArray_1A100 {

	public static void main(String[] args) {
		
		final int TOTAL_ELEMENTOS = 50;
		Random rand = new Random();
		int [] array = new int[TOTAL_ELEMENTOS];
		int [] solucion = new int [100];
		boolean saltar=false;
		int numero=1;
		int posicion=0;
		
		
		//Mete numeros aleatorios en el array y los muestra
		for (int i=0; i<array.length; i++) {
			array[i]=rand.nextInt(100)+1;
			System.out.print("|"+array[i]+"| ");
		}

		System.out.println("");
		
		for (int j=0; j<100; j++) {
			for (int h=0; h<array.length-1; h++) {
				if (numero==array[h]) {
					saltar=true;
				}
				
			}
			if (saltar==false){
				System.out.println(numero);
				solucion[posicion]=numero;
				posicion++;
			}
			else {
				saltar=false;
				
			}
			
			numero++;
		}
		
		
		for (int z=0; z<solucion.length-1; z++) {
			System.out.print("|"+solucion[z]+"|");
		}
		
		/*int numero=1;
		int hola=0;
		while (hola<100) {
			for (int h=0; h<array.length-1; h++) {
				if (numero==array[h]) {
					saltar=true;
				}
				
			}
			if (saltar==false){
				System.out.println(numero);
				solucion[hola]=numero;
			}
			else {
				saltar=false;
			}
			
			numero++;
			hola++;
		}*/
		
		
		
		
	}

}

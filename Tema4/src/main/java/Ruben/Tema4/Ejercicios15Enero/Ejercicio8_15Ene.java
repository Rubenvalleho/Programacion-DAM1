package Ruben.Tema4.Ejercicios15Enero;

public class Ejercicio8_15Ene {

	public static void main(String[] args) {
		
		int [] [] array = new int [4] [4];
		int contador = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int e = 0; e < array[i].length; e++) {
				if (contador==0 || contador==5 ||contador==10 || contador==15) {
					array [i] [e] = 1;
				}
				else {
					array [i] [e] = 0;
				}
				contador++;
				
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int e = 0; e < array[i].length; e++) {
				System.out.print(array[i] [e] + "\t" );
			}
			System.out.println("");
		}

	}

}
